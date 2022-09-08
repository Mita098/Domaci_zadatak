package d06_09_2022_Zadatak2;

public class Planina {
	private String naziv;
	private String nazivDrzave;
	private int visina;
	public Planina(String naziv, String nazivDrzave, int visina) {
		super();
		this.naziv = naziv;
		this.nazivDrzave = nazivDrzave;
		this.visina = visina;
	}
	public Planina() {
		super();
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getNazivDrzave() {
		return nazivDrzave;
	}
	public void setNazivDrzave(String nazivDrzave) {
		this.nazivDrzave = nazivDrzave;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	

}
