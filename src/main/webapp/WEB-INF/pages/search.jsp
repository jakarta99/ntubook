<div class="alert alert-info" role="alert">
  We found the book!!!
</div>

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
  	<div class="p-3 mb-2 bg-dark text-white">
		<div>
	        <a class="navbar-brand js-scroll-trigger" href="/">NTU Books</a>
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
  	
  	
		
			<table class="table table-bordered" >
			  <thead>
			    <tr>
			      <th scope="row" class="bg-warning">Book Details</th>
			      <th class="bg-warning">Information</th>
			      <th class="bg-warning">Picture</th>
			      
			    </tr>
			  </thead>
			  <tbody>
			  	<tr>
			      <th scope="row" class="table-secondary">書名</th>
			      <td>${result.name}</td>
			      <td rowspan="9"><img height="450" width="350" align="left" src="/upload/${result.imageFile}" alt=""></td>
			    </tr>
			    <tr>
			      <th scope="row" class="table-secondary">售價</th>
			      <td>${result.price}</td>
			      
			    </tr>
			    <tr>
			      <th scope="row" class="table-secondary">課程名稱</th>
			      <td>${result.courseName}</td>
			    </tr>
			    <tr>
			      <th scope="row" class="table-secondary">教授名稱</th>
			      <td>${result.professor}</td>
			    </tr>
			    <tr>
			      <th scope="row" class="table-secondary">開課系所</th>
			      <td>${result.college}</td>
			    </tr>
			     <tr>
			      <th scope="row" class="table-secondary">有無筆記</th>
			      <td>${result.notesOn}</td>
			    </tr>
			     <tr>
			      <th scope="row" class="table-secondary">書況（幾成新）</th>
			      <td>${result.howNew}</td>
			    </tr>
			    <tr>
			      <th scope="row" class="table-secondary">備註</th>
			      <td>${result.messages}</td>
			    </tr>
			    <tr>
			      <th scope="row" class="table-secondary">關注人數</th>
			      <td>${result.viewCount}</td>
			    </tr>
			    
			  </tbody>
			</table>
			
			<div class="text-center">
				<button type="button" class="btn btn-danger  btn-lg" id="interestBtn" onclick="alert('Thanks a lot');">我有興趣！</button>
				&nbsp;&nbsp;&nbsp;
				
				<button type="button" class="btn btn-warning  btn-lg" id="indexBtn" onclick="document.location.href='/'">查詢其他書！</button>
			</div>
		
  </body>

</html>




<!--${result.id} <br/>
${result.name} <br/>
${result.price} <br/>
${result.viewCount} <br/>

<a href='/'>Index</a>
-->