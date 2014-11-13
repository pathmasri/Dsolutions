/**
 * @autor pathmasri
 * Sep 3, 2014 12:29:49 AM
 */
package com.dsolutions.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dsolutions.dao.RoleDao;
import com.dsolutions.model.Role;

public class RoleServiceImpl {

	@Autowired
    private RoleDao roleDao;
 
    public Role getRole(int id) {
        return roleDao.getRole(id);
    }
}
