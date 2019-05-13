<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title id="page-title">TEDU_BBS-${post.postName}</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/jquery-3.3.1.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="js/bootstrap.min.js"></script>
<!--css-->
<link href="" rel="shortcut icon">
<link href="./css/ld/ld_1.css" rel="stylesheet" type="text/css">
<link href="./css/ld/ld_4.css" rel="stylesheet" type="text/css">
<link href="./css/ld/ld_2.css" rel="stylesheet" type="text/css">
<link href="./css/ld/ld_3.css" rel="stylesheet" type="text/css">
<link href="./css/ld/ld_css5.css" rel="stylesheet" type="text/css">
<link href="css/ql/post-style.css" rel="stylesheet" type="text/css" />
<script src="js/ql_post_js.js" type="text/javascript"></script>
<!--<base target="_blank">-->
<base href="." target="_blank">
<script type="text/javascript" src="./js/ld/ld_1.js" charset="utf-8"></script>
</head>

<body>
	<div class="topIndex">
		<div class="hdTop">
			<div class="hdTopCon navTopSec">
				<div class="leftNavSec">
					<a href="" target="_blank" class="linkHome"> <img alt=""
						src="imgs/ld/ld_logo.jpg">
					</a>
				</div>
				<div id="hdBefore" class="hdBefore ui-loginBefore" style="">
					<a href="" target="_blank" class="hdtReg">注册</a><span
						class="hdtLogin ui-topLogin"><div class="hdtLogBoxWrap">
							<a href="" class="btnLogin" style="color: #fff;" target="_self">登录</a>
						</div></span>
				</div>
				<div id="hdLogged" class="hdLogged ui-loginAfter"
					style="display: none;">
					<a href="" target="_self" class="hdtExit">退出</a><a href=""
						id="hdtName" class="hdtName ui-username"></a><span class="hdtWel">欢迎你</span>
				</div>
			</div>
		</div>
	</div>
	<!-- 公共头部分 end -->

	<!-- 频道头 begin-->
	<div class="channelHead">
		<div class="navNews">
			<div class="navNewsCon">
				<!-- logo begin-->
				<a target="_self" href="">
					<div class="logoNews">
						<h1></h1>
					</div>
				</a>
				<!-- logo end-->

				<!-- 导航 begin-->
				<div class="navNewsMain">
					<ul>
						<li><span><a target="_blank" href="">娱乐</a><em></em></span></li>
						<li class="cur"><span><a target="_self" href="">文史</a></span></li>
						<li><span><a target="_self" href="">股票</a></span></li>
						<li><span><a target="_self" href="">教育</a></span></li>
						<li><span><a target="_self" href="">体育</a></span></li>
						<li><span><a target="_self" href="">美食</a></span></li>
						<li><span><a target="_self" href="">育儿</a></span></li>
						<li><span><a target="_self" href="">星座</a></span></li>
					</ul>
				</div>
				<!-- 导航 end-->

				<!-- 搜索 begin-->
				<div class="navSearch">
					<form action="./imgs/ld/ld_1.jpg" method="get" id="ui-topSearch">
						<input name="q" type="text" id="ui-topSearchKeyWord"
							class="searchBox"> <input id="ui-topSearchBtn" name=""
							type="submit" class="searchBtn" value=" ">
					</form>
				</div>
				<!-- 搜索 end-->
			</div>
		</div>
	</div>
	<!-- 频道头 end-->

		<!-- 内容部分 begin-->
	<div class="container  post-block">
		<div class="row post-row">
		<div class="col-md-3"></div>
		<div class="col-md-6 post-main">
			<div class="post-title">
				<h1>${post.postName}</h1>
			</div>
			<div class="article-info-box">
				<div class="article-bar-top">
				<span class="time">发帖日期: ${post.lastUpdate}</span>
				<a class="follow-nickName" href="#" target="_blank">作者:
				 ${post.writerId}
				</a>
				<span class="read-count">阅读数：${post.viewCount}</span>
				</div>
			</div>
			<hr/>
			<div class="post-content">
			 <p>${post.postBody}</p>
			</div>
		</div>
		<div class="col-md-3"></div>
		</div>
	</div>
	<!-- 内容部分end -->
	<!-- 用户评论部分begin -->
	<div class="container  user-block">
		<div class="row user-row">
		<div class="col-md-3"></div>
		<div class="col-md-6 user-main">
			<div class="user-content"></div>
		</div>
		<div class="col-md-3"></div>
		</div>
	</div>
	<!-- 用户评论部分end -->
	<div></div>
	<!--footer部分开始-->
	<div id="footer">
		<div class="footNew" class="container">
			<!-- 链接 begin -->
			<div class="fLink">
				<div class="flinkMain marWidMain">
					<a href="#" target="_blank">达内BBS简介</a>| <a href="#"
						target="_blank">About TarenaBBS</a>| <a href="#" target="_blank">网站地图</a>|
					<a href="#" target="_blank">诚聘英才</a>| <a href="#" target="_blank">广告服务</a>|
					<a href="#" target="_blank">联系方式</a>| <a href="#" target="_blank">隐私政策</a>|
					<a href="#" target="_blank">服务条款</a>| <a href="#" target="_blank">意见反馈</a>|
					<a href="#" target="_blank">公告</a>|
				</div>
			</div>
			<!-- 链接 end -->

			<div class="copyMain">
				<em style="color: #5e5e5e; margin-left: 22px; font-style: normal;">Copyright©
					达内BBS</em>
				<ahref ="#" style="color: #5e5e5e;">版权所有</a>
			</div>
			<div></div>
		</div>
	</div>
	<!--footer部分结束-->


</body>
</html>