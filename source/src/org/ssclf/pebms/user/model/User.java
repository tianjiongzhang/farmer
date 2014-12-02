/**
 * @(#) User.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import org.ssclf.pebms.base.model.BaseEntity;

/**
 * 用户类
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 2010-10-01
 */
@Entity
@Table(name = "LC_USER")
public class User extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
     * 状态常量
     */
    public static final Character STATUS_ENABLED = '1';
    public static final Character STATUS_DISABLED = '2';
    
    /**
     * 性别常量
     */
    public static final Character SEX_MALE = '1';
    public static final Character SEX_FEMALE = '2';
    
    /**
     * 电子邮件， 注册时必须提供的信息
     */
    @NotNull(message = "邮箱不能为空！")
    @Email(message = "邮箱格式不正确！")
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;
    
    /**
     * 昵称， 注册时必须提供的信息
     */
    @NotNull(message = "昵称不能为空！")
    @Size(min = 1, max = 32, message = "昵称最少 {min}，最大 {max}个字符！")
    @Column(name = "NICKNAME", nullable = false)
    private String nickname;

    /**
     * 密码， 注册时必须提供的信息
     */
    @NotNull(message = "密码不能为空！")
    @Size(min = 6, max = 16, message = "密码最少 {min}，最大 {max}个字符！")
    @Column(name = "PASSWORD", nullable = false)
    private String password;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     *            the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
