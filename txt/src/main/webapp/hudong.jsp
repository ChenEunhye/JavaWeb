<!DOCTYPE html>
<html>
	<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>TOMORROW X TOGETHER</title>
<title>粉丝互动</title>

<style type="text/css">
*{margin:0; padding:0;}
body,input{font-size:14px; line-height:24px; color:#333; font-family:Microsoft yahei, Song, Arial, Helvetica, Tahoma, Geneva;}
h1{margin-bottom:15px; height:100px; line-height:100px; text-align:center; font-size:24px; color:#fff; background:black;}
#content #post,#comment p{zoom:1;}
#content #post:after,#comment p:after{display:block; height:0; clear:both; visibility:hidden; overflow:hidden; content:'.';}
.transition{-webkit-transition:all 0.5s linear; -moz-transition:all 0.5s linear; -o-transition:all 0.5s linear; -ms-transition:all 0.5s linear; transition:all 0.5s linear;}
#content{margin:0 auto; width:960px; overflow:hidden;}
#content #post{margin-bottom:15px; padding-bottom:15px; border-bottom:1px #d4d4d4 dashed;
	   height: 556px;
   }
#content #post textarea{display:block; margin-bottom:10px; padding:5px; width:948px; height:390px; border:1px #d1d1d1 solid; border-radius:5px; resize:none; outline:none;}
#content #post textarea:hover{border:1px #9bdf70 solid; background:#f0fbeb;}
#content #post #postBt,#content #post #clearBt{margin-left:5px; padding:3px; float:right;}
#comment{overflow:hidden;}
#comment p{margin-bottom:10px; padding:10px; border-radius:5px;}
#comment p:nth-child(odd){border:1px solid #e3e197; background:#ffd;}
#comment p:nth-child(even){border:1px solid #adcd3c; background:#f2fddb;}
/*#comment p span{display:inline; float:left;}*/
#comment p .right{text-align:right;}
#comment p .msg{width:738px;}
#comment p .datetime{width:200px; color:#999; text-align:right;}
</style>
<link rel="stylesheet" type="text/css" href="css/indexstyle.css"/>
</head>
<body>

              

<div id="content">
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
	<div id="post">
		<div style="background:#3EADC5 ;height:30px;">
		</div>
		 <form action="HuDongServlet">
		<input type="text" name="nicheng" placeholder="输入昵称"><br>
		<div>
			<textarea class="transition" name="pinglun" placeholder="输入评论"></textarea>
		</div>
		<input name="userId" type="hidden" value="${user.id}"/>
		<input id="postBt" type="submit" style="border:none; background-color:#3EADC5; color:white;border-radius:5px; width:80px; height:30px;" value="发表留言">
		</form>
	</div>
	<div id="comment">
	 <form action="HuDongServlet">
	<c:forEach var="hudong" items="${hudongData}">
           		 <input class="title" value="${hudong.nicheng}:${hudong.pinglun}">
           		 <!--<input id="postBt" type="submit" style="border:none; background-color:#3EADC5; color:white;border-radius:5px; width:80px; height:30px;" value="删除">-->
           		 <c:if test="${user.id == hudong.userId}">
           		 	<a href="HuDongDeleteServlet?id=${hudong.id}" style="color:blue;">删除</a>
           		 </c:if>
           		 <!-- <p>${user.id}-----${hudong.userId}</p> -->
           		 <!---<<input value="${hudong.id}">>-->
		</c:forEach></form>
	</div>
</div>
</body>
</html>