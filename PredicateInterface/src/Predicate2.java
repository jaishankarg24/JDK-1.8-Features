import java.util.Scanner;

import java.util.function.Predicate;

class User{
	String name;
	String pwd;
	
	User(String name, String pwd){
		this.name=name;
		this.pwd=pwd;
	}
}
public class Predicate2 {

	public static void main(String[] args) {
		
		Predicate<User>checkAuthentication=tempUser->tempUser.name.equalsIgnoreCase("ABC") && tempUser.pwd.equalsIgnoreCase("FullStack");
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=scan.next();
		System.out.println("Enter the Password");
		String pwd=scan.next();
		
		User user=new User(name, pwd);
		
		if (checkAuthentication.test(user)) {
			System.out.println("All services of FullStack is available to" +user.name);
		}else {
			System.out.println(user.name+"is not a valid user");
		}


	}

}

/* output
 
 Enter the Name:
xyz
Enter the Password
java
xyzis not a valid user

Enter the Name:
abc
Enter the Password
fullstack
All services of FullStack is available toabc

*/
