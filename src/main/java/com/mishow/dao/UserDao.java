/**
 * 
 */
package com.mishow.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mishow.po.User;

/**
 * 封装所有用户公共的操作
 * 
 * @author marsyoung
 * 
 */
@Repository("userDao")
public class UserDao extends MarsDao<User> {
	@Transactional
	public long getTotalNumByDepartment(String department) {
		Session session = this.getSessionFactory().openSession();
		// return ((Integer)
		// (this.sessionFactory.openSession().createQuery("select count(*) from "+entityName).iterate().next())).intValue();
		Query q = session.createQuery("select count(*) from " + entityName + " where department='" + department + "'");
		long n = (Long) (q.uniqueResult());
		session.close();
		return n;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<User> getCurrentPageListByDepartmentDesc(int offset, int userPageSize, String department) {
		Session session = this.getSessionFactory().openSession();
		List<User> list;
		Query q = session.createQuery("from " + entityName + " where department='" + department + "' order by id desc");
		try {
			q.setFirstResult(offset);
			q.setMaxResults(userPageSize);
			list = q.list();
			session.close();
		} catch (RuntimeException re) {
			throw re;
		}
		return list;
	}

	@Transactional
	public long getTotalNumByUsertype(String usertype) {
		Session session = this.getSessionFactory().openSession();
		// return ((Integer)
		// (this.sessionFactory.openSession().createQuery("select count(*) from "+entityName).iterate().next())).intValue();
		Query q = session.createQuery("select count(*) from " + entityName + " where usertype='" + usertype + "'");
		long n = (Long) (q.uniqueResult());
		session.close();
		return n;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<User> getCurrentPageListByUsertypeDesc(int offset, int userPageSize, String usertype) {
		Session session = this.getSessionFactory().openSession();
		List<User> list;
		Query q = session.createQuery("from " + entityName + " where usertype='" + usertype + "' order by id desc");
		try {
			q.setFirstResult(offset);
			q.setMaxResults(userPageSize);
			list = q.list();
			session.close();
		} catch (RuntimeException re) {
			throw re;
		}
		return list;
	}
	
	@Transactional
	public int update(User user) {
		Session session = this.getSessionFactory().openSession();
		Query q = session.createQuery("update " + entityName + " set username='"+user.getUsername() +"',password='"+user.getPassword()+"',realname='"+user.getRealname()+"',gender='"+user.getGender()+"' where username='" + user.getUsername()+"'");
		q.executeUpdate();
		session.close();
		return 1;
	}

}
