<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head lang="en">
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <link rel="stylesheet" href="../lib/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../lib/plugins/select2/select2.min.css"/>
    <link rel="stylesheet" href="../lib/font-awesome/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="../lib/common/MFT.css"/>
    <script src="../lib/jquery/jquery-1.11.3.min.js"></script>
    <script src="../lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="../lib/plugins/select2/select2.js"></script>
    <title>注册</title>
    <style>
        body{
            background: #fff;
        }
        .content-register{
            padding-top: 39px;
            padding-bottom: 50px;
        }
        .content-register .btnMargin{
            margin-top: 20px;
            display: table;
            margin-left: auto;
            margin-right: auto;
        }
        .content-register small{
            padding-left: 25px;
        }
        .content-register>.form-horizontal>.form-group>.col-md-2>.select{
            width: 100%;
        }
        .header-main{
            background: #edf3f6;
            height: 75px;
        }
        .header-main h1,
        .header-main h2{
            margin: 0;
            padding: 0;
        }
        .header-main h2{
            height: 75px;
            line-height: 75px;
            font-size: 20px;
            color: #68d4da;
        }
        .link-right{
            height: 75px;
            line-height: 75px;
        }
        .link-right a{
            color: #808b9b;
        }
    </style>
</head>
<body>
<!--header-->
<header class="header-main">
    <div class="col-md-10 col-md-offset-1">
        <h1 class="col-md-2"><a href="javascript:;"><img src="../lib/common/logo_02.png" alt=""/></a></h1>
        <h2 class="col-md-2">欢迎登陆</h2>
        <div class="col-md-2 col-md-offset-6 text-right link-right">
            <a href="javascript:;">返回首页</a>&nbsp;|
            <a href="javascript:;">帮助</a>
        </div>
    </div>
</header>
<!--content-->
<section class="content-register">
    <!--form1-->
    <form action="<c:url value="/register/registerCustomer"/>" method="post" class="container-fluid form-horizontal">
        <div class="form-group">
            <label for="ID" class="col-md-2 col-md-offset-3 control-label">选择注册账号</label>
            <div class="col-md-2">
                <select id="ID" name="userType" class="sel col-md-12 select">
                    <option value="AL">请选择</option>
                    <option value="AL">景区公司</option>
                    <option value="AL">客栈</option>
                    
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="phoneNum" class="col-md-2 col-md-offset-3 control-label">手机号码</label>
            <div class="col-md-2">
                <input type="phone" name="mobilePhone" class="form-control" id="phoneNum" placeholder="phone number">
            </div>
            <div class="col-md-4">
                <button class="btn">获取验证码</button>
            </div>
        </div>
        <div class="form-group">
            <label for="authCode" class="col-md-2 col-md-offset-3 control-label">验证码</label>
            <div class="col-md-2">
                <input type="number" name="authCode" class="form-control" id="authCode" placeholder="auth code">
            </div>
        </div>
        <div class="col-md-12">
            <button type="submit" class="btn btn-primary btnMargin">确认</button>
        </div>
    </form>
    <div class="col-md-10 col-lg-offset-1">
        <hr/>
    </div>
    <!--form2-->
   <!--   <form action="<%=request.getContextPath() %>/register/registerCustomer" class="container-fluid form-horizontal form2">  --> 
      <form action="<c:url value="/register/fileUpload"/>" method="post" enctype="multipart/form-data" class="container-fluid form-horizontal form2">>  
        <div class="form-group">
            <label for="password" class="col-md-2 col-md-offset-3 control-label">设置密码</label>
            <div class="col-md-2">
                <input type="password" name="password" class="form-control" id="password" placeholder="password">
            </div>
        </div>
        <div class="form-group">
            <label for="userName" class="col-md-2 col-md-offset-3 control-label">客栈名称</label>
            <div class="col-md-2">
                <input type="text" name="innName" class="form-control" id="userName" placeholder="travel name">
            </div>
        </div>
        <div class="form-group">
            <label for="licenseNum" class="col-md-2 col-md-offset-3 control-label">掌柜姓名</label>
            <div class="col-md-2">
                <input type="text" name="managerName" class="form-control" id="licenseNum" placeholder="license num">
            </div>
        </div>
        <div class="form-group">
            <label for="linkman" class="col-md-2 col-md-offset-3 control-label">掌柜身份证号</label>
            <div class="col-md-2">
                <input type="text" name="idCard" class="form-control" id="linkman" placeholder="linkman">
            </div>
        </div>
        <div class="form-group">
            <label for="phoneNum2" class="col-md-2 col-md-offset-3 control-label">座机号码</label>
            <div class="col-md-2">
                <input type="number" name="localPhone" class="form-control" id="phoneNum2" placeholder="phoneNum2">
            </div>
        </div>
  
        <div class="form-group">
            <label for="Email" class="col-md-2 col-md-offset-3 control-label">电子邮箱</label>
            <div class="col-md-2">
                <input type="email" name="email" class="form-control" id="Email" placeholder="Email">
            </div>
        </div>
        <div class="form-group">
            <label for="BillSite" class="col-md-2 col-md-offset-3 control-label">客栈地址</label>
            <div class="col-md-5">
                <input type="text" name="address" class="form-control" id="BillSite" placeholder="Bill site">
            </div>
        </div>
        <div class="col-md-6 col-md-offset-4">
            <small>相关资质:请上传XXX.XXX.XXX等资质的扫描文件.支持jpg,png,gif格式,单张图片大小不得大于2M</small>
            	选择文件:<input type="file" name="file">  
        </div>
        <!--提交-->
        <div class="col-md-12">
              <input type="submit" value="提交注册">  
        </div>
    </form>
    
   		 <c:if test="${!empty error}">
	        <font color="red"><c:out value="${error}" /></font>
		</c:if>  
    
    <%-- <form action="<c:url value="/register/fileUpload"/>" method="post" enctype="multipart/form-data">  
    选择文件:<input type="file" name="file">  
    手机号码： <input type="phone" name="mobilePhone" class="form-control" id="phoneNum" placeholder="phone number">
    <input type="submit" value="提交">    --%>
</form>
</section>

<script>
    var reg = /^[^ ]{1,11}$/;/*正则*/
    var phoneNum = $('#phoneNum');
    var authCode = $('#authCode');
    $(document).ready(function(){
        $("select").select2();
    });
    $('.content-register .form2').hide();
    $('.btnMargin').on('click',function(){
        if(reg.test(phoneNum.val())&&reg.test(authCode.val())){
            $('.content-register .form2').show()
        }
    })
</script>
</body>
</html>