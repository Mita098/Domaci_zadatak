package d25_02_2022;

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
