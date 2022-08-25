package d23_08_2022;

public class DomaciZadatak2 {

	public static void main(String[] args) {
		Racun x = new Racun("323-231321-23", "Petar Peric", 13000);
		Racun b = new Racun("322-2332323-64", "Milan Peric", 9000);
		Transakcija c = new Transakcija(32132, x, b);
		double transakcija = 5000;
		c.izvrsiTransakciju(transakcija);
		c.stampaTransakcije();
		x.print();
		b.print();
		transakcija = 10000;
		c.izvrsiTransakciju(transakcija);
		transakcija = 3000;
		c.izvrsiTransakciju(transakcija);
		x.print();
		b.print();
	}

}
