package Revision_devoir;

public class Truc extends Essai {
	
	public Truc(String nom,String prenom,int Age) {
		super(nom,prenom,Age);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truc name = new Truc("Yohann","AHARH",19);
		System.out.print(name.get_nom());
		
	}

}
