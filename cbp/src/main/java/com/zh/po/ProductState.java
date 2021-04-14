package com.zh.po;

import javax.persistence.*;

@Table(name = "product_state")
public class ProductState {
    @Id
    @Column(name = "product_state_id")
    private Integer productStateId;

    @Column(name = "product_state_name")
    private String productStateName;

    /**
     * @return product_state_id
     */
    public Integer getProductStateId() {
        return productStateId;
    }

    /**
     * @param productStateId
     */
    public void setProductStateId(Integer productStateId) {
        this.productStateId = productStateId;
    }

    /**
     * @return product_state_name
     */
    public String getProductStateName() {
        return productStateName;
    }

    /**
     * @param productStateName
     */
    public void setProductStateName(String productStateName) {
        this.productStateName = productStateName == null ? null : productStateName.trim();
    }
}