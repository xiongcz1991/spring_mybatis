<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form commandName="student" action="${pageContext.request.contextPath}/student/add">
		<table>
			<tr>
				<td>id:</td>
				<td><form:input path="id"></form:input></td>
			</tr>
			<tr>
				<td>name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>password</td>
				<td><form:password path="password" showPassword="true"/></td>
			</tr>
			<tr>
				<td>hobbies</td>
				<%
					ArrayList<String> hobbiesList = new ArrayList<String>();
					hobbiesList.add("足球");
					hobbiesList.add("lanqiu");
					hobbiesList.add("pingpang");
					hobbiesList.add("yumaoqiu");
					hobbiesList.add("other");
					request.setAttribute("hobbiesList", hobbiesList);
				%>
				<td>
					<form:checkboxes items="${hobbiesList}" path="hobbies"/>
				</td>
			</tr>
			<tr>
				<td>isman</td>
				<td><form:checkbox path="isman" value="true"/></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>