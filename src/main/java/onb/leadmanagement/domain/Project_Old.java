package onb.leadmanagement.domain;

import java.util.*;

import javax.persistence.*;

import static org.apache.commons.lang.Validate.*;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Project_Old {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="projectId")
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private Status status;
	
	private String detail;
	
	protected Project_Old(){
		
	}
	
	public Project_Old(String name){
		notEmpty(name);
		this.name = name;
		this.status = Status.for_evaluation;
		this.detail = "";
	}
	
	public Project_Old(String name, Status status,String detail) {
		notNull(name);
		notNull(status);
		notNull(detail);
		this.name = name;
		this.status = status;
		this.detail = detail;
	}
	public String getName(){
		return name;
	}
	public void setStatus(Status status){
		this.status = status;
	}
	public Status getStatus(){
		return status;
	}
	public String getDetails() {
		return detail;
	}
	public void setDetails(String details) {
		this.detail = details;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project_Old other = (Project_Old) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		return name;
	}
	
}
