package onb.newmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="activityId")
	private long id;
	
	private String subject;
	private String message;
	private long date;
	
	protected Activity() {
	}

	public Activity(long id, String subject, String message, long date) {
		super();
		this.id = id;
		this.subject = subject;
		this.message = message;
		this.date = date;
	}

}
