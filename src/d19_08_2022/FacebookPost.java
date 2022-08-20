package d19_08_2022;

public class FacebookPost {
	private String postavljac;
	private String primaoc;
	private String text;
	private int lajkovi;
	private int deljenja;
	
	public FacebookPost(){
		
	}
	public FacebookPost(String postavljac , String primaoc , String text){
		this.postavljac = postavljac;
		this.primaoc = primaoc;
		this.text = text;
	}
	public void like() {
		this.lajkovi++;
	}
	public void dislike() {
		this.lajkovi--;
		if (this.lajkovi < 0) {
			this.lajkovi = 0;
		}
	}
	public void share() {
		this.deljenja++;
	}
	public void print() {
		System.out.println(this.postavljac + ">>>" + this.primaoc);
		System.out.println(this.text);
		System.out.println("Likes " + this.lajkovi + " | Shares " + this.deljenja);
	}
	public void setPostavljac(String postavljac) {
		this.postavljac = postavljac;
	}
	public void setPrimaoc(String primaoc) {
		this.primaoc = primaoc;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPostavljac() {
		return this.postavljac;
	}
	public String getPrimaoc() {
		return this.primaoc;
	}
	public String getText() {
		return this.text;
	}
}
