package d26_08_2022_Zadatak2;

public class Alpinista extends Planinar{

	private int brPoena;

	public Alpinista(int jedinstveniBR, String punoIme, int brPoena) {
		super(jedinstveniBR, punoIme);
		this.brPoena = brPoena;
	}

	public int getBrPoena() {
		return brPoena;
	}

	public void setBrPoena(int brPoena) {
		this.brPoena = brPoena;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id:" + this.jedinstveniBR);
		System.out.println("Ime: " + this.punoIme);
		System.out.println("Broj poena: " + this.brPoena);		
	}

	@Override
	public double clanarina() {
		int clanarina = 1500;
		clanarina = clanarina - (this.brPoena * 50);
		return clanarina;
		
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisina() < 4000) {
			return true;
		}else {
			return false;
		}
	}
	

}
