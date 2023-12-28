package edu.kh.objarray.practice.model.vo;

public class Employee {
	
	private int num; 
	private String name;
	private String department;
	private	String rank;
	private int pay;
	
	public Employee() {}

	public Employee(int num, String name, String department, String rank, int pay) {
		
		this.num = num;
		this.name = name;
		this.department = department;
		this.rank = rank;
		this.pay = pay;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
	
	

}
