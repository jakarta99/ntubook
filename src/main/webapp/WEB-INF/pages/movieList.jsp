<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<!-- Refers from Google CDN -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
	
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
</head>
<body>

	<h1>Movie List</h1>
	
	<input type="button" id="addButton" value="Add" onclick="add()"/>
	
	<table border='1'>
		<thead>
			<tr>
				<th>Name</th>
				<th>Type</th>
				<th>Year</th>
				<th>Function</th>
			</tr>
		</thead>
		<tbody id = "movieBody">
		
		</tbody>
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
							.append("<td><input type='button' value='Edit' onclick='edit("+o.id+")'> <input type='button' value='Delete' onclick='del("+o.id+")'></td>")
							.append("<td>"+o.name+"</td>")
							.append("<td>"+o.type+"</td>")
							.append("<td>"+o.year+"</td>")
			});
		});
	}
	
	function add(){
		document.location.href='${pageContext.request.contextPath}/movies/add';
	}
	
	function edit(id){
		document.location.href='${pageContext.request.contextPath}/movies/edit/'+id;
	}
	
	function del(id){
		$.ajax({ 
			url: '${pageContext.request.contextPath}/movies',
			type: 'DELETE',
			contentType: 'application/json; charset=utf-8',
			dataType: 'json',
			data: JSON.stringify({'id':id}),
		}).done(function(response){
			alert('SUCCESS');
			loadData();
		}).fail(function(response){
			alert('ERROR');
		});
	}
	
	</script>
	
</body>
</html>