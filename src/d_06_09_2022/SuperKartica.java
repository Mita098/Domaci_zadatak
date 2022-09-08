package d_06_09_2022;

public class SuperKartica {
	private String broj;
	private String punoIme;
	private int popust;
	public SuperKartica(String broj, String punoIme, int popust) {
		super();
		this.broj = broj;
		this.punoIme = punoIme;
		this.popust = popust;
	}
	public SuperKartica() {
		super();
	}
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public int getPopust() {
		return popust;
	}
	public void setPopust(int popust) {
		this.popust = popust;
	}
	private void stampaj() {
		System.out.println(this.broj + ", " + this.punoIme);
	}
}
