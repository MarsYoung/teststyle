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

import com.mishow.po.Question;

@Repository("questionDao")
public class QuestionDao extends MarsDao<Question> {
	@Transactional
	public Long getTotalNumBySubject(String questionsubject) {
		Session session = this.getSessionFactory().openSession();
		// return ((Integer)
		// (this.sessionFactory.openSession().createQuery("select count(*) from "+entityName).iterate().next())).intValue();
		Query q = session.createQuery("select count(*) from " + entityName + " where questionsubject='"
				+ questionsubject + "'");
		long n = (Long) (q.uniqueResult());
		session.close();
		return n;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Question> getCurrentPageListByTypeDesc(int offset, int questionPageSize, String questiontypeString) {
		Session session = this.getSessionFactory().openSession();
		List<Question> list;
		Query q = session.createQuery("from " + entityName + " where questiontypeString='" + questiontypeString
				+ "' order by id desc");
		try {
			q.setFirstResult(offset);
			q.setMaxResults(questionPageSize);
			list = q.list();
			session.close();
		} catch (RuntimeException re) {
			throw re;
		}
		return list;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Question> getCurrentPageListBySubjectDesc(int offset, int questionPageSize, String questionsubject) {
		Session session = this.getSessionFactory().openSession();
		List<Question> list;
		Query q = session.createQuery("from " + entityName + " where questionsubject='" + questionsubject
				+ "' order by id desc");
		try {
			q.setFirstResult(offset);
			q.setMaxResults(questionPageSize);
			list = q.list();
			session.close();
		} catch (RuntimeException re) {
			throw re;
		}
		return list;
	}

	@Transactional
	public Long getTotalNumByType(String questiontypeString) {
		Session session = this.getSessionFactory().openSession();
		// return ((Integer)
		// (this.sessionFactory.openSession().createQuery("select count(*) from "+entityName).iterate().next())).intValue();
		Query q = session.createQuery("select count(*) from " + entityName + " where questiontypeString='"
				+ questiontypeString + "'");
		long n = (Long) (q.uniqueResult());
		session.close();
		return n;
	}

	@Transactional
	public int update(Question question) {
		Session session = this.getSessionFactory().openSession();
		Query q = session.createQuery("update " + entityName + " set questioncontent='" + question.getQuestioncontent()
				+ "',questionanswer='" + question.getQuestionanswer() + "',questionfrom='" + question.getQuestionfrom()
				+ "',questionsubject='" + question.getQuestionsubject() + "',questioncommitterid='"
				+ question.getQuestioncommitterid() + "',questioncommitter='" + question.getQuestioncommitter()
				+ "+' where id=" + question.getId());
		q.executeUpdate();
		session.close();
		return 1;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<String> getSubjectsListByMajor(String major) {
		Session session = this.getSessionFactory().openSession();
		List<String> list;
		Query q = session.createQuery("select questionsubject from " + entityName + " where major='" + major
				+ "' group by questionsubject");
		try {
			list = q.list();
			session.close();
		} catch (RuntimeException re) {
			throw re;
		}
		return list;
	}

	@Transactional
	public Long getTotalNumByMajorAndSubject(String questionsubject, String major) {
		Session session = this.getSessionFactory().openSession();
		// return ((Integer)
		// (this.sessionFactory.openSession().createQuery("select count(*) from "+entityName).iterate().next())).intValue();
		Query q = session.createQuery("select count(*) from " + entityName + " where questionsubject='"
				+ questionsubject + "' and major='" + major + "' ");
		long n = (Long) (q.uniqueResult());
		session.close();
		return n;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Question> getCurrentPageListByMajorAndSubject(int offset, int questionPageSize, String questionsubject,
			String major) {
		Session session = this.getSessionFactory().openSession();
		List<Question> list;
		Query q = session.createQuery("from " + entityName + " where questionsubject='" + questionsubject
				+ "' and major='" + major + "' " + " order by id desc");
		try {
			q.setFirstResult(offset);
			q.setMaxResults(questionPageSize);
			list = q.list();
			session.close();
		} catch (RuntimeException re) {
			throw re;
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Question> getAllIDAndDifficultyBySubjectAndType(String questionType,
			String questionSubject) {

		Session session = this.getSessionFactory().openSession();
		List<Question> list;
		Query q = session.createQuery("select id,questiondifficulty from " + entityName + " where questionsubject='"
				+ questionSubject + "' and questiontype='" + questionType + "' ");
		list = q.list();
		session.close();
		return list;
	}
}
