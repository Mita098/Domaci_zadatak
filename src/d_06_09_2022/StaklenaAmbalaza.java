package d_06_09_2022;

public class StaklenaAmbalaza extends Ambalaza{
	private int kaucija;
	private boolean zahtevaKauciju;
	private int osnovnaCena;
	public StaklenaAmbalaza(String barkod, String naziv, int neto, int bruto, int kaucija, boolean zahtevaKauciju,
			int osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.kaucija = kaucija;
		this.zahtevaKauciju = zahtevaKauciju;
		this.osnovnaCena = osnovnaCena;
	}
	public int getKaucija() {
		return kaucija;
	}
	public void setKaucija(int kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isZahtevaKauciju() {
		return zahtevaKauciju;
	}
	public void setZahtevaKauciju(boolean zahtevaKauciju) {
		this.zahtevaKauciju = zahtevaKauciju;
	}
	public int getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla() {
		if (this.zahtevaKauciju == true) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		}else {
			return this.osnovnaCena * 1.2;
		}
	}
	@Override
	public void stampa() {
		System.out.println("ime " +this.naziv);
		System.out.println("cena " +this.cenaArtikla());
		System.out.println("neto " +this.neto);
		System.out.println("bruto " +this.bruto);
		if (this.zahtevaKauciju == true) {
			System.out.println("Cena kaucije: " + this.kaucija);
		}
	}
	
}
