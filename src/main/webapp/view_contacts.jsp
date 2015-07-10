<html>
	<head>
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/viewinquiry.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/navbar.css">
		<title>Contacts</title>
	</head>
	
	<body>
		<div class="container-fluid">
			<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
				<div class="container-fluid">
			
					<a class="navbar-brand navbar-right">O&B Lead Manager</a>
					<div class="navbar-header">
						<a class="navbar-brand" href="lead_profile.jsp"><span class="glyphicon glyphicon-chevron-left"></span></a>
						<a class="navbar-brand">Martin Dee's Contact</a>
					</div>
				</div>
			</nav>
			<div id="container">	
				<div class="container-fluid">
					<div class="row">
						<div class="col-xs-18 col-sm-6 col-md-3">
						  <div class="thumbnail">
						      <div class="caption">
							<h4>Martin Dee</h4>
							<p>Mobile: 0999 999 9999</p>
							<p>Email Address: martindee@onb.com</p>
							<a href="#" class="btn btn-default btn-xs pull-right" data-toggle="modal" data-target="#myModal" role="button"><i class="glyphicon glyphicon-plus"></i></a> 
							<a href="#" class="btn btn-default btn-xs" role="button">Edit</a>						    
							</div>
						  </div>
						</div>
						<div class="col-xs-18 col-sm-6 col-md-3">
						  <div class="thumbnail">
						      <div class="caption">
							<h4>Marc Gee</h4>
							<p>Mobile: 0999 999 9999</p>
							<p>Landline: 888 8888</p>
							<p>Email Address: marcgee@gmail.com</p>
							<a href="#" class="btn btn-default btn-xs pull-right" data-toggle="modal" data-target="#myModal" role="button"><i class="glyphicon glyphicon-plus"></i></a> 
							<a href="#" class="btn btn-default btn-xs" role="button">Edit</a>						    
							</div>
						  </div>
						</div>
					</div>
				</div>
			</div>
		</div>	
		
		

		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">
			  <!-- Modal content-->
			      <div class="modal-content">
				<div class="modal-header">
				  <button type="button" class="close" data-dismiss="modal">&times;</button>
				  <h4 class="modal-title">Add new Contact</h4>
				</div>
				<div class="modal-body">
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
					</form>
				</div>
				<div class="modal-footer">
				  <button type="button" class="btn btn-default finish" data-dismiss="modal">Submit</button>
				</div>
			      </div>
			      
			</div>
		</div>
					
							
		
		
		<script src="resources/js/jquery/jquery-1.11.3.min.js"></script>
		<script	src="resources/js/bootstrap/bootstrap.min.js"></script>
		<script	src="resources/js/customjs/create_profile.js"></script>
		
	</body>
</html>
