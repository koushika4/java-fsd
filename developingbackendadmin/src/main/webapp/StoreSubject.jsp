<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Subject Details</h2>
<form action="SubjectController" method="post">
<label>SubId</label>
<input type="number" name="subid"><br/>
<label>SubName</label>
<input type="text" name="subname"><br/>
<input type="submit" value="Store Subject">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp">Main</a>
</body>
</html>
