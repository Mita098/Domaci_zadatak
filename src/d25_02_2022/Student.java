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


import java.util.ArrayList;

public class Student {
	private int brIndeksa;
	private String punoIme;
	private String tip;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	public Student(int brIndeksa, String punoIme, String tip) {
		this.brIndeksa = brIndeksa;
		this.punoIme = punoIme;
		this.tip = tip;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	public void setIspiti(ArrayList<Ispit> ispiti) {
		this.ispiti = ispiti;
	}
	public int getBrIndeksa() {
		return brIndeksa;
	}
	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}
	public double prosek() {
		double suma = 0;
		int brojac = 0;
		for (int i = 0; i < this.ispiti.size(); i++) {
			if(this.ispiti.get(i).prosoPao()) {
				suma = suma + this.ispiti.get(i).getOcena();
				brojac ++;
			}
		}
		return suma / brojac;
	}
	public void stampa() {
		System.out.println(this.brIndeksa + " - " + this.punoIme + " - " + this.tip);
		System.out.println("Predmeti: ");
		for (int i = 0; i < this.ispiti.size(); i++) {
			this.ispiti.get(i).print();
		}
		System.out.println("Prosecna ocena: " + this.prosek());
	} 

}
