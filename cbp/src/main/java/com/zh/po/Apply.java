package com.zh.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "apply")
public class Apply {
    @Id
    @Column(name = "apply_id")
    private Integer applyId;

    @Column(name = "apply_user")
    private Integer applyUser;

    @Column(name = "apply_money")
    private Double applyMoney;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "apply_date")
    private Date applyDate;

    @Column(name = "apply_state")
    private Integer applyState;

    private User user;
    private ApplyState aState;

    public ApplyState getaState() {
        return aState;
    }

    public void setaState(ApplyState aState) {
        this.aState = aState;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return apply_id
     */
    public Integer getApplyId() {
        return applyId;
    }

    /**
     * @param applyId
     */
    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    /**
     * @return apply_user
     */
    public Integer getApplyUser() {
        return applyUser;
    }

    /**
     * @param applyUser
     */
    public void setApplyUser(Integer applyUser) {
        this.applyUser = applyUser;
    }

    /**
     * @return apply_money
     */
    public Double getApplyMoney() {
        return applyMoney;
    }

    /**
     * @param applyMoney
     */
    public void setApplyMoney(Double applyMoney) {
        this.applyMoney = applyMoney;
    }

    /**
     * @return apply_date
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * @param applyDate
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * @return apply_state
     */
    public Integer getApplyState() {
        return applyState;
    }

    /**
     * @param applyState
     */
    public void setApplyState(Integer applyState) {
        this.applyState = applyState;
    }
}
