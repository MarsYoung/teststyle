package com.mishow.dao;

/**
 * @author marsyoung
 *
 */

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mishow.po.Student;

@Repository("studentDao")
public class StudentDao extends MarsDao<Student> {
	public Student getStudentByUserName(String username) {
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Student> list = session.createQuery("from Student where username='" + username + "'").list();
		session.close();
		if (null != list && list.size() != 0) {
			Student st = list.get(0);
			return st;
		} else {
			return null;
		}
	}

	@Transactional
	public int update(Student student) {
		Session session = this.getSessionFactory().openSession();
		Query q = session.createQuery("update " + entityName + " set username='"+student.getUsername() +"',studentnum='"+student.getStudentnum()+"',classname='"+student.getClassname()+"' where username='" + student.getUsername()+"'");
		q.executeUpdate();
		session.close();
		return 1;
	}

}
