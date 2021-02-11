import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Stm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>nameList=new ArrayList<String>();
		nameList.add("sachin");
		nameList.add("dhoni");
		nameList.add("kohli");
		nameList.add("dravid");
		nameList.add("yuvi");
		
		System.out.println("nameList names "+nameList);
		
		List<String>newList=nameList.stream().filter(name->name.length()==5).collect(Collectors.toList());
		System.out.println("newList with max 5char name"+newList);
		List<String>upperList=nameList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println("newList upperCase name"+upperList);
	}

}
/*
nameList names [sachin, dhoni, kohli, dravid, yuvi]
newList with max 5char name[dhoni, kohli]
newList upperCase name[SACHIN, DHONI, KOHLI, DRAVID, YUVI]
*/