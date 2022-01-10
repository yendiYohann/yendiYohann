package PK6;

import java.util.Scanner;

public class Projetchap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		String valeur;
		do {
		System.out.println("1. Creer un compte");
		System.out.println("2. Afficher un compte");
		System.out.println("3.Creer une ligne comptable");
		System.out.println("4. Sortir");
		System.out.println("5. De l'aide");
		char type_compte ='\0';
		
		System.out.println("Votre choix : ");
		double numCompte = 0 ,valeure = 0,taux = 0,numCompte2;
		valeur = clavier.nextLine();
		switch(valeur) {
		case "1":
				System.out.println("Type de compte [Types possibles : (C)courant, (J)joint, (E)épargne] : \nNumero du compte \nPremière valeur creditee :  \nTaux de placement :  ");
				type_compte = clavier.next().charAt(0);
				System.out.println("Numero du compte : ");
				numCompte = clavier.nextDouble();
				System.out.println("Première valeure créditée : ");
				valeure = clavier.nextDouble();
				if(type_compte == 'E' || type_compte == 'e' ) {
					System.out.println("Taux placement :  ");
					taux = clavier.nextDouble();
				}
				;break;
		case "2":
				System.out.print("Entrer le numéro de compte a consulter : ");
				numCompte2 = clavier.nextDouble();
				if(numCompte2 == numCompte) {
					System.out.println("Entrer le numero de compte a consulter");
					if(type_compte == 'C') {
						System.out.println("Courant");}
						else if(type_compte == 'J') {
							System.out.println("Join");
						}
						else if (type_compte == 'E') {
							System.out.println("Le taux est de :"+taux);
						}
					}
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
	
	}while(valeur!="4");

}
}
