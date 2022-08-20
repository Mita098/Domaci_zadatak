package d19_08_2022;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		FacebookPost stari = new FacebookPost();
		stari.setPostavljac("Petar Peric");
		stari.setPrimaoc("Nikola Nikolic");
		stari.setText("Hello!!");
		stari.like();
		stari.like();
		stari.share();
		stari.dislike();
		stari.print();
		
		FacebookPost novi = new FacebookPost("Milos Milosevic", "Zoki Pesic" , "Hajmo na pive!");
		novi.like();
		novi.like();
		novi.like();
		novi.share();
		novi.dislike();
		novi.print();
	}

}
