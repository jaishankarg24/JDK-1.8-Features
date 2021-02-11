import java.util.ArrayList;

public class Stm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>number=new ArrayList<Integer>();
		number.add(20);
		number.add(60);
		number.add(900);
		number.add(500);
		number.add(220);
		number.add(230);
		
		number.stream().forEach(data->System.out.println(data));
		System.out.println();
		
		number.stream().forEach(System.out::println);

	}

}
/*
20
60
900
500
220
230

20
60
900
500
220
230
*/