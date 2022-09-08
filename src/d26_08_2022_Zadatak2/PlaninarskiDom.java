package d26_08_2022_Zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
	private String naziv;
	private int godOsnivanja;
	private ArrayList<Planinar> planinari = new ArrayList<Planinar>();

	public PlaninarskiDom(String naziv, int godOsnivanja) {
		super();
		this.naziv = naziv;
		this.godOsnivanja = godOsnivanja;
	}

	public PlaninarskiDom() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public void setGodOsnivanja(int godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}

	public ArrayList<Planinar> getPlaninari() {
		return planinari;
	}

	public void dodajPlaninara(Planinar planinar) {
		this.planinari.add(planinar);
	}

	public int planinariSeUspesnoPenjuBR(Planina planina) {
		int brojac = 0;
		for (int i = 0; i < this.planinari.size(); i++) {
			if (this.planinari.get(i).uspesanUspon(planina)) {
				brojac++;
			}
		}
		return brojac;
	}

	public void izbaciPlaninara(int idbroj) {
		for (int i = 0; i < this.planinari.size(); i++) {
			if (this.planinari.get(i).getJedinstveniBR() == idbroj) {
				this.planinari.remove(i);
			}
		}
	}
	public void stampajDom() {
		System.out.println("Naziv doma " + this.naziv);
		System.out.println("Godina nastanka doma " + this.godOsnivanja);
		System.out.println("Clanovi:");
		for (int i = 0; i < this.planinari.size(); i++) {
			System.out.println("Planinar br:" + (i + 1));
			this.planinari.get(i).stampaj();
			System.out.println();
		}
	}
	public double ukupnaClanarina() {
		double suma = 0 ;
		for (int i = 0; i < this.planinari.size(); i++) {
			suma = suma + this.planinari.get(i).clanarina();
		}
		return suma;
	}
}
