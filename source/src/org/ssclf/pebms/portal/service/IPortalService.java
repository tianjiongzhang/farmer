/**
 * @(#) IPortalService.java Created on 2011-2-25
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.portal.service;

import org.ssclf.pebms.user.model.User;
import org.ssclf.pebms.utility.PEBMSException;
import org.ssclf.pebms.base.service.IBaseService;

/**
 * The class <code>IPortalService</code>
 *
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
public interface IPortalService extends IBaseService {
    
    /**
     * 登录
     *
     * @param email
     * @param password
     * @return
     * @throws PEBMSException
     */
    User login(String email, String password) throws PEBMSException;
    
}
