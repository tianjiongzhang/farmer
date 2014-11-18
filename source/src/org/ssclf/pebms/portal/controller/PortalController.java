/**
 * @(#) PortalController.java Created on 2011-2-25
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.portal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ssclf.pebms.portal.service.IPortalService;
import org.ssclf.pebms.user.model.User;
import org.ssclf.pebms.user.service.IUserService;
import org.ssclf.pebms.utility.PEBMSException;
import org.ssclf.pebms.base.controller.BaseController;

/**
 * The class <code>PortalController</code>
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
@Controller
public class PortalController extends BaseController {

	private static final String VIEW_LOGIN = "login";
	private static final String VIEW_INDEX = "index";

	@Autowired
	private IPortalService portalService;

	@Autowired
	private IUserService userService;

	/**
	 * @param validator
	 */
	@Autowired
	public PortalController(Validator validator) {
		super(validator);
	}

	/**
	 * 登录系统
	 * 
	 * @param req
	 * @param result
	 * @param user
	 * @return
	 * @throws PEBMSException
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest req, @Valid Login login,
			BindingResult result) throws PEBMSException {
		// 校验用户输入的表单数据是否合法
		if (result.hasErrors()) {
			throw new PEBMSException(pebmsLocale.getMessage("args.invalid"));
		}

		User loginedUser = portalService.login(login.getEmail(),
				login.getPassword());

		// 在会话中保存登录用户
		req.getSession().setAttribute(LOGINED_USER, loginedUser);
		return "redirect:/" + VIEW_INDEX;
	}

	/**
	 * 退出应用
	 * 
	 * @param req
	 * @return 登录页面
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest req) {
		// 从会话中删除登录用户
		req.getSession().removeAttribute(LOGINED_USER);
		return "redirect:/" + VIEW_LOGIN;
	}

}
