import java.util.ArrayList;

import java.util.Comparator;

public class Stm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>number=new ArrayList<Integer>();
		number.add(20);
		number.add(60);
		number.add(900);
		number.add(500);
		number.add(220);
		number.add(230);

		Integer minNumber=number.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("Min ELement is "+minNumber);
		
		Integer maxNumber=number.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("Min ELement is "+maxNumber);
		
		
		Integer minNum=number.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Min ELement is "+minNum);
		
		Integer maxNum=number.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max ELement is "+maxNum);
	}

}
/*
Min ELement is 20
Min ELement is 900
Min ELement is 20
Max ELement is 900
*/