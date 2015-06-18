package com.mishow.constants;

import java.util.HashMap;
import java.util.Map;

public class QuestionConstants {
	public static Map<Integer, String> questionTypeMap=new HashMap<Integer, String>();
	//"#{1:'填空题',2:'选择题',3:'简答题',4:'问答题',5:'判断题',6:'综合题'}"
	static{
		questionTypeMap.put(1, "填空题");
		questionTypeMap.put(2, "选择题");
		questionTypeMap.put(3, "简答题");
		questionTypeMap.put(4, "问答题");
		questionTypeMap.put(5, "判断题");
		questionTypeMap.put(6, "综合题");
		questionTypeMap.put(7, "");
		questionTypeMap.put(8, "");
		questionTypeMap.put(9, "");
		questionTypeMap.put(10, "");
	}
	
	public static Map<Integer, String> questionBasicSubjectMap=new HashMap<Integer, String>();
	static{
		questionBasicSubjectMap.put(1, "马克思主义哲学原理");
		questionBasicSubjectMap.put(2, "马克思主义经济学原理");
		questionBasicSubjectMap.put(3, "毛泽东思想");
		questionBasicSubjectMap.put(4, "邓小平理论");
		questionBasicSubjectMap.put(5, "大学英语");
		questionBasicSubjectMap.put(6, "高等数学");
		questionBasicSubjectMap.put(7, "计算机");
		questionBasicSubjectMap.put(8, "思想道德修养");
		questionBasicSubjectMap.put(9, "军事理论");
		questionBasicSubjectMap.put(10, "法律基础");
		questionBasicSubjectMap.put(11, "计算机基础");
		questionBasicSubjectMap.put(12, "其它学科");
	}
	
	
}
