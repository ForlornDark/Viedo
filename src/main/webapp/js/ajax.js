	$(function () {
		selectList();
		selectList1();
		
		$("#login").click(function() {
			$.post("findUserByName.do",{"name":$("#signin-username").val(),"password":$("#signin-password").val()},function(data){
  				if(data == 1) {		
  					$(".top_login").css('display','none'); 
  					history.go(0);
  				} else {
  					$(".fieldset_error").show(); 
  				
  				}
  			},"text");
		});
		$("#sihnup").click(function() {
			$.post("sinup.do",{"name":$("#signup-username").val(),"password":$("#signup-password").val(),"email":$("#signup-email").val()},function(data){
  				if(data == 1) {		
  					$(".top_login").css('display','none'); 
  					history.go(0);
  				} else {
  					$(".fieldset_error2").show(); 
  				
  				}
  			},"text");
		});
		$(".search").click(function() {
			$.post("search.do",{"key":$("#key").val()},function(data){
					$("#ull").remove();
					var videoList='<ul id="ull">'
					$.each($.parseJSON(data),function(j,vi){
						
						videoList+='<li><a title="'+vi.name+'   '+vi.score+'分" href="detail.do?vid='+vi.vid+'"><img src="http://t.dyxz.la/upload/img/201612/poster_20161215_8653110_b.jpg"><span class="item_score">'+vi.score+'</span></a><h3><a href="detail.do?vid='+vi.vid+'">'+vi.name+'</a></h3></li>';
					});	
					videoList+='</ul>';
					console.log(videoList);
					$(".list_video").append(videoList);
  			},"text");
		});
	});
	function logout() {
		$.post("logout.do",function(data){
			if(data == 1) {
				history.go(0) ;
  				console.log("退出成功");
  			} else {
  				console.log("退出失败");
  			}
		});
	}