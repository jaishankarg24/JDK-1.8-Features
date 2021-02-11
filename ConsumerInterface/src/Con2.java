import java.util.function.Consumer;

import java.util.ArrayList;

class Cricketer{
	private String name;
	private int id;
	private String country;
	
	Cricketer(String name, int id, String country){
		this.name=name;
		this.id=id;
		this.country=country;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCountry() {
		return country;
	}
}
public class Con2 {

	public static void main(String[] args) {
		
		ArrayList<Cricketer>cricketers=new ArrayList<Cricketer>();
		addRecords(cricketers);
		
		System.out.println("Cricketer Information is below");
		Consumer<Cricketer>printInfo=tempCricketer->{
			System.out.println("Name is :"+tempCricketer.getName());
			System.out.println("Id is :"+tempCricketer.getId());
			System.out.println("Country is :"+tempCricketer.getCountry());
			System.out.println("*************************************");
		};
		
		for(Cricketer cricketer:cricketers) {
			printInfo.accept(cricketer);
		}
		
		
	
		
	}
	
	public static void addRecords(ArrayList<Cricketer>cricketers) {
		cricketers.add(new Cricketer("Dhoni",7,"ind"));
		cricketers.add(new Cricketer("abd",17,"sa"));
		cricketers.add(new Cricketer("gayle",33,"wi"));
		cricketers.add(new Cricketer("smith",25,"aus"));
		cricketers.add(new Cricketer("morgan",12,"eng"));
		cricketers.add(new Cricketer("taylor",40,"nz"));
	}

}
/*
Cricketer Information is below
Name is :Dhoni
Id is :7
Country is :ind
*************************************
Name is :abd
Id is :17
Country is :sa
*************************************
Name is :gayle
Id is :33
Country is :wi
*************************************
Name is :smith
Id is :25
Country is :aus
*************************************
Name is :morgan
Id is :12
Country is :eng
*************************************
Name is :taylor
Id is :40
Country is :nz
*************************************
*/