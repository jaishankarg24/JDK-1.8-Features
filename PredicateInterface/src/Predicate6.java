import java.util.function.Predicate;

import java.util.ArrayList;

class Cricketer1{
	String name;
	String designation;
	double salary;
	String teamName;
	
	Cricketer1(String name,String designation, double salary, String teamName){
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.teamName=teamName;
	}
	
	@Override
	public String toString() {
		
		String result=String.format("(%s,%s,%.2f,%s)", name,designation,salary,teamName);
		return result+"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		Cricketer1 cobj=(Cricketer1)obj;
		
		if(cobj.name.equals("dhoni")==name.equals("dhoni") &&
				cobj.designation.equals("captain")==designation.equals("captain") &&	
				cobj.salary==salary &&
				cobj.teamName.equals("csk")==teamName.equals("csk")) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Predicate6 {

	public static void main(String[] args) {
		ArrayList<Cricketer1>cricketeres=new ArrayList<Cricketer1>();
		addRecords(cricketeres);
		System.out.println("the information of players is");
		System.out.println(cricketeres);
		System.out.println("-----------------------------------------");
		
		Predicate<Cricketer1>checkCaptain=Predicate.isEqual(
				new Cricketer("dhoni","captain",50000,"csk"));
		
		Cricketer1 c1=new Cricketer1("dhoni","captain",50000,"csk");
		Cricketer1 c2=new Cricketer1("watson","alrounder",35000,"csk");
		
		System.out.println(checkCaptain.test(c1));
		System.out.println(checkCaptain.test(c2));
	}
	
	public static void addRecords(ArrayList<Cricketer1>cricketeres) {
		cricketeres.add(new Cricketer1("rohit","captain",50000,"MI"));
		cricketeres.add(new Cricketer1("dhoni","captain",50000,"csk"));
		cricketeres.add(new Cricketer1("kohli","captain",50000,"Rcb"));
		cricketeres.add(new Cricketer1("raina","batsman",45000,"csk"));
		cricketeres.add(new Cricketer1("abd","batsman",45000,"rcb"));
		cricketeres.add(new Cricketer1("warner","batsman",45000,"srh"));
		cricketeres.add(new Cricketer1("Bumrah","bowler",35000,"MI"));
		cricketeres.add(new Cricketer1("steyn","bowler",35000,"rcb"));
		cricketeres.add(new Cricketer1("shami","bowler",35000,"punjob"));
		cricketeres.add(new Cricketer1("Malinga","bowler",35000,"MI"));

	}
}


/* Output
 
the information of players is
[(rohit,captain,50000.00,MI)
, (dhoni,captain,50000.00,csk)
, (kohli,captain,50000.00,Rcb)
, (raina,batsman,45000.00,csk)
, (abd,batsman,45000.00,rcb)
, (warner,batsman,45000.00,srh)
, (Bumrah,bowler,35000.00,MI)
, (steyn,bowler,35000.00,rcb)
, (shami,bowler,35000.00,punjob)
, (Malinga,bowler,35000.00,MI)
]
-----------------------------------------
false
false
*/