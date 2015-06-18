package com.mishow.po;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author marsyoung
 * 
 */
public class User {
	int id;
	String username;
	String password;
	String usertype;
	String realname;
	int gender;
	String mailbox;

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the mailbox
	 */
	public String getMailbox() {
		return mailbox;
	}

	/**
	 * @param mailbox the mailbox to set
	 */
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * @return the usertype
	 */
	public String getUsertype() {
		return usertype;
	}

	/**
	 * @param usertype the usertype to set
	 */
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getJSONString() throws JSONException{
		JSONObject jo=new JSONObject();
		jo.put("username", username);
		jo.put("password", password);
		jo.put("realname", realname);
		jo.put("gender", gender);
		return jo.toString();
		
	}
	
}
