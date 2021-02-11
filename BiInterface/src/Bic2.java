import java.util.ArrayList;

class Employeee{
	private String name;
	private double salary;
	
	Employeee(String name,double salary){
		this.name=name;
		this.salary= salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
public class Bic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employeee>employeees=new ArrayList<Employeee>();
		addRecords(employeees);
		
		System.out.println("Employeee salary Before hike ");
		System.out.println("*****************************");
		
		for(Employeee employeee:employeees) {
			System.out.println("Name is :"+employeee.getName());
			System.out.println("Salary is :"+employeee.getSalary());
			System.out.println("-------------------------------------");
		}
		
		java.util.function.BiConsumer<Employeee, Double>hikesalary=(tempEmployeee,tempSalary)->{
			double salary=tempEmployeee.getSalary()+tempSalary;
			tempEmployeee.setSalary(salary);
		};
		
		for(Employeee employeee:employeees) {
		hikesalary.accept(employeee, 5000.0);
		}
		
		System.out.println("Employeee salary After hike ");
		System.out.println("*****************************");
		
		for(Employeee employeee:employeees) {
			System.out.println("Name is :"+employeee.getName());
			System.out.println("Salary is :"+employeee.getSalary());
			System.out.println("-------------------------------------");
		}
		

	}
	
	public static void addRecords(ArrayList<Employeee>employeees) {
		
		employeees.add(new Employeee("sachin",50000.0));
		employeees.add(new Employeee("dhoni",55000.0));
		employeees.add(new Employeee("kohli",60000.0));
		employeees.add(new Employeee("rohit",45000.0));
		employeees.add(new Employeee("rahul",35000.0));
		employeees.add(new Employeee("ashwin",40000.0));
		
		
		
		
	}

}

/*
Employeee salary Before hike 
*****************************
Name is :sachin
Salary is :50000.0
-------------------------------------
Name is :dhoni
Salary is :55000.0
-------------------------------------
Name is :kohli
Salary is :60000.0
-------------------------------------
Name is :rohit
Salary is :45000.0
-------------------------------------
Name is :rahul
Salary is :35000.0
-------------------------------------
Name is :ashwin
Salary is :40000.0
-------------------------------------
Employeee salary After hike 
*****************************
Name is :sachin
Salary is :55000.0
-------------------------------------
Name is :dhoni
Salary is :60000.0
-------------------------------------
Name is :kohli
Salary is :65000.0
-------------------------------------
Name is :rohit
Salary is :50000.0
-------------------------------------
Name is :rahul
Salary is :40000.0
-------------------------------------
Name is :ashwin
Salary is :45000.0
-------------------------------------
*/