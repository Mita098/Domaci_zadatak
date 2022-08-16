package d15_08_2022;

import java.util.Scanner;

public class DomaciZadatak4 {

	public static void main(String[] args) {
//		Zadatak
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//		JMBG: [jmbg]
//		Ime: [ime]
//		Prezime: [prezime]
//		God. rodjenja: [god]
//		Aktivan: [true/false]
//		Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite vas JMBG: ");
		String jmbg = s.next();
		System.out.print("Unesite vase ime: ");
		String ime = s.next();
		System.out.print("Unesite vase prezime: ");
		String prezime = s.next();
		System.out.print("Unesite vasu god. rodjenja: ");
		int god = s.nextInt();
		System.out.print("Unesite status aktivnosti (true / false): ");
		boolean aktivan = s.nextBoolean();
		System.out.println();
		format ( jmbg,  ime, prezime, god, aktivan);

	}
	public static void format (String jmbg, String ime,String prezime,int god,boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + god);
		System.out.println("Aktivan: " + aktivan);

	}

}
