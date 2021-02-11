import java.util.function.BiPredicate;
public class Bip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BiPredicate<Integer,Integer>sumofEven=(fop,sop)->(fop+sop)%2==0;
		
		System.out.println(sumofEven.test(3, 2));
		System.out.println(sumofEven.test(2, 2));

	}

}
/*
false
true
*/