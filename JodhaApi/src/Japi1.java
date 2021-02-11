import java.time.LocalTime;

public class Japi1 {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		
		System.out.println("The current Time is "+time);
		System.out.println("------------------------------");
		
		int hr=time.getHour();
		int hour=hr%12;
		int minute=time.getMinute();
		int seconds=time.getSecond();
		int nano=time.getNano();
		System.out.print("the current time is ");
		System.out.printf("%d:%d:%d ",hour, minute, seconds,nano);

	}

}
/*
The current Time is 17:05:53.620695
------------------------------
the current time is 5:5:53 
*/