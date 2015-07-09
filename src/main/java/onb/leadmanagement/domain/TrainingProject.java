package onb.leadmanagement.domain;

import javax.persistence.Entity;

import static org.apache.commons.lang.Validate.notNull;
import static org.apache.commons.lang.StringUtils.isEmpty;

@Entity
public class TrainingProject extends Project {
	
	private String course;
	private int numberOfEnrollees;
	
	public TrainingProject(String name, String course, int numberOfEnrollees) {
		super(name);
		notNull(numberOfEnrollees);
		if(isEmpty(course))
			throw new IllegalArgumentException("Course title cannot be empty or null");
		this.course = course;
		this.numberOfEnrollees = numberOfEnrollees;
	}
	
	public String getCourse(){
		return course;
	}
	public int getNumberOfEnrollees(){
		return numberOfEnrollees;
	}

}
