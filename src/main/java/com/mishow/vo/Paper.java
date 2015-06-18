package com.mishow.vo;

import java.util.HashMap;
import java.util.Map;

public class Paper {

	// 题型-题目个数
	Map<Integer, Integer> questinonTypeSize = new HashMap<Integer, Integer>();
	String subject;
	int difficulty;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public Map<Integer, Integer> getQuestinonTypeSize() {
		return questinonTypeSize;
	}

	public void setQuestinonTypeSize(Map<Integer, Integer> questinonTypeSize) {
		this.questinonTypeSize = questinonTypeSize;
	}

}
