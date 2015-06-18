package com.mishow.po;

/**
 * @author marsyoung
 * 
 */
public class Course {
	int id;
	String coursename;
	int coursetype;
	String coursebook;
	String coursebookisbn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the coursename
	 */
	public String getCoursename() {
		return coursename;
	}

	/**
	 * @param coursename the coursename to set
	 */
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	/**
	 * @return the coursetype
	 */
	public int getCoursetype() {
		return coursetype;
	}

	/**
	 * @param coursetype the coursetype to set
	 */
	public void setCoursetype(int coursetype) {
		this.coursetype = coursetype;
	}

	/**
	 * @return the coursebook
	 */
	public String getCoursebook() {
		return coursebook;
	}

	/**
	 * @param coursebook the coursebook to set
	 */
	public void setCoursebook(String coursebook) {
		this.coursebook = coursebook;
	}

	/**
	 * @return the coursebookisbn
	 */
	public String getCoursebookisbn() {
		return coursebookisbn;
	}

	/**
	 * @param coursebookisbn the coursebookisbn to set
	 */
	public void setCoursebookisbn(String coursebookisbn) {
		this.coursebookisbn = coursebookisbn;
	}

}
