<html>
	<head>
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/createprofile.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/navbar.css">
		<title>Create Inquiry</title>
	</head>
	
	<body>
		<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				
				<a class="navbar-brand navbar-right">Create New Inquiry</a>
				<div class="navbar-header">
					<a class="navbar-brand">O&B Lead Manager</a>
				</div>
			</div>
		</nav>	
		
		<div id="contain-design">
			<div id="container" class="center_div">
				<fieldset>
				<legend>Inquiry Details</legend>
				<form action="index.jsp" role="form">
				  <div class="form-group">
				     <input type="text" class="form-control" id="name" placeholder="* Inquiry Name">
				  </div>	  			  
				  
				 <div class="form-group">
					Inquiry Message
					<textarea name="inquirymessage" cols="50" rows="10"></textarea>				 
				</div>
				
				  <div class="form-group radio">
				  	<label style="padding:0;">Inquiry Type: </label>
  					<label><input id="inquiryconsult" type="radio" name="optradio" value="consultation">Consultation</label>
  					<label><input id="inquirytrain" type="radio" name="optradio" value="training">Training</label>
					<label><input id="inquirynone" type="radio" name="optradio" value="none">None</label>
				  </div>
				  
				  <div class="inquiry-info">
				  
				  </div>
				    
				  <button type="submit" class="btn btn-success">Submit</button>
				</form>
				</fieldset>
				
			</div>
		</div>
		<script src="resources/js/jquery/jquery-1.11.3.min.js"></script>
		<script	src="resources/js/bootstrap/bootstrap.min.js"></script>
		<script	src="resources/js/customjs/create_inquiry.js"></script>
	</body>
</html>
