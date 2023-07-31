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
	<body onload="setActionElements(${homeDate.sort},${homeDate.curPage})">
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
				
				<div class="ffl">
				<div class="title">
				<form action="ZhoubianServlet">
		  <a  id="sort0" href="ZhoubianServlet?sort=0">全部商品</li></a>
		  <a  id="sort1" href="ZhoubianServlet?sort=1">玩偶</li></a>
		  <a  id="sort2" href="ZhoubianServlet?sort=2">应援产品</li></a>
</div>
					<div class="wz">
						<c:forEach var="zhoubian" items="${zhoubianData.zhoubianList}">
					    <div class="item">
					      <img height=250 width=250 alt="" src="${zhoubian.dizhi}">
					      <div class="item-1">${zhoubian.xinxi}</div>
					      <div class="item-2">${zhoubian.jiage}<div class="item-2">${zhoubian.kucun}</div></div>
					     </div>
					    </c:forEach>
						
					</div>
				</div>
			</div>
			<div class="foot">版权所属@2023陈恩惠和顾帏宇组</div>
		</div>
	</body>

</html>




