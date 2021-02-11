package funFunction;
import java.util.function.Function;

import java.util.ArrayList;

class Employee{
	private String name;
	private int age;
	private double salary;
	
	Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	
	public double getsalary() {
		return salary;
	}
}
public class Fun1 {

	public static void main(String[] args) {
		ArrayList<Employee>employees=new ArrayList<Employee>();
		addRecords(employees);
		
		Function<ArrayList<Employee>,Double>totalSalary=tempEmpList->{
			double total=0;
			for(Employee employee:tempEmpList) {
				total+=employee.getsalary();
			}
			return total;
		};
		System.out.println("the sum of all the employees salaries is"+totalSalary.apply(employees));
	}
	public static void addRecords(ArrayList<Employee>employees) {
		employees.add(new Employee("sachin",48,50000));
		employees.add(new Employee("dravid",47,40000));
		employees.add(new Employee("kohli",32,45000));
		employees.add(new Employee("dhoni",38,40000));
		employees.add(new Employee("yuvi",38,30000));
	}
}

//the sum of all the employees salaries is205000.0