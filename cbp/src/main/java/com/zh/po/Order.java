package com.zh.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order")
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_user")
    private Integer orderUser;

    @Column(name = "order_product")
    private Integer orderProduct;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "order_state")
    private Integer orderState;

    /**
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return order_user
     */
    public Integer getOrderUser() {
        return orderUser;
    }

    /**
     * @param orderUser
     */
    public void setOrderUser(Integer orderUser) {
        this.orderUser = orderUser;
    }

    /**
     * @return order_product
     */
    public Integer getOrderProduct() {
        return orderProduct;
    }

    /**
     * @param orderProduct
     */
    public void setOrderProduct(Integer orderProduct) {
        this.orderProduct = orderProduct;
    }

    /**
     * @return order_date
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return order_state
     */
    public Integer getOrderState() {
        return orderState;
    }

    /**
     * @param orderState
     */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}