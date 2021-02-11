import java.util.function.Predicate;

import java.util.ArrayList;

class Cricketer{
	String name;
	String designation;
	double salary;
	String teamName;
	
	Cricketer(String name, String designation,double salary,String teamName){
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.teamName=teamName;
		
	}
	
	@Override
	public String toString() {
		String result=String.format("(%s,%s,%.2f,%s)", name,designation,salary,teamName);
		return result;
	}
}
public class Predicate4 {

	public static void main(String[] args) {
		
		ArrayList<Cricketer>cricketeres=new ArrayList<Cricketer>();
		addRecords(cricketeres);
		System.out.println("the Infornamtion of players is:");
		System.out.println(cricketeres);
		
		System.out.println("-----------------------------------");
		
		Predicate<Cricketer>captainInfo=tempCricketer->tempCricketer.designation.equalsIgnoreCase("captain");
		System.out.println("Information of captains from drifferent teams");
		displayInfo(captainInfo,cricketeres);
		
		Predicate<Cricketer>batsmanInfo=tempCricketer->tempCricketer.designation.equalsIgnoreCase("batsman");
		System.out.println("Information of batsman from drifferent teams");
		displayInfo(captainInfo,cricketeres);
		
		Predicate<Cricketer>rcbInfo=tempCricketer->tempCricketer.teamName.equalsIgnoreCase("rcb");
		System.out.println("Information of players from Rcb team");
		displayInfo(rcbInfo,cricketeres);
		
		System.out.println("Information of the players who are not captains of the team");
		displayInfo(captainInfo.negate(),cricketeres);
		
		System.out.println("Batsman information of Rcb team");
		displayInfo(batsmanInfo.and(rcbInfo),cricketeres);
		
		System.out.println("batsman or captain information is");
		Predicate<Cricketer>bowlerInfo=tempCricketer->tempCricketer.designation.equalsIgnoreCase("captain");
		//System.out.println("Information of captains from drifferent teams");
		displayInfo(captainInfo.or(bowlerInfo),cricketeres);
		
	}
	
	public static void addRecords(ArrayList<Cricketer>cricketeres) {
		cricketeres.add(new Cricketer("rohit","captain",50000,"MI"));
		cricketeres.add(new Cricketer("dhoni","captain",50000,"CSK"));
		cricketeres.add(new Cricketer("kohli","captain",50000,"Rcb"));
		cricketeres.add(new Cricketer("raina","batsman",45000,"csk"));
		cricketeres.add(new Cricketer("abd","batsman",45000,"rcb"));
		cricketeres.add(new Cricketer("warner","batsman",45000,"srh"));
		cricketeres.add(new Cricketer("Bumrah","bowler",35000,"MI"));
		cricketeres.add(new Cricketer("steyn","bowler",35000,"rcb"));
		cricketeres.add(new Cricketer("shami","bowler",35000,"punjob"));
		cricketeres.add(new Cricketer("Malinga","bowler",35000,"MI"));
		
	}
	
	public static void displayInfo(Predicate<Cricketer>predicate,ArrayList<Cricketer>cricketeres) {
		
		for(Cricketer cricketer:cricketeres) {
			if(predicate.test(cricketer)) {
				System.out.println(cricketer);
			}
		}
		System.out.println("------------------------------------");
	}
	

}

/* Output
 the Infornamtion of players is:
[(rohit,captain,50000.00,MI), (dhoni,captain,50000.00,CSK), (kohli,captain,50000.00,Rcb), (raina,batsman,45000.00,csk), (abd,batsman,45000.00,rcb), (warner,batsman,45000.00,srh), (Bumrah,bowler,35000.00,MI), (steyn,bowler,35000.00,rcb), (shami,bowler,35000.00,punjob), (Malinga,bowler,35000.00,MI)]
-----------------------------------
Information of captains from drifferent teams
(rohit,captain,50000.00,MI)
(dhoni,captain,50000.00,CSK)
(kohli,captain,50000.00,Rcb)
------------------------------------
Information of batsman from drifferent teams
(rohit,captain,50000.00,MI)
(dhoni,captain,50000.00,CSK)
(kohli,captain,50000.00,Rcb)
------------------------------------
Information of players from Rcb team
(kohli,captain,50000.00,Rcb)
(abd,batsman,45000.00,rcb)
(steyn,bowler,35000.00,rcb)
------------------------------------
Information of the players who are not captains of the team
(raina,batsman,45000.00,csk)
(abd,batsman,45000.00,rcb)
(warner,batsman,45000.00,srh)
(Bumrah,bowler,35000.00,MI)
(steyn,bowler,35000.00,rcb)
(shami,bowler,35000.00,punjob)
(Malinga,bowler,35000.00,MI)
------------------------------------
Batsman information of Rcb team
(abd,batsman,45000.00,rcb)
------------------------------------
batsman or captain information is
(rohit,captain,50000.00,MI)
(dhoni,captain,50000.00,CSK)
(kohli,captain,50000.00,Rcb)
------------------------------------

 */










