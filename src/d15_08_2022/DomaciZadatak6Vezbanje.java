package d15_08_2022;

import java.util.Scanner;

public class DomaciZadatak6Vezbanje {

	public static void main(String[] args) {
//	 Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//	Primer izvrsenja: 
//	izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//	izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//	Napomena: Resiti bez koriscenja petlji. 
		Scanner s = new Scanner (System.in);
		System.out.print("unesite  M: ");
		int m = s.nextInt();
		System.out.print("Unesite n: ");
		int n = s.nextInt();
		int rez = pronalazenjeOdDo(m,n);
		System.out.println("Izbroji(" + m + ", " + n + ") ima rezultat " + rez);

	}
	public static int pronalazenjeOdDo(int m,int n) {
		if (m > n) {
			return  m - n - 1;
		}else {
			return  n - m - 1;

		}
	}
}
