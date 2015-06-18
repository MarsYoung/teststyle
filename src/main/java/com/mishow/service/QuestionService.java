package com.mishow.service;

import java.util.List;

import com.mishow.po.Question;
import com.mishow.po.User;
import com.mishow.vo.Paper;

public interface QuestionService {
	int addQuestion(Question q,User u);
	int getQuestion(String searchcontent);
	int getTotalNum();
	List<Question> getCurrentPageList(int offset);
	String delete(int id);
	String update(Question q);
	Question getQuestion(int id);
	List<Question> getCurrentPageListByUsername(int offset,String username);
	int getTotalNumByUsername(String username);
	int getTotalNumBySubject(String questionsubject);
	List<Question> getCurrentPageListBySubject(int offset, String questionsubject);
	List<Question> getCurrentPageListByType(int offset, String questiontypeString);
	int getTotalNumByType(String questiontypeString);
	List<String> getSubjectsListByMajor(String major);
	List<Question> getCurrentPageListByMajorAndSubject(int offset, String questionsubject, String major);
	int getTotalNumByMajorAndSubject(String questionsubject, String major);
	
	
	/*
	 * 	随机抽题算法的实现
	 * 	抽出List
	 * */
	List<Question> selectQuestionByRan(Paper paper);
}
