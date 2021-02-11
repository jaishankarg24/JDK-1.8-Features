import java.util.function.Supplier;

public class Supp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String>randomPassword=()->{
			
			String otp="";
			
			Supplier<Integer>digit=()->(int)(Math.random()*10);
			
			String symbol="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character>character=()->symbol.charAt((int)(Math.random()*29));
			
			
			for(int i=0;i<=8;i++) {
				if(i%2==1) {
					otp=otp+digit.get();
				}else {
					otp=otp+character.get();
				}
			}
			
			return otp;
		};
		
		System.out.println("Your 8 digit otp is :"+randomPassword.get());

	}

}
//Your 8 digit otp is :A0$3Q7T3J
