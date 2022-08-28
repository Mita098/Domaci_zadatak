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


public class Osoba {
	private String punoIme;
	private String jmbg;
	private int godinaRodj;
	public Osoba() {
	}
	public Osoba(String punoIme, String jmbg, int godinaRodj) {
		this.punoIme = punoIme;
		this.jmbg = jmbg;
		this.godinaRodj = godinaRodj;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public int getGodinaRodj() {
		return godinaRodj;
	}
	public void setGodinaRodj(int godinaRodj) {
		this.godinaRodj = godinaRodj;
	}
	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.jmbg + ", " + this.godinaRodj);
	}

}
