package PK1;

public class Etudiant extends Homme{
	static String fili�re;
	static int ann�e;
	
	public String setfili�re(String newfil) {
		return this.fili�re = newfil;
	}
	public int setann�e(int newnom) {
		return this.ann�e = newnom;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant nouveau = new Etudiant();
		nouveau.setnom("AHARH");
		nouveau.setprenom("Yohann");
		nouveau.setfili�re("GL");
		nouveau.setann�e(2021);
		getinformations(nouveau.nom,nouveau.prenom,nouveau.fili�re,nouveau.ann�e);
	}
	
	public static void  getinformations(String nom,String prenom, String fili�re,int ann�e) {
		System.out.println("Nom : "+nom+" Prenom : "+prenom+" fili�re : "+fili�re+" ann�e : "+ann�e);
	}
	
}
