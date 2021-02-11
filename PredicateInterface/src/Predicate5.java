import java.util.function.Predicate;
public class Predicate5 {

	public static void main(String[] args) {
		Predicate<String>checkName=Predicate.isEqual("sachin");
		System.out.println(checkName.test("sachin"));
		System.out.println(checkName.test("dravid"));
	}

}
/* output
true
false
*/