/**
 * @(#) Login.java Created on 2011-2-25
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.portal.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * The class <code>Login</code>
 *
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
public class Login {

    /**
     * 电子邮件， 登录时必须提供的信息
     */
    @NotNull(message = "邮箱不能为空！")
    private String email;
    
    /**
     * 密码， 登录时必须提供的信息
     */
    @NotNull(message = "密码不能为空！")
    @Size(min = 6, max = 16, message = "密码最少 {min}，最大 {max}个字符！")
    private String password;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
