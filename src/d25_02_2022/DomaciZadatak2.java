package d25_02_2022;

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
