package PK6;
import java.util.*;
public class Projet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Creer un compte");
		System.out.println("2. Afficher un compte");
		System.out.println("3.Creer une ligne comptable");
		System.out.println("4. Sortir");
		System.out.println("5. De l'aide");
		Scanner clavier = new Scanner(System.in);
		System.out.println("Votre choix : ");
		String valeur = clavier.nextLine();
		switch(valeur) {
		case "1":
				System.out.println("Type de compte [Types possibles : courant, joint, épargne] : \nNumero du compte \nPremière valeur creditee :  \nTaux de placement :  ")
				;break;
		case "2":
				System.out.print("Entrer le numéro de compte a consulter : ");
				String numero = clavier.nextLine();
						break;
		case "3":
				System.out.print("Option non programmer");
				break;
		case "4":
				System.out.println("Bye!!!!");
				System.exit(0);
				break;
				
		case "5":
				System.out.println("Demande d’aide financière. Madame, Monsieur, Je me permets de vous adresser la présente afin de vous demander \nun soutien financier qui m’aidera à faire face à mes difficultés financières actuelles. \nEn effet, (expliquer votre situation : familiale, dette, emploi, santé, …)");
				
		} 
		int a = 2;
		
		
		
	}

}
