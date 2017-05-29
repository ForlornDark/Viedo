<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>视频分享网站</title>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<link rel="stylesheet" type="text/css" href="css/login.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath }/js/index.js"></script>
<script src="${pageContext.request.contextPath }/js/ajax.js"></script>
<script type="text/javascript">
	
	function selectList() {
		 $.ajax({
				url : "selectList.do",
				type : "post",
				dataType:"json",
				contentType : "application/json;charset=UTF-8",
				cache : false,
				success : function(data) {
			
					var videoList=''
					$.each(data,function(i,v){
						
						videoList+='<li><a title="'+v.name+'   '+v.score+'分" href="detail.do?vid='+v.vid+'"><img src="http://t.dyxz.la/upload/img/201612/poster_20161215_8653110_b.jpg"><span class="item_score">'+v.score+'</span></a><h3><a href="detail.do?vid='+v.vid+'">'+v.name+'</a></h3></li>';
					});	
				
					console.log(videoList);
					$("#ull").append(videoList);
				}	
		});
	}
	function selectList1() {
		 $.ajax({
			url : "selectList1.do",
			type : "post",
			dataType:"json",
			contentType : "application/json;charset=UTF-8",
			cache : false,
			success : function(data) {
				
				//console.log(data);
				var newDate = new Date();
				var videoList=''
				$.each(data,function(i,v){
					
					videoList+='<li><h4>'+v.vid+'</h4><a href="detail.do?vid='+v.vid+'">'+v.name+'</a><span>'+formatDateTime(v.update)+'</span></li>';
				});	
				
				console.log(videoList);
				$("#ull2").append(videoList);
			}	
		});
	}
	function formatDateTime(inputTime) {  
		    var date = new Date(inputTime);
		    var y = date.getFullYear();  
		    var m = date.getMonth() + 1;  
		    m = m < 10 ? ('0' + m) : m;  
		    var d = date.getDate();  
		    d = d < 10 ? ('0' + d) : d;  
		    var h = date.getHours();
		    h = h < 10 ? ('0' + h) : h;
		    var minute = date.getMinutes();
		    var second = date.getSeconds();
		    minute = minute < 10 ? ('0' + minute) : minute;  
		    second = second < 10 ? ('0' + second) : second; 
		    return y + '-' + m + '-' + d;  
	}
	

</script>
</head>
<body>
<div class="top_topic">
	<h1><a href="index.jsp">视频分享网站</a></h1>
	<input type="text" id="key" placeholder="输入搜索关键字" class="key">
	<input type="button"  value="搜索" class="search">
</div>	
<c:choose>
	<c:when test="${!empty sessionScope.user }">
		<nav class="main_nav2" style="position:absolute;left:70%;top:20px;">
				<ul>
					<li>欢迎你！${sessionScope.user.name }</li>
					<li><input onclick="logout()" type="button" value="退出"></li>
				</ul>
		</nav>
	</c:when>
	<c:otherwise>
		<nav class="main_nav">
					<ul>
						<li><a class="cd-signin" href="#0">登录</a></li>
						<li><a class="cd-signup" href="#0">注册</a></li>
					</ul>
		</nav>
	</c:otherwise>
</c:choose>
<div class="top_login">
	<div class="cd-user-modal"> 
		<div class="cd-user-modal-container">
			<ul class="cd-switcher">
				<li><a href="#0" class="selected">用户登录</a></li>
				<li><a href="#0">注册新用户</a></li>
			</ul>

			<div id="cd-login"> <!-- 登录表单 -->
				<form class="cd-form">
					<p class="fieldset">
						<label class="image-replace cd-username" for="signin-username">用户名</label>
						<input class="full-width has-padding has-border" id="signin-username" type="text" placeholder="输入用户名">
					</p>

					<p class="fieldset">
						<label class="image-replace cd-password" for="signin-password">密码</label>
						<input class="full-width has-padding has-border" id="signin-password" type="text"  placeholder="输入密码">
					</p>

					<p class="fieldset">
						<input type="checkbox" id="remember-me" checked>
						<label for="remember-me">记住登录状态</label>
					</p>

					<p class="fieldset_error" style="display:none;">
						<span style="color:red;">登录失败，请检查账户密码是否正确！</span>
					</p>
					<p class="fieldset">
						<input id="login" class="full-width2" type="button" value="登 录">
					</p>
				</form>
			</div>

			<div id="cd-signup"> <!-- 注册表单 -->
				<form class="cd-form">
					<p class="fieldset">
						<label class="image-replace cd-username" for="signup-username">用户名</label>
						<input class="full-width has-padding has-border" id="signup-username" type="text" placeholder="输入用户名">
					</p>

					<p class="fieldset">
						<label class="image-replace cd-email" for="signup-email">邮箱</label>
						<input class="full-width has-padding has-border" id="signup-email" type="email" placeholder="输入mail">
					</p>

					<p class="fieldset">
						<label class="image-replace cd-password" for="signup-password">密码</label>
						<input class="full-width has-padding has-border" id="signup-password" type="text"  placeholder="输入密码">
					</p>

					<p class="fieldset">
						<input type="checkbox" id="accept-terms">
						<label for="accept-terms">我已阅读并同意 <a href="#0">用户协议</a></label>
					</p>
					<p class="fieldset_error2" style="display:none;">
						<span style="color:red;">用户名或邮箱已存在！</span>
					</p>
					<p class="fieldset">
						<input id="sihnup" class="full-width2" type="button" value="注册新用户">
					</p>
				</form>
			</div>
		</div>
	</div> 
