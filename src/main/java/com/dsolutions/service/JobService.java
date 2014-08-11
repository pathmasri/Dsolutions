package com.dsolutions.service;

import java.util.List;


import com.dsolutions.model.Job;


public interface JobService {
	
	 public int insertRow(Job job);

	 public List<Job> getList();

	 public Job getRowById(int id);

	 public int updateRow(Job job);

	 public int deleteRow(int id);

}
