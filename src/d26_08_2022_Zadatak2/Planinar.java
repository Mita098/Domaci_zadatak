package d26_08_2022_Zadatak2;

public abstract class Planinar {
	protected int jedinstveniBR;
	protected String punoIme;
	public Planinar(int jedinstveniBR, String punoIme) {
		super();
		this.jedinstveniBR = jedinstveniBR;
		this.punoIme = punoIme;
		
	}
	public int getJedinstveniBR() {
		return jedinstveniBR;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public abstract void stampaj();
	public abstract double clanarina();
	public abstract boolean uspesanUspon(Planina planina);
	
}
