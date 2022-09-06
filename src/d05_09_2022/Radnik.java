package d05_09_2022;
//Zadatak  
//Kreirati klasu Sektor koja ima:
//naziv sektora
//platu koja je za taj sektor
//
//Kreirati abstraktnu klasu Radnik koja ima:
//ime i prezime
//niz sektora u kojima radi
//abstraktnu metodu koja vraca platu radnika
//metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//suma plata svih sektor / broj sektora * 0.5
//override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog


import java.util.ArrayList;

public abstract class Radnik {
	protected String punoIme;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();
	public Radnik(String punoIme) {
		super();
		this.punoIme = punoIme;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public ArrayList<Sektor> getSektori() {
		return sektori;
	}
	public void setSektori(ArrayList<Sektor> sektori) {
		this.sektori = sektori;
	}
	public abstract double plata();
	public void zaposliUSektor(Sektor sektor) {
		this.sektori.add(sektor);
	}
}
