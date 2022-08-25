package d23_08_2022;

public class Transakcija {
	private int id;
	private Racun salje;
	private Racun prima;
	public Transakcija(int id, Racun salje, Racun prima) {
		this.id = id;
		this.salje = salje;
		this.prima = prima;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Racun getSalje() {
		return salje;
	}
	public void setSalje(Racun salje) {
		this.salje = salje;
	}
	public Racun getPrima() {
		return prima;
	}
	public void setPrima(Racun prima) {
		this.prima = prima;
	}
	private double provizija (double transakcija) {
		if (transakcija < 4500) {
			return 45;
		}else {
			return transakcija * 0.01;
		}
	}
	public void izvrsiTransakciju (double transakcija) {
		if(this.salje.getStanje() > transakcija + this.provizija(transakcija)) {
		this.salje.menjaStanje(transakcija + this.provizija(transakcija)) ;
		this.prima.menjaStanje(-transakcija);
		}else {
			System.out.println("Nemate dovoljo sredstava za transakciju");
		}
	}
	public void stampaTransakcije() {
		System.out.println(this.id);
		System.out.println("Racun sa: " + this.salje.getPunoIme() + " - " + this.salje.getBrRacuna());
		System.out.println("Racun na: " + this.prima.getPunoIme() + " - " + this.prima.getBrRacuna());

	}
	
}
