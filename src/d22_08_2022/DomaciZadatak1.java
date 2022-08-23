package d22_08_2022;
//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora) 
//
//	U glavnom programu napraviti vise autora sa vise knjiga.




public class DomaciZadatak1 {

	public static void main(String[] args) {
		Autor A = new Autor("Petar", "Peric");
		Knjiga A1 = new Knjiga(4217481, "Lord of the rings", 1999, A);
		Knjiga A2 = new Knjiga(5341421, "Boj na Kosovo", 2023, A);
		A1.stampa();
		A2.stampa();
		
		Autor b = new Autor("Zoran", "Misic");
		Knjiga b1 = new Knjiga(76546, "Maratonci trce pocasni krug", 2002, b);
		Knjiga b2 = new Knjiga(2312312, "Game of thrones", 2023, b);
		b1.stampa();
		b2.stampa();
	}

}
