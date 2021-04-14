package com.zh.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "product_num")
    private Integer productNum;

    @Column(name = "product_state")
    private Integer productState;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "product_date")
    private Date productDate;

    @Column(name = "product_kind")
    private String productKind;

    private ProductState pState;

    public ProductState getpState() {
        return pState;
    }

    public void setpState(ProductState pState) {
        this.pState = pState;
    }

    /**
     * @return product_id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * @return product_price
     */
    public Double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice
     */
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return product_num
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * @param productNum
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * @return product_state
     */
    public Integer getProductState() {
        return productState;
    }

    /**
     * @param productState
     */
    public void setProductState(Integer productState) {
        this.productState = productState;
    }

    /**
     * @return product_date
     */
    public Date getProductDate() {
        return productDate;
    }

    /**
     * @param productDate
     */
    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    /**
     * @return product_kind
     */
    public String getProductKind() {
        return productKind;
    }

    /**
     * @param productKind
     */
    public void setProductKind(String productKind) {
        this.productKind = productKind == null ? null : productKind.trim();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productNum=" + productNum +
                ", productState=" + productState +
                ", productDate=" + productDate +
                ", productKind='" + productKind + '\'' +
                ", pState=" + pState +
                '}';
    }
}
