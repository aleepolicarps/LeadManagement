<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css" />">

<meta charset="utf-8">
<title>Hello World</title>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">

			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <!-- <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> -->
				</button>
				<a class="navbar-brand" href="#">Create</a>
			</div>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search Profile">
				</div>
				<button type="submit" class="btn btn-default">Go</button>
			</form>
			



			<%-- 	<c:url value="/showMessage.html" var="messageUrl" />
		<a href="${messageUrl}">Click to enter</a> --%>

		<%-- 	<script src="<c:url value="/resources/js/jquery-1.11.3.min.js"/>"></script>
			<script
				src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script> --%>
</body>
</html>
