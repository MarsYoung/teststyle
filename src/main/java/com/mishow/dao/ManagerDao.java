package com.mishow.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mishow.po.Manager;

/**
 * @author marsyoung
 * 
 */
@Repository("managerDao")
public class ManagerDao extends MarsDao<Manager> {

	@Transactional
	public int update(Manager manager) {
		Session session = this.getSessionFactory().openSession();
		Query q = session.createQuery("update " + entityName + " set username='" + manager.getUsername()
				+ "',managernum='" + manager.getManagernum() + "',managerdepartment='" + manager.getManagerdepartment()
				+ "' where username='" + manager.getUsername()+"'");
		q.executeUpdate();
		session.close();
		return 1;
	}
}
