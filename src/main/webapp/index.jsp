<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/customcss/navbar.css">
	<link rel="stylesheet" type="text/css" href="resources/css/customcss/index.css">
	<title>O&B Lead Manager</title>
	</head>
<body>
	<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	       			 	<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
      				</button>
				<a class="navbar-brand">O&B Lead Manager</a>
			</div>
			
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<form class="navbar-form navbar-right" role="search">
				  <div class="form-group">
				    <input type="text" class="form-control" placeholder="Search Profile">
				  </div>
				  <button type="submit" class="btn btn-default">Find Profile</button>
				</form>
			</div>
		</div>
	</nav>	

	<div class="container-fluid">
		<div class="row">
			<div id="sidebar-left" class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-pills nav-stacked side-group">
					<li class="active">
						<a href="index.jsp">Overview</a>
					</li>
					<li>
						<a href="create_profile.jsp">Create Lead Profile</a>
					</li>
				</ul>
			</div>
			
			<div id="container">
				<div>
					<h1 class="pageheader">Major Reports</h1>
					<div class="row placeholders">
						<div class="col-xs-12 col-sm-6 placeholder">
							<h4>Graph</h4>
						</div>
						<div class="col-xs-12 col-sm-6 placeholder">
							<h4>Graph</h4>
						</div>
					</div>
					<h2 class="subheader">Recent Leads</h2>
					<div class="table-responsive">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>#</th>
									<th>Name</th>
									<th>Service Availed</th>
									<th>Contacted Date</th>
									<th>Contact Person</th>
									<th>Contact Detail</th>
								</tr>
							</thead>
							<tr>
								<td>0001</td>
								<td><a href="lead_profile.jsp">Orange and Bronze</a></td>
								<td>Java Training</td>
								<td>06/29/1996</td>
								<td>Martin Dee</td>
								<td>099 999 9999</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="resources/js/jquery/jquery-1.11.3.min.js"></script>
	<script	src="resources/js/bootstrap/bootstrap.min.js"></script>
</body>
</html>
