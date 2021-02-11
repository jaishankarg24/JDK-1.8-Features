import java.util.function.Supplier;

public class Supp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String>randomName=()->{
			String[]names= {"dhoni","kohli","rohit","sachin","yuvi"};
			
			int index=(int)(Math.random()*5);
			return names[index];
		};
		 
		System.out.println("The random name is "+randomName.get());
		
	}

}
//The random name is yuvi
//The random name is kohli
