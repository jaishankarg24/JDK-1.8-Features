import java.util.function.Supplier;

import java.util.Date;
public class supp1 {

	public static void main(String[] args) {
		Supplier<Date>dateInfo=()->new Date();
		System.out.println("The current date time information is :"
													+dateInfo.get());

	}

}
//The current date time information is :Fri Jan 29 15:10:11 IST 2021
