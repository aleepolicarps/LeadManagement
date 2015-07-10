$( document ).ready(function() {
	
	var projectChangeToConsultationDetails = function(){
		$(".project-info").empty();
		var addHtml = " <div class='form-group'> " +
				"<input type='number' class='form-control' " +
				"id='budget' placeholder='Budget'> </div>" +
				"<div class='form-group'><input type='text' " +
				"class='form-control' id='service' " +
				"placeholder='Service Availed'></div>" +
				"<div class='form-group'><input type='text' " +
				"class='form-control' id='expenditure' " +
				"placeholder='Expenditure Type'></div>";
		
		$(".project-info").append(addHtml);
	}
	
	var projectChangeToTrainingDetails = function(){
		$(".project-info").empty();
		var addHtml = " <div class='form-group'> " +
		"<input type='text' class='form-control' " +
		"id='topic' placeholder='Topic'> </div>" +
		"<div class='form-group'><input type='number' " +
		"class='form-control' id='budget' " +
		"placeholder='Budget'></div>";

		$(".project-info").append(addHtml);
	}
	
	$("#projectconsult").click(projectChangeToConsultationDetails);
	$("#projecttrain").click(projectChangeToTrainingDetails);
	
});
