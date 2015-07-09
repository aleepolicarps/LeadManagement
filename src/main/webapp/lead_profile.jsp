<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap/bootstrap.min.css" />">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/customcss/leadprofile.css" />">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/customcss/navbar.css" />">
		<title>Lead Profile</title>
	</head>
	
	<body>
		<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand">Lead Management</a>
				</div>
				
				<form class="navbar-form navbar-right" role="search">
				  <div class="form-group">
				    <input type="text" class="form-control" placeholder="Search Profile">
				  </div>
				  <button type="submit" class="btn btn-default">Find Profile</button>
				</form>
			</div>
		</nav>	
		
		<div id="sidebar-left" class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-pills nav-stacked side-group">
				<li class="active">
					<a href="#">Overview</a>
				</li>
				<li>
					<a href="#">Report</a>
				</li>
				<li>
					<a href="#">Create Lead Profile</a>
				</li>
			</ul>
		</div>
		
		<div id="container">
			<div id="profile-name">
				<h3>Orange and Bronze</h3>
				<h5>Date Created: 1/1/15</h5>
			</div>
			<div id="tablist">
				<ul class="nav nav-tabs" style="border:0;">
	 				<li role="presentation" class="active"><a href="#">Details</a></li>
	 				<li role="presentation"><a href="#">Projects</a></li>
	 				<li role="presentation"><a href="#">Logs</a></li>
	  				<li class="dropdown">
       					<a href="#" data-toggle="dropdown" class="dropdown-toggle">Menu<b class="caret"></b></a>
        				<ul class="dropdown-menu">
            				<li><a href="#">Add Contact Person</a></li>
				            <li><a href="#">Create New Project</a></li>
				            <li class="divider"></li>
				            <li><a href="#">Edit Profile</a></li>
        				</ul>
   					</li>
				</ul>
			</div>
			
		</div>
		
		
		<script src="<c:url value="/resources/js/jquery/jquery-1.11.3.min.js"/>"></script>
		<script	src="<c:url value="/resources/js/bootstrap/bootstrap.min.js"/>"></script>
		
	</body>
</html>
