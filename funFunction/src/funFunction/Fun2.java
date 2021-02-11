package funFunction;

import java.util.function.Predicate;

import java.util.function.Function;
import java.util.ArrayList;

class Employee1{
	private String name;
	private int age;
	private double salary;
	
	Employee1(String name, int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
}

public class Fun2 {

	public static void main(String[] args) {
		
		ArrayList<Employee1>employees=new ArrayList<Employee1>();
		addRecords(employees);
		
		System.out.println("The Employee details before hike is :");
		for(Employee1 employee:employees) {
			System.out.println("NAme is:"+employee.getName());
			System.out.println("Salary is :"+employee.getSalary());
			System.out.println("Age is :"+employee.getAge());
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			
		}
		
		Predicate<Employee1>checkSalary=tempEmployee->tempEmployee.getSalary()<=40000;
		
		Function<Employee1,Employee1>giveHike=tempEmployee->{
			double salary=tempEmployee.getSalary()+5000;
			tempEmployee.setSalary(salary);
			return tempEmployee;
		};
		
		ArrayList<Employee1>hikedEmployees=new ArrayList<Employee1>();
		for(Employee1 employee:employees) {
			if (checkSalary.test(employee)) {
				hikedEmployees.add(giveHike.apply(employee));
			}
		}
		System.out.println("-----------------------------------------");
		
		System.out.println("The Employee details who got the hike is:");
		for (Employee1 employee:hikedEmployees) {
			System.out.println("NAme is:"+employee.getName());
			System.out.println("Salary is:"+employee.getSalary());
			System.out.println("Age is:"+employee.getAge());
			System.out.println("-------------------------------------");
			
		}
	}
	
	public static void addRecords(ArrayList<Employee1>employees) {
		employees.add(new Employee1("sachin",48,50000));
		employees.add(new Employee1("dravid",47,40000));
		employees.add(new Employee1("kohli",32,45000));
		employees.add(new Employee1("dhoni",38,40000));
		employees.add(new Employee1("yuvi",38,60000));
		employees.add(new Employee1("lara",38,40000));
		employees.add(new Employee1("pointing",38,40000));
	}

}


/*
The Employee details before hike is :
NAme is:sachin
Salary is :50000.0
Age is :48
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
NAme is:dravid
Salary is :40000.0
Age is :47
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
NAme is:kohli
Salary is :45000.0
Age is :32
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
NAme is:dhoni
Salary is :40000.0
Age is :38
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
NAme is:yuvi
Salary is :60000.0
Age is :38
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
NAme is:lara
Salary is :40000.0
Age is :38
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
NAme is:pointing
Salary is :40000.0
Age is :38
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
-----------------------------------------
The Employee details who got the hike is:
NAme is:dravid
Salary is:45000.0
Age is:47
-------------------------------------
NAme is:dhoni
Salary is:45000.0
Age is:38
-------------------------------------
NAme is:lara
Salary is:45000.0
Age is:38
-------------------------------------
NAme is:pointing
Salary is:45000.0
Age is:38
-------------------------------------
*/