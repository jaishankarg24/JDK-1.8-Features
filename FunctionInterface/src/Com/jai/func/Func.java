package Com.jai.func;

import java.util.function.Function;

public class Func {

	public static void main(String[] args) {
		
		Function<String,Integer>calculateLength=name->name.length();
		System.out.println(calculateLength.apply("sachinrameshtendulker"));
		
		Function<Integer,Integer>calculateSquare=data->data*data;
		System.out.println(calculateSquare.apply(5));
		

	}

}
/*
21
25
*/