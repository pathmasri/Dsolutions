/**
 * @autor pathmasri
 * Aug 8, 2014 3:15:47 PM
 */
package com.dsolutions.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.dsolutions.model.Job;

public class JobDaoImpl implements JobDao {
	
	@Autowired
	 SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.dsolutions.dao.JobDao#insertRow(com.dsolutions.model.Job)
	 */
	@Override
	public int insertRow(Job job) {
		  Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.saveOrUpdate(job);
		  tx.commit();
		  Serializable id = session.getIdentifier(job);
		  session.close();
		  return (Integer) id;
	}

	/* (non-Javadoc)
	 * @see com.dsolutions.dao.JobDao#getList()
	 */
	@Override
	public List<Job> getList() {
		Session session = sessionFactory.openSession();
		  @SuppressWarnings("unchecked")
		  List<Job> employeeList = session.createQuery("from Job")
		    .list();
		  session.close();
		  return employeeList;
	}

	/* (non-Javadoc)
	 * @see com.dsolutions.dao.JobDao#getRowById(int)
	 */
	@Override
	public Job getRowById(int id) {
		 Session session = sessionFactory.openSession();
		  Job job = (Job) session.load(Job.class, id);
		  return job;
	}

	/* (non-Javadoc)
	 * @see com.dsolutions.dao.JobDao#updateRow(com.dsolutions.model.Job)
	 */
	@Override
	public int updateRow(Job job) {
		  Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.saveOrUpdate(job);
		  tx.commit();
		  Serializable id = session.getIdentifier(job);
		  session.close();
		  return (Integer) id;
	}

	/* (non-Javadoc)
	 * @see com.dsolutions.dao.JobDao#deleteRow(int)
	 */
	@Override
	public int deleteRow(int id) {
		 Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  Job job = (Job) session.load(Job.class, id);
		  session.delete(job);
		  tx.commit();
		  Serializable ids = session.getIdentifier(job);
		  session.close();
		  return (Integer) ids;
	}

}
