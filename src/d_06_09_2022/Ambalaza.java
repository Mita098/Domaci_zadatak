package d_06_09_2022;

public abstract class Ambalaza {
	protected String barkod;
	protected String naziv;
	protected int neto;
	protected int bruto;
	public Ambalaza(String barkod, String naziv, int neto, int bruto) {
		super();
		this.barkod = barkod;
		this.naziv = naziv;
		this.neto = neto;
		this.bruto = bruto;
	}
	
	public Ambalaza() {
		super();
	}

	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getNeto() {
		return neto;
	}
	public void setNeto(int neto) {
		this.neto = neto;
	}
	public int getBruto() {
		return bruto;
	}
	public void setBruto(int bruto) {
		this.bruto = bruto;
	}
	public int tezinaPak() {
		return this.bruto - this.neto;
	}
	public abstract double cenaArtikla();
	public abstract void stampa();
}
