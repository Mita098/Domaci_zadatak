package d16_08_2022;

import java.util.Scanner;

public class DomaciZadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone.
//		Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo,
//		a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
		Scanner s = new Scanner (System.in);
		Proizvod krem = new Proizvod();
		krem.naziv = "Euro krem";
		krem.cena = 349.99;
		krem.tezina = 1000;
		krem.stampa();
		Proizvod dzem = new Proizvod();
		dzem.naziv = "Marmelada";
		dzem.cena = 1299.99;
		dzem.tezina = 12000;
		dzem.stampa();
		System.out.print("Unesite tezinu u kg / t za proizvod krem ");
		String weight = s.next();
		System.out.println("tezina krema u odabranom parametru je " + krem.konvertuj(weight) + weight);
		System.out.print("Unesite tezinu u kg / t za proizvod dzem ");
		weight = s.next();
		System.out.println("tezina dzema u odabranom parametru je " + dzem.konvertuj(weight) + weight);


	}

}
