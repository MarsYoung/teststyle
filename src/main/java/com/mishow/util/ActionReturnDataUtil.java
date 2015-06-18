package com.mishow.util;

import org.json.JSONException;
import org.json.JSONObject;

public class ActionReturnDataUtil {
	public static String returnSUCESS(JSONObject jo) throws JSONException{
		JSONObject njo=new JSONObject();
		njo.put("status", 1);
		njo.put("data", jo);
		return njo.toString();
	}
	
	public static String returnFAILURE(JSONObject jo,Exception e) throws JSONException{
		JSONObject njo=new JSONObject();
		njo.put("status", 0);
		njo.put("data", jo);
		njo.put("e", e);
		return njo.toString();
	}
	
	public static String returnSUCESS(String jo) throws JSONException{
		JSONObject njo=new JSONObject();
		njo.put("status", 1);
		njo.put("data", jo);
		return njo.toString();
	}
	
	public static String returnFAILURE(String jo,Exception e) throws JSONException{
		JSONObject njo=new JSONObject();
		njo.put("status", 0);
		njo.put("data", jo);
		njo.put("e", e);
		return njo.toString();
	}
}
