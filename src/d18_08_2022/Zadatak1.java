package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//		Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//		a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//		Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
		
		Proizvod jedan = new Proizvod();
		jedan.naziv = "Vox usisivac";
		jedan.cena = 4499.99;
		jedan.tezina = 3600;
		
		Proizvod dva = new Proizvod();
		dva.naziv = "Verbatim fleshdrive";
		dva.cena = 999.99;
		dva.tezina = 120;
		
		jedan.stampaj();
		dva.stampaj();
		
		double povecanje = 300.0;
		jedan.povecajCenu(povecanje);
		
		povecanje = 200;
		dva.povecajCenu(povecanje);
		
		jedan.stampaj();
		dva.stampaj();
		
		int popust = 10;
		System.out.println("Cena " + jedan.naziv + "a ako je popust " + popust +"% iznosi " + jedan.vratiCenuSaPopustom(popust) + "rsd");
	
		popust = 20;
		System.out.println("Cena " + dva.naziv + "a ako je popust " + popust +"% iznosi " + dva.vratiCenuSaPopustom(popust) + "rsd");

		System.out.println("Postarina za " + jedan.naziv + " iznosi " + jedan.racunajPostarinu() + "rsd");
		System.out.println("Postarina za " + dva.naziv + " iznosi " + dva.racunajPostarinu() + "rsd");

	}

}
