/**
 * @(#) IUserService.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.user.service;

import java.util.List;

import org.ssclf.pebms.user.model.User;
import org.ssclf.pebms.utility.PEBMSException;
import org.ssclf.pebms.base.service.IBaseService;

/**
 * The class <code>IUserService</code>用户服务接口
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
public interface IUserService extends IBaseService {

    /**
     * 创建用户
     * 
     * @param creatorId
     * @param user
     * @throws PEBMSException
     */
    void createUser(Long creatorId, User user) throws PEBMSException;

    /**
     * 获取用户
     * 
     * @param id
     * @return
     */
    User getUser(Long id);

    /**
     * @param email
     * @return
     */
    User getUserByEmail(String email);

    /**
     * 获取用户列表
     * 
     * @param startPosition
     * @param maxResult
     * @return
     */
    List<User> queryUsers(final int firstResult, final int maxResults);

}
