package com.msm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="t_user")
public class User {

    private int userId;          // 用户id标识
    private String staffId;      // 用户工号
    private String userName;     // 姓名
    private String password;     // 密码
    private String userDepart;   // 部门
    private String userPosition; // 职位
    private String telephone;    // 电话

    @NotNull(message="用户Id号不能为空！")
    @GeneratedValue
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    @NotEmpty(message="用户工号不能为空！")
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @NotEmpty(message="用户名不能为空！")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @NotEmpty(message="用户密码不能为空！")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotEmpty(message="用户部门不能为空！")
    public String getUserDepart() {
        return userDepart;
    }

    public void setUserDepart(String userDepart) {
        this.userDepart = userDepart;
    }

    @NotEmpty(message="用户职位不能为空！")
    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    @NotEmpty(message="用户电话不能为空！")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", staffId=" + staffId + ", userName=" + userName + ", password=" + password
               + ", userDepart=" + userDepart + ", userPosition=" + userPosition + ", telephone=" + telephone + "]";
    }

}
