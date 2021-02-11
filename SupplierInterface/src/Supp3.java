import java.util.function.Supplier;
public class Supp3 {
	public static void main(String[] args) {
		Supplier<String>oneTimePassword=()->{
			String otp="";
			for(int i=0;i<=6;i++) {
			otp+=(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println("Your OneTimePassword is :"+oneTimePassword.get());
	}

}
//Your OneTimePassword is :8686549
