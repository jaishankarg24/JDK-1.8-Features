import java.util.function.Consumer;


class Course{
	private String name;
	private int cost;
	private int no_of_students;
	
	Course(String name, int cost, int no_of_students){
		this.name=name;
		this.cost=cost;
		this.no_of_students=no_of_students;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getCost() {
		return cost;
	}
	public int getNo_of_students() {
		return no_of_students;
	}
}
public class Con4 {

	public static void main(String[] args) {
		Consumer<Course>printName=tempCourse->System.out.println("Name of corse "+tempCourse.getName());
		
		Consumer<Course>printCost=tempCourse->System.out.println("Cost of corse "+tempCourse.getCost());
	
		Consumer<Course>printNumb=tempCourse->System.out.println("Number of student in corse "+tempCourse.getNo_of_students());
		
		Consumer<Course>printInfo=printName.andThen(printCost).andThen(printNumb);
		
		System.out.println("Courses Available");
		System.out.println("*****************************************");
		Course course1=new Course("java",2000,200);
		printInfo.accept(course1);
		
		System.out.println();
		
		Course course2=new Course("python",1500,200);
		printInfo.accept(course2);		
		
		
	}

}
/*
Courses Available
*****************************************
Name of corse java
Cost of corse 2000
Number of student in corse 200

Name of corse python
Cost of corse 1500
Number of student in corse 200
*/