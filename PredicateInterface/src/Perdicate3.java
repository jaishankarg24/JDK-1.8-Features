//Matrimonial Application


import java.util.function.Predicate;

class Person{
	String name;
	int salary;
	int age;
	
	Person(String name, int age, int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
			
	}
	
	@Override
	public String toString() {
		return name+"--------->"+age+"------>"+salary;
	}
}
public class Perdicate3 {

	public static void main(String[] args) {
		
		Person[]persons= {
				new Person("sachin",45,55000),
				new Person("dhoni",30,60000),
				new Person("kohli",25,65000),
				new Person("rohit",28,50000),
				new Person("dravid",40,40000),
				new Person("yuvi",32,45000)
		};
		
		
		Predicate<Person>marriageCondition=tempPerson->tempPerson.age<30 && tempPerson.salary>=50000;
		System.out.println("Candidates available for marriage ");
		for(Person person:persons)
		if(marriageCondition.test(person)) {
			System.out.println(person);
			
			
		}
		
		
	}

}

/* Output
 Candidates available for marriage 
kohli--------->25------>65000
rohit--------->28------>50000
*/
