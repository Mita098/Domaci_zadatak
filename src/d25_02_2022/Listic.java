package d25_02_2022;

import java.util.ArrayList;

public class Listic {
	private ArrayList<Kombinacija>kombinacija = new ArrayList <Kombinacija>();
	public void dodajKombinaciju(Kombinacija kombinacija) {
		if(this.kombinacija.size() < 7) {
		this.kombinacija.add(kombinacija);
		}else {
			System.out.println("Nemate mesto na listicu za vise kombinacija");
		}
	}
	public boolean dobitna(Kombinacija dobitnaKombinacija) {
		for (int i = 0; i < this.kombinacija.size(); i++) {
			if(this.kombinacija.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)) {
				return true;
			}
		}
		return false;
	}
	public void stampa() {
		for (int i = 0; i < this.kombinacija.size(); i++) {
			this.kombinacija.get(i).stampa();
			System.out.println();
			System.out.println();
		}
	}
 

}
