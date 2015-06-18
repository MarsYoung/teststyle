package com.mishow.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mishow.constants.Constants;
import com.mishow.constants.QuestionConstants;
import com.mishow.po.Question;
import com.mishow.po.User;
import com.mishow.service.QuestionService;
import com.mishow.vo.Pagination;

@Scope("prototype")
@Controller
public class QuestionAction extends MarsAction {
	protected final Log log = LogFactory.getLog(getClass());
	int questiontype;
	String questionanswer;
	String questioncontent;
	String questioncommitter;
	String questioncommitterid;
	String questionfrom;
	String questiontypeString;
	String questionsubject;
	String questionsubjectOther;
	String questiondifficulty;

	// 选择题
	String questionselecta;
	String questionselectb;
	String questionselectc;
	String questionselectd;

	// datetime
	String datetime;
	// 查询
	String username;
	// 专业
	String questionmajor;
	String isbasicsubject;
	String major;

	List<String> subjectsList;

	@Resource(name = "questionService")
	QuestionService questionService;

	public QuestionService getQuestionService() {
		return questionService;
	}

	@Required
	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	public int getQuestiontype() {
		return questiontype;
	}

	public void setQuestiontype(int questiontype) {
		this.questiontype = questiontype;
	}

	public String getQuestionanswer() {
		return questionanswer;
	}

	public void setQuestionanswer(String questionanswer) {
		this.questionanswer = questionanswer;
	}

	public String getQuestioncontent() {
		return questioncontent;
	}

	public void setQuestioncontent(String questioncontent) {
		this.questioncontent = questioncontent;
	}

	public String getQuestioncommitter() {
		return questioncommitter;
	}

	public void setQuestioncommitter(String questioncommitter) {
		this.questioncommitter = questioncommitter;
	}

	public String getQuestioncommitterid() {
		return questioncommitterid;
	}

	public void setQuestioncommitterid(String questioncommitterid) {
		this.questioncommitterid = questioncommitterid;
	}

	public String getQuestionfrom() {
		return questionfrom;
	}

	public void setQuestionfrom(String questionfrom) {
		this.questionfrom = questionfrom;
	}

	public String getQuestiontypeString() {
		return questiontypeString;
	}

	public void setQuestiontypeString(String questiontypeString) {
		this.questiontypeString = questiontypeString;
	}

	public String getQuestionsubject() {
		return questionsubject;
	}

	public void setQuestionsubject(String questionsubject) {
		this.questionsubject = questionsubject;
	}

	public String getQuestiondifficulty() {
		return questiondifficulty;
	}

	public void setQuestiondifficulty(String questiondifficulty) {
		this.questiondifficulty = questiondifficulty;
	}

	public String getQuestionselecta() {
		return questionselecta;
	}

	public void setQuestionselecta(String questionselecta) {
		this.questionselecta = questionselecta;
	}

	public String getQuestionselectb() {
		return questionselectb;
	}

	public void setQuestionselectb(String questionselectb) {
		this.questionselectb = questionselectb;
	}

	public String getQuestionselectc() {
		return questionselectc;
	}

	public void setQuestionselectc(String questionselectc) {
		this.questionselectc = questionselectc;
	}

	public String getQuestionselectd() {
		return questionselectd;
	}

