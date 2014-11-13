/**
 * @autor pathmasri
 * Sep 3, 2014 12:18:28 AM
 */
package com.dsolutions.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dsolutions.model.Role;

public class RoleDaoImpl implements RoleDao {

	@Autowired
    private SessionFactory sessionFactory;
     
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
 
    public Role getRole(int id) {
        Role role = (Role) getCurrentSession().load(Role.class, id);
        return role;
    }
}

