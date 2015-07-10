package onb.newmodel;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;

import javax.persistence.*;

import static org.apache.commons.lang.Validate.*;


@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="projectId")
	private long id;
	
	@Column(nullable=false)
	private String name;
	private ProjectType type;
	private BigDecimal revenue;
	
	@Column(nullable=false)
	private ProjectStatus status;
	
	@Column(nullable=false)
	private long startingDate;
	private long endingDate;
	
	protected Project(){
		
	}
	public Project(String name, ProjectType type, Date startingDate) {
		notEmpty(name);
		notNull(type);
		notNull(startingDate);
		this.name = name;
		this.type = type;
		this.startingDate = startingDate.getTime();
		this.status = ProjectStatus.ON_GOING;
	}
	public Project(String name, ProjectType type, String revenue,
			Date startingDate) {
		notEmpty(name);
		notNull(type);
		notEmpty(revenue);
		notNull(startingDate);
		this.name = name;
		this.type = type;
		this.revenue = new BigDecimal(revenue);
		this.startingDate = startingDate.getTime();
		this.status = ProjectStatus.ON_GOING;
	}
	public Project(String name, ProjectType type, String revenue,
			ProjectStatus status, Date startingDate, Date endingDate) {
		notEmpty(name);
		notNull(type);
		notEmpty(revenue);
		notNull(startingDate);
		notNull(status);
		notNull(endingDate);
		this.name = name;
		this.type = type;
		this.revenue = new BigDecimal(revenue);
		this.status = status;
		this.startingDate = startingDate.getTime();
		this.endingDate = endingDate.getTime();
	}
	public String getName(){
		return name;
	}
	public void setRevenue(String revenue){
		notEmpty(revenue);
		this.revenue = new BigDecimal(revenue, new MathContext(2));
	}
	public String getRevenue(){
		return revenue.toString();
	}
	public String getType(){
		return type.toString();
	}
	public String getStatus(){
		return status.toString();
	}
	public void setStatus(ProjectStatus status){
		notNull(status);
		this.status = status;
	}
	public void finishProject(){
		if(status == ProjectStatus.FINISHED){
			throw new 
			ProjectAlreadyFinishedExcpetion("Cannot finish already finished project");
		}
		this.endingDate = (new Date()).getTime();
		this.status = ProjectStatus.FINISHED;
	}
	public Date getStartingDate(){
		return new Date(startingDate);
	}
	public Date getEndingDate(){
		return new Date(endingDate);
	}
	public void setEndingDate(Date endingDate){
		notNull(endingDate);
		this.endingDate = endingDate.getTime();
	}
}
