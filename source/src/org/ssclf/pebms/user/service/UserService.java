/**
 * @(#) UserService.java Created on 2010-10-21
 *
 * Copyright (c) 2014 ssclf.org All Rights Reserved
 */
package org.ssclf.pebms.user.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssclf.pebms.user.model.User;
import org.ssclf.pebms.user.repository.IUserRepository;
import org.ssclf.pebms.utility.PEBMSException;
import org.ssclf.pebms.base.service.BaseService;

/**
 * The class <code>UserService</code> 用户服务对象类
 * 
 * @author xushengyong264@pingan.com.cn
 * @version 1.0
 */
@Service("userService")
public class UserService extends BaseService implements IUserService {

    @Autowired
    private IUserRepository userRepo;

    @Transactional
    public void createUser(Long creatorId, User user) throws PEBMSException {
        if ((null == creatorId) || (null == user)) {
            throw new PEBMSException(wnxLocale.getMessage("args.invalid"));
        }

        user.setCreatorId(creatorId);
        user.setCreateDate(new Date());
        user.setStatus(User.STATUS_ENABLED);
        userRepo.persist(user);
    }

    @Transactional(readOnly = true)
    public User getUser(Long id) {
        return userRepo.findById(User.class, id);
    }

    @Transactional(readOnly = true)
    public User getUserByEmail(String email) {
        return userRepo.findUserByEmail(email);
    }

    @Transactional(readOnly = true)
    public List<User> queryUsers(final int firstResult, final int maxResults) {
        return userRepo.queryUsers(firstResult, maxResults);
    }

}
