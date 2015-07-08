<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap/bootstrap.min.css" />">
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/customcss/leadprofile.css" />">
		<title>Lead Profile</title>
	</head>
	
	<body>
		<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				
				<ul class="nav navbar-nav navbar-right">
        			<li class="dropdown">
         				<a href="#" class="navbar-brand dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Orange and Bronze <span class="caret"></span></a>
         				<ul class="dropdown-menu">
				            <li><a href="#">Add New Project</a></li>
				            <li><a href="#">Add Contact Person</a></li>
				            <li role="separator" class="divider"></li>
				            <li><a href="#">Edit Profile</a></li>
          				</ul>
       				 </li>
     			 </ul>
				<div class="navbar-header">
					<a class="navbar-brand">Lead Management</a>
				</div>
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
			<div id="profile-name" class=".col-md-3">
				<h3>Orange and Bronze</h3>
				<h5>Date Created: 1/1/15</h5>
			</div>
		</div>
		
		
		<script src="<c:url value="/resources/js/jquery-1.11.3.min.js"/>"></script>
		<script	src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
		
	</body>
</html>
