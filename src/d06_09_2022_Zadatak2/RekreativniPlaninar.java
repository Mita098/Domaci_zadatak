package d06_09_2022_Zadatak2;

public class RekreativniPlaninar extends Planinar{

	private int tezinaOpreme;
	private String okrug;
	private int maxUsponBezOpreme;
	private boolean daLiCeUspeti;
	private int clanarina;
	
	
	public RekreativniPlaninar(int jedinstveniBR, String punoIme, int tezinaOpreme, String okrug, int maxUsponBezOpreme) {
		super(jedinstveniBR, punoIme);
		this.tezinaOpreme = tezinaOpreme;
		this.okrug = okrug;
		this.maxUsponBezOpreme = maxUsponBezOpreme;
	}
	
	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getOkrug() {
		return okrug;
	}

	public int getMaxUsponBezOpreme() {
		return maxUsponBezOpreme;
	}

	public boolean isDaLiCeUspeti() {
		return daLiCeUspeti;
	}

	public int getClanarina() {
		return clanarina;
	}

	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id:" + this.jedinstveniBR);
		System.out.println("Ime: " + this.punoIme);
		System.out.println("Okrug: " + this.okrug);
	}
	@Override
	public double clanarina() {
		return this.clanarina = 1000;
	}
	@Override
	public boolean uspesanUspon(Planina planina) {
		if(this.maxUsponBezOpreme - (this.tezinaOpreme * 50) > planina.getVisina()) {
			return true;
		}else {
			return false;
		}
	}
	
}
