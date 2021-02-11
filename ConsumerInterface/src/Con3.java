import java.util.function.Consumer;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;

class Student{
	private String name;
	private int marks;
	
	Student(String name, int marks){
		this.name=name;
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
}
public class Con3 {

	public static void main(String[] args) {
		ArrayList<Student>students=new ArrayList<Student>();
		addRecords(students);
		
		Predicate<Student>checkReq=tempStudent->tempStudent.getMarks()>=70;
		
		Function<Student, String>gradeInfo=tempStudent->{
			if(tempStudent.getMarks()>=70) {
				return "A[Distinction]";
			}else if(tempStudent.getMarks()>=60) {
				return "B[FirstClass]";
			}
			else if(tempStudent.getMarks()>=50) {
				return "C[SecondClass]";
			}else {
				return "F[Failed]";
			}
		};
		
		Consumer<Student>printData=tempStudent->{
			System.out.println("Name is :"+tempStudent.getName());
			System.out.println("Marks is :"+tempStudent.getMarks());
			System.out.println("Grade is :"+gradeInfo.apply(tempStudent));
		};
		
		for(Student student:students) {
			if(checkReq.test(student)) {
			printData.accept(student);
			}	
		}

	}
	
	public static void addRecords(ArrayList<Student>students) {
		students.add(new Student("Abd",55));
		students.add(new Student("dhoni",75));
		students.add(new Student("kohli",80));
		students.add(new Student("sachin",95));
		students.add(new Student("rohit",65));
	}

}
/*
 Name is :dhoni
Marks is :75
Grade is :A[Distinction]
Name is :kohli
Marks is :80
Grade is :A[Distinction]
Name is :sachin
Marks is :95
Grade is :A[Distinction]
*/
