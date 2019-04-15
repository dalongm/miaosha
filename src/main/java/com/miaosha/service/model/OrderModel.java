package com.miaosha.service.model;

import java.math.BigDecimal;

/**
 * @author dalongm
 * @date 2019/4/13 21:29
 * @description
 */
public class OrderModel {
    private String id;

    // 购买的用户id
    private Integer userId;

    // 购买的商品id
    private Integer itemId;

    // 若非空，则表示以秒杀商品方式下单
    private Integer promoId;

    // 购买商品的单价，若promoId非空，则表示秒杀价格
    private BigDecimal itemPrice;

    // 购买数量
    private Integer amount;

    // 购买金额，若promoId非空，则表示秒杀价格
    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", itemId=" + itemId +
                ", promoId=" + promoId +
                ", itemPrice=" + itemPrice +
                ", amount=" + amount +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
