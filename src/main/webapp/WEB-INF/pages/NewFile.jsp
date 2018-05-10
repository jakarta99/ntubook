<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
	integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
	crossorigin="anonymous"></script>

<!-- Refers from Google CDN -->

<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
</head>
<body>

	<h1>Book List</h1>

	<input type="button" class="btn btn-primary" id="addButton"
		name="addButton" value="Add..." onclick="add()" />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Function</th>
				<th>Name</th>
				<th>Price</th>
				<th>Professor</th>
			</tr>
		</thead>
		<tbody id="tableBody">

		</tbody>
	</table>

	<script>
	$(function() {
		
		loadData();
	
	});
	
	function loadData() {
		$.ajax({
<<<<<<< HEAD
			url : '${pageContext.request.contextPath}/books',
			type : 'GET',
			dataType : 'json',

		})
		.always(function(response) {
		$("#tableBody").empty();

		$(response.data).each(function(i, o) {
			$("#tableBody")
					.append("<tr>")
					.append("<td><input type='button' value='Edit..' class='btn btn-default btn-sm' onclick='edit("	+ o.id + ")'> <input type='button' class='btn btn-danger btn-sm'  value='Del..' onclick='del("+ o.id + ")'></td>")
					.append("<td>"+ o.name + "</td>")
					.append("<td>"+ o.price + "</td>")
					.append("<td>"+ o.professor	+ "</td>")
=======
			url: '${pageContext.request.contextPath}/books',
			type: 'GET',
			dataType: 'json',
			
		}).always(function(response){ 
			$("#tableBody").empty();
			
			$(response.data).each(function(i, o) {
				$("#tableBody").append("<tr>")
							.append("<td><input type='button' value='Edit..' onclick='edit("+o.id+")'> <input type='button' value='Del..' onclick='del("+o.id+")'></td>")
							.append("<td>"+o.name+"</td>")
							.append("<td>"+o.price+"</td>")
							.append("<td>"+o.professor+"</td>")
>>>>>>> branch 'master' of https://github.com/jakarta99/ntubook.git
			});
		});
	}

	function add() {
		document.location.href = '${pageContext.request.contextPath}/books/add';
	}

	function edit(id) {
		document.location.href = '${pageContext.request.contextPath}/books/edit/'
				+ id;
	}

	function del(id) {
<<<<<<< HEAD
		$.ajax({
			url : '${pageContext.request.contextPath}/books',
			type : 'DELETE',
			contentType : 'application/json; charset=utf-8', 
			dataType : 'json',
			data : JSON.stringify({
				'id' : id
			}), 
		}).done(function(response) {
=======
		$.ajax({ 
			url: '${pageContext.request.contextPath}/books',
			type: 'DELETE',
			contentType: 'application/json; charset=utf-8',
			dataType: 'json',
			data: JSON.stringify({'id':id}),
		}).done(function(response){
>>>>>>> branch 'master' of https://github.com/jakarta99/ntubook.git
			alert('success');
			loadData();
		}).fail(function(response) {
			alert('error');
		});
	}
	</script>
</body>
</html>