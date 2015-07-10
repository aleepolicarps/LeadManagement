package onb.leadmanagement.domain.model;

import javax.persistence.Entity;

@Entity
public class Activity {
	
	private String subject;
	private String message;
	private long date;
	
	
	
	protected Activity() {
	}

}
