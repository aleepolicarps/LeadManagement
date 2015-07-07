package onb.leadmanagement.domain;

import java.math.BigDecimal;

public class Consultation extends Project {

	private String technology;
	private BigDecimal budget;
	private Expenditure expenditure;
	
	
	public Consultation(String name, Status status,
			String detail, String technology, Double budget) {
		super(name, status, detail);
		this.setTechnology(technology);
		this.setBudget(budget);
	}

	public Consultation(String name) {
		super(name);
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public BigDecimal getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = new BigDecimal(budget);
	}

	public Expenditure getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(Expenditure expenditure) {
		this.expenditure = expenditure;
	}
}
