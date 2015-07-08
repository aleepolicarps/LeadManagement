<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap/bootstrap.min.css" />">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/customcss/createprofile.css" />">
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
			<div id="container" class="center_div">
				<fieldset>
				<legend>Lead Profile</legend>
				<form role="form">
				  <div class="form-group">
				     <input type="text" class="form-control" id="name" placeholder="* Organization or Individual Name">
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
				  
				  
				  <div class="form-group radio">
				  	<label style="padding:0;">Profile Type: </label>
  					<label><input type="radio" name="optradio" value="organization">Organization</label>
  					<label><input type="radio" name="optradio" value="individual">Individual</label>
				  </div>
				    
				  <button type="submit" class="btn btn-primary">Submit</button>
				</form>
				</fieldset>
				
			</div>
		</div>
		<script src="<c:url value="/resources/js/jquery-1.11.3.min.js"/>"></script>
		<script	src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
		
	</body>
</html>