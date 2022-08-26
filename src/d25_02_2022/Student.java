package d25_02_2022;

import java.util.ArrayList;

public class Student {
	private int brIndeksa;
	private String punoIme;
	private String tip;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	public Student(int brIndeksa, String punoIme, String tip) {
		this.brIndeksa = brIndeksa;
		this.punoIme = punoIme;
		this.tip = tip;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	public void setIspiti(ArrayList<Ispit> ispiti) {
		this.ispiti = ispiti;
	}
	public int getBrIndeksa() {
		return brIndeksa;
	}
	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}
	public double prosek() {
		double suma = 0;
		int brojac = 0;
		for (int i = 0; i < this.ispiti.size(); i++) {
			if(this.ispiti.get(i).prosoPao()) {
				suma = suma + this.ispiti.get(i).getOcena();
				brojac ++;
			}
		}
		return suma / brojac;
	}
	public void stampa() {
		System.out.println(this.brIndeksa + " - " + this.punoIme + " - " + this.tip);
		System.out.println("Predmeti: ");
		for (int i = 0; i < this.ispiti.size(); i++) {
			this.ispiti.get(i).print();
		}
		System.out.println("Prosecna ocena: " + this.prosek());
	} 

}
