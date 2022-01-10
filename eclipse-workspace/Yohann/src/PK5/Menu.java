package PK5;
import java.util.*;
public class Menu {
	static double sommes;
	
	static double somme(double x , double y) {
		return sommes=x+y;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
				System.out.println("Entrez une donnée : ");
				double nom = clavier.nextDouble();
				Rectangle box = new Rectangle();
				box.Longueur(nom);
				box.Largeur(14.6);
				System.out.println(box.get_Largeur());
				System.out.println(box.get());
				System.out.println(box.jeu());
				System.out.println(somme(4,6));
				
	
				Lome lieu = new Lome();
				lieu.Ville("Lomé", 500000, "Faure");
				}
	}