	public void setQuestionselectd(String questionselectd) {
		this.questionselectd = questionselectd;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getQuestionsubjectOther() {
		return questionsubjectOther;
	}

	public void setQuestionsubjectOther(String questionsubjectOther) {
		this.questionsubjectOther = questionsubjectOther;
	}

	public String getQuestionmajor() {
		return questionmajor;
	}

	public void setQuestionmajor(String questionmajor) {
		this.questionmajor = questionmajor;
	}

	public String getIsbasicsubject() {
		return isbasicsubject;
	}

	public void setIsbasicsubject(String isbasicsubject) {
		this.isbasicsubject = isbasicsubject;
	}

	public List<String> getSubjectsList() {
		return subjectsList;
	}

	public void setSubjectsList(List<String> subjectsList) {
		this.subjectsList = subjectsList;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String addQuestion() throws JSONException {
		User u = (User) session.get("loginuser");
		System.out.println(u);
		System.out.println(questionsubject + questiondifficulty + questioncontent);

		if (u != null && u.getUsername() != null) {
			Question q = new Question();
			q.setIsbasicsubject(isbasicsubject);
			if (isbasicsubject.equals("0")) {// 代表专业课
				q.setMajor(questionmajor);
			}
			q.setQuestiontype(questiontype);
			q.setQuestionfrom(questionfrom);
			if (Integer.valueOf(questiontype) == 2) {
				JSONArray abcd = new JSONArray();
				abcd.put(questionselecta);
				abcd.put(questionselectb);
				abcd.put(questionselectc);
				abcd.put(questionselectd);
				JSONObject o = new JSONObject();
				o.put("items", abcd);
				o.put("questioncontent", questioncontent);
				q.setQuestioncontent(o.toString());
			} else {
				q.setQuestioncontent(questioncontent);
			}

			q.setQuestionanswer(questionanswer);
			q.setQuestioncommitter(u.getRealname());
			q.setQuestioncommitterid(u.getUsername());
			q.setQuestiontypeString(QuestionConstants.questionTypeMap.get(Integer.valueOf(questiontype)));
			if (!questionsubject.equals("其他学科")) {
				q.setQuestionsubject(questionsubject);
			} else {
				q.setQuestionsubject(questionsubjectOther);
			}
			q.setQuestiondifficulty(questiondifficulty);
			q.setDatetime(new SimpleDateFormat(Constants.SECOND_TIME_FORMAT).format(new Date()));
			int i = questionService.addQuestion(q, u);
			if (i == 1) {
				return SUCCESS;
			} else {
				return INPUT;
			}
		} else {
			return LOGIN;
		}

	}

	public String getCurrentPageQuestionList() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.QUESTION_PAGE_SIZE, questionService.getTotalNum(), pagerOffset);
		List<Question> userList = questionService.getCurrentPageList(pager.getOffset());
		pager.setList(userList);
		pager.setUrl(Constants.QUSETION_BASE_URL);
		return SUCCESS;
	}

	public String getCurrentPageQuestionListByUsername() {
		/*
		 * 构造分页对象
		 */
		User u = (User) session.get("loginuser");
		pager = new Pagination(Constants.QUESTION_PAGE_SIZE, questionService.getTotalNumByUsername(u.getUsername()),
				pagerOffset);
		List<Question> userList = questionService.getCurrentPageListByUsername(pager.getOffset(), u.getUsername());
		pager.setList(userList);
		pager.setUrl(Constants.QUSETION_BY_USER_BASE_URL);
		return SUCCESS;
	}

