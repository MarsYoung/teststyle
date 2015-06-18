package com.mishow.po;

/**
 * @author marsyoung
 * 
 */
public class Question {
	int id;
	int questiontype;
	String questionanswer;
	String questioncontent;
	String questioncommitter;
	String questioncommitterid;
	String questionfrom;
	String questiontypeString;
	String questionsubject;
	String questiondifficulty;
	String datetime;

	String major;
	String isbasicsubject;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the questiontype
	 */
	public int getQuestiontype() {
		return questiontype;
	}

	/**
	 * @param questiontype
	 *            the questiontype to set
	 */
	public void setQuestiontype(int questiontype) {
		this.questiontype = questiontype;
	}

	/**
	 * @return the questionanswer
	 */
	public String getQuestionanswer() {
		return questionanswer;
	}

	/**
	 * @param questionanswer
	 *            the questionanswer to set
	 */
	public void setQuestionanswer(String questionanswer) {
		this.questionanswer = questionanswer;
	}

	/**
	 * @return the questioncontent
	 */
	public String getQuestioncontent() {
		return questioncontent;
	}

	/**
	 * @param questioncontent
	 *            the questioncontent to set
	 */
	public void setQuestioncontent(String questioncontent) {
		this.questioncontent = questioncontent;
	}

	/**
	 * @return the questioncommitter
	 */
	public String getQuestioncommitter() {
		return questioncommitter;
	}

	/**
	 * @param questioncommitter
	 *            the questioncommitter to set
	 */
	public void setQuestioncommitter(String questioncommitter) {
		this.questioncommitter = questioncommitter;
	}

	/**
	 * @return the questioncommitterid
	 */
	public String getQuestioncommitterid() {
		return questioncommitterid;
	}

	/**
	 * @param questioncommitterid
	 *            the questioncommitterid to set
	 */
	public void setQuestioncommitterid(String questioncommitterid) {
		this.questioncommitterid = questioncommitterid;
	}

	/**
	 * @return the questionfrom
	 */
	public String getQuestionfrom() {
		return questionfrom;
	}

	/**
	 * @param questionfrom
	 *            the questionfrom to set
	 */
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

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getIsbasicsubject() {
		return isbasicsubject;
	}

	public void setIsbasicsubject(String isbasicsubject) {
		this.isbasicsubject = isbasicsubject;
	}

}
