package d_06_09_2022;

public class Tetrapak extends Ambalaza{
	private boolean reciklaza;
	private int osnovnaCena;

	public Tetrapak(String barkod, String naziv, int neto, int bruto, boolean reciklaza, int osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public int getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.reciklaza == true) {
			return this.tezinaPak() * 1.5 + this.osnovnaCena;
		}else {
			return this.osnovnaCena;
		}
	}
	@Override
	public void stampa() {
		System.out.println("ime " + this.naziv);
		System.out.println("cena " +this.cenaArtikla());
		System.out.println("neto " +this.neto);
		System.out.println("bruto " +this.bruto);
		if (this.reciklaza == true) {
			System.out.println("Moze se reciklirati");
		}else {
			System.out.println("ne moze se reciklirati");
		}


	}
}
