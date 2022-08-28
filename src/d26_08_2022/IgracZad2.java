package d26_08_2022;
//2. Zadatak
//Kreirati klasu Karton koja ima:
//tip kartona (crveni, zuti)
//konstuktore za koje mislite da ce vam trebati
//gettere i settere za karton
//	
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
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//U glavnom programu kreirati igraca i dodati mu nekoliko kartona.


import java.util.ArrayList;

public class IgracZad2 extends OsobaZad2{
	private int broj;
	private String pozicija;
	private ArrayList<Karton> Kartoni = new ArrayList<Karton>();
	private boolean kapiten;
	public IgracZad2() {
		super();
	}
	public IgracZad2(int broj, String pozicija, boolean kapiten,String punoIme, String jmbg, int godRodj) {
		super(punoIme ,jmbg, godRodj);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
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
	public void dodajKarton(Karton karton) {
		this.Kartoni.add(karton);
	}
	public int brZutih() {
		int brojac = 0;
		for (int i = 0; i < this.Kartoni.size(); i++) {
			if (this.Kartoni.get(i).getTip().equals("Zuti")) {
				brojac++;
			}
		}
		return brojac;
	}
	public int brCrvenih() {
		int brojac = 0;
		for (int i = 0; i < this.Kartoni.size(); i++) {
			if (this.Kartoni.get(i).getTip().equals("Crveni")) {
				brojac++;
			}
		}
		return brojac;
	}
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj igraca " + this.broj);
		System.out.println("Pozicija " + this.pozicija);
		if (this.kapiten) {
			System.out.println("Kapiten");
		}
		System.out.println("Broj zutih kartona " + this.brZutih());
		System.out.println("Broj crvenih kartona " + this.brCrvenih());
		
	}
	
}
