package d25_02_2022;
//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)



public class Ispit {
	private String naziv;
	private int ocena;
	private String punoImeProf;
	public Ispit(String naziv, int ocena, String punoImeProf) {
		this.naziv = naziv;
		this.ocena = ocena;
		this.punoImeProf = punoImeProf;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getPunoImeProf() {
		return punoImeProf;
	}
	public void setPunoImeProf(String punoImeProf) {
		this.punoImeProf = punoImeProf;
	}
	public boolean prosoPao() {
		if (this.ocena > 5 && this.ocena <= 10) {
			return true;
		}else {
			return false;
		}
		
	}
	public void print() {
		System.out.println(this.naziv + " - " + this.punoImeProf + " - " + this.ocena);
	}

}
