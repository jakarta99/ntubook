<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Agency - Start Bootstrap Theme</title>

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
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
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
  	    <form>
          <div class="form-row">
       	  	<div class="col-12 col-md-9">
          		<input type="search" style="height:65px;font-size:20pt;" class="form-control form-control-lg"  placeholder="Enter the book...">
          		<p style="height:100px;"></p>
          	</div>
         	<div class="col-12 col-md-3">
          		<button type="submit" class="btn btn-block btn-lg btn-primary" style="width:200px;height:65px;font-size:25pt;">Search</button>
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
          <div class="col-md-4">
            <span class="fa-stack fa-4x">
              <i class="fa fa-circle fa-stack-2x text-primary"></i>
              <i class="fas fa-chalkboard-teacher fa-stack-1x fa-inverse"></i>
            </span>
            <h4 class="service-heading">Required Courses</h4>
          </div>
          <div class="col-md-4">
            <span class="fa-stack fa-4x">
              <i class="fa fa-circle fa-stack-2x text-primary"></i>
              <i class="fas fa-check-circle fa-stack-1x fa-inverse"></i>
            </span>
            <h4 class="service-heading">Elective Courses</h4>
          </div>
          <div class="col-md-4">
            <span class="fa-stack fa-4x">
              <i class="fa fa-circle fa-stack-2x text-primary"></i>
              <i class="fas fa-paper-plane fa-stack-1x fa-inverse"></i>
            </span>
            <h4 class="service-heading">General Courses</h4>
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
        <div class="row">
          <div class="col-md-4 col-sm-6 portfolio-item">
            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal1">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fa fa-plus fa-3x"></i>
                </div>
              </div>
              <img height="450" width="350" src="img/portfolio/01-thumbnail.jpg" alt="">
            </a>
            <div class="portfolio-caption" align="center"> <p>
              <h4>Book1</h4>
              <p class="text-muted">Price1</p>
            </div>
          </div>
          <div class="col-md-4 col-sm-6 portfolio-item">
            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal2">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fa fa-plus fa-3x"></i>
                </div>
              </div>
              <img height="450" width="350" src="img/portfolio/02-thumbnail.jpg" alt="">
            </a>
            <div class="portfolio-caption" align="center"> <p> 
              <h4>Book2</h4>
              <p class="text-muted">Price2</p>
            </div>
          </div>
          <div class="col-md-4 col-sm-6 portfolio-item">
            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal3">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fa fa-plus fa-3x"></i>
                </div>
              </div>
              <img height="450" width="350" src="img/portfolio/03-thumbnail.jpg" alt="">
            </a>
            <div class="portfolio-caption" align="center"> <p>
              <h4>Book3</h4>
              <p class="text-muted">Price3</p>
            </div>
          </div>          
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
		           <select style="height:35px; width:100px">
					 <option value="開課系所 ">開課系所</option>
					 <option value="國企系">國企系</option>
					 <option value="經濟系">經濟系</option>
				   </select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				   <select style="height:35px; width:100px">
					 <option value="有無筆記 ">有無筆記</option>
					 <option value="有">有</option>
					 <option value="無">無</option>
				   </select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				   <select style="height:35px; width:100px">
				 	 <option value="書幾成新 ">書幾成新</option>
					 <option value="全新">全新</option>
					 <option value="九成">九成</option>
					 <option value="七成">七成</option>
					 <option value="五成">五成</option>
					 <option value="三成">三成</option>
				   </select> <p> </p>
				   <div class="form-group">
		            <textarea class="form-control" style="height:150px;" id="courseName" placeholder="想說的話" required="required" data-validation-required-message="想說的話"></textarea>
		            <p class="help-block text-danger"></p>
		          </div>
				 </div>
				 <div class="col-md-6">
                  <div class="form-group">
                    <textarea class="form-control" style="height:417px;" id="message" placeholder="上傳照片" required="required" data-validation-required-message="上傳照片"></textarea>
                    <p class="help-block text-danger"></p>
                  </div>
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
              <img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
              <h4>FangChun</h4>            
              <ul class="list-inline social-buttons">
                <li class="list-inline-item">
                  <a href="#">
                    <i class="fa fa-twitter"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a href="#">
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
              <img class="mx-auto rounded-circle" src="img/team/2.jpg" alt="">
              <h4>PengChen</h4>             
              <ul class="list-inline social-buttons">
                <li class="list-inline-item">
                  <a href="#">
                    <i class="fa fa-twitter"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a href="#">
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
              <img class="mx-auto rounded-circle" src="img/team/3.jpg" alt="">
              <h4>ChungLun</h4>          
              <ul class="list-inline social-buttons">
                <li class="list-inline-item">
                  <a href="#">
                    <i class="fa fa-twitter"></i>
                  </a>
                </li>
                <li class="list-inline-item">
                  <a href="#">
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

    

   
    <!-- Footer -->
    <footer>
      <div class="container">
        <div class="row">
          <div class="col-md-4">
            <span class="copyright">Copyright &copy; Your Website 2018</span>
          </div>
          <div class="col-md-4">
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-twitter"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
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
          <div class="col-md-4">
            <ul class="list-inline quicklinks">
              <li class="list-inline-item">
                <a href="#">Privacy Policy</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Terms of Use</a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </footer>
    
    <!-- Portfolio Modals -->

    <!-- Modal 1 -->
    <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="close-modal" data-dismiss="modal">
            <div class="lr">
              <div class="rl"></div>
            </div>
          </div>
          <div class="container">
            <div class="row">
              <div class="col-lg-8 mx-auto">
                <div class="modal-body">
                  <!-- Project Details Go Here -->
                  <h2 class="text-uppercase">Book1</h2>
                  
                  <div class="container">
			        <div class="row">
			          <div class="col-lg-12">
			          	<div class="col-md-6">
                  		  <img height="450" width="350" align="left" src="img/portfolio/01-full.jpg" alt="">
                  		</div>
                  		<div class="col-md-10">
                  			<p style="font-size:15pt;">售價：</p>
                  			<p style="font-size:15pt;">課程名稱：</p>
                  			<p style="font-size:15pt;">教授名稱：</p>
                  			<p style="font-size:15pt;">開課系所：</p>
                  			<p style="font-size:15pt;">有無筆記：</p>
                  			<p style="font-size:15pt;">書幾成新：</p>
                  			<p style="font-size:15pt;">想說的話：</p>
                  		</div>
                  	  </div>
                  	</div>
                 </div>
                
                 <button class="btn btn-primary" data-dismiss="modal" type="button"> 連繫賣家</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Modal 2 -->
    <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="close-modal" data-dismiss="modal">
            <div class="lr">
              <div class="rl"></div>
            </div>
          </div>
          <div class="container">
            <div class="row">
              <div class="col-lg-8 mx-auto">
                <div class="modal-body">
                  <!-- Project Details Go Here -->
                  <h2 class="text-uppercase">Book2</h2>
                  <div class="container">
			        <div class="row">
			          <div class="col-lg-12">
			          	<div class="col-md-6">
                  			<img height="450" width="350" align="left" src="img/portfolio/02-full.jpg" alt="">
                  		</div>
                  		<div class="col-md-10">
                  			<p style="font-size:15pt;">售價：</p>
                  			<p style="font-size:15pt;">課程名稱：</p>
                  			<p style="font-size:15pt;">教授名稱：</p>
                  			<p style="font-size:15pt;">開課系所：</p>
                  			<p style="font-size:15pt;">有無筆記：</p>
                  			<p style="font-size:15pt;">書幾成新：</p>
                  			<p style="font-size:15pt;">想說的話：</p>
                  		</div>
                  	  </div>
                  	</div>
                 </div>
                  
                  <button class="btn btn-primary" data-dismiss="modal" type="button"> 連繫賣家</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Modal 3 -->
    <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="close-modal" data-dismiss="modal">
            <div class="lr">
              <div class="rl"></div>
            </div>
          </div>
          <div class="container">
            <div class="row">
              <div class="col-lg-8 mx-auto">
                <div class="modal-body">
                  <!-- Project Details Go Here -->
                  <h2 class="text-uppercase">Book3</h2>
                  <div class="container">
			        <div class="row">
			          <div class="col-lg-12">
			          	<div class="col-md-6">
                  			<img height="450" width="350" align="left" src="img/portfolio/03-full.jpg" alt="">
                        </div>
                        <div class="col-md-10">
                  			<p style="font-size:15pt;">售價：</p>
                  			<p style="font-size:15pt;">課程名稱：</p>
                  			<p style="font-size:15pt;">教授名稱：</p>
                  			<p style="font-size:15pt;">開課系所：</p>
                  			<p style="font-size:15pt;">有無筆記：</p>
                  			<p style="font-size:15pt;">書幾成新：</p>
                  			<p style="font-size:15pt;">想說的話：</p>
                  		</div>
                  	  </div>
                  	</div>
                 </div>
                 <button class="btn btn-primary" data-dismiss="modal" type="button"> 連繫賣家</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

   
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

  </body>

</html>


<ul>
 	<li> <a href='${pageContext.request.contextPath}/books/list'>Book Admin</a></li> 
	<li> <a href='${pageContext.request.contextPath}/music/list'>Music Admin</a></li>
 	<li> <a href='${pageContext.request.contextPath}/movies/list'>Movie Admin</a></li>
	<li> <a href='${pageContext.request.contextPath}/shelfs/list'>Shelf Admin</a></li>
</ul>