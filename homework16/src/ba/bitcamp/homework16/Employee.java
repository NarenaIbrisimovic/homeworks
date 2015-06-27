package ba.bitcamp.homework16;

public class Employee {
	private String name;
	private String sex;
	private int monthlySalary;
	
	public Employee(String name, String sex,int monthlySalary){
		this.name = name;
		this.sex =  sex;
		this.monthlySalary = monthlySalary;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSex(){
		return sex;
	}
	
	
	public int getmonthlySalary(){
		return monthlySalary;
	}
	
	
	
	public void setmonthlySalary(int monthlySalary){
		this.monthlySalary = monthlySalary;
		
	}
}
