package ba.bitcamp.homework16;

public class Firm {
	private String name;
	private Employee director;
	private Employee[]employees;
	
	private Firm (String name, Employee director, Employee[] employees){
		this.name = name;
		this.director = director;
		this.employees = employees;
	}

	
	
	public int getNumberOfEmployees(){
		return employees.length;
	}
	
	
	public int Money(){
		int money = 0;
		for (int i = 0; i < employees.length; i++){
			money+=employees[i].getmonthlySalary();
		}
		return money;
	}
	
	public int numberFemale(){
		int numberFemale = 0;
		for(int i = 0; i < employees.length; i++){
			if(employees[i].getSex().equals("female")){
				numberFemale++;
			}
			
		}
		return numberFemale;
	}
	
	public String toString(){
		String s = "Firm:" + name + "\n";
		s += "Director:" + director.getName() + "\n";
		s+= "Number of employees:" + employees.length;
		return s;
	}
	
	
	
}
