package com.cn.yc.gatewayzuulservice.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

//@Component
public class secondFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
    // 与prefilter  是统计 所以 1  后执行
    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        return  ctx.sendZuulResponse();
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        //根据prefiter 获取 是否执行  通过 filterOrder 顺序关系执行 当 key =1 时 secondFilter 就不在被执行
        // 当 key =2 时 threeFilter 就不被执行
        String key =request.getParameter("key");
        if("2".equals(key)){
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody("{\"msg\":\"401, stop 2 .\"}");
        }
        return null;
    }
}
