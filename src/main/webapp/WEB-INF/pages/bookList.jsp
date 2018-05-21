<html>
<head>

	<!-- Refers from Google CDN -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
	
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
</head>
<body>

	<h1>Book List</h1>
	
	<input type="button" id="addButton" name="addButton" value="Add..." onclick="add()"/>
	<table border='1'>
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
			});
		});
	}
	
	function add() {
		document.location.href='${pageContext.request.contextPath}/books/add';
	}
	
	function edit(id) {
		document.location.href='${pageContext.request.contextPath}/books/edit/'+id;  //根目錄:/books/edit
	}
	
	function del(id) {
		$.ajax({ 
			url: '${pageContext.request.contextPath}/books',
			type: 'DELETE',
			contentType: 'application/json; charset=utf-8',    //content type的一種
			dataType: 'json',
			data: JSON.stringify({'id':id}),    //-->轉成字串
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
