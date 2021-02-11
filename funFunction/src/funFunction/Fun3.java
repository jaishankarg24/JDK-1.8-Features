package funFunction;

import java.util.function.Function;



public class Fun3 {

	public static void main(String[] args) {
		
		
		Function<String,String> convertCase=name->name.toUpperCase();
		
		Function<String,String>giveSubstring=name->name.substring(0, 9);
		
		System.out.println(convertCase.apply("sachinrameshtendulkar"));
		System.out.println(giveSubstring.apply("sachinrameshtendulkar"));
		
		System.out.println(convertCase.andThen(giveSubstring).apply("sachinrameshtendulkar"));
		System.out.println(convertCase.compose(giveSubstring).apply("sachinrameshtendulkar"));

	}

}
/*
SACHINRAMESHTENDULKAR
sachinram
SACHINRAM
SACHINRAM
*/