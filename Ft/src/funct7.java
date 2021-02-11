
import java.util.function.Function;

import java.util.ArrayList;
import java.util.function.Predicate;

class Studnt{
	private String name;
	private int marks;
	
	Studnt(String name, int marks){
		this.name= name;
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
		
	}
	
}
public class funct7 {

	public static void main(String[] args) {
		
		ArrayList<Studnt>students = new ArrayList<Studnt>();
		addRecords(students);
		
		Function<Studnt,String>gradeInfo=tempStudnt->{
			if (tempStudnt.getMarks()>=70) {
				return "A[Distinction]";
			}else if (tempStudnt.getMarks()>=60) {
				return "B[First Class]";
			}else if (tempStudnt.getMarks()>=50) {
				return "C[second Class]";
			}
			else {
				return "D[Failed]";
			}
		};
		
		Predicate<Studnt>distinctionInfo=tempStudnt->tempStudnt.getMarks()>=70;
		System.out.println("Student Information");
		
		for (Studnt student:students) {
			if (distinctionInfo.test(student)) {
			System.out.println("Name:"+student.getName());
			System.out.println("Marks:"+student.getMarks());
			System.out.println("GardeInfo:"+gradeInfo.apply(student));
			System.out.println("****************************************");
		}
		}
		
	}
	
	public static void addRecords(ArrayList<Studnt>students) {
		students.add(new Studnt("Dhoni", 75));
		students.add(new Studnt("Sachin", 45));
		students.add(new Studnt("Shewag", 55));
		students.add(new Studnt("kohli", 85));
		students.add(new Studnt("Rohit", 65));
		students.add(new Studnt("raina", 35));
		
	}

}
