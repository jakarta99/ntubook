<html>
<head>

	<!-- Refers from Google CDN -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
	
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
</head>
<body>

<h1>Shelf Edit</h1>

<form id="theForm" name="theForm">
<input type="hidden" name="id" value="${model.id }"/>
Name : <input type="text" name="name" value="${model.name}"/> <br/>
Designer : <input type="text" name="designer" value="${model.designer}"/> <br/>
Height : <input type="text" name="height" value="${model.height}"/> <br/>
Width : <input type="text" name="width" value="${model.width}"/> <br/>
Length : <input type="text" name="length" value="${model.length}"/> <br/>

<input type="button" id="saveButton" value="Save.." /> 
<input type="button" id="cancelButton" value="Cancel.." />
</form>

<script>
$(function(){
	$("#saveButton").click(function() {
		$.ajax({
			url: '${pageContext.request.contextPath}/books',
			type: 'PUT',
			contentType: 'application/json; charset=utf-8',
			data: JSON.stringify($("#theForm").serializeObject()),
			dataType: 'json',
			
		}).done(function(response){
			alert("success");
			document.location.reload();
		}).fail(function(response){
			alert("error");
		});
	});
	
	$("#cancelButton").click(function() {
		document.location.href="${pageContext.request.contextPath}/books/list";
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




