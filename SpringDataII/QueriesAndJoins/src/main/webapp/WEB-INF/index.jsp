<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Query</title>
</head>
<body>

	<table>
		<tr>
			<th>continent</th>
			<th>number of countries</th>
		</tr>
		<c:forEach var="obj" items="${countries }">
			<tr>
				<td>${obj[0].continent }</td>
				<td>${obj[1] }</td>
			</tr>
    		</c:forEach>
	
	</table>
    	
</body>
</html>