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
		<title>city</title>
	</head>
	<body>
	 
	 <div class="input-group" style="margin-bottom: 10px;margin-left: 70px;">
        <span class="input-group-addon" style="padding: 5px 10px"><i class="glyphicon glyphicon-info-sign"></i></span>
        <select id="shengcode"  name="sheng">
             <option selected value="" >请选择省份</option>
        </select>
        <select id="shicode" >
             <option selected value=""  name="shi">请选择</option>
        </select>
        <select id="xiancode" >
             <option selected value="" name="xian" >请选择</option>
        </select>
</div>
	 
	 
	 
	<h2><input type="text" value="aaaa" id="userTypeSel" /></h2>
	</body>
</html>

<script type="text/javascript">
$(function(){
    $.ajax({
        type:'POST',
        url:'/<%=path%>/register/ajax/getCity',
        data:{"sheng":0 },
        success:function(data){
            var all_ps=data['dict_city'];

           //这里取得结果后，然后遍历出结果填充在对应的html页面中 
           
            for(var i=0;i<all_ps.length;i++){
                var $html=String.format('<option value="{0}">{1}</option>',all_ps[i][0],all_ps[i][1]);
                $('#shengcode').append($html)
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("error");
                },
        dataType: 'json'
    });

    $('#shengcode').change(function(){
        var parent = $('#shengcode').val()
        $.ajax({
        type:'POST',
        url:'/app/ajax/get_city/',
        data:{"parent":parent,"level":2},
        success:function(data){
            var all_ps=data['dict_city'];
            
<!--在填充之前将后面的几个下拉菜单制空-->
            
            var $shicode = $('#shicode').empty();
            $shicode.append('<option selected value="">请选择</option>')
            var $xiancode = $('#xiancode').empty();
            $xiancode.append('<option selected value="">请选择</option>')
            for(var i=0;i<all_ps.length;i++){
                var $html=String.format('<option value="{0}">{1}</option>',all_ps[i][0],all_ps[i][1])
                $('#shicode').append($html)
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("error");
                },
        dataType: 'json'
    });
    })

     $('#shicode').change(function(){
        var parent = $('#shicode').val()
        $.ajax({
        type:'POST',
        url:'/app/ajax/get_city/',
        data:{"parent":parent,"level":3},
        success:function(data){
            var all_ps=data['dict_city']
            var $xiancode = $('#xiancode').empty();
            $xiancode.append('<option selected value="">请选择</option>')
            for(var i=0;i<all_ps.length;i++){
                var $html=String.format('<option value="{0}">{1}</option>',all_ps[i][0],all_ps[i][1])
                $('#xiancode').append($html)
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("error");
                },
        dataType: 'json'
    });
    })
})

  
</script>
