package com.cn.yc.gatewayzuulservice.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;


/**
 * 预处理过滤器
 */
@Component
@RefreshScope
public class Prefilter extends ZuulFilter {
    private Logger log =LoggerFactory.getLogger(Prefilter.class);
    @Value("${token}")
    private boolean token;

    //当前过滤器为什么类型的过滤器
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {//同类型之间的优先级，数字越小优先级越高
        return 0;
    }

    @Override
    public boolean shouldFilter() {//过滤器是否启作用
        return true;
    }

    @Override
    public Object run(){
        //验证当前用户是否登入如果未登入提示登入
        // RequestContext 共享信息   上下文
        RequestContext ctx =RequestContext.getCurrentContext();
        HttpServletRequest request =ctx.getRequest();
        //根据prefiter 获取 是否执行  通过 filterOrder 顺序关系执行 当 key =1 时 secondFilter 就不在被执行
        // 当 key =2 时 threeFilter 就不被执行 一次类推
        /*String key =request.getParameter("key");
        ctx.set("threeFilter",true);
        if("1".equals(key)){
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody("{\"msg\":\"401, stop 1 .\"}");
        }*/
         if(!token){
             String token =request.getHeader("token");
             if(token == null || token.equals("")){
                 ctx.setSendZuulResponse(false);// 无需再继续执行执行返回客户端
                 ctx.setResponseStatusCode(401);//响应编码 401 为无权限
                 ctx.setResponseBody("{\"msg\":\"401, pls login first.\"}");//提示前端
                 return "access denied";
             }
         }
        return "pass";

    }
}
