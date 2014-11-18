/**
 * @(#) UserController.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.ssclf.pebms.user.model.User;
import org.ssclf.pebms.user.service.IUserService;
import org.ssclf.pebms.base.controller.BaseController;

/**
 * 用户控制器类
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 2010-10-04
 */
@Controller
public class UserController extends BaseController {

    private static final String VIEW_USER_FORM = "user/form";
    private static final String VIEW_USER_DETAIL = "user/detail";
    private static final String VIEW_USER_INDEX = "user/index";

    @Autowired
    private IUserService userService;

    /**
     * @param validator
     */
    @Autowired
    public UserController(Validator validator) {
        super(validator);
    }
    
    /**
     * 跳转到用户索引视图
     * 
     * @param user
     */
    @RequestMapping(value = "/user/index", method = RequestMethod.GET)
    public String gotoUserIndex() {
        return VIEW_USER_INDEX;
    }

    /**
     * 跳转到用户表单视图
     * 
     * @param req
     * @param model
     * @return
     */
    @RequestMapping(value = "/user/{userId}/form", method = RequestMethod.GET)
    public String gotoUserForm(HttpServletRequest req, Model model) {
        User user = (User) req.getSession().getAttribute(LOGINED_USER);
        model.addAttribute(user);

        PortraitFile portraitFile = new PortraitFile();
        model.addAttribute(portraitFile);
        return VIEW_USER_FORM;
    }

    /**
     * 跳转到用户详情视图
     * 
     * @return
     */
    @RequestMapping(value = "/user/{userId}/detail", method = RequestMethod.GET)
    public String gotoUserDetail(Model model) {
        // 列表页面内嵌创建邀请表单，减少低效的页面跳转
        // Invitation invitation = new Invitation();
        // invitation.setType(Invitation.TYPE_JOIN);
        // invitation.setSubject(wnxLocale.getMessage("invitation.subject"));
        // model.addAttribute(invitation);
        
        return VIEW_USER_DETAIL;
    }

    /**
     * 获取用户
     * 
     * @return
     */
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public @ResponseBody
    User getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    /**
     * 获取用户列表
     * 
     * @return
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public @ResponseBody
    List<User> queryUsers(@RequestParam int pageNumber) {
        return userService.queryUsers(((pageNumber - 1) * 10 + 1), 10);
    }

}
