<html>
<head>
	<!-- Refers from Google CDN -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
	
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
</head>
<body>

	<h1>Movie Add</h1>
<form id="theForm" name="theForm">
<input type="hidden" name="id" value="${model.id }"/>
Name : <input type="text" name="name" value="${model.name}"/> <br/>
Price : <input type="text" name="price" value="${model.price}"/> <br/>
Professor : <input type="text" name="professor" value="${model.professor}"/> <br/>

<input type="button" id="saveButton" value="Save.." /> 
<input type="button" id="cancelButton" value="Cancel.." />
</form>



</body>
</html>