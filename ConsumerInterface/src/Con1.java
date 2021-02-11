import java.util.function.Consumer;
public class Con1 {

	public static void main(String[] args) {
		
		Consumer<String>printData=name->System.out.println(name);
		
		printData.accept("MsDhoni");
		printData.accept("sachin");
	}

}
/*
MsDhoni
sachin

*/