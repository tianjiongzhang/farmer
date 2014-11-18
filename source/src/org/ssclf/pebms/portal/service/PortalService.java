/**
 * @(#) PortalService.java Created on 2011-2-25
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssclf.pebms.user.model.User;
import org.ssclf.pebms.user.service.IUserService;
import org.ssclf.pebms.utility.PEBMSException;
import org.ssclf.pebms.base.service.BaseService;

/**
 * The class <code>PortalService</code>
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
@Service("portalService")
public class PortalService extends BaseService implements IPortalService {

    @Autowired
    private IUserService userService;

    @Transactional(readOnly = true)
    public User login(String email, String password) throws PEBMSException {
        if ((null == email) || email.isEmpty() || (null == password)
                || password.isEmpty()) {
            throw new PEBMSException(wnxLocale.getMessage("args.invalid"));
        }

        // 用户不存在
        User existentUser = userService.getUserByEmail(email);
        if (existentUser == null) {
            throw new PEBMSException(wnxLocale.getMessage("user.inexistence"));
        }

        // 密码不一致
        if (!existentUser.getPassword().equalsIgnoreCase(password)) {
            throw new PEBMSException(wnxLocale.getMessage("pswd.invalid"));
        }

        // 帐户被禁用
        if (existentUser.getStatus().equals(User.STATUS_DISABLED)) {
            throw new PEBMSException(wnxLocale.getMessage("user.disabled"));
        }

        return existentUser;
    }
}
