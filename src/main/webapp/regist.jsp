<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/7
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册</title>
    <link rel="stylesheet" href="css/reset.css" />
    <link rel="stylesheet" href="css/common.css" />
</head>
<body>
<div class="wrap login_wrap">
    <div class="content">

        <div class="logo"></div>

        <div class="login_box">
            <div class="login_form">
                <div class="login_title">
                    注册
                </div>
                <form action="regist" method="post">
                    <c:if test="${ empty error}">
                        <span style="color: red; font-size: 25px" >${error}</span>
                    </c:if>
                    <div class="form_text_ipt">
                        <input name="userName" type="text" placeholder="用户名">
                    </div>


                    <div class="ececk_warning"><span>数据不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="password" type="password" placeholder="密码">
                    </div>
                    <div class="ececk_warning"><span>数据不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="password2" type="password" placeholder="重复密码">
                    </div>
                    <div class="ececk_warning"><span>数据不能为空</span></div>

                    <div class="form_text_ipt">
                        <input name="phone" type="text" placeholder="手机号">
                    </div>
                    <div class="ececk_warning"><span>数据不能为空</span></div>


                    <div class="form_btn">
                        <button type="submit">注册</button>
                    </div>
                    <div class="form_reg_btn">
                        <span>已有帐号？</span><a href="login.jsp">马上登录</a>
                    </div>
                </form>
                <div class="other_login">
                    <div class="left other_left">
                        <span>其它登录方式</span>
                    </div>
                    <div class="right other_right">
                        <a href="#">QQ登录</a>
                        <a href="#">微信登录</a>
                        <a href="#">微博登录</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="js/jquery.min.js" ></script>
<script type="text/javascript" src="js/common.js" ></script>
</body>

</html>
