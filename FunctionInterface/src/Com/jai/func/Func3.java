package Com.jai.func;
import java.util.function.Function;

public class Func3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer>countBlankSpace=name->name.length()-name.replaceAll(" ", "").length();
		System.out.println("No of BlankSpaces are:"+countBlankSpace.apply("Aradhya Brilliance Center"));

	}

}
//No of BlankSpaces are:2