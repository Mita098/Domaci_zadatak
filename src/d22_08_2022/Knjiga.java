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
//




public class Knjiga {
	private int iSBN;
	private String naziv;
	private int godinaIzdavanja;
	private Autor autor;
	public Knjiga(int iSBN, String naziv, int godinaIzdavanja, Autor autor) {
		this.iSBN = iSBN;
		this.naziv = naziv;
		this.godinaIzdavanja = godinaIzdavanja;
		this.autor = autor;
	}
	public int getiSBN() {
		return iSBN;
	}
	public void setiSBN(int iSBN) {
		this.iSBN = iSBN;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getGodinaIzdavanja() {
		return godinaIzdavanja;
	}
	public void setGodinaIzdavanja(int godinaIzdavanja) {
		this.godinaIzdavanja = godinaIzdavanja;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public void stampa() {
		System.out.println(this.iSBN);
		System.out.println(this.naziv + " - " + this.godinaIzdavanja);
		System.out.print("Autor: ");
		this.autor.printAutora();
		
		
	}
}
