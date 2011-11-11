import java.util.ArrayList;
import java.util.List;


public class Abonent {
	
	private String nazwa;
	private List<Dane>  info = new ArrayList<Dane>();
	
	public Abonent(String nazwa, String village){
		this.setNazwa(nazwa);

	}
		
	public Abonent(String nazwa, List<Dane> info) {
		super();
		this.setNazwa(nazwa);
		this.info = info;
	}
	
	public void printInfo(){
		for(Dane d: info){
			d.printInfo();	
			}
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNazwa() {
		return nazwa;
	}
	
	public void addInfo(String numerTel, String adresMail){
		
		info.add(new Dane(numerTel,adresMail));
	}	
	public void szukaj(String numer){
		for(Dane d: info){
			if(d.getNumerTel()== numer) System.out.println("Znalazlem! Abonent nazywa siê: " + getNazwa() );
		}
		
	}
	
	public void edytuj(String doZmiany, String NowaWartosc){
		for(Dane d: info){
			if(d.getNumerTel()== doZmiany) {
										d.setNumerTel(NowaWartosc);
										System.out.println("Dane zmieniono");
			}
			
			if(d.getadresMail()== doZmiany) {
										d.setadresMail(NowaWartosc);
										System.out.println("Dane zmieniono");
			}
		}
	}
	

	public void usun(String doUsuniencia) {
		for(Dane d: info) {
			if(d.getNumerTel()== doUsuniencia) {
										d.setNumerTel("");
										System.out.println("Usunieto");
			}

			if(d.getadresMail()== doUsuniencia) {
										d.setadresMail("");
										System.out.println("Usuniento");
			}	
		}
}	
}


