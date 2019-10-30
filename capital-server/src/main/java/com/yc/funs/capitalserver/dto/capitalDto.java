package com.yc.funs.capitalserver.dto;

import java.math.BigDecimal;

public class capitalDto {
    private BigDecimal feeAmount;//赎回总额
    private BigDecimal  feeNum;//赎回数量
    private BigDecimal  feeRate;//赎回费率
    private BigDecimal  money;// 赎回费用
    private BigDecimal  feeSum;//赎回金额
    private  BigDecimal  tAssets;//T日净值

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public BigDecimal getFeeNum() {
        return feeNum;
    }

    public void setFeeNum(BigDecimal feeNum) {
        this.feeNum = feeNum;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getFeeSum() {
        return feeSum;
    }

    public void setFeeSum(BigDecimal feeSum) {
        this.feeSum = feeSum;
    }

    public BigDecimal gettAssets() {
        return tAssets;
    }

    public void settAssets(BigDecimal tAssets) {
        this.tAssets = tAssets;
    }
}
