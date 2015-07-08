package onb.leadmanagement.domain;


import javax.persistence.*;
@Entity

public class Communication {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="communicationId")
	private Long id;
	
	@Column(nullable=false)
	private int month;
	@Column(nullable=false)
	private int day;
	@Column(nullable=false)
	private int year;
	@Column(nullable=false)
	private String time;
	
	
	private int numOfMinutes; //nullable
	
	private Address location; //nullable
	
	@Column(nullable=false)
	private String subject;
	private String content; //details (summary)
	
	@Column(nullable=false)
	private Channel channel;
	
	
	
	protected Communication(){
		//for jpa
	}



	public Communication(int month, int day, int year, String time,
			int numOfMinutes, Address location, String subject, String content,
			Channel channel) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.time = time;
		this.numOfMinutes = numOfMinutes;
		this.location = location;
		this.subject = subject;
		this.content = content;
		this.channel = channel;
	}
	
	
	public String getId(){
		return id.toString();
	}
	
	public String getDate(){
		String[] monthNames = {"January", "February", "March", "April", 
				"May", "June", "July", "August", "September", "October", 
				"November", "December"};
		return monthNames[month]+" "+day+", "+year;
	}
	public Address getLocation(){
		return location;
	}
	public String getSubject(){
		return subject;
	}
	public String getContent(){
		return content;
	}
	public int getNumOfMinutes(){
		return numOfMinutes;
	}
	private String getTime() {
		return time;
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
		Communication other = (Communication) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("LOG ENTRY:").append("\n")
		.append("\t").append("Date: ").append(getDate())
		.append("\t").append("Time:" ).append(getTime())
		.append("\t").append("Subject: ").append(subject);
		return sb.toString();
	}	
}
