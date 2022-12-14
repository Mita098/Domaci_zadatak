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

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		ArrayList <Igrac>igraci = new ArrayList<Igrac>();
		ArrayList <Trener>treneri = new ArrayList<Trener>();

		Igrac a = new Igrac("Petar Peric","21312313",1997,23,"Napadac",true);
		Igrac b = new Igrac("Goran Peric","87868787",1990,19,"odbrana",false);

		Trener c = new Trener("Nikola Savic", "02300232", 1960, 32, "kondicioner");
		Trener g = new Trener("Ivan Savic", "3848348", 1970, 19, "pomocni");

		a.stampaj();
		b.stampaj();
		c.stampaj();
		g.stampaj();
		System.out.println("Unesite broj igraca:");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			Igrac x = new Igrac();
			
			System.out.print("unesite ime i prezime ");
			String punoIme = s.next();
			punoIme += s.nextLine();
			x.setPunoIme(punoIme);
			System.out.print("unesite jmbg ");
			x.setJmbg(s.next());
			System.out.print("unesite godinu rodjenja ");
			x.setGodinaRodj(s.nextInt());
			System.out.print("unesite broj ");
			x.setBroj(s.nextInt());
			System.out.print("unesite poziciju ");
			x.setPozicija(s.next());
			System.out.print("kapiten ili ne ");
			x.setKapiten(s.nextBoolean());
			igraci.add(x);
			
		}
		for (int i = 0; i < igraci.size(); i++) {
			igraci.get(i).stampaj();
		}
		
		System.out.println("Unesite broj trenera:");
		int z = s.nextInt();
		for (int i = 0; i < z; i++) {
			Trener x = new Trener();
			System.out.print("unesite ime i prezime ");
			String punoIme = s.next();
			punoIme += s.nextLine();
			x.setPunoIme(punoIme);
			System.out.print("unesite jmbg ");
			x.setJmbg(s.next());
			System.out.print("unesite godinu rodjenja ");
			x.setGodinaRodj(s.nextInt());
			System.out.print("Unesite godine iskustva ");
			x.setGodIskustva(s.nextInt());
			System.out.print("unesite tip trenera ");
			x.setTip(s.next());
			treneri.add(x);
			
		}
		for (int i = 0; i < treneri.size(); i++) {
			treneri.get(i).stampaj();
		}
	}

}
