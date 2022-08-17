package d16_08_2022;

import java.util.Scanner;

public class DomaciZadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za izabranu temperaturu 
//		atribut za mod (hladi/greje) - string
//		metodu za stampu (proizvoljno)
//		metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//
//
//		U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
		Scanner s = new Scanner(System.in);
		SmartAirConditioning a = new SmartAirConditioning();
		a.marka = "vox";
		a.temp = 22;
		a.mode = "hladi";
		
		SmartAirConditioning b = new SmartAirConditioning();
		b.marka = "vivax";
		b.temp = 26;
		b.mode = "greje";
		a.stampa();
		b.stampa();
		System.out.print("Unesite temperaturu u hladovini: ");
		int hladovina = s.nextInt();
		if (a.poredjenje(hladovina) == true) 
		{
			System.out.println("Spoljasnja temperatura je veca.");
		}else {
			System.out.println("Spoljasnja temperatura je manja.");
		}
		System.out.print("Unesite temperaturu u hladovini: ");
		hladovina = s.nextInt();
		if (b.poredjenje(hladovina) == true) 
		{
			System.out.println("Spoljasnja temperatura je veca.");
		}else {
			System.out.println("Spoljasnja temperatura je manja.");
		}
	
	}

}
