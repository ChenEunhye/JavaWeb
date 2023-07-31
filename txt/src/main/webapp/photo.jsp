<!DOCTYPE html>

<html lang="en">

<head>

    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/indexstyle.css"/>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>照片墙</title>

    <style>

        body {

            margin: 0px;
			 background-image: url(images/photobeijing.jpg);
           

        }

        #div1 {

            width: 100%;

            height: 50px;

            background: rgba(50, 161, 235, 0.966);
            

        }/*导航栏*/

        #div2 {

            background-image: url(images/photobeijing.jpg);

            position:fixed;

            top: 0;

            left: 0;

            width:100%;

            height:100%;

            min-width: 1000px;

            z-index:-10;

            zoom: 1;

            background-color: #fff;

            background-repeat: no-repeat;

            background-size: cover;

            -webkit-background-size: cover;

            -o-background-size: cover;

            background-position: center 0;

        }

        #photo_box{

            width: 280px;

            height: 400px;

            position: fixed;

            left: 0;

            right: 0;

            top:0;

            bottom: 0;

            margin: 200px auto;

            transform-style: preserve-3d;/*表示所有子元素在3D空间中呈现*/

            transform: rotateX(-5deg) rotateY(0deg);

            animation: run 30s linear infinite;/*循环执行run动画，每30秒执行一次*/

        }

 

        /*设置图像大小、边框、圆角、位置*/

        #photo_box img{

            width: 250px;

            height: 350px;

            border: 5px solid #ccc;

            border-radius: 5px;

            position: absolute;

            left: 0;

            top: 0;

        }

 

        /*依次设置图像盒子中每个图像旋转后位置*/

        #photo_box img:nth-child(1){

            transform: rotateY(0deg) translateZ(500px);

        }

        #photo_box img:nth-child(2){

            transform: rotateY(36deg) translateZ(500px);

        }

        #photo_box img:nth-child(3){

            transform: rotateY(72deg) translateZ(500px);

        }

        #photo_box img:nth-child(4){

            transform: rotateY(108deg) translateZ(500px);

        }

        #photo_box img:nth-child(5){

            transform: rotateY(144deg) translateZ(500px);

        }

        #photo_box img:nth-child(6){

            transform: rotateY(180deg) translateZ(500px);

        }

        #photo_box img:nth-child(7){

            transform: rotateY(216deg) translateZ(500px);

        }

        #photo_box img:nth-child(8){

            transform: rotateY(252deg) translateZ(500px);

        }

        #photo_box img:nth-child(9){

            transform: rotateY(288deg) translateZ(500px);

        }

        #photo_box img:nth-child(10){

            transform: rotateY(324deg) translateZ(500px);

        }

        #photo_box img:nth-child(11){

            transform: rotateY(360deg) translateZ(500px);

        }

 

            /*采用@keyframes 规则创建run动画。*/

        @keyframes run {

            0%{transform: rotateX(0deg) rotateY(0deg);

            }

            25%{transform: rotateX(10deg) rotateY(90deg);

            }

            50%{transform: rotateX(0deg) rotateY(180deg);

            }

            75%{transform: rotateX(-10deg) rotateY(270deg);

            }

            100%{transform: rotateX(0deg) rotateY(360deg);

            }

        }

        #text1 {

            float: left;

            color:#fff;

            width: 150px;

            padding:12px 0;

            height: 50px;

        }

        #text2 {

            float: right;

            width: 100px;

            color:#fff;

            padding:12px 0;

            height: 50px;

        }

        #text3 {

            float: right;

            width: 100px;

            color:#fff;

            padding:12px 0;

            height: 50px;

        }

 

    </style>

</head>

<body onload="setActionElements(${homeDate.sort},${homeDate.curPage})"
		 style="background-image: url(images/photobeijing.jpg)">

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
			<button onclick="eject()" style="color:white">点击这里</button>
    <div id="div2">

        
<button onclick="eject()" style="color:#fff;">点击这里</button>
	<div id="photo_box" style="visibility:hidden">
		<c:forEach var="photo" items="${photoData}">
    		<img src="${photo.dizhi}">
		</c:forEach>
	</div>
        </div>

    

</body>

<script type="text/javascript">
	function eject(){
		var aa = document.getElementById("photo_box")
		aa.style.visibility="visible"
	}
</script>
</html>
