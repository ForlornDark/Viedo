<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Single</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/detail.css" rel="stylesheet" type="text/css" media="all">
<script type="text/javascript" src="js/detail.js"></script>
<link rel="stylesheet" href="css/normalize.min.css">
<link rel="stylesheet" href="css/score.css">
<script src="js/jquery.barrating.js"></script>
<script src="js/score.js"></script>
</head>
<div class="top_topic">
	<h1><a href="index.jsp">视频分享网站</a></h1>
	<input type="text" id="key" placeholder="输入搜索关键字" class="key">
	<input type="button"  value="搜索" class="search">
</div>	
	   <div class="content">
      	   <div class="movie_top">
      	         <div class="col-md-9 movie_box">
                        <div class="grid images_3_of_2">
                        	<div class="movie_image">
                                <span class="movie_rating">${video.score }</span>
                                <img src="img/single.jpg" class="img-responsive" alt="">
                            </div>
                            
                        </div> 
                        <div class="desc1 span_3_of_2">
                        <h2>${video.name }</h2>
                        <c:choose>
                        	<c:when test="${video.area==1 }">
                        		<p class="movie_option"><strong>地区: </strong><i>大陆</i></p>
                        	</c:when>
                        	<c:when test="${video.area==2 }">
                        		<p class="movie_option"><strong>地区: </strong><i>香港</i></p>
                        	</c:when>
                        	<c:when test="${video.area==3 }">
                        		<p class="movie_option"><strong>地区: </strong><i>美国</i></p>
                        	</c:when>
                        	<c:when test="${video.area==4 }">
                        		<p class="movie_option"><strong>地区: </strong><i>韩国</i></p>
                        	</c:when>
                        	<c:when test="${video.area==5 }">
                        		<p class="movie_option"><strong>地区: </strong><i>日本</i></p>
                        	</c:when>
                        	<c:when test="${video.area==6 }">
                        		<p class="movie_option"><strong>地区: </strong><i>台湾</i></p>
                        	</c:when>
                        	<c:when test="${video.area==7 }">
                        		<p class="movie_option"><strong>地区: </strong><i>法国</i></p>
                        	</c:when>
                        	<c:when test="${video.area==8 }">
                        		<p class="movie_option"><strong>地区: </strong><i>英国</i></p>
                        	</c:when>                
                        	<c:otherwise>
                        		<p class="movie_option"><strong>地区: </strong><i>其他</i></p>
                        	</c:otherwise>
                        </c:choose>
                        	<c:choose>
                        	<c:when test="${video.type==1 }">
                        		<p class="movie_option"><strong>类型: </strong><i>动作</i></p>
                        	</c:when>
                        	<c:when test="${video.type==2 }">
                        		<p class="movie_option"><strong>类型: </strong><i>喜剧</i></p>
                        	</c:when>
                        	<c:when test="${video.type==3 }">
                        		<p class="movie_option"><strong>类型: </strong><i>爱情</i></p>
                        	</c:when>
                        	<c:when test="${video.type==4 }">
                        		<p class="movie_option"><strong>类型: </strong><i>科幻</i></p>
                        	</c:when>
                        	<c:when test="${video.type==5 }">
                        		<p class="movie_option"><strong>类型: </strong><i>灾难</i></p>
                        	</c:when>
                        	<c:when test="${video.type==6 }">
                        		<p class="movie_option"><strong>类型: </strong><i>惊悚</i></p>
                        	</c:when>
                        	<c:when test="${video.type==7 }">
                        		<p class="movie_option"><strong>类型: </strong><i>动画</i></p>
                        	</c:when>
                        	<c:when test="${video.type==8 }">
                        		<p class="movie_option"><strong>类型: </strong><i>奇幻</i></p>
                        	</c:when>   
                        	<c:when test="${video.type==9 }">
                        		<p class="movie_option"><strong>类型: </strong><i>战争</i></p>
                        	</c:when>                 
                        	<c:otherwise>
                        		<p class="movie_option"><strong>类型: </strong><i>其他</i></p>
                        	</c:otherwise>
                        </c:choose>
                        	<p class="movie_option"><strong>上映日期: </strong><i>${video.release }</i></p>
                        	<p class="movie_option"><strong>更新日期: </strong><i>${video.update }</i></p>
                        		<p class="movie_option"><strong>下载地址: </strong></p>
                        		<input type="text" readonly="readonly" class="url_text" value="thunder://QUFodHRwOi8vZGwxMTUuODBzLmltOjkyMC8xNzA1L+mAn2TkuI7mv4Dmg4U4L+mAn2TkuI7mv4Dmg4U4Lm1wNFpa"> 
                        		
                        	<div class="down_btn"><a class="btn1" href="" onclick="copyToClipBoard2()">点击复制</a></div>
                         <div class="down_btn"><a class="btn1" href="">点击下载</a></div>
                         </div>
                        <div class="clearfix"> </div>
                        <p class="m_4">影视详情</p>
		                <form method="post" action="">
					<div class="text">
			                   <textarea placeholder="评论内容" ></textarea>
			                </div>
			                	<div class="box-body">
			                
								<select id="example-f" name="rating">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
								</select>
								
							</div>
			                <div class="form-submit1">
					           <input name="submit" type="submit" id="submit" value="Submit Your Message"><br>
					        </div>
							<div class="clearfix"></div>
                 		</form>
		                <div class="single">
		                
		                <ul class="single_list">
		                <c:forEach items="${comments}" var="c" varStatus="status">
					        <li>
					            <div class="data">
					                <div class="title">用户ID： ${c.uid}&nbsp;&nbsp;&nbsp;<span style="color: blue;">${c.date}</span>
					                </div>
					                <p style="color: #000">${c.content }</p>
					            </div>
					            <div class="clearfix"></div>
					        </li>
					     </c:forEach>
			  			</ul>
                      </div>
                      </div>
                      <div class="clearfix"> </div>
                  </div>
           </div>
  
</body>
</html>