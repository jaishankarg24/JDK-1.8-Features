package Com.jai.func;
import java.util.function.Function;

public class Func2 {

	public static void main(String[] args) {
		Function<String,String>removeBlankSpace=name->name.replaceAll(" ", "");
		System.out.println(removeBlankSpace.apply("Aradhya Brilliance Center"));

	}

}

//AradhyaBrillianceCenter