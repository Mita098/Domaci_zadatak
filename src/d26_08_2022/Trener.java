package d26_08_2022;

public class Trener extends Osoba{
	private int godIskustva;
	private String tip;
	public Trener(String punoIme, String jmbg, int godinaRodj,int godIskustva, String tip) {
		super(punoIme , jmbg, godinaRodj);
		this.godIskustva = godIskustva;
		this.tip = tip;
	}
	
	public Trener() {
		super();
	}

	public int getGodIskustva() {
		return godIskustva;
	}
	public void setGodIskustva(int godIskustva) {
		this.godIskustva = godIskustva;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Godine iskustva: " + this.godIskustva);
		System.out.println("Tip trenera: " + this.tip);
		System.out.println();
		
	}

}
