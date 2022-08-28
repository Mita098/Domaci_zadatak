package d26_08_2022;

public class Osoba {
	private String punoIme;
	private String jmbg;
	private int godinaRodj;
	public Osoba() {
	}
	public Osoba(String punoIme, String jmbg, int godinaRodj) {
		this.punoIme = punoIme;
		this.jmbg = jmbg;
		this.godinaRodj = godinaRodj;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public int getGodinaRodj() {
		return godinaRodj;
	}
	public void setGodinaRodj(int godinaRodj) {
		this.godinaRodj = godinaRodj;
	}
	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.jmbg + ", " + this.godinaRodj);
	}

}
