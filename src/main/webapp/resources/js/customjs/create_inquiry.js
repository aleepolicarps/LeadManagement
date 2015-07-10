$( document ).ready(function() {
	
	var inquiryChangeToConsultationDetails = function(){
		$(".inquiry-info").empty();
		var addHtml = " <div class='form-group'> " +
				"<input type='number' class='form-control' " +
				"id='budget' placeholder='Budget'> </div>" +
				"<div class='form-group'><input type='text' " +
				"class='form-control' id='service' " +
				"placeholder='Service Availed'></div>" +
				"<div class='form-group'><input type='text' " +
				"class='form-control' id='expenditure' " +
				"placeholder='Expenditure Type'></div>";
		
		$(".inquiry-info").append(addHtml);
	}
	
	var inquiryChangeToTrainingDetails = function(){
		$(".inquiry-info").empty();
		var addHtml = " <div class='form-group'> " +
		"<input type='text' class='form-control' " +
		"id='topic' placeholder='Topic'> </div>" +
		"<div class='form-group'><input type='number' " +
		"class='form-control' id='budget' " +
		"placeholder='Budget'></div>";

		$(".inquiry-info").append(addHtml);
	}

	var clearDetails = function(){
		$(".inquiry-info").empty();	
	}
	
	$("#inquiryconsult").click(inquiryChangeToConsultationDetails);
	$("#inquirytrain").click(inquiryChangeToTrainingDetails);
	$("#inquirynone").click(clearDetails);
	
});
