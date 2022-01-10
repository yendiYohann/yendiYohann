package PK3;

public class points {
	private char nom;
	private double abscisse;
	
	public void point (char nom,double abscisse) {
		this.nom = nom;
		this.abscisse = abscisse;
	}
	
	public void Affichage() {
		System.out.println("Nom : "+nom+" abscissse : "+abscisse);
	}
	 public double translate(double newabscisse) {
		 return this.abscisse = abscisse+newabscisse;
	 }	
	 public static void main(String[] args) {
		 points nou = new points();
		 nou.point('a',14);
		 nou.Affichage();
		 nou.translate(6);
		 nou.Affichage();
	 }
}
