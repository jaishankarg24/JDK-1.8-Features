import java.util.*;
public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer data=10;
		System.out.println(data);
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);//-------> Integer.valueOf(10);
		al.add(20);
		System.out.println("arraylist elements :"+al);

	}

}
/*
10
arraylist elements :[10, 20]
*/