package onb.leadmanagement.domain;

import java.util.*;
import static org.apache.commons.lang.Validate.*;


public class LeadProfile {
	private String name;
	private Channel channelAccessed; 
	private String comments;
	private List<Project> projects = new ArrayList<Project>();
	private Contact contact;
	
	public LeadProfile(String name){
		notEmpty(name);
		this.name = name;
	}
	
	public LeadProfile(String name, Channel channelAccessed, Contact contact){
		notEmpty(name);
		notNull(channelAccessed);
		notNull(contact);
		this.name = name;
		this.channelAccessed = channelAccessed;
		this.contact = contact;
	}
	
	
	public String getName(){
		return name;
	}
	public Channel getChannelAccessed(){
		return channelAccessed;
	}
	public String getComments(){
		return comments;
	}
	public void addProject(Project project){
		projects.add(project);
	}
	public List<Project> getProjects(){
		return new ArrayList<Project>(projects);
	}
}
