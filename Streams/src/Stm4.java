import java.util.ArrayList;

public class Stm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>nameList=new ArrayList<>();
		nameList.add("Sachin");
		nameList.add("dhoni");
		nameList.add("rohit");
		nameList.add("kohli");
		nameList.add("yuvi");
		nameList.add("pointing");
		nameList.add("dravid");
		nameList.add("ganguly");
		
		long result =nameList.stream().filter(name->name.length()>5).count();
		System.out.println("the number of elements after filtering "+result);
	}

}
//the number of elements after filtering 4
