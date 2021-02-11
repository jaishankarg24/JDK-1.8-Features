import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>number=new ArrayList<Integer>();
		number.add(20);
		number.add(60);
		number.add(900);
		number.add(500);
		number.add(220);
		number.add(230);
		
		List<Integer>Ascend=number.stream().sorted().collect(Collectors.toList());
		System.out.println("AscendingOrder elements"+Ascend);

		List<Integer>dscend=number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("dscendingOrder elements"+dscend);
		

	}

}
/*
AscendingOrder elements[20, 60, 220, 230, 500, 900]
dscendingOrder elements[900, 500, 230, 220, 60, 20]
*/