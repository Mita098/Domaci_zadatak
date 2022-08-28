package d26_08_2022;
//.Zadatak
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere 
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.


public class Igrac extends Osoba{
	private int broj;
	private String pozicija;
	private boolean kapiten;
	
	public Igrac(String punoIme, String jmbg, int godinaRodj,int broj, String pozicija, boolean kapiten) {
		super(punoIme , jmbg, godinaRodj);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public Igrac() {
		super();
	}

	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj: " + this.broj);
		System.out.println("Pozicija: " + this.pozicija);
		if(this.kapiten) {
		System.out.println("Kapiten");
		System.out.println();
		}
	}
}