	public String getCurrentPageQuestionListByTeacher() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.QUESTION_PAGE_SIZE, questionService.getTotalNumByUsername(username),
				pagerOffset);
		List<Question> userList = questionService.getCurrentPageListByUsername(pager.getOffset(), username);
		pager.setList(userList);
		pager.setUrl(Constants.QUSETION_BY_TEACHER_BASE_URL);
		return SUCCESS;
	}

	public String getCurrentPageQuestionListBySubject() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.QUESTION_PAGE_SIZE, questionService.getTotalNumBySubject(questionsubject),
				pagerOffset);
		List<Question> userList = questionService.getCurrentPageListBySubject(pager.getOffset(), questionsubject);
		pager.setList(userList);
		pager.setUrl(Constants.QUSETION_BY_SUBJECT_BASE_URL);
		return SUCCESS;
	}

	public String getCurrentPageQuestionListByType() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.QUESTION_PAGE_SIZE, questionService.getTotalNumByType(questiontypeString),
				pagerOffset);
		List<Question> userList = questionService.getCurrentPageListByType(pager.getOffset(), questiontypeString);
		pager.setList(userList);
		pager.setUrl(Constants.QUSETION_BY_TYPE_BASE_URL);
		return SUCCESS;
	}

	public String dealQuestion() {
		return SUCCESS;
	}

	public String delete() {
		questionService.delete(id);
		return SUCCESS;
	}

	public String gotoupdatepage() throws JSONException {
		Question q = questionService.getQuestion(id);
		if (null != q) {
			setId(id);
			setQuestiontype(q.getQuestiontype());
			setQuestionfrom(q.getQuestionfrom());
			setQuestionanswer(q.getQuestionanswer());
			setQuestioncommitter(q.getQuestioncommitter());
			setQuestioncommitterid(q.getQuestioncommitterid());
			setQuestionsubject(q.getQuestionsubject());
			setQuestiondifficulty(q.getQuestiondifficulty());
			if (Integer.valueOf(q.getQuestiontype()) == 2) {
				JSONObject o = new JSONObject(q.getQuestioncontent());
				setQuestioncontent(o.getString("questioncontent"));
				JSONArray abcd = o.getJSONArray("items");
				setQuestionselecta(abcd.getString(0));
				setQuestionselectb(abcd.getString(1));
				setQuestionselectc(abcd.getString(2));
				setQuestionselectd(abcd.getString(3));
			} else {
				setQuestioncontent(q.getQuestioncontent());
			}
			setDatetime(q.getDatetime());
			switch (q.getQuestiontype()) {
			case 1:
				return SUCCESS + "_1";
			case 2:
				return SUCCESS + "_2";
			case 3:
				return SUCCESS + "_3";
			case 4:
				return SUCCESS + "_4";
			case 5:
				return SUCCESS + "_5";
			case 6:
				return SUCCESS + "_6";
			default:
				return ERROR;
			}
		} else {
			return ERROR;
		}
	}

	public String update() throws JSONException {
		User u = (User) session.get("loginuser");
		System.out.println(u);
		if (u != null && u.getUsername() != null) {
			Question q = new Question();
			q.setId(id);
			q.setQuestiontype(questiontype);
			q.setQuestionfrom(questionfrom);
			if (Integer.valueOf(questiontype) == 2) {
				JSONArray abcd = new JSONArray();
				abcd.put(questionselecta);
				abcd.put(questionselectb);
				abcd.put(questionselectc);
				abcd.put(questionselectd);
				JSONObject o = new JSONObject();
				o.put("items", abcd);
				o.put("questioncontent", questioncontent);
				q.setQuestioncontent(o.toString());
			} else {
				q.setQuestioncontent(questioncontent);
			}
			q.setQuestionanswer(questionanswer);
			q.setQuestioncommitter(u.getRealname());
			q.setQuestioncommitterid(u.getUsername());
			q.setQuestiontypeString(QuestionConstants.questionTypeMap.get(Integer.valueOf(questiontype)));
			q.setQuestionsubject(questionsubject);
			q.setQuestiondifficulty(questiondifficulty);
			q.setDatetime(new SimpleDateFormat(Constants.SECOND_TIME_FORMAT).format(new Date()));
			return questionService.update(q);
		} else {
			return LOGIN;
		}

	}

	public String getSubjectsListByMajor() {
		subjectsList = questionService.getSubjectsListByMajor(major);
		return SUCCESS;
	}

	public String getCurrentPageQuestionListByMajorAndSubject() {
		/*
		 * 构造分页对象
		 */
		pager = new Pagination(Constants.QUESTION_PAGE_SIZE, questionService.getTotalNumByMajorAndSubject(
				questionsubject, questionmajor), pagerOffset);
		List<Question> userList = questionService.getCurrentPageListByMajorAndSubject(pager.getOffset(),
				questionsubject, questionmajor);
		pager.setList(userList);
		pager.setUrl(Constants.QUSETION_BY_MAJOTANDSUBJECT_BASE_URL);
		return SUCCESS;
	}
}