</div>

  <div class="block3">
		<h3>热门电影</h3>
		<ul id="ull2">
			
			
		</ul>
		
  </div>
  <div class="block2">
    <div class="top">
		<ul>
			<li>类型</li>
			<li class="type_selected"><a href="findVideoByType.do?type=1">动作</a></li>
			<li><a href="findVideoByType.do?type=2">喜剧</a></li>
			<li><a href="findVideoByType.do?type=3">爱情</a></li>
			<li><a href="findVideoByType.do?type=4">科幻</a></li>
			<li><a href="findVideoByType.do?type=5">灾难</a></li>
			<li><a href="findVideoByType.do?type=6">惊悚</a></li>
			<li><a href="findVideoByType.do?type=7">动画</a></li>
			<li><a href="findVideoByType.do?type=8">奇幻</a></li>
			<li><a href="findVideoByType.do?type=9">战争</a></li>
			<li><a href="findVideoByType.do?type=10">其他</a></li>
		</ul><br>
		<ul>
			<li>地区</li>
			<li><a href="findVideoByArea.do?area=1">大陆</a></li>
			<li><a href="findVideoByArea.do?area=2">香港</a></li>
			<li><a href="findVideoByArea.do?area=3">美国</a></li>
			<li><a href="findVideoByArea.do?area=4">韩国</a></li>
			<li><a href="findVideoByArea.do?area=5">日本</a></li>
			<li><a href="findVideoByArea.do?area=6">台湾</a></li>
			<li><a href="findVideoByArea.do?area=7">法国</a></li>
			<li><a href="findVideoByArea.do?area=8">英国</a></li>
			<li><a href="findVideoByArea.do?area=9">其他</a></li>
			
		</ul><br>
		<ul>
			<li>年代</li>
			<li><a>2017</a></li>
			<li><a>2016</a></li>
			<li><a>2015</a></li>
			<li><a>2014</a></li>
			<li><a>2013</a></li>
			<li><a>2012</a></li>
			<li><a>2011</a></li>
			<li><a>2010</a></li>
			<li><a>00年代</a></li>
			<li><a>90年代</a></li>
		</ul><br>
	</div>
	
	<div class ="order">
		<ul> 
			<li><a>最新</a></li>
			<li><a href="findVideosByDowncount.do">最热</a></li>
			<li><a href="findVideosByScore.do">评分最高</a></li>
		</ul>
	</div><br>
	

	<div class="list_video">
		<ul id="ull">
		<c:if test="${videos }==null">
		<span style="color: blue;font-size: 40px">出错啦，没有相关视频！！！</span>
		</c:if>
		<c:forEach items="${videos }" var="v" varStatus="status">
			<li><a title="${v.name}   ${ v.score}分" href="detail.do?vid=${v.vid }"><img src="http://t.dyxz.la/upload/img/201612/poster_20161215_8653110_b.jpg"><span class="item_score">${ v.score}</span></a><h3><a href="detail.do?vid=${v.vid }">${v.name}</a></h3></li>
		</c:forEach>
		</ul>
		
	</div>
	<br>
	<div class="pager">
			<a>上一页</a>
			<a>1</a>
			<strong>2</strong>
			<a>3</a>
			<a>4</a>
			<a>5</a>
			<a>下一页</a>
	</div>
  </div>
  
</body>
</html>
