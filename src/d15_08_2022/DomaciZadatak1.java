package d15_08_2022;

public class DomaciZadatak1 {

	public static void main(String[] args) {
//		Napisati metodu stampajVrednostZa10Vecu u 
//		kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
		int a = 12;
		stampajVrednostZa10Vecu(a);
		a = 32;
		stampajVrednostZa10Vecu(a);
		a = -9;
		stampajVrednostZa10Vecu(a);
		
		
	}
	public static void stampajVrednostZa10Vecu(int a) {
		a = a + 10;
		System.out.println("Vrednost a uvecana za 10 je: " + a);
	}
}
