<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>视频分享网站</title>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<link rel="stylesheet" type="text/css" href="css/login.css" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script src="js/index.js"></script>
</head>

<body>
	
<div id="main">
	<div class="demo">
		<nav class="main_nav">
			<ul>
				<li><a class="cd-signin" href="#0">登录</a></li>
				<li><a class="cd-signup" href="#0">注册</a></li>
			</ul>
		</nav>
	</div>
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

					<p class="fieldset">
						<input class="full-width2" type="submit" value="登 录">
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

					<p class="fieldset">
						<input class="full-width2" type="submit" value="注册新用户">
					</p>
				</form>
			</div>
			<a href="#0" class="cd-close-form">关闭</a>
		</div>
	</div> 
	
</div>
</body>
</html>
