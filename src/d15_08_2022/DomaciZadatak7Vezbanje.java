package d15_08_2022;

import java.util.Scanner;

public class DomaciZadatak7Vezbanje {

	public static void main(String[] args) {
//		(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//		U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
		Scanner s = new Scanner (System.in);
		System.out.print("Unesite A: ");
		int a = s.nextInt();
		System.out.print("Unesite B: ");
		int b = s.nextInt();
		System.out.print("Unesite C: ");
		int c = s.nextInt();
		int rez = najmanjiOdTri(a , b , c);
		System.out.println("Najmanji od tri uneta broja je: " + rez);
	}
	public static int najmanjiOdTri(int a , int b , int c) {
		if(a < b && a < c) {
			return a;
		}else if (b < a && b < c) { 
		return b;
		} else {
			return c;
		}
		}
	}

