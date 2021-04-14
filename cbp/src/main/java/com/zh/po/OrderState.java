package com.zh.po;

import javax.persistence.*;

@Table(name = "order_state")
public class OrderState {
    @Id
    @Column(name = "order_state_id")
    private Integer orderStateId;

    @Column(name = "order_state_name")
    private String orderStateName;

    /**
     * @return order_state_id
     */
    public Integer getOrderStateId() {
        return orderStateId;
    }

    /**
     * @param orderStateId
     */
    public void setOrderStateId(Integer orderStateId) {
        this.orderStateId = orderStateId;
    }

    /**
     * @return order_state_name
     */
    public String getOrderStateName() {
        return orderStateName;
    }

    /**
     * @param orderStateName
     */
    public void setOrderStateName(String orderStateName) {
        this.orderStateName = orderStateName == null ? null : orderStateName.trim();
    }
}