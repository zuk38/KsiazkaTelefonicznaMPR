
public class Dane {

	private String numerTel;
	private String adresMail;
	
	public Dane(String numerTel, String adresMail){
		this.numerTel=numerTel;
		this.adresMail=adresMail;
	}
	
	public void printInfo() {

		System.out.println("Numer tlefonu: " + numerTel + " Adres e-mail: " + adresMail);
	}
	
	public String getNumerTel(){
		return this.numerTel;
	}
	
	public void setNumerTel(String NumerTel){
		this.numerTel=NumerTel;
	}
	
	public String getadresMail(){
		return this.adresMail;
	}
	
	public void setadresMail(String adresMail){
		this.adresMail=adresMail;
	}
	

}
