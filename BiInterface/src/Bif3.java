
class Employee{
	private String name;
	private int id;
	private double dailyWages;
	
	Employee(String name,int id, double dailyWages){
		this.name=name;
		this.id=id;
		this.dailyWages=dailyWages;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	public double getDailyWages() {
		return dailyWages;
	}
}

class TimeSheet{
	private int id;
	private int no_of_days;
	
	TimeSheet(int id,int no_of_days){
		this.id=id;
		this.no_of_days=no_of_days;
	}
	
	public int getId() {
		return id;
	}
	
	public int getNoofdays() {
		return no_of_days;
	}
}
public class Bif3 {

	public static void main(String[] args) {
		java.util.function.BiFunction<Employee, TimeSheet, Double>salary=(tempEmployee, tempTimeSheet)->tempEmployee.getDailyWages()*tempTimeSheet.getNoofdays();               
		
		Employee e=new Employee("sachin",10,10000);
		TimeSheet t=new TimeSheet(10,30);
		
		System.out.print("Salary of Employee :"+e.getName());
		System.out.println(" is :"+salary.apply(e, t) );
		

	}

}

//Salary of Employee :sachin is :300000.0
