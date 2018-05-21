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

<!-- Refers from Google CDN -->

<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
</head>

<body>

<h1>Music Add</h1>

<form id="theForm" name="theForm">
Name : <input type="text" name="name"/> <br/>
Price : <input type="text" name="price"/> <br/>
Length : <input type="text" name="length"/> <br/>

<input type="button" id="saveButton" value="Save.." /> 
<input type="button" id="cancelButton" value="Cancel.." />
</form>

<script>
$(function(){
	$("#saveButton").click(function() {
		$.ajax({
			url: '${pageContext.request.contextPath}/music',
			type: 'POST',
			contentType: 'application/json; charset=utf-8', 
			data: JSON.stringify($("#theForm").serializeObject()), 
			dataType: 'json',
			
		}).done(function(response){
			alert("success");
			document.location.reload(); 
			document.location.href="${pageContext.request.contextPath}/music/list";
		}).fail(function(response){
			alert("error");
		});
	});
	
	$("#cancelButton").click(function() {
		document.location.href="${pageContext.request.contextPath}/music/list";
	});
	
	

});


jQuery.fn.serializeObject = function() {
  var arrayData, objectData;
  arrayData = this.serializeArray();
  objectData = {};

  $.each(arrayData, function() {
    var value;

    if (this.value != null) {
      value = this.value;
    } else {
      value = '';
    }

    if (objectData[this.name] != null) {
      if (!objectData[this.name].push) {
        objectData[this.name] = [objectData[this.name]];
      }

      objectData[this.name].push(value);
    } else {
      objectData[this.name] = value;
    }
  });

  return objectData;
};

</script>

</body>
</html>
