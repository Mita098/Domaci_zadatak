package d_06_09_2022;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		Korpa x = new Korpa();
		SuperKartica x1= new SuperKartica("2132-2323-2132-3233", "Pera Peric" , 0);
		Tetrapak x2 = new Tetrapak("3231342-2323", "Cokoladno mleko", 200, 230, true, 59);
		Tetrapak x3 = new Tetrapak("3231342-5231", "Milkshake mleko", 200, 230, false, 63);
		StaklenaAmbalaza x4 = new StaklenaAmbalaza("543535-5355", "Merak", 500, 550, 30, true, 68) ;
		StaklenaAmbalaza x5 = new StaklenaAmbalaza("543535-3233", "Somerzbi", 500, 550, 0, false, 119) ;
		x.dodajAmbalazu(x2);
		x.dodajAmbalazu(x3);
		x.dodajAmbalazu(x4);
		x.dodajAmbalazu(x5);
		
		x.izbaciAmbalazu("3231342-5231");
		for (int i = 0; i < x.getAmbalaze().size(); i++) {
			x.getAmbalaze().get(i).stampa();
		}
		System.out.println("Ukupna cena korpe je: " + x.ukupnaCenaKorpe(x1));
		
	}

}
