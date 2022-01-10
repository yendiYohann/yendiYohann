package PK1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		// Afficher du texte;
		System.out.println("Hello World");
		
		//Créer une variable de type string;
		//Sans new;
		String ville = "kara";
		//Avec new;
		String pays = new String("Togo");
		System.out.println(ville);
		System.out.println(pays.length());
		//Demander une saise;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Votre age : ");
		int age = clavier.nextInt();
		Scanner name = new Scanner(System.in);
		System.out.println("Votre nom : ");
		String nom = name.nextLine();
		System.out.println("Vous avez "+ age + " ans et votre nom est : "+ nom);
		
		
		Scanner Nombre1 = new Scanner(System.in);
		System.out.println("Entrer le premier nombre : ");
		float nombre1 = clavier.nextInt();
		Scanner Nombre2 = new Scanner(System.in);
		System.out.println("Entrer le second nombre : ");
		float nombre2 = clavier.nextInt();
		float somme = ((nombre1+nombre2)/2);
		System.out.println("La moyenne est : "+somme);	


		System.out.println("Salut tout le monde");
		String noms = "Yohann";
		System.out.println(noms);
		
		
		Scanner Saisie = new Scanner(System.in);
		System.out.println("Entre ce que tu veux saisir : ");
		String Saisies = Saisie.nextLine();
		System.out.println(Saisies);
		
		//Methode uppercase
		String txt = "hello world";
		System.out.print(txt.toUpperCase());
		
		//La methode equals
		String Nom1 = "Yohann";
		String Nom2 = "Yohann";
		System.out.println(Nom1.equals(Nom2));
				
		
	}

}
