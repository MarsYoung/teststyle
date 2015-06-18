<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="addquestion"
	style="height: auto; width: 800px; margin-right: auto; margin-left: auto; background-color: #D3EBF7;">
	<s:form action="addQuestion.action" namespace="/question"
		theme="simple">
		<div id="formcontent">
			<table>
				<tr>
					<td width="120" height="40" align="center" valign="middle"
						style="width: 120px; color: #6600FF;"><span class="STYLE5">题型</span></td>
					<td><s:radio
							list="#{1:'填空题',2:'选择题',3:'简答题',4:'问答题',5:'判断题',6:'综合题'}"
							name="questiontype" label="题型" /></td>
				</tr>
				<tr>
					<td width="120"  align="center" valign="middle"
						style="width: 120px;  color: #6600FF;"><span
						class="STYLE5">题目</span></td>
					<td width="300"><s:textarea name="questioncontent" style="width:400px;height:100px;" label="题目"></s:textarea></td>
				</tr>
				<tr>
					<td width="120"  align="center" valign="middle"
						style="width: 120px; color: #6600FF;"><span
						class="STYLE5">答案</span></td>
					<td><s:textarea name="questionanswer" style="width:400px;height:100px;" label="答案"></s:textarea></td>
				</tr>
				<tr>
					<td width="120" height="40" align="center" valign="middle"
						style="width: 120px; color: #6600FF;"><span class="STYLE5">题目来源</span></td>
					<td><s:textfield name="questionfrom" label="题目来源" style="width:400px;"></s:textfield></td>
				</tr>
			</table>

		</div>
		<br />
		<div id="formsubmit"
			style="height: 30px; width: 400px; margin-right: auto; margin-left: auto; background-color: #D3EBF7; padding-top: 10px; padding-bottom: 10px; align: center;">

			<div
				style="width: 200px; padding-left: 20px; margin-right: 30px; float: right;">

				<div align="left">
					<input name="reset" type="reset" value="重   填"
						style="color: #6600FF; font-size: 20px" /> <input name="submit"
						type="submit" value="添   加"
						style="color: #6600FF; font-size: 20px;" />
				</div>
			</div>
		</div>
	</s:form>
</div>

