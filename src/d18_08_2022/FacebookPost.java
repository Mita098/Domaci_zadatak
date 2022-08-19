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


public class FacebookPost {
	public String nazivPostavljaca;
	public String nazivPrimaoca;
	public String text;
	public int brLajkova;
	public int brDeljenja;
	
	public void like() {
		this.brLajkova++;
	}
	public void dislike() {
		this.brLajkova--;
		if (this.brLajkova < 0 ) {
			this.brLajkova = 0;
		}
	}
	public void share() {
		this.brDeljenja++;
	}
	public void print() {
		System.out.println(this.nazivPostavljaca +" >>> " + this.nazivPrimaoca);
		System.out.println(this.text);
		System.out.println("Likes " + this.brLajkova +" | Shares " + this.brDeljenja) ;
	}
}
