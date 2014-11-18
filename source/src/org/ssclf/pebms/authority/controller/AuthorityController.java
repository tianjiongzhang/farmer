/**
 * @(#) AuthorityController.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.authority.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import org.ssclf.pebms.base.controller.BaseController;

/**
 * 权限控制器类
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 2010-10-04
 */
@Controller
@RequestMapping(value = "/authority")
public class AuthorityController extends BaseController {

    @Autowired
    public AuthorityController(Validator validator) {
        super(validator);
    }

}
