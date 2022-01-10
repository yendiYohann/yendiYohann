package PK1;

public class Etudiant extends Homme{
	static String filière;
	static int année;
	
	public String setfilière(String newfil) {
		return this.filière = newfil;
	}
	public int setannée(int newnom) {
		return this.année = newnom;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant nouveau = new Etudiant();
		nouveau.setnom("AHARH");
		nouveau.setprenom("Yohann");
		nouveau.setfilière("GL");
		nouveau.setannée(2021);
		getinformations(nouveau.nom,nouveau.prenom,nouveau.filière,nouveau.année);
	}
	
	public static void  getinformations(String nom,String prenom, String filière,int année) {
		System.out.println("Nom : "+nom+" Prenom : "+prenom+" filière : "+filière+" année : "+année);
	}
	
}
