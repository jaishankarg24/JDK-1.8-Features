
public class Bic {

	public static void main(String[] args) {
		
		java.util.function.BiConsumer<String, String>concate=(a,b)->System.out.println(a+b);
		
		concate.accept("sachin", "Tendulkar");
	}

}
//sachinTendulkar
