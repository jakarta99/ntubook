<html>
<head>

	<!-- Refers from Google CDN -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
	
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
</head>
<body>

	<h1>Book List</h1>
	
	<input type="button" id="addButton" name="addButton" value="Add..."/>
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
		// after document ready to load data from Server
		$.ajax({
			
			url: '${pageContext.request.contextPath}/books',
			type: 'GET',
			dataType: 'json',
			
		}).done(function(response){
			$(response).each(function(i, data) {
				$("#tableBody").append("<tr>")
							.append("<td><input type='button' value='Edit..'> <input type='button' value='Del..'></td>")
							.append("<td>"+data.name+"</td>")
							.append("<td>"+data.price+"</td>")
							.append("<td>"+data.professor+"</td>")
			});
		});
		
	});
	</script>
	
	
</body>
</html>
