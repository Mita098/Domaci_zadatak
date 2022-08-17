package d16_08_2022;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezina;
	
	
	public void stampa() {
		System.out.println(this.naziv + ", " + this.cena + " rsd, " + this.tezina + "g");
	}
	public double konvertuj (String weight) {
		if (weight.equals("kg")) {
			return this.tezina / 1000;
		}else {
			return this.tezina / 1000000;
		}
}
}