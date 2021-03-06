<html>
	<head>
		<link rel="stylesheet" type="text/css" href="resources/css/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/leadprofile.css">
		<link rel="stylesheet" type="text/css" href="resources/css/customcss/navbar.css">
		<title>Lead Profile</title>
	</head>
	
	<body>
		<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand">O&B Lead Manager</a>
				</div>
				
				<form class="navbar-form navbar-right" role="search">
				  <div class="form-group">
				    <input type="text" class="form-control" placeholder="Search Profile">
				  </div>
				  <button type="submit" class="btn btn-default">Find Profile</button>
				</form>
			</div>
		</nav>	
		
		<div class="container-fluid">
			<div class="row">
				
				<div id="sidebar-left" class="col-sm-3 col-md-2 sidebar">
					<ul class="nav nav-pills nav-stacked side-group">
						<li>
							<a href="index.jsp">Overview</a>
						</li>
						<li>
							<a href="create_profile.jsp">Create Lead Profile</a>
						</li>
					</ul>
				</div>
		
				<div id="container">
					

							<div id="profile-name">
								<h3>Martin Dee</h3>
								<h5>Individual</h5>
								<h5>Date Created: 1/1/15</h5>
							</div>
						
						<div id="test">
							<div id="tablist">
								<ul class="nav nav-tabs">
					 				<li class="active"><a data-toggle="tab" href="#details">Details</a></li>
									<li><a data-toggle="tab" href="#inquiries">Inquiry</a></li>
					 				<li><a data-toggle="tab" href="#projects">Previous Projects</a></li>
					  				<li class="dropdown">
				       					<a data-toggle="dropdown" class="dropdown-toggle" href="#">Menu<b class="caret"></b></a>
										<ul class="dropdown-menu">
						    				    <li><a data-toggle="tab" href="#newcontact">Add Contact Person</a></li>
										    <li><a data-toggle="tab" href="#">Add Meeting Schedule</a></li>
										    <li><a data-toggle="tab" href="#newinquiry">Create New Inquiry</a></li>
										    <li><a data-toggle="tab" href="#newproject">Create New Project</a></li>
										    <li class="divider"></li>
										    <li><a href="#">Edit Profile</a></li>
										</ul>
				   					</li>
								</ul>
								 <div class="tab-content">
									<div id="details" class="tab-pane fade in active">
									    <table class="table table-striped table-hover">
									    	<thead>
										      	<tr>
												<th>Name</th>
												<th>Revenue</th>
										     	</tr>
									    	</thead>
									    	<tbody>
										      	<tr>
												<td>Martin Dee</td>
												<td>PHP. 10,000</td>
										      	</tr>
									    	</tbody>
										<thead>
										      	<tr>
												<th>Industry</th>
												<th>Profile Type</th>
										     	</tr>
									    	</thead>
										<tbody>
										      	<tr>
												<td>Technology</td>
												<td>Individual</td>
										      	</tr>
									    	</tbody>
										<thead>
										      	<tr>
												<th>Contact Info.</th>
												<th>Affiliated Organization</th>
										     	</tr>
									    	</thead>
										<tbody>
										      	<tr>
												<td><a href="view_contacts.jsp">View Contact(s)</a></td>
												<td>Orange and Bronze</td>	
										      	</tr>
									    	</tbody>
									    </table>
									</div>
									<div id="projects" class="tab-pane fade">
									   <table class="table table-hover">
									    	<thead>
										      	<tr>
												<th>Project Name</th>
												<th>Project Type</th>
												<th>Date Added</th>
												<th>Revenue</th>
										     	</tr>
									    	</thead>
									    	<tbody>
										      	<tr>
												<td>Combined Core Spring and Hibernate Training</td>
												<td>Training</td>
												<td>6/23/2015</td>
												<td>PHP 16,000</td>
										      	</tr>
										</tbody>
									    </table>
									</div>
									<div id="inquiries" class="tab-pane fade">
									   <table class="table table-hover">
									    	<thead>
										      	<tr>
												<th>Inquiry Name</th>
												<th>Date Added</th>
												<th>Inquiry Type</th>
												<th>Status</th>
										     	</tr>
									    	</thead>
									    	<tbody>
										      	<tr>
												<td><a href="view_inquiry.jsp">Java Training</a></td>
												<td>7/1/2015</td>
												<td>Training</td>
												<td>On-going</td>
										      	</tr>
										</tbody>
									    </table>
									</div>
									<div id="newcontact" class="tab-pane tab-workspace fade">
										<fieldset>
											<legend>Add New Contact</legend>
											<form role="form">
											  <div class="form-group">
											     <input type="text" class="form-control" id="name" placeholder="* Contact Name">
											  </div>	  
											  
											  <div class="form-group">
											     <input type="email" class="form-control" id="email" placeholder="* Email Address">
											  </div>
											  
											  <div class="form-group">
											     <input type="text" class="form-control" id="mobile" placeholder="* Mobile Number">
											  </div>
											  
											  <div class="form-group">
											  	<input type="text" class="form-control" id="landline" placeholder="Landline Number">
											  </div>
											  
											  <div class="form-group">
											     <input type="email" class="form-control" id="address" placeholder="* Address">
											  </div>
											    
											  <button type="submit" class="btn btn-success">Submit</button>
											</form>
										</fieldset>
									</div>
									<div id="newproject" class="tab-pane tab-workspace fade">
										<fieldset>
										<legend>Project Details</legend>
											<form role="form">
											  <div class="form-group">
											     <input type="text" class="form-control" id="name" placeholder="* Project Name">
											  </div>	  			  
											  
											  <div class="form-group radio">
											  	<label style="padding:0;">Project Type: </label>
							  					<label><input id="projectconsult" type="radio" name="optradio" value="consultation">Consultation</label>
							  					<label><input id="projecttrain" type="radio" name="optradio" value="training">Training</label>
											  </div>
											  
											  <div class="project-info">
											  
											  </div>
											    
											  <button type="submit" class="btn btn-success">Submit</button>
											</form>
										</fieldset>
									</div>
									<div id="newinquiry" class="tab-pane tab-workspace fade">
										<fieldset>
										<legend>Inquiry Details</legend>
											<form action="index.jsp" role="form">
											  <div class="form-group">
											     <input type="text" class="form-control" id="name" placeholder="* Inquiry Name">
											  </div>	  			  
											  
											 <div class="form-group">
												Inquiry Message <br>
												<textarea name="inquirymessage" cols="63" rows="10"></textarea>				 
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
							</div>
						</div>
					
				</div>
			</div>
		</div>
		
		<script src="resources/js/jquery/jquery-1.11.3.min.js"></script>
		<script	src="resources/js/bootstrap/bootstrap.min.js"></script>
		<script	src="resources/js/customjs/create_project.js"></script>
		<script	src="resources/js/customjs/create_inquiry.js"></script>
		
	</body>
</html>
