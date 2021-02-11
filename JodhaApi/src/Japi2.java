import java.time.LocalDate;

public class Japi2 {

	public static void main(String[] args) {

		LocalDate date=LocalDate.now();
		System.out.println("Today's date is "+date);
		System.out.println("-----------------------------");
		
		int year=date.getYear();
		int month=date.getMonthValue();
		int day=date.getDayOfMonth();
		
		System.out.print("Today's date is ");
		System.out.printf("%d/%d/%d", day, month, year);
		
	}

}
/*
Today's date is 2021-01-29
-----------------------------
Today's date is 29/1/2021
*/