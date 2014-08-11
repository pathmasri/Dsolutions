/**
 * @autor pathmasri
 * Aug 8, 2014 3:15:47 PM
 */
package com.dsolutions.dao;

import java.util.List;

import com.dsolutions.model.Job;

public interface JobDao {
	
	 public int insertRow(Job job);

	 public List<Job> getList();

	 public Job getRowById(int id);

	 public int updateRow(Job job);

	 public int deleteRow(int id);

}
