package com.mishow.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mishow.constants.Constants;
import com.mishow.po.SystemInfo;

@Repository("systemInfoDao")
public class SystemInfoDao extends MarsDao<SystemInfo> {
	@Transactional
	public int update(SystemInfo systemInfo) {
		Session session = this.getSessionFactory().openSession();
		String createtime = new SimpleDateFormat(Constants.SECOND_TIME_FORMAT).format(new Date());
		Query q = session.createQuery("update " + entityName + " set username='" + systemInfo.getUsername()
				+ "',info='" + systemInfo.getInfo() + "',createtime='" + createtime + "' where id="
				+ systemInfo.getId());
		q.executeUpdate();
		session.close();
		return 1;
	}

}
