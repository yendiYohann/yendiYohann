package Parti_homme;

public class Homme {
	
	protected String nom;
	protected String prenom;
	protected int Age ;
	protected String fili�re="Pas encore d�fini";
	/* Ici on a creer le constructeur de la classe*/
	public Homme(String nom,String prenom, int Age) {
		this.prenom = prenom;
		this.nom = nom;
		this.Age = Age;
	}
	public Homme(String nom,String prenom, int Age,String filiere) {
		this.prenom = prenom;
		this.nom = nom;
		this.Age = Age;
		this.fili�re = filiere;
	}
	
	
	public String NomPrenomAge() {
		return "Je me nomme "+this.nom+" "+this.prenom+" et j'ai "+this.Age+" ans";
	}
	
	public String setnewNom(String newnom) {
		return this.nom = newnom;
	}
	public void setFiliere(String newfil) {
		this.fili�re=newfil;}
	
	public String presenteToi() {
		return "Je me nomme "+this.nom+" "+this.prenom+" et j'ai "+this.Age+" ans et je suis en "+this.fili�re;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
