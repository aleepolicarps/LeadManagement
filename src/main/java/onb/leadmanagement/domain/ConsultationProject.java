package onb.leadmanagement.domain;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="ConsultationProject")
public class ConsultationProject extends Project {

	private String technology;
	private BigDecimal budget;
	private ExpenditureType expenditure;

	public ConsultationProject(String name, Status status,
			ArrayList<Communication> communicationLog, String detail,
			String technology, Double budget, ExpenditureType expenditure) {
		super(name, status, communicationLog, detail);
		this.technology = technology;
		this.budget = new BigDecimal(budget, new MathContext(2));
		this.expenditure = expenditure;
	}
	public ConsultationProject(String name) {
		super(name);
	}
	public String getTechnology(){
		return technology;
	}
	public String getBudget(){
		return budget.toString();
	}
	public ExpenditureType getExpenditureType(){
		return expenditure;
	}

}
