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


public class Trener extends Osoba{
	private int godIskustva;
	private String tip;
	public Trener(String punoIme, String jmbg, int godinaRodj,int godIskustva, String tip) {
		super(punoIme , jmbg, godinaRodj);
		this.godIskustva = godIskustva;
		this.tip = tip;
	}
	
	public Trener() {
		super();
	}

	public int getGodIskustva() {
		return godIskustva;
	}
	public void setGodIskustva(int godIskustva) {
		this.godIskustva = godIskustva;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Godine iskustva: " + this.godIskustva);
		System.out.println("Tip trenera: " + this.tip);
		System.out.println();
		
	}

}
