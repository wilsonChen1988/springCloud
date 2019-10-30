package com.yc.funs.capitalserver.controller;

import com.yc.funs.capitalserver.dto.capitalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Map;

@RestController
public class CapitalController {

    @RequestMapping("/calculate")
    public String calculate(@RequestParam Map<String,String> map){

        //赎回总额 = 赎回数量 * T日净值
        // 赎回费用 = 赎回总额 * 赎回费率
        // 赎回金额 = 赎回总额 - 赎回费用
        /* BigDecimal feeAmount =map.get("feeNum").multiply(map.get("tAssets"));
         BigDecimal money = feeAmount.multiply(map.get("feeRate"));
         BigDecimal feeSum = feeAmount.subtract(money);*/
        Float feeAmount = Float.parseFloat(map.get("feeNum")) *  Float.parseFloat(map.get("tAssets"));
        Float money = feeAmount * Float.parseFloat(map.get("feeRate"));
        Float feeSum = feeAmount - money;
        Float  cost  = feeSum - Float.parseFloat(map.get("cost")) ;
        return String.valueOf(cost).toString();
    }

    @RequestMapping("/totalMoney")
    public String totalMoney(@RequestParam Map<String,String> map){

        //赎回总额 = 赎回数量 * T日净值
        // 赎回费用 = 赎回总额 * 赎回费率
        // 赎回金额 = 赎回总额 - 赎回费用
        /* BigDecimal feeAmount =map.get("feeNum").multiply(map.get("tAssets"));
         BigDecimal money = feeAmount.multiply(map.get("feeRate"));
         BigDecimal feeSum = feeAmount.subtract(money);*/
        Float feeAmount = Float.parseFloat(map.get("feeNum")) * Float.parseFloat(map.get("tAssets"));
        Float  cost  = feeAmount - Float.parseFloat(map.get("cost")) ;
        return String.valueOf(cost).toString();
    }
}
