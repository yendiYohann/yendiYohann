package Parti_homme;

public class Personne {
	private String nom;
	private String prenom;
	private int Age;
	
	public Personne(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom,String prenom,int Age) {
		this.nom = nom;
		this.prenom = prenom;
		this.Age = Age;
	}
	public String presente_toi() {
		return "Je m'appelle  "+this.nom+"  "+this.prenom+" et j'ai "+this.Age+" ans";
	}
	
	public void nouvelAge(int Age) {
		this.Age = Age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne premier = new Personne("AHARH","Yohann",19);
		System.out.println(premier.presente_toi());
		premier.nouvelAge(8);
		System.out.println(premier.presente_toi());
	}

}
