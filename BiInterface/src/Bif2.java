//import java.util.function.BiFunction;

public class Bif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.function.BiFunction<Integer,Integer,Integer>mult=(a,b)->a*b;
		System.out.println("product is: "+mult.apply(10, 29));
	}

}
//product is: 290
