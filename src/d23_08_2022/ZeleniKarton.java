package d23_08_2022;
//Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta 
//broj indeksa 
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita


public class ZeleniKarton {
	private String punoIme;
	private int brIndeksa;
	private String nazivPredmeta;
	private int ocena;
	private String punoImeProf;
	public ZeleniKarton(String punoIme, int brIndeksa, String nazivPredmeta,String profesor, int ocena) {
		this.punoIme = punoIme;
		this.brIndeksa = brIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.punoImeProf = profesor;
	}
	
	public String getPunoImeProf() {
		return punoImeProf;
	}

	public void setPunoImeProf(String punoImeProf) {
		this.punoImeProf = punoImeProf;
	}

	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public int getBrIndeksa() {
		return brIndeksa;
	}
	public void setBrIndeksa(int brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public boolean prosaoIliPao () {
		if(this.ocena > 5) {
			return true;
		}else {
			return false;
		}
	}
	public void stampa() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.punoIme + ", " + this.brIndeksa);
		System.out.println("Profesor: " + this.punoImeProf);
	}

	
}
