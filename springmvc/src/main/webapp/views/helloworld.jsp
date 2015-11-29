<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%
	String path = request.getContextPath();
 
%>

 
<html>
<body>
	<h1>这里是一个springmvc的helloworld例子</h1>
	
	<h2><input type="text" value="aaaa" id="userTypeSel" /></h2>
	<h2>This is a heading</h2>
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
<button type="button" id="aaaa">Click me</button>
<button type="button" onclick="submitdds()">juer111</button>
<button type="button"  onclick="test()">test </button>

资质图片：<img runat="server"  src="<%=path%>/upload/image.jpg"  />

</body>
	
</body>
</html>
 
 <script src="<%=path%>/script/jquery-1.11.3.min.js"></script>
  <script src="/script/jquery-1.11.3.min.js"></script>
 <script src="/script/test.js"></script>
 <script src="<%=path%>/script/test.js"></script>
<script type="text/javascript">
function  submitdds(){
	alert();
	var  aaa = $("#userTypeSel").val()
	alert(aaa);
}


 
 
$(document).ready(function(){
$("aaaa").click(function(){
	alert();
	
$("p").hide();
});
}); 
</script>

