package d16_08_2022;

public class SmartAirConditioning {
	public String marka;
	public double temp;
	public String mode;
	
	
	public void stampa() {
		System.out.println("Klima marke " + this.marka + " u modu " + this.mode + " ima temperaturu od " + this.temp + " stepeni.");
	}
	public boolean poredjenje(int hladovina) {
		if (hladovina > this.temp) {
			return true;
		}else {
			return false;
		}
	}


}