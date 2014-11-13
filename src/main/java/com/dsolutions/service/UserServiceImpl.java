/**
 * @autor pathmasri
 * Sep 3, 2014 12:26:49 AM
 */
package com.dsolutions.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dsolutions.dao.UserDao;
import com.dsolutions.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;
 
    public User getUser(String login) {
        return userDao.getUser(login);
    }
}
