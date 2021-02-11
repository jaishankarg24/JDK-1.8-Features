import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Stm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("list elements "+list);
		ArrayList<Integer>newList=new ArrayList<Integer>();
		for(Integer data:list) {
			data=data*2;
			newList.add(data);
			
		}
		
		System.out.println("multiplied newList "+newList);
		
		List<Integer>resultList=list.stream().map(data->data*2).collect(Collectors.toList());
		System.out.println("stream resultList "+resultList);
	}

}
/*
list elements [1, 2, 3, 4, 5]
multiplied newList [2, 4, 6, 8, 10]
stream resultList [2, 4, 6, 8, 10]
*/