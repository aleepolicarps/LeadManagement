<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap/bootstrap.min.css" />">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/customcss/createprofile.css" />">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/customcss/navbar.css" />">
		<title>Create Lead Profile</title>
	</head>
	
	<body>
		<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				
				<a class="navbar-brand navbar-right">Create New Project</a>
				<div class="navbar-header">
					<a class="navbar-brand">Lead Management</a>
				</div>
			</div>
		</nav>	
		
		<div id="contain-design">
			<div id="container" class="center_div">
				<fieldset>
				<legend>Project Details</legend>
				<form role="form">
				  <div class="form-group">
				     <input type="text" class="form-control" id="name" placeholder="* Project Name">
				  </div>	  			  
				  
				  <div class="form-group radio">
				  	<label style="padding:0;">Project Type: </label>
  					<label><input type="radio" name="optradio" value="consultation">Consultation</label>
  					<label><input type="radio" name="optradio" value="training">Training</label>
				  </div>
				  
				  <div class="project-info">
				  
				  </div>
				    
				  <button type="submit" class="btn btn-success">Submit</button>
				</form>
				</fieldset>
				
			</div>
		</div>
		<script src="<c:url value="/resources/js/jquery/jquery-1.11.3.min.js"/>"></script>
		<script	src="<c:url value="/resources/js/bootstrap/bootstrap.min.js"/>"></script>
		<script	src="<c:url value="/resources/js/customjs/create_project.js"/>"></script>
	</body>
</html>