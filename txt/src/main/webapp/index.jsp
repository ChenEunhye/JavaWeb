<!DOCTYPE html>
<html>
	<head>
		<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>TOMORROW X TOGETHER</title>
		<link rel="stylesheet" type="text/css" href="css/indexstyle.css"/>
	</head>
	<body onload="setActionElements(${homeDate.sort})">
		<div class="page">
			<div class="nav">
				<ul class="fr">
					<a><li><nav >
        		<c:if test="${empty user }">
					<div><a href="login.jsp">亲，请登录</a>
					<a href="register.jsp">注册</a></div>		
				</c:if>
				<c:if test="${!empty user }">
					<div><a href="login.jsp" > 欢迎您${user.usr}</a>
					<a href="LoginServlet?logout">退出</a></div>	
				</c:if>
    			</nav></li></a>
    			    <a href="index.jsp"><li>首页</li></a>
					<a href="jieshao.jsp"><li>团队介绍</li></a>
					<a href="runphoto.jsp"><li>精选照片</li></a>
					<a href="runzhoubian.jsp"><li>粉丝周边</li></a>
					<a href="rungoumai.jsp"><li>购买平台</li></a>
					<a href="runhudong.jsp"><li>匿名表白墙</li></a>
				</ul>
			</div>	
			
			<div class="mid">
				<div class="banner"><img src="images/xiaobeijing.png" alt=""></div>
				<div class="left fl">
					<p class="title">简介</p>
					<div class="jj">
						<img src="images/touxiang.jpg" alt="">
					</div>
				
				</div>
				<div class="right fl">
					<p class="title">团队简介</p>
					<div class="wz">
						
						<p>TOMORROW X TOGETHER，简称TXT，是BigHit Entertainment于2019年3月4日推出的韩国男子演唱组合，
						由崔秀彬 (SOOBIN)、崔然竣 (YEONJUN)、崔杋圭 (BEOMGYU)、姜太显 (TAEHYUN)、休宁凯 (HUENINGKAI)5位成员组成，
						崔秀彬担任队长。官方粉丝名为MOA 。</p>
					</div>
				</div>
			</div>
			<div class="foot">版权所属@陈恩惠和顾帏宇组</div>
		</div>
	</body>
</html>




