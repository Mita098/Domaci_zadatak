package d23_08_2022;
//Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta 
//broj indeksa 
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
//

import java.util.ArrayList;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		ArrayList <ZeleniKarton> prva = new ArrayList<ZeleniKarton>();
		ZeleniKarton  x = new ZeleniKarton("Petar Peric", 3213, "Fizika", "Milan Milanovic", 6); 
		ZeleniKarton  c = new ZeleniKarton("Petar Peric", 3213, "Matematika", "Uros Milanovic", 7); 
		ZeleniKarton  v = new ZeleniKarton("Petar Peric", 3213, "Matematika 2", "Nikola Milanovic", 6); 
		ZeleniKarton  b = new ZeleniKarton("Petar Peric", 3213, "Elektronika", "Zdravko Milanovic", 5); 
		ZeleniKarton  n = new ZeleniKarton("Petar Peric", 3213, "OOP", "Petar Milanovic", 5); 
		ZeleniKarton  m = new ZeleniKarton("Petar Peric", 3213, "Elektrotehnika", "Igor Milanovic", 9); 
		ZeleniKarton  a = new ZeleniKarton("Petar Peric", 3213, "Informatika", "Dragan Milanovic", 7); 
		ZeleniKarton  s = new ZeleniKarton("Petar Peric", 3213, "Web programiranje", "Jovan Milanovic", 5); 
		ZeleniKarton  d = new ZeleniKarton("Petar Peric", 3213, "Web dizajn", "Marija Milanovic", 5); 
		ZeleniKarton  f = new ZeleniKarton("Petar Peric", 3213, "FIzika2", "Milica Milanovic", 6); 
		prva.add(x);
		prva.add(c);
		prva.add(v);
		prva.add(b);
		prva.add(n);
		prva.add(m);
		prva.add(a);
		prva.add(s);
		prva.add(d);
		prva.add(f);
		for(int i = 0; i < prva.size();i++) {
			prva.get(i).stampa();
		}
		double sumaPros = 0;
		double sumaPoloz = 0;
		int brojac = 0;
		for (int i = 0; i < prva.size();i++) {
			sumaPros = sumaPros + prva.get(i).getOcena();
			if(prva.get(i).prosaoIliPao()) {
				sumaPoloz = sumaPoloz + prva.get(i).getOcena();
				brojac++;
			}
		}
		sumaPros = sumaPros / prva.size();
		sumaPoloz = sumaPoloz / brojac;
		System.out.println("Prosecna ocena svih ispita je: " + sumaPros);
		System.out.println("Prosecna ocena polozenih ispita je: " + sumaPoloz);
	}

}
