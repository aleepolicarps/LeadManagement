<html>
	<head>
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/createprofile.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/navbar.css">
		<title>Create Lead Profile</title>
	</head>
	
	<body>
		<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				
				<a class="navbar-brand navbar-right">Create Lead Profile</a>
				<div class="navbar-header">
					<a class="navbar-brand">Lead Management</a>
				</div>
			</div>
		</nav>	
		
		<div id="contain-design">
			<div class="container-fluid">
				<div id="container" class="center_div">
					<fieldset>
					<legend>Lead Profile</legend>
					<form role="form">
					  <div class="form-group">
					     <input type="text" class="form-control" id="name" placeholder="Name">
					  </div>	  
					  
					  <div class="form-group">
					     <input type="email" class="form-control" id="email" placeholder="Email Address">
					  </div>
					  
					  <div class="form-group">
					     <input type="text" class="form-control" id="mobile" placeholder="Mobile Number">
					  </div>
					  
					  <div class="form-group">
					  	<input type="text" class="form-control" id="landline" placeholder="Landline Number">
					  </div>
					  
					  <div class="form-group">
					     <input type="email" class="form-control" id="address" placeholder="Address">
					  </div>
					  

					  <div class="form-group radio">
					  	<label style="padding:0;">Profile Type: </label>
	  					<label><input type="radio" name="optradio" value="organization">Organization</label>
	  					<label><input type="radio" name="optradio" value="individual">Individual</label>
					  </div>
					  
					  <div class="project-info"></div>
	  
					  <nav>
					 	<ul class="pager">
						<li><a href="index.jsp">Cancel</a></li>
					    	<li><a href="create_inquiry.jsp">Next</a></li>
					  	</ul>
					  </nav>
					</form>
					</fieldset>
				
				</div>
			</div>
		</div>
		<script src="resources/js/jquery/jquery-1.11.3.min.js"></script>
		<script	src="resources/js/bootstrap/bootstrap.min.js"></script>
		<script	src="resources/js/customjs/create_profile.js"></script>
		
	</body>
</html>
