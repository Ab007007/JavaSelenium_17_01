package com.syn.java.basics.inheritance;

public class Employee extends Person
{
	
	String empID;
	String empEmail;
	String companyName;
	
	
	public String toString() {
		String str = "\nEmployee ID : " + this.empID + "\nEmployee email : " + this.empEmail + "\nCompanyName : " + this.companyName 
				+ "\n*****************************************************";
		return super.toString() + str;
	}
	public Employee(String empID,String empEmail, String companyName)
	{
		this.empID = empID;
		this.empEmail = empEmail;
		this.companyName = companyName;
	}

	public Employee(String name, int age, double height, double weight,String empID,String empEmail, String companyName)
	{
		super(name, age, height, weight);
		this.empID = empID;
		this.empEmail = empEmail;
		this.companyName = companyName;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("aravinda", 35, 5.8, 77, "emp123", "emp123@synechron.com", "Synechron");
		System.out.println(emp1);
		
		
	}
}
