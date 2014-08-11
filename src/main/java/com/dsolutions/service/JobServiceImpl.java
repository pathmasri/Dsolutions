/**
 * @autor pathmasri
 * Aug 8, 2014 3:17:37 PM
 */
package com.dsolutions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dsolutions.dao.JobDao;
import com.dsolutions.model.Job;

public class JobServiceImpl implements JobService {
	
	@Autowired
	 JobDao jobDao;
	 

	/* (non-Javadoc)
	 * @see com.dsolutions.service.JobService#insertRow(com.dsolutions.model.Job)
	 */
	@Override
	public int insertRow(Job job) {
		return jobDao.insertRow(job);
	}

	/* (non-Javadoc)
	 * @see com.dsolutions.service.JobService#getList()
	 */
	@Override
	public List<Job> getList() {
		// TODO Auto-generated method stub
		return jobDao.getList();
	}

	/* (non-Javadoc)
	 * @see com.dsolutions.service.JobService#getRowById(int)
	 */
	@Override
	public Job getRowById(int id) {
		// TODO Auto-generated method stub
		return jobDao.getRowById(id);
	}

	/* (non-Javadoc)
	 * @see com.dsolutions.service.JobService#updateRow(com.dsolutions.model.Job)
	 */
	@Override
	public int updateRow(Job job) {
		// TODO Auto-generated method stub
		return jobDao.updateRow(job);
	}

	/* (non-Javadoc)
	 * @see com.dsolutions.service.JobService#deleteRow(int)
	 */
	@Override
	public int deleteRow(int id) {
		// TODO Auto-generated method stub
		return jobDao.deleteRow(id);
	}

}
