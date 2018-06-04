<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html lang = "en">
	<head>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    	<meta name="description" content="">
    	<meta name="author" content="">

    	<title>Movie List</title>

    	<!-- Bootstrap core CSS -->
    	<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    	<!-- Custom fonts for this template -->
    	<link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    	<link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    	<link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    	<!-- Plugin CSS -->
    	<link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    	<!-- Custom styles for this template -->
    	<link href="css/creative.min.css" rel="stylesheet">

	</head>
<body>
<h1 align="center">Movie List</h1>
	<input type="button" class="btn btn-primary" id="addButton" name="addButton" value="Add" onclick="add() " />
		<table class="table table-bordered table-dark">
			<thead>
				<tr>
					<th>Function</th>
					<th>Name</th>
					<th>Type</th>
					<th>Year</th>
				<tr>
			</thead>
			<tbody id="tableBody"></tbody>
	
		</table>
		
		<script>
		$(function() {
			
			loadData();
			
		});
		
		function loadData() {
			$.ajax({
				url: '${pageContext.request.contextPath}/movies',
				type: 'GET',
				dataType: 'json',
				
			}).always(function(response){ 
				$("#tableBody").empty();
				
				$(response.data).each(function(i, o) {
					$("#tableBody").append("<tr>")
								
								.append("<td><input type='button' class='btn btn-info' value='Edit.' onclick='edit("+o.id+")'  > <input type='button' class='btn btn-info'  value='Del.' onclick='del("+o.id+")'  ></td>")
								.append("<td align='center'>"+o.name+"</td>")
								.append("<td align='center'>"+o.type"</td>")
								.append("<td align='center'>"+o.year+"</td>")
								.append("<td>"+o.width+"</td>")
								.append("<td>"+o.length+"</td>")
				});
			});
		}
		
		function add() {
			document.location.href='${pageContext.request.contextPath}/movies/add';
		}
		
		function edit(id) {
			document.location.href='${pageContext.request.contextPath}/movies/edit/'+id;
		}
		
		function del(id) {
			$.ajax({ 
				url: '${pageContext.request.contextPath}/movies',
				type: 'DELETE',
				contentType: 'application/json; charset=utf-8',
				dataType: 'json',
				data: JSON.stringify({'id':id}),
			}).done(function(response){
				alert('success');
				loadData();
			}).fail(function(response){
				alert('error');
			});
		}

		
		</script>
		
</body>
</html>