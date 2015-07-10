$( document ).ready(function() {
	
	var changeToIndividualDetails = function(){
		$(".project-info").empty();
		var addHtml = " <div class='form-group'> " +
		"<input type='text' class='form-control' " +
		"id='orgname' placeholder='Affiliated Organization'> </div>";
		
		$(".project-info").append(addHtml);
	}
	
	var changeToOrganizationDetails = function(){
		$(".project-info").empty();
		var addHtml = " <div class='form-group'> " +
		"<input type='text' class='form-control' " +
		"id='orgname' placeholder='Organization Name'> </div>" +
		"<div class='form-group'><input type='text' " +
		"class='form-control' id='orgmobile' " +
		"placeholder='Organization Mobile'></div>" +
		"<div class='form-group'><input type='text' " +
		"class='form-control' id='orglandline' " +
		"placeholder='Organization Landline'></div>" +
		"<div class='form-group'><input type='email' " +
		"class='form-control' id='orgemail' " +
		"placeholder='Organization Email Address'></div>" +
		"<div class='form-group'><input type='text' " +
		"class='form-control' id='orgaddress' " +
		"placeholder='Organization Address'></div>";

		$(".project-info").append(addHtml);
	}
	
	$("input[value='organization']").click(changeToOrganizationDetails);
	$("input[value='individual']").click(changeToIndividualDetails);
	
});

