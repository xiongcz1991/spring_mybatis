<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 
	spring 标签库
	1. form		渲染表单元素
	2. input 	渲染<input type="text"></input>
	3. password	渲染<input type="password"></input>
	4. hidden	 渲染<input typr="hidden"></hidden>
	5. textarea	渲染textarea
	6. checkbox 渲染单个checkbox
	7. checkboxes 渲染多个checkboxs
	8. radiobutton 
	9. radiobuttons
	10. select
	11. option
	12. options
	13。 errors 在一个span标签中渲染字段错误
 -->
 	<!-- 
 	1. 自动绑定一个model中的属性值到form标签对应的实体对象，默认为command属性 
 	2. 支持restful 风格请求提交
 	form标签的属性
 	modelAtrribute 	from绑定的模型属性名称，默认command
 	commandName		from绑定的模型属性名称，默认command
 	acceptCharSet	定义服务器接收的字符编码
 	cssClass		定义要用到渲染form表单的css类
 	cssStyle		定义要应用到渲染from表单的css样式
 	htmlEscape		boolean值，表示被渲染的值是否要进行html转义
 	-->
 	<form:form >
 		<form:input path="name"></form:input>
 		<form:input path="country"></form:input>
 		<form:password path="country" showPassword="true"></form:password>
 	</form:form>
</body>
</html>