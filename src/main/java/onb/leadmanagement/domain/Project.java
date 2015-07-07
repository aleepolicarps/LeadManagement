package onb.leadmanagement.domain;

import java.util.*;

public class Project {
	
	private String name;
	private Status status;
	private List<Communication> communicationLog = new ArrayList<Communication>();
	private String detail;
	
	public Project(String name){
		this.name = name;
		this.status = Status.for_bidding;
	}
	
	public Project(String name, Status status, String detail) {
		super();
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
	public void addToLog(Communication communication){
		communicationLog.add(communication);
	}
}
