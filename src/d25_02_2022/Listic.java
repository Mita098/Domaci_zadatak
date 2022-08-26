package d25_02_2022;
//Zadatak (Za vezbanje)
//Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. Znaci nije vam potrebna provera za opseg brojeva.
//
//Za potrebe Lotto igre na srecu potrebno je 
//Kreirati klasu Kombinacija koja ima:
//id kombinacije (String)
//niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//Zaglavlje metode je:
//public boolean daLiJeIstaKombinacija( Kombinacija k)
//metoda vraca true ako su svi elementi na istim pozicija isti
//npr: this [0] == k [0], this [1] == k [1] …. 
//metodu za stampu koja stampa podatke u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//
//	Kreirati klasu Listic koja ima: 
//niz kombinacija - maksimalno 7 kombinacija
//metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija. Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//Zaglavlje metode 
//public boolean dobitna(Kombinacija dobitnaKombinacija)
//metodu koja stampa listic u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//…… i tako za sve kombinacije


import java.util.ArrayList;

public class Listic {
	private ArrayList<Kombinacija>kombinacija = new ArrayList <Kombinacija>();
	public void dodajKombinaciju(Kombinacija kombinacija) {
		if(this.kombinacija.size() < 7) {
		this.kombinacija.add(kombinacija);
		}else {
			System.out.println("Nemate mesto na listicu za vise kombinacija");
		}
	}
	public boolean dobitna(Kombinacija dobitnaKombinacija) {
		for (int i = 0; i < this.kombinacija.size(); i++) {
			if(this.kombinacija.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)) {
				return true;
			}
		}
		return false;
	}
	public void stampa() {
		for (int i = 0; i < this.kombinacija.size(); i++) {
			this.kombinacija.get(i).stampa();
			System.out.println();
			System.out.println();
		}
	}
 

}
