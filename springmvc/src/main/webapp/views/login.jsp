<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%
	String path = request.getContextPath();
 
%>
<script src=http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js></script>
<script type="text/javascript">
//<![CDATA[
//判断是否成功将Jquery库引入，如果没有成功引入则引入本地Jquery库
!window.jQuery && document.write("<script type=\"text/javascript\" src=\"http://www.gengu.org/wp-content/themes/M1893Pro/js/jquery.min.js\"><\/script>");
//]]>
</script>

<html>
	<head>
		<title>宝宝淘论坛登录1</title>
	</head>
	<body>
		<c:if test="${!empty error}">
	        <font color="red"><c:out value="${error}" /></font>
		</c:if>        
		<form action="<c:url value="/login.do"/>" method="post">
			用户名：
			<input type="text" name="name">
			<br>
			密 码：
			<input type="password" name="password">
			<br>
			<input type="submit" value="登录" />
			<input type="reset" value="重置" />
		</form>
		资质图片：<img runat="server"  src="<%=path%>/upload/image.jpg"  />
		
	<h2><input type="text" value="aaaa" id="userTypeSel" /></h2>
	</body>
</html>

<script type="text/javascript">
 
	alert();
	var  aaa = $("#userTypeSel").val()
	alert(aaa);
 


  
</script>
