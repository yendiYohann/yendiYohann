package Revision_devoir;
import java.util.*;

public class Essai {
	protected String nom;
	protected String prenom;
	protected int Age;
	
	public Essai(String nom, String prenom, int Age) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.prenom = prenom;
		this.Age = Age;
	}
	
	public String get_nom() {
		return this.nom;
	}
	public void set_nom(String newnom) {
		this.nom = newnom;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.print("Vous voulez entrer combien de nombre ? : ");
		int iteration = clavier.nextInt();
		int [] nombres = new int[iteration];
		for(int i = 0;i<iteration;i++) {
			System.out.println("Entrer le nombre"+(i+1)+" : ");
			int number = clavier.nextInt();
			nombres[i]=number;
		}
		int testeur = 0 ;
		for(int j = 0; j<nombres.length;j++) {
			
			if(testeur<nombres[j]) {
				testeur = nombres[j];
			}
		}
		System.out.println(testeur);
		
		
	}

}
