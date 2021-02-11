import java.util.stream.*;

public class Stm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> intArr=Stream.of(10, 20, 30, 40, 50);
		intArr.forEach(System.out::println);
		System.out.println();
		Double dArr[]= {10.0, 20.0, 30.0, 40.0, 50.0};
		Stream<Double> doubleArr=Stream.of(dArr);
		doubleArr.forEach(System.out::println);
		

	}

}
/*
10
20
30
40
50

10.0
20.0
30.0
40.0
50.0
*/