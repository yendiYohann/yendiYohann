package Revision_devoir;

public class Homme {
	protected String nom;
	protected String prenom;
	protected int Age;
	protected char achronyme;
	public Homme(String nom,String prenom,int Age) {
		this.nom = nom;
		this.prenom = prenom;
		this.Age= Age;
		this.achronyme = this.nom.charAt(0);
	}
	public char get_nom() {
		return this.achronyme;
	}
	public void se_deplacer() {
		System.out.println("Je me deplace");
	}
	
	

}
