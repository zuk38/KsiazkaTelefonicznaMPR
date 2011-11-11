import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
	
		List<Dane> info = new ArrayList<Dane>();
		
		info.add(new Dane("500100100", "aaa@wp.pl"));
		
		Abonent a = new Abonent("Jan Kowalski", info);
		
		a.addInfo("600012234", "aa@a.pl");
		
		a.printInfo();
		
		a.szukaj("500100100");
		a.edytuj("aa@a.pl","bb@b.pl");
		a.printInfo();
		
		a.usun("600012234");
		a.printInfo();
		

	}

}
