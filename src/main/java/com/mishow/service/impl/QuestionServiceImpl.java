package com.mishow.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mishow.constants.Constants;
import com.mishow.constants.QuestionConstants;
import com.mishow.dao.ManagerDao;
import com.mishow.dao.QuestionDao;
import com.mishow.dao.StudentDao;
import com.mishow.dao.SystemInfoDao;
import com.mishow.dao.TeacherDao;
import com.mishow.dao.UserDao;
import com.mishow.dao.UserInfoDao;
import com.mishow.po.Question;
import com.mishow.po.User;
import com.mishow.po.UserInfo;
import com.mishow.service.QuestionService;
import com.mishow.vo.Paper;

@Service("questionService")
public class QuestionServiceImpl<userInfoDao> implements QuestionService {
	@Resource(name = "userDao")
	UserDao userDao;

	@Resource(name = "studentDao")
	StudentDao studentDao;

	@Resource(name = "teacherDao")
	TeacherDao teacherDao;

	@Resource(name = "managerDao")
	ManagerDao managerDao;

	@Resource(name = "questionDao")
	QuestionDao questionDao;

	@Resource(name = "systemInfoDao")
	SystemInfoDao systemInfoDao;

	@Resource(name = "userInfoDao")
	UserInfoDao userInfoDao;

	@Override
	public int addQuestion(Question q, User user) {
		if (q != null) {
			q.setQuestiontypeString(QuestionConstants.questionTypeMap.get(q.getQuestiontype()));
			questionDao.save(q);
			UserInfo info = new UserInfo();

			info.setUsername(q.getQuestioncommitterid());
			String createtime = new SimpleDateFormat(Constants.SECOND_TIME_FORMAT).format(new Date());
			info.setCreatetime(createtime);
			info.setInfo(user.getRealname() + " 提交了一道 " + q.getQuestionsubject() + q.getQuestiontypeString());
			userInfoDao.save(info);
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int getQuestion(String searchcontent) {

		return 0;
	}

	@Override
	public int getTotalNum() {
		// 还得这么转化
		String longst = "" + questionDao.getTotalNum();
		return Integer.valueOf(longst);
	}

	@Override
	public int getTotalNumByUsername(String username) {
		// 还得这么转化
		String longst = "" + questionDao.getTotalNumByUsername(username);
		return Integer.valueOf(longst);
	}

	@Override
	public List<Question> getCurrentPageList(int offset) {
		return questionDao.getCurrentPageListDesc(offset, Constants.QUESTION_PAGE_SIZE);
	}

	@Override
	public String delete(int id) {
		questionDao.delete(id);
		return "success";
	}

	@Override
	public Question getQuestion(int id) {
		return questionDao.get(id);

	}

	@Override
	public String update(Question q) {
		questionDao.update(q);
		return "success";
	}

	@Override
	public List<Question> getCurrentPageListByUsername(int offset, String username) {
		return questionDao.getCurrentPageListByUsernameDesc(offset, Constants.QUESTION_PAGE_SIZE, username);
	}

	@Override
	public int getTotalNumBySubject(String questionsubject) {
		// 还得这么转化
		String longst = "" + questionDao.getTotalNumBySubject(questionsubject);
		return Integer.valueOf(longst);
	}

	@Override
	public List<Question> getCurrentPageListBySubject(int offset, String questionsubject) {
		return questionDao.getCurrentPageListBySubjectDesc(offset, Constants.QUESTION_PAGE_SIZE, questionsubject);
	}

	@Override
	public List<Question> getCurrentPageListByType(int offset, String questiontypeString) {
		return questionDao.getCurrentPageListByTypeDesc(offset, Constants.QUESTION_PAGE_SIZE, questiontypeString);
	}

	@Override
	public int getTotalNumByType(String questiontypeString) {
		// 还得这么转化
		String longst = "" + questionDao.getTotalNumByType(questiontypeString);
		return Integer.valueOf(longst);
	}

	@Override
	public List<String> getSubjectsListByMajor(String major) {
		return questionDao.getSubjectsListByMajor(major);
	}

	@Override
	public int getTotalNumByMajorAndSubject(String questionsubject, String major) {
		String longst = "" + questionDao.getTotalNumByMajorAndSubject(questionsubject, major);
		return Integer.valueOf(longst);
	}

	@Override
	public List<Question> getCurrentPageListByMajorAndSubject(int offset, String questionsubject, String major) {
		return questionDao.getCurrentPageListByMajorAndSubject(offset, Constants.QUESTION_PAGE_SIZE, questionsubject,
				major);
	}

	@Override
	public List<Question> selectQuestionByRan(Paper paper) {
		List<Question> resultList = new ArrayList<Question>();
		Map<Integer, Integer> questionSizeMap = paper.getQuestinonTypeSize();
		// 遍历paper map，取出其中已有的题型
		Iterator<Integer> it = questionSizeMap.keySet().iterator();
		while (it.hasNext()) {
			int i = it.next();
			String questionType = QuestionConstants.questionTypeMap.get(i);
			int questionNum = questionSizeMap.get(i);
			int difficulty = paper.getDifficulty();
			String questionSubject = paper.getSubject();
			List<Question> questionByTypeAndSubjectAndNum = getQuestionByTypeAndSubjectAndNum(questionType,
					questionSubject, questionNum, difficulty);
			for (Question q : questionByTypeAndSubjectAndNum) {
				resultList.add(q);
			}
		}

		return resultList;
	}

	private List<Question> getQuestionByTypeAndSubjectAndNum(String questionType, String questionSubject,
			int questionNum, int difficulty) {

		// step 1:根据专业和学科，取出所有问题 的id 和 difficulty
		List<Question> list = questionDao.getAllIDAndDifficultyBySubjectAndType(questionType, questionSubject);
		// step 2:根据paper中的difficulty和questionNum,随机生成难度接近该数值的难度系数，然后去上一步的结果集中取出相应的id
		List<Integer> ids = new ArrayList<Integer>();
		String difficultyStr = list.get(new Random().nextInt(list.size())).getQuestiondifficulty();
		for (int i = 0; i < questionNum; i++) {
			int difficultyInt = Integer.valueOf(difficultyStr);
			if (difficultyInt <= difficulty + 1 && difficultyInt >= difficulty - 1) {
				ids.add(difficulty);
			}
		}
		// step 3:根据上一步获得的id列表，去数据库中取出所有数据。
		return questionDao.getAllByIDList(ids);
	}

}
