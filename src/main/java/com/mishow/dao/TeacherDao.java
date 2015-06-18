package com.mishow.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mishow.po.Teacher;
import com.mishow.po.User;

/**
 * 分装教师独特的数据操作
 * @author marsyoung
 *
 */
@Repository("teacherDao")
public class TeacherDao extends MarsDao<Teacher>{
	@SuppressWarnings("unchecked")
	public List<User> getCurrentPageListBySubjectDesc(int offset, int userPageSize, String subject) {
		Session session = this.getSessionFactory().openSession();
		List<User> list;
		Query q = session.createQuery("from " + entityName + " where subject='" + subject + "' order by id desc");
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
	public int update(Teacher teacher) {
		Session session = this.getSessionFactory().openSession();
		Query q = session.createQuery("update " + entityName + " set username='"+teacher.getUsername() +"',teachernum='"+teacher.getTeachernum()+"',teacherdepartment='"+teacher.getTeacherdepartment()+"' where username='" + teacher.getUsername()+"'");
		q.executeUpdate();
		session.close();
		return 1;
	}
}
