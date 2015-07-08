<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>

<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/mainpage.css"/>">

<meta charset="utf-8">
<title>Main Page</title>
</head>
<body>
	<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Lead Management</a>
			</div>
			<div class="navbar-search">
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
						<input type="text" class="form-control"
							placeholder="Search Profile">
					</div>
					<button type="submit" class="btn btn-default">Go</button>
				</form>
			</div>
			
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">Overview<span
							class="sr-only">(current)</span></a></li>
					<li><a href="#">Reports</a></li>
					<li><a href="#">Create Profile</a></li>
				</ul>
			</div>

			<div class="co-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
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
							<td>Orange and Bronze</td>
							<td>Java Training</td>
							<td>06/29/1996</td>
							<td>Martin Dee</td>
							<td>099 999 9999</td>
						</tr>
						<tbody>

						</tbody>
					</table>
				</div>

			</div>

		</div>
	</div>









	<%-- 	<c:url value="/showMessage.html" var="messageUrl" />
		<a href="${messageUrl}">Click to enter</a> --%>

	<%-- 	<script src="<c:url value="/resources/js/jquery-1.11.3.min.js"/>"></script>
			<script
				src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script> --%>
</body>
</html>
