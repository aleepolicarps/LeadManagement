package onb.leadmanagement.domain;

import java.util.*;

import javax.persistence.*;

import static org.apache.commons.lang.Validate.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="projectId")
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private Status status;
	
	@OneToMany
	@JoinColumn(name="projectId", referencedColumnName="projectId")
	private List<Communication> communicationLog;
	
	private String detail;
	
	public Project(String name){
		notEmpty(name);
		this.name = name;
		this.status = Status.for_evaluation;
		this.communicationLog = new ArrayList<Communication>();
		this.detail = "";
	}
	
	public Project(String name, Status status,
			ArrayList<Communication> communicationLog,String detail) {
		notNull(name);
		notNull(status);
		notNull(communicationLog);
		notNull(detail);
		this.name = name;
		this.status = status;
		this.communicationLog.addAll(communicationLog);
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
	public void addToLog(Communication communication){
		communicationLog.add(communication);
	}
	public List<Communication> getCommunicationLog(){
		return new ArrayList<Communication>(communicationLog);
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
		Project other = (Project) obj;
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
