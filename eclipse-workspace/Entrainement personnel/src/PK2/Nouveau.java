package PK2;
import java.util.Scanner;
public class Nouveau {
/*	static void aff_str(String mot) {
		System.out.println(mot);
	}
	static void aff_int(String mot) {
		System.out.println(mot);
	}
	static void aff_float(String mot) {
		System.out.println(mot);
	}
	static void aff_boolean(String mot) {
		System.out.println(mot);
	}
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Votre nombre : ");
		float nbre = clavier.nextFloat();
		
		String maison = "0";

		if (nbre >=0 && nbre<=5) {
			
			maison = "1";
		}
		else if (nbre >5 && nbre<=7){
			
			maison = "2";
		}
		else if (nbre>7 && nbre<=10){
			
			maison = "3";
		}
		else if(nbre>10 && nbre<=12){
			
			maison = "4";
		}
		else if(nbre>12 && nbre<=14){
			
			maison = "5";
		}
		else if (nbre>14 && nbre<=16){
			
			maison = "6";
		}
		else if (nbre>16 && nbre<=19){
			Affichage("Tres bien");
			maison = "7";
		}

		else if (nbre>19 && nbre<=20){
			Affichage("Excellent");
			maison = "8";
	
		}

		switch (maison) {
			case "1":
				Affichage("Mauvais");
				break;
			case "2":
				Affichage("Mediocre");
				break;
			case "3":
				Affichage("Inssufisant");
				break;
			case "4":
				Affichage("Passable");
				break;
			case "5":
				Affichage("Assez bien");
				break;
			case "6":
				Affichage("bien");
				break;
			case "7":
				Affichage("Tres bien");
				break;
			case "8":
				Affichage("Excellent");
				break;
			default:
				Affichage("Non pris en charge");
				break;
		}

	} */

	public static void main(String[] args){
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisissez un nombre entre 0 et 10 : ");
		float nbre = clavier.nextFloat();
			while(nbre <0 || nbre>10){
				System.out.println("Entrer un nombre compris entre 0 et 10 : ");
				System.out.println("Saisissez un nombre entre 0 et 10 : ");
				nbre = clavier.nextFloat();

			
		}
		
		}
			
	}
