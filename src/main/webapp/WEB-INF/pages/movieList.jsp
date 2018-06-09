<html>
<head>

	<!-- Refers from Google CDN -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
	
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
</head>
<body>

	<h1 align="center">Movie List</h1>

	<input type="button" id="addButton" name="addButton" value="Add..." onclick="add()"/>
	<table border='1'>
		<thead>
			<tr>
				<th>Function</th>
				<th>Name</th>
				<th>Type</th>
				<th>Year</th>
			<tr>
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
			url: '${pageContext.request.contextPath}/movies',
			type: 'GET',
			dataType: 'json',
				
		}).always(function(response){ 
			$("#tableBody").empty();
				
			$(response.data).each(function(i, o) {
				$("#tableBody").append("<tr>")
							.append("<td><input type='button' value='Edit.' onclick='edit("+o.id+")'  > <input type='button' value='Del.' onclick='del("+o.id+")' ></td>")
							.append("<td align='center'>"+o.name+"</td>")
							.append("<td align='center'>"+o.type"</td>")
							.append("<td align='center'>"+o.year+"</td>")			
				});
			});
		}
		
		function add() {
			document.location.href='${pageContext.request.contextPath}/movie1/add';
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