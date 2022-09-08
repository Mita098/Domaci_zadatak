package d05_09_2022;
//Zadatak  
//Kreirati klasu Sektor koja ima:
//naziv sektora
//platu koja je za taj sektor
//
//Kreirati abstraktnu klasu Radnik koja ima:
//ime i prezime
//niz sektora u kojima radi
//abstraktnu metodu koja vraca platu radnika
//metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//suma plata svih sektor / broj sektora * 0.5
//override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog


public class DomaciZad1 {

	public static void main(String[] args) {
		Magacioner a = new Magacioner("Pera Peric");
		Menadzer b = new Menadzer("Marko Markovic");

		Sektor logistika = new Sektor("Logistika", 30000);
		Sektor magacin = new Sektor("Magacin", 30000);
		Sektor dorade = new Sektor("Rework area", 30000);
		Sektor pakovanje = new Sektor("Pakovanje", 30000);
		
		b.zaposliUSektor(magacin);
		b.zaposliUSektor(pakovanje);
		b.zaposliUSektor(dorade);
		b.zaposliUSektor(logistika);
		
		a.zaposliUSektor(magacin);
		a.zaposliUSektor(pakovanje);
		
		System.out.println("menadzerova plata je " + b.plata());
		System.out.println("magacionerova plata je " + a.plata());
	}

}
