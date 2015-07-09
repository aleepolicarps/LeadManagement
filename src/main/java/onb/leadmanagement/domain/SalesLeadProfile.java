package onb.leadmanagement.domain;

import java.util.*;

import javax.persistence.*;

import static org.apache.commons.lang.Validate.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class SalesLeadProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="salesLeadId")
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Channel initialChannelAccessed;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="salesLeadId", referencedColumnName="salesLeadId")
	private Set<Project> projects;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="salesLeadId", referencedColumnName="salesLeadId")
	private List<Communication> communicationLog;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="contactId")
	private Contact contact;
	
	@Column(nullable = false)
	private Industry industry;
	
	private String comments;
	
	protected SalesLeadProfile(){ 
		//for jpa
	}
	
	public SalesLeadProfile(String name){
		notEmpty(name);
		this.name = name;
		this.initialChannelAccessed = Channel.NONE;
		this.contact = new Contact();
		this.industry = Industry.NONE;
		projects = new HashSet<Project>();
		communicationLog = new ArrayList<Communication>();
		this.comments = "";
	}
	
	public SalesLeadProfile(String name, Channel channelAccessed, Contact contact,
			Industry industry, Set<Project> projects, List<Communication> communicationLog){
		notEmpty(name);
		notNull(channelAccessed);
		notNull(contact);
		notNull(industry);
		notNull(projects);
		notNull(communicationLog);
		this.name = name;
		this.initialChannelAccessed = channelAccessed;
		this.contact = contact;
		this.industry = industry;
		this.projects  = new HashSet<Project>(projects);
		this.communicationLog = new ArrayList<Communication>(communicationLog);
		this.comments = "";
	}
	public void addToLog(Communication communication){
		communicationLog.add(communication);
	}
	public List<Communication> getCommunicationLog(){
		return new ArrayList<Communication>(communicationLog);
	}	
	public String getId(){
		return id.toString();
	}
	public String getName(){
		return name;
	}
	public Channel getChannelAccessed(){
		return initialChannelAccessed;
	}
	public String getComments(){
		return comments;
	}
	public void addProject(Project project){
		projects.add(project);
	}
	public void mergeProjects(Set<Project> project){
		projects.addAll(project);
	}
	public void removeProject(Project project){
		projects.remove(project);
	}
	public Set<Project> getProjects(){
		return new HashSet<Project>(projects);
	}	
	public Contact getContact(){
		return contact;
	}
	public Industry getIndustry() {
		return industry;
	}
	@Override
	public String toString() {
		return name;
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
		SalesLeadProfile other = (SalesLeadProfile) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
	
}
