package d22_08_2022;
//(Za vezbanje) Kreirati klasu Proizvod koja ima:
//sifru proizvoda
//naziv proizvoda
//cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//gettere i settere za sifru i naziv
//setter za cenu po kilogramu
//metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//metodu getCenaLb koja vraca cenu za 1lb prozvoda
// 		konverzija: 1 kg = 2.2046 lb
//metodu koja stampa proizvod u formatu:
//(sifra) - (naziv)
//
//	Kreirati klasu Vaga koja ima:
//merna jedinica (kg ili lb)
//proizvod (proizvod koji se meri)
//TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//default-ni konstuktor
//getteri i setteri za sve atribute
//metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//               (sifra) - (naziv)
//   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//   Ukupno: (ukupna cena) 


public class DomaciVezbanje1 {

	public static void main(String[] args) {
		Proizvod A = new Proizvod(3232, "Secer", 1);
		Vaga a1 = new Vaga();
		a1.setProizvod(A);
		a1.setMernaJedinica("kg");
		double tezina = 1.5;
		a1.stampajRacun(tezina);
		
		Proizvod B = new Proizvod(2313, "Brasno", 1);
		Vaga b1 = new Vaga();
		b1.setProizvod(B);
		b1.setMernaJedinica("lb");
		tezina = 1 ;
		b1.stampajRacun(tezina);
	}

}
