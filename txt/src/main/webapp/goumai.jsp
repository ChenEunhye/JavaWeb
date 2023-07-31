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
				<form action="GouMaiServlet">
		  <a  id="sort0" href="GouMaiServlet?sort=0">全部商品</li></a>
		  <form action="GouMaisServlet">
			<input class="searchText" type="search" name="keyWord">
			<input class="searchBtn" type="submit" value="搜索"></li>
		</form></div>
					<div class="wz">
						<c:forEach var="zhoubian" items="${zhoubianData.zhoubianList}">
					    <div class="item">
					      <img height=250 width=250 alt="" src="${zhoubian.dizhi}">
					      <div class="item-1">${zhoubian.xinxi}</div>
					      <div class="item-2">${zhoubian.jiage}<div class="item-2">${zhoubian.kucun}</div> 
					      <button type="button" onclick="addToCart(${zhoubian.kucun},${zhoubian.id},'buy')">购买</button></div>
					     </div>
					    </c:forEach>
						
					</div>
				</div>
			</div>
			<div class="foot">版权所属@2023陈恩惠和顾帏宇组</div>
		</div>
	</body>
	<script type="text/javascript">
		function addToCart(kucun,id,action){
			if (kucun>0){
				alert("购买成功");
				location.href = "KucunServlet?kucun="+kucun+"&id="+id+"&action="+action; 
			}else
				alert("库存不足");
			
		}
		
	
	
	</script>
</html>




