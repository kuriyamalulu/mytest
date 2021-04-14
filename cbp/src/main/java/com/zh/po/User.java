package com.zh.po;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_loginname")
    private String userLoginname;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_role")
    private Integer userRole;

    @Column(name = "user_money")
    private Double userMoney;

    @Column(name = "user_budget")
    private Double userBudget;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_loginname
     */
    public String getUserLoginname() {
        return userLoginname;
    }

    /**
     * @param userLoginname
     */
    public void setUserLoginname(String userLoginname) {
        this.userLoginname = userLoginname == null ? null : userLoginname.trim();
    }

    /**
     * @return user_password
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return user_role
     */
    public Integer getUserRole() {
        return userRole;
    }

    /**
     * @param userRole
     */
    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    /**
     * @return user_money
     */
    public Double getUserMoney() {
        return userMoney;
    }

    /**
     * @param userMoney
     */
    public void setUserMoney(Double userMoney) {
        this.userMoney = userMoney;
    }

    /**
     * @return user_budget
     */
    public Double getUserBudget() {
        return userBudget;
    }

    /**
     * @param userBudget
     */
    public void setUserBudget(Double userBudget) {
        this.userBudget = userBudget;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userLoginname='" + userLoginname + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userRole=" + userRole +
                ", userMoney=" + userMoney +
                ", userBudget=" + userBudget +
                '}';
    }
}
