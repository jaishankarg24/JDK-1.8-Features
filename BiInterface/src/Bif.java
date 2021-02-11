import java.util.function.BiFunction;

import java.util.ArrayList;

class Cricketer{
	private String name;
	private int id;
	
	Cricketer(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}
public class Bif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String,Integer,Cricketer>createObj=(name,id)->new Cricketer(name,id);
		
		ArrayList<Cricketer>cricketers=new ArrayList<Cricketer>();
		addRecords(cricketers,createObj);
		
		System.out.println("the details of the cricketers are");
		System.out.println("*************************************");
		
		for(Cricketer cricketer:cricketers) {
			System.out.println("Name is :"+cricketer.getName());
			System.out.println("id is :"+cricketer.getId());
			System.out.println("***********************************");
		}
		
		

	}
	
	public static void addRecords(ArrayList<Cricketer>cricketers,BiFunction<String,Integer,Cricketer>createObj) {
		cricketers.add(createObj.apply("sachin", 10));
		cricketers.add(createObj.apply("dhoni",7 ));
		cricketers.add(createObj.apply("kohli", 18));
		cricketers.add(createObj.apply("rohit", 45));
		cricketers.add(createObj.apply("yuvi", 9));
	}

}
/*
the details of the cricketers are
*************************************
Name is :sachin
id is :10
***********************************
Name is :dhoni
id is :7
***********************************
Name is :kohli
id is :18
***********************************
Name is :rohit
id is :45
***********************************
Name is :yuvi
id is :9
***********************************
*/
