package Com.jai.func;
import java.util.function.Function;


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

public class Func4 {

	private static final int Student = 0;
	private static final int ArrayList = 0;

	public static void main(String[] args) {
		
		ArrayList<Student>students=new ArrayList<Student>();
		addRecords(students);
		
		Function<Student,String>gradeInfo=tempStudent->{
			if(tempStudent.getMarks()>=70) {
				return "A[disctinction]";
				
			}
			else if(tempStudent.getMarks()>=60) {
				return "B[FirstClass]";
			}
			else if(tempStudent.getMarks()>=50) {
				return "C[SecondClass]";
			}
			else {
				return "D[Failed]";
			}
		};
		
		System.out.println("Student Information along with grade");
		
		for (Student student : students) {
			System.out.println("Name"+student.getName());
			System.out.println("Marks"+student.getMarks());
			System.out.println("Grade is"+gradeInfo.apply(student));
			System.out.println("****************************");
		}
	}
		
		/*public static void addRecords(ArrayList<Student>students) {
			
			students.add(new Student("Sachin", 45));
			students.add(new Student("Dhoni", 85));
			students.add(new Student("kohli", 35));
			students.add(new Student("dravid", 75));
			students.add(new Student("kumble", 55));
			students.add(new Student("sehwag", 65));
			students.add(new Student("yuvi", 45));
			students.add(new Student("ganguly", 35));
					
		}

	}*/

	private static void addRecords(java.util.ArrayList<Com.jai.func.Student> students) {
		
		students.add(new Student("Sachin", 45));
		students.add(new Student("Dhoni", 85));
		students.add(new Student("kohli", 35));
		students.add(new Student("dravid", 75));
		students.add(new Student("kumble", 55));
		students.add(new Student("sehwag", 65));
		students.add(new Student("yuvi", 45));
		students.add(new Student("ganguly", 35));
		
		
	}

}

/* Output
 
 Student Information along with grade
NameSachin
Marks45
Grade isD[Failed]
****************************
NameDhoni
Marks85
Grade isA[disctinction]
****************************
Namekohli
Marks35
Grade isD[Failed]
****************************
Namedravid
Marks75
Grade isA[disctinction]
****************************
Namekumble
Marks55
Grade isC[SecondClass]
****************************
Namesehwag
Marks65
Grade isB[FirstClass]
****************************
Nameyuvi
Marks45
Grade isD[Failed]
****************************
Nameganguly
Marks35
Grade isD[Failed]
****************************
*/
