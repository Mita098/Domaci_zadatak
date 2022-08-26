package d25_02_2022;
//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)


public class DomaciZadatak1 {

	public static void main(String[] args) {
		Student A = new Student (12323, "Lazar Stojanovic", "doktorske");
		
		Ispit c1 = new Ispit("Elektronika", 10, "Zoran Zoranovic");
		Ispit c2 = new Ispit("Programiranje", 7, "Goran Zoranovic");
		Ispit c3 = new Ispit("FIzika", 5, "Marina Zoranovic");
		Ispit c4 = new Ispit("Matematika 1", 9, "Goran Zoranovic");
		Ispit c5 = new Ispit("Matematika 2", 8, "Dragan Zoranovic");
		
		A.dodajIspit(c1);
		A.dodajIspit(c2);
		A.dodajIspit(c3);
		A.dodajIspit(c4);
		A.dodajIspit(c5);
		
		A.stampa();
	}

}
