import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
public class Stm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>data=new ArrayList<Integer>();
		data.add(10);
		data.add(23);
		data.add(30);
		data.add(40);
		data.add(51);
		data.add(63);
		data.add(70);
		data.add(89);
		
		System.out.println("data ArrayList elements "+data);
		
		ArrayList<Integer>even=new ArrayList<Integer>();
		for(Integer i:data) {
			if(i%2==0) {
				even.add(i);
			}
		}
		
		System.out.println("even ArrayList Elements "+even);
		
		System.out.println();
		List<Integer>result=data.stream().filter(evenList->evenList%2==0).collect(Collectors.toList());
		System.out.println("Even listElements :"+result);
	}

}
/*
data ArrayList elements [10, 23, 30, 40, 51, 63, 70, 89]
even ArrayList Elements [10, 30, 40, 70]

Even listElements :[10, 30, 40, 70]
*/
