import java.util.ArrayList;

public class Stm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>number=new ArrayList<Integer>();
		number.add(20);
		number.add(60);
		number.add(900);
		number.add(500);
		number.add(220);
		number.add(230);
		
		Integer arr[]=number.stream().toArray(Integer[]::new);
		System.out.println("The Array elements are");
		for(Integer i:arr) {
			System.out.println(i);
		}

	}

}
/*
The Array elements are
20
60
900
500
220
230
*/