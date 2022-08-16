package d15_08_2022;

import java.util.Scanner;

public class DomaciZadatak2 {

	public static void main(String[] args) {
//		Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
//		Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan string tako sto spoji ime i prezime.
//		METODA NISTA NE STAMPA.
//		Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”
		Scanner s = new Scanner (System.in);
		System.out.print("Unesite vase ime: ");
		String ime = s.next();
		System.out.print("Unesite vase prezime: ");
		String prezime = s.next();
		String spoj = spajanje(ime,prezime);
		System.out.println("vase puno ime i prezime je: " + spoj);
	}
	public static String spajanje(String ime,String prezime) {
		return ime + " " + prezime; 
	}
}
