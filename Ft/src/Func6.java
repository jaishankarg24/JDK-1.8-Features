import java.util.function.Function;


import java.util.ArrayList;
//import java.util.function.Predicate;

class Student{
	private String name;
	private int marks;
	
	Student(String name, int marks){
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
public class Func6 {

	public static void main(String[] args) {
		
		ArrayList<Student>students = new ArrayList<Student>();
		addRecords(students);
		
		Function<Student,String>gradeInfo=tempStudent->{
			if (tempStudent.getMarks()>=70) {
				return "A[Distingtion]";
			}else if (tempStudent.getMarks()>=60) {
				return "B[First Class]";
			}else if (tempStudent.getMarks()>=50) {
				return "C[second Class]";
			}
			else {
				return "D[Failed]";
			}
		};
		
		System.out.println("Student Information");
		
		for (Student student:students) {
			System.out.println("Name:"+student.getName());
			System.out.println("Marks:"+student.getMarks());
			System.out.println("GardeInfo:"+gradeInfo.apply(student));
		}
		
	}
	
	public static void addRecords(ArrayList<Student>students) {
		students.add(new Student("Dhoni", 75));
		students.add(new Student("Sachin", 45));
		students.add(new Student("Shewag", 55));
		students.add(new Student("kohli", 85));
		students.add(new Student("Rohit", 65));
		students.add(new Student("raina", 35));
		
	}

}
