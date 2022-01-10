package Parti_homme;

public class Etudiants extends Homme {
	
	
	
	public Etudiants(String nom, String prenom, int Age) {
		super(nom, prenom, Age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiants yohann = new Etudiants("KOFFIGO", "Emmanuel", 26);
		Etudiants Kossi = new Etudiants("AHARH", "Yohann",18);
		System.out.println(yohann.presenteToi());
	}
	public Etudiants(String nom , String prenom, int Age, String filiere) {
		super(nom,prenom,Age,filiere);
	}
	
}
