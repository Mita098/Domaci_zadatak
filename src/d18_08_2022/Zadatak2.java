package d18_08_2022;
//Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.


public class Zadatak2 {

	public static void main(String[] args) {
		FacebookPost one =new FacebookPost();
		FacebookPost two =new FacebookPost();
		
		one.nazivPostavljaca = "Planeta Sport";
		one.nazivPrimaoca = "Dimitrije Stojanovic";
		one.text = "Postovani u nasim radnjama imate sezonski pospust za jesenju garderobu!!!";
		one.brLajkova = 2;
		one.brDeljenja = 0;
		
		two.nazivPostavljaca = "Anonymous";
		two.nazivPrimaoca = "Mark Zuckerberg";
		two.text = "If you dont pay us 20m $ we will hack all your companies";
		two.brLajkova = 193000;
		two.brDeljenja = 5200;
		
		one.like();
		one.like();
		one.dislike();
		one.share();
		one.print();
		
		two.like();
		two.like();
		two.dislike();
		two.share();
		two.print();
	}

}
