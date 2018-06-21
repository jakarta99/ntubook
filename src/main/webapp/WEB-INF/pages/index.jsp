<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>NTUbooks</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <!-- Custom styles for this template -->
    <link href="css/agency.min.css" rel="stylesheet">

  </head>

  <body id="page-top">
  	
	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
		<div class="container">
	        <a class="navbar-brand js-scroll-trigger" href="#page-top">NTU Books</a>
	        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">Menu
	        	<i class="fa fa-bars"></i>
	        </button>
	        <div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav text-uppercase ml-auto">
	        		<li class="nav-item">
	              		<a class="nav-link js-scroll-trigger" href="#categories">Categories</a>
	            	</li>
		            <li class="nav-item">
		            	<a class="nav-link js-scroll-trigger" href="#bestsellers">Bestsellers</a>
		            </li>	            
		            <li class="nav-item">
		            	<a class="nav-link js-scroll-trigger" href="#sell">Sell</a>
		            </li>
		            <li class="nav-item">
		            	<a class="nav-link js-scroll-trigger" href="#team">Team</a>
		            </li>	           
				</ul>
	    	</div>
		</div>
	</nav>

    <!-- Header -->
    <header class="masthead">
    <div class="container">
        <div class="intro-text">
        	<div class="intro-lead-in">
          		<big><big>Find The Book You Want!</big></big>
       		</div>
  	    	<form id="formsearch" action="/books/search" enctype="multipart/form-data" method="get">
        		<div class="form-row">
       	  			<div class="col-12 col-md-9">
          				<input name="allsearch" type="text" style="height:65px;font-size:20pt;" class="form-control form-control-lg" id="txtallsearch" placeholder="請輸入書名..." size="24" />
          				<p style="height:100px;"></p>
          			</div>
         			<div class="col-12 col-md-3">
          				<a href="javascript:$('#formsearch').submit();">          				
          					<button type="button" class="btn btn-block btn-lg btn-primary" style="width:200px;height:65px;font-size:25pt;">Search</button>
          				</a>
          			
         			</div>
          		</div>
        	</form>
        	        	
        </div>
    </div>
    </header>
          	

    <!-- Services -->
    <section id="categories">
    	<div class="container">
        	<div class="row">
        		<div class="col-lg-12 text-center">
            		<h2 class="section-heading text-uppercase">Categories</h2>
          		</div>
        	</div>
        
	        <div class="row text-center">
	        	<div class="col-md-4" >
					<button type="button" style="width:200px;height:250px;font-size:27pt;" class="btn btn-primary btn-lg" onclick="show1()">社科院<br>文學院<br>管理學院<br>法律學院</button>
	          	</div>
                   
		    	<div class="col-md-4">
		    		<button type="button" style="width:200px;height:250px;font-size:27pt;" class="btn btn-primary btn-lg" onclick="show2()">理學院<br>工學院<br>電資學院<br>生農學院</button>
		    	</div>
          
          		<div class="col-md-4">
		    		<button type="button" style="width:200px;height:250px;font-size:27pt;" class="btn btn-primary btn-lg " onclick="show3()">醫學院<br>生科院<br>公衛學院<br>其他通識</button>
		    	</div>
          
		        <div id="control1" style= "display: none">
			        <div class="row"  id="findByCollege1" align="center">    
			        </div>        	
		        </div>
		        
		        <div id="control2" style= "display: none">
			        <div class="row"  id="findByCollege2" align="center">    
			        </div>        	
		        </div>
		        
		        <div id="control3" style= "display: none">
			        <div class="row"  id="findByCollege3">    
			        </div>        	
		        </div>
          
        </div>
      </div>
    </section>

	<!-- Portfolio Grid -->
	<section class="bg-light" id="bestsellers">
    	<div class="container">
        	<div class="row">
         		<div class="col-lg-12 text-center">
            		<h2 class="section-heading text-uppercase">Bestsellers</h2>            
         		</div>
        	</div>
        	<div class="row" id="hotList">
         		     
        	</div>        	
        	
    	</div>
    </section>       
    

	<!-- Sell -->
    <section id="sell">
    	<div class="container">
        	<div class="row">
          		<div class="col-lg-12 text-center">
            		<h2 class="section-heading text-uppercase">Sell your book</h2>            
          		</div>
        	</div>
        	<div class="row">
          		<div class="col-lg-12">
            		<form id="contactForm" name="sentMessage" novalidate="novalidate">
              			<div class="row">
                			<div class="col-md-6">
		          				<div class="form-group">
		            				<input class="form-control" id="name" type="text" placeholder="書名" required="required" data-validation-required-message="請輸入書名">
		            				<p class="help-block text-danger"></p>
		          				</div>
		          				
		          				<div class="form-group">
						            <input class="form-control" id="price" type="text" placeholder="售價" required="required" data-validation-required-message="請輸入售價">
						            <p class="help-block text-danger"></p>
		          				</div>
		          				
								<div class="form-group">
									<input class="form-control" id="courseName" type="text" placeholder="課程名稱" required="required" data-validation-required-message="請輸入課程名稱">
		          					<p class="help-block text-danger"></p>
		          				
		          				</div>               
					          	
					          	<div class="form-group">
					            	<input class="form-control" id="courseName" type="text" placeholder="教授名稱" required="required" data-validation-required-message="請輸入教授名稱">
					            	<p class="help-block text-danger"></p>
					         	</div>
		           
						        <select style="height:35px; width:166px">
									<option value="開課學院 ">開課學院</option>
									<option value="文學院">文學院</option>
									<option value="理學院">理學院</option>
									<option value="社會科學院">社會科學院</option>
									<option value="醫學院">醫學院</option>
									<option value="工學院">工學院</option>
									<option value="生物資源暨農學院">生物資源暨農學院</option>
									<option value="管理學院">管理學院</option>
									<option value="公共衛生學院">公共衛生學院</option>
									<option value="電機資訊學院">電機資訊學院</option>
									<option value="法律學院">法律學院</option>
									<option value="生命科學院">生命科學院</option>
									<option value="其他通識">其他通識</option>
								</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				 
								<select style="height:35px; width:155px">
									<option value="有無筆記 ">有無筆記</option>
									<option value="有">有</option>
									<option value="無">無</option>
								</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				 
								<select style="height:35px; width:155px">
								 	<option value="書幾成新 ">書幾成新</option>
									<option value="全新">全新</option>
									<option value="九成">九成</option>
									<option value="七成">七成</option>
									<option value="五成">五成</option>
									<option value="三成">三成</option>
								</select> <p> </p>
				   
								<div class="form-group">
						           <textarea class="form-control" style="height:150px;" id="courseName" placeholder="想說的話"></textarea>
						           <p class="help-block text-danger"></p>
						        </div>
							</div>
				
				 			<div class="col-md-6">
				 				<form>
				   					<div class="form-group">
				     					<label for="exampleFormControlFile1"><big>上傳此書照片</big></label>
				     					<input type="file" class="form-control-file" id="exampleFormControlFile1">
				   					</div>
				 				</form>
				 			</div>				
		             
			     			<div class="clearfix"></div>
		    				<div class="col-lg-12 text-center">
		       					<div id="success"></div>
	       						<button id="sendMessageButton" class="btn btn-primary btn-lg" style="height:55px;font-size:25pt;" type="submit">Send</button>
	     					</div>
			     
   						</div>
		 			</form>
		   		</div>
			</div>
	   	</div>
	</section>
			   

   
    
    <!-- Team -->
    <section class="bg-light" id="team">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 text-center">
            <h2 class="section-heading text-uppercase">Our Amazing Team</h2>            
          </div>
        </div>
        <div class="row">
          <div class="col-sm-4">
            <div class="team-member">
              <img class="mx-auto rounded-circle" src="img/team/fang.jpg" alt="">
              <h4>FangChun</h4>            
              <ul class="list-inline social-buttons">
                <li class="list-inline-item">
                  <a href="#">
                    <i class="fa fa-envelope-square"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a href="https://www.facebook.com/profile.php?id=100003071286181"  target="_blank">
                    <i class="fa fa-facebook"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a href="#">
                    <i class="fa fa-linkedin"></i>
                  </a>
                </li>
              </ul>
            </div>
          </div>
          <div class="col-sm-4">
            <div class="team-member">
              <img class="mx-auto rounded-circle" src="img/team/chen.jpg" alt="">
              <h4>PengChen</h4>             
              <ul class="list-inline social-buttons">
                <li class="list-inline-item">
                  <a href="#">
                    <i class="fa fa-envelope-square"></i>
                    
                  </a>
                </li>
                <li class="list-inline-item">
                  <a href="https://www.facebook.com/profile.php?id=100013136956588"  target="_blank">
                    <i class="fa fa-facebook"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a href="#">
                    <i class="fa fa-linkedin"></i>
                  </a>
                </li>
              </ul>
            </div>
          </div>
          <div class="col-sm-4">
            <div class="team-member">
              <img class="mx-auto rounded-circle" src="img/team/lun.jpg" alt="">
              <h4>ChungLun</h4>          
              <ul class="list-inline social-buttons">
                <li class="list-inline-item">
                  <a href="#">
                    <i class="fa fa-envelope-square"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a href="https://www.facebook.com/alunahsieh" target="_blank">
                    <i class="fa fa-facebook"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a href="#">
                    <i class="fa fa-linkedin"></i>
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-8 mx-auto text-center">           
          </div>
        </div>
      </div>
    </section>

    
    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Contact form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Custom scripts for this template -->
    <script src="js/agency.min.js"></script>


	<script>
		function show1() {
			var x = document.getElementById("control1");
		    if (x.style.display === "none") {
		        x.style.display = "block";
		    } else {
		        x.style.display = "none";
		    }
		}
	</script>
	
	<script>
		function show2() {
			var x = document.getElementById("control2");
		    if (x.style.display === "none") {
		        x.style.display = "block";
		    } else {
		        x.style.display = "none";
		    }
		}
	</script>
	
	<script>
		function show3() {
			var x = document.getElementById("control3");
		    if (x.style.display === "none") {
		        x.style.display = "block";
		    } else {
		        x.style.display = "none";
		    }
		}
	</script>
	
	<script>
		$(function() {
			loadHot3();
		});
		
		function loadHot3() {
			$.ajax({
				url: '${pageContext.request.contextPath}/books/hot3',
				type: 'GET',
				dataType: 'json', 
			}).always(function(response){ 
									
				$(response.data).each(function(i, o) {
					
					var htmlContent = "<div class='col-md-4 col-sm-6 portfolio-item'>"
										+"<a href='${pageContext.request.contextPath}/bookDetail?id="+o.id+"' border='0'>"
										+"<img height='450' width='350' src='img/portfolio/02-calculus.jpg'>"
										+"</a>"
										+"<div class='portfolio-caption' align='center'>"
											+"<h4>"+o.name+"</h4>"
											+"<p class='text-muted' style='font-size:20pt'>"+o.price+"</p>"
										+"</div>"
									  +"</div>";
					
					
					$("#hotList").append(htmlContent);
								
				});
			});
		};
   	</script>

	<script>
		$(function() {
			loadFindByCollege1();
		});
	
		function loadFindByCollege1() {			
			$.ajax({
				url: '${pageContext.request.contextPath}/books/findByCollege1',
				type: 'GET',
				dataType: 'json',  
			}).always(function(response){ 
									
				$(response.data).each(function(i, o) {
					var htmlContent = "<div class='col-md-3 portfolio-item'>"
										+"<a href='${pageContext.request.contextPath}/bookDetail?id="+o.id+"' border='0'>"
										+"<img height='350' width='270' src='img/portfolio/03-acct.jpg'>"
										+"</a>"
										+"<div class='portfolio-caption' align='center'>"
											+"<h4>"+o.name+"</h4>"
											+"<p class='text-muted' style='font-size:20pt'>"+o.price+"</p>"
										+"</div>"
									  +"</div>";
					$("#findByCollege1").append(htmlContent);								
				});
			});
		};
	</script>
	
	<script>
		$(function() {
			loadFindByCollege2();
		});
	
		function loadFindByCollege2() {			
			$.ajax({
				url: '${pageContext.request.contextPath}/books/findByCollege2',
				type: 'GET',
				dataType: 'json',  
			}).always(function(response){ 
									
				$(response.data).each(function(i, o) {
					var htmlContent = "<div class='col-md-3 portfolio-item'>"
										+"<a href='${pageContext.request.contextPath}/bookDetail?id="+o.id+"' border='0'>"
										+"<img height='350' width='270' src='img/portfolio/03-acct.jpg'>"
										+"</a>"
										+"<div class='portfolio-caption' align='center'>"
											+"<h4>"+o.name+"</h4>"
											+"<p class='text-muted' style='font-size:20pt'>"+o.price+"</p>"
										+"</div>"
									  +"</div>";
					$("#findByCollege2").append(htmlContent);								
				});
			});
		};
	</script>
	
	<script>
		$(function() {
			loadFindByCollege3();
		});
	
		function loadFindByCollege3() {			
			$.ajax({
				url: '${pageContext.request.contextPath}/books/findByCollege3',
				type: 'GET',
				dataType: 'json',  
			}).always(function(response){ 
									
				$(response.data).each(function(i, o) {
					var htmlContent = "<div class='col-md-3 portfolio-item'>"
										+"<a href='${pageContext.request.contextPath}/bookDetail?id="+o.id+"' border='0'>"
										+"<img height='350' width='270' src='img/portfolio/03-acct.jpg'>"
										+"</a>"
										+"<div class='portfolio-caption' align='center'>"
											+"<h4>"+o.name+"</h4>"
											+"<p class='text-muted' style='font-size:20pt'>"+o.price+"</p>"
										+"</div>"
									  +"</div>";
					$("#findByCollege3").append(htmlContent);								
				});
			});
		};
	</script>
	
  </body>

</html>


<ul>
 	<li> <a href='${pageContext.request.contextPath}/books/list'>Book Admin</a></li> 
	<li> <a href='${pageContext.request.contextPath}/music/list'>Music Admin</a></li>
 	<li> <a href='${pageContext.request.contextPath}/movies/list'>Movie Admin</a></li>
	<li> <a href='${pageContext.request.contextPath}/shelfs/list'>Shelf Admin</a></li>
</ul>