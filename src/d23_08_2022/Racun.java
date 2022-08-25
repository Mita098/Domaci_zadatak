package d23_08_2022;

public class Racun {
	private String brRacuna;
	private String punoIme;
	private double stanje;
	
	public Racun(String brRacuna, String punoIme, int stanje) {
		this.brRacuna = brRacuna;
		this.punoIme = punoIme;
		this.stanje = stanje;
	}
	public String getBrRacuna() {
		return brRacuna;
	}
	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public double getStanje() {
		return stanje;
	}
	public void menjaStanje( double vrednost) {
		if(this.stanje > vrednost) {
		this.stanje = this.stanje - vrednost;
		}
	}
	public void print() {
		System.out.println(this.punoIme + " - " + this.brRacuna);
		System.out.println("stanje na racunu je " + this.stanje + "rsd.");
	}
	
}
