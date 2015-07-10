package onb.leadmanagement.domain;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class ConsultationProject extends Project_Old {

	private String technology;
	private BigDecimal budget;
	private ExpenditureType expenditure;

	protected ConsultationProject(){
		super();
	}
	public ConsultationProject(String name, Status status, String detail,
			String technology, Double budget, ExpenditureType expenditure) {
		super(name, status, detail);
		this.technology = technology;
		this.budget = new BigDecimal(budget, new MathContext(2));
		this.expenditure = expenditure;
	}
	public ConsultationProject(String name) {
		super(name);
		this.technology="";
		this.budget=BigDecimal.ZERO;
		this.expenditure=expenditure.CAPITAL_EXPENSE;
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
