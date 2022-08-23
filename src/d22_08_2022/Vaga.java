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


public class Vaga {
	private String mernaJedinica;
	private Proizvod proizvod;
	public Vaga() {
	}
	public String getMernaJedinica() {
		return mernaJedinica;
	}
	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}
	public Proizvod getProizvod() {
		return proizvod;
	}
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	public double sracunajCenu (Double tezina) {
		if (this.mernaJedinica.equals("kg")) {
			return this.proizvod.getCenaKg() * tezina;
		}else if(this.mernaJedinica.equals("lb")){
			return this.proizvod.getCenaLb() * tezina;
	}
		else return 0;
	}
	public void stampajRacun(double tezina) {
		this.proizvod.stampa();
		if(this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg()+ " f/" + this.mernaJedinica + " x " + tezina);
		}else {
			System.out.println(this.proizvod.getCenaLb() + " f/" + this.mernaJedinica + " x " + tezina);

		}
		System.out.println("Ukupno: " + this.sracunajCenu(tezina) + " f");
		
	}
}
