$( document ).ready(function() {
	
	var changeToConsultationDetails = function(){
		$(".project-info").empty();
		var addHtml = " <div class='form-group'> " +
				"<input type='number' class='form-control' " +
				"id='budget' placeholder='* Budget'> </div>" +
				"<div class='form-group'><input type='text' " +
				"class='form-control' id='language' " +
				"placeholder='* Programming Language to be used'></div>" +
				"<div class='form-group'><input type='text' " +
				"class='form-control' id='expenditure' " +
				"placeholder='* Expenditure Type'></div>";
		
		$(".project-info").append(addHtml);
	}
	
	var changeToTrainingDetails = function(){
		$(".project-info").empty();
		var addHtml = " <div class='form-group'> " +
		"<input type='text' class='form-control' " +
		"id='budget' placeholder='* Topic'> </div>" +
		"<div class='form-group'><input type='number' " +
		"class='form-control' id='language' " +
		"placeholder='* Cost'></div>";

		$(".project-info").append(addHtml);
	}
	
	$("input[value='consultation']").click(changeToConsultationDetails);
	$("input[value='training']").click(changeToTrainingDetails);
	
});