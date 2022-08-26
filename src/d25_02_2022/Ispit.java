package d25_02_2022;

public class Ispit {
	private String naziv;
	private int ocena;
	private String punoImeProf;
	public Ispit(String naziv, int ocena, String punoImeProf) {
		this.naziv = naziv;
		this.ocena = ocena;
		this.punoImeProf = punoImeProf;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getPunoImeProf() {
		return punoImeProf;
	}
	public void setPunoImeProf(String punoImeProf) {
		this.punoImeProf = punoImeProf;
	}
	public boolean prosoPao() {
		if (this.ocena > 5 && this.ocena <= 10) {
			return true;
		}else {
			return false;
		}
		
	}
	public void print() {
		System.out.println(this.naziv + " - " + this.punoImeProf + " - " + this.ocena);
	}

}
