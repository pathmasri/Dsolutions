/**
 * @autor pathmasri
 * Sep 3, 2014 12:14:54 AM
 */
package com.dsolutions.dao;

import com.dsolutions.model.User;

public interface UserDao {
	
	public User getUser(String login);
	
}
