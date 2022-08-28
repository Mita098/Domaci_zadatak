package d26_08_2022;

public class Igrac extends Osoba{
	private int broj;
	private String pozicija;
	private boolean kapiten;
	
	public Igrac(String punoIme, String jmbg, int godinaRodj,int broj, String pozicija, boolean kapiten) {
		super(punoIme , jmbg, godinaRodj);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public Igrac() {
		super();
	}

	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj: " + this.broj);
		System.out.println("Pozicija: " + this.pozicija);
		if(this.kapiten) {
		System.out.println("Kapiten");
		System.out.println();
		}
	}
}
