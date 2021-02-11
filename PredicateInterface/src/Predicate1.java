import java.util.function.Predicate;

import java.util.ArrayList;
public class Predicate1 {

	public static void main(String[] args) {
		String[]cricketerNames= {"Sachin",null,"saurav","dravid","","sehwagh","",null};
		
		Predicate<String>cleanData=name->name!=null && name.length()!=0;
		
		ArrayList<String>nameList=new ArrayList<String>();
		
		for (String cricketerName:cricketerNames) {
			if (cleanData.test(cricketerName)) {
				nameList.add(cricketerName);
			}
		}
		System.out.println("the cleaned data for processing is:");
		for (String name:nameList) {
			System.out.println(name);
		}

	}

}

/* Output

the cleaned data for processing is:
Sachin
saurav
dravid
sehwagh
*/