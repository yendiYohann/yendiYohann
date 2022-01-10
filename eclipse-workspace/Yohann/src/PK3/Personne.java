package PK3;

public class Personne {
	private String nom;
	private String prenom;
	private int Age;
	
	public void nomprenom(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public void nomprenomage(String nom,String prenom,int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.Age = age;
	}
	
	public void presenteToi() {
		System.out.println("Je me nomme : "+nom);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne nou = new Personne();
		Personne vou = new Personne();
		nou.nomprenom("AHARH", "Yohann");
		nou.presenteToi();
		vou.nomprenom("KOSSI", "Jack");
		vou.presenteToi();
	}

}
