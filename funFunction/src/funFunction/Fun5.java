package funFunction;

import java.util.function.Function;

public class Fun5 {

	public static void main(String[] args) {
		
		Function<Integer,Integer>doubleNumber=data->data+data;
		
		Function<Integer,Integer>cubeNumber=data->data*data*data;
		
		System.out.println(doubleNumber.andThen(cubeNumber).apply(3));
		System.out.println(doubleNumber.compose(cubeNumber).apply(3));
	}

}
/*
216
54
*/