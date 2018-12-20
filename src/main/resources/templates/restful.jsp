<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery-3.3.1.js"></script>
</head>
<body>
	<button id="addBtn" name="addBtn" onclick="alert("test")">添加</button>
	<button id="updateBtn" name="updateBtn">修改</button>
	<button id="deleteBtn" name="deleteBtn">删除</button>
	<button id="selectBtn" name="selectBtn">查询</button>
	<div id="showMessage">show Message!</div>
</body>
</html>