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

public class DomaciZadatak2 {
	public static void main(String[] args) {
		Kombinacija a = new Kombinacija("2332f", 1, 2, 3, 4, 5, 6, 7);
		Kombinacija b = new Kombinacija("2332f", 10, 11, 13, 14, 15, 16, 17);
		Kombinacija c = new Kombinacija("2332f", 11, 22, 33, 32, 31, 2, 8);
		Kombinacija d = new Kombinacija("2332f", 2, 6, 1, 8, 14, 22, 33);
		Kombinacija e = new Kombinacija("2332f", 3, 1, 5, 2, 9, 11, 15);
		Kombinacija g = new Kombinacija("2332f", 3, 1, 5, 2, 9, 11, 15);
		Kombinacija j = new Kombinacija("2332f", 3, 1, 5, 2, 9, 11, 15);
		Kombinacija k = new Kombinacija("2332f", 3, 1, 5, 2, 9, 11, 15);

		Kombinacija dobitna = new Kombinacija("dsfada", 1 , 2, 3, 4, 5,6,7);
		Listic z = new Listic();
		z.dodajKombinaciju(a);
		z.dodajKombinaciju(b);
		z.dodajKombinaciju(c);
		z.dodajKombinaciju(d);
		z.dodajKombinaciju(e);
		z.dodajKombinaciju(g);
		z.dodajKombinaciju(j);
		z.dodajKombinaciju(k);

		z.stampa();
		System.out.println(z.dobitna(dobitna));
	
	}
}
