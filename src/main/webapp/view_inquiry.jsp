<html>
	<head>
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/viewinquiry.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/navbar.css">
		<title>Inquiry</title>
	</head>
	
	<body>	  
	
		<div class="container-fluid">
			<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
				<div class="container-fluid">
			
					<a class="navbar-brand navbar-right">O&B Lead Manager</a>
					<div class="navbar-header">
						<a class="navbar-brand" href="lead_profile.jsp"><span class="glyphicon glyphicon-chevron-left"></span></a>
						<a class="navbar-brand">Martin Dee's Inquiry</a>
					</div>
				</div>
			</nav>
		
			  <button type="button" class="btn btn-info btn-lg add" data-toggle="modal" data-target="#myModal">Add Activity</button>

			 
			  <div class="modal fade" id="myModal" role="dialog">
			    <div class="modal-dialog">
			    
			      
			      <div class="modal-content">
				<div class="modal-header">
				  <button type="button" class="close" data-dismiss="modal">&times;</button>
				  <h4 class="modal-title">Inquiry Details</h4>
				</div>
				<div class="modal-body">
				  <textarea rows="4" cols="68" placeholder="Add message"></textarea>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default finish" data-dismiss="modal">Submit</button>
					<input class="chooseFile" type="file" name="..."></span>
					<span class="fileinput-filename"></span>
				</div>	
			      </div>  
			    </div>
			  </div>
			<div id="container">	
				<div class="container-fluid">
					<div class="row">
						<div id="profile-name">
							<h3>Java Training</h3>
							<h5>Status: Ongoing Inquiry</h5>
							<h5>Date Created: 7/1/15</h5>
						</div>
					</div>
					<div class="row">
						<table class="table table-hover">
							<thead>
							      	<tr>
									<th>Date Added</th>
									<th>Message</th>
									<th>Attachment</th>
							     	</tr>
						    	</thead>
						    	<tbody>
							      	<tr>
									<td>7/3/15</td>
									<td>We want core java trainings. More on using advanced java.</td>
									<td><a href="#">minute.pdf</a></td>
							      	</tr>
							</tbody>
						</table>					
					</div>
				</div>
			</div>
		</div>	
		
	
					
							
		
		
		<script src="resources/js/jquery/jquery-1.11.3.min.js"></script>
		<script	src="resources/js/bootstrap/bootstrap.min.js"></script>
		<script	src="resources/js/customjs/create_profile.js"></script>
		<script	src="resources/js/customjs/view_inquiry.js"></script>
		
	</body>
</html><a href="#" class="close fileinput-exists" data-dismiss="fileinput" style="float: none">&times;</a>
