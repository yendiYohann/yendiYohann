package Revision_devoir;

public class Etudiants extends Homme {
	public Etudiants(String nom,String prenom,int Age) {
		super(nom,prenom,Age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiants premier = new Etudiants("AHARH","Yohann",19);
		System.out.println(premier.get_nom());
		premier.se_deplacer();
	}

}
