package PK6;
import java.util.*;
public class Exo5Chap6 {
	static int saisie;
	Scanner clavier;
	static int nombre1;
	static int nombre2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);	
		setnombre();
		verifier(saisie,clavier,nombre1,nombre2);
		
	}
	
	public static int setnombre() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un premier nombre : ");
		nombre1 = clavier.nextInt();
		do{System.out.println("Entrer un second nombre : ");
		nombre2 = clavier.nextInt();}while(nombre1>nombre2);
		System.out.println("Entrer une valeure comprise les 2 nombres entrées précedemment : ");
		saisie = clavier.nextInt();	
		return saisie ;
		
		
		
	}
	
	public static void verifier(int saisie,Scanner clavier,int nombre1,int nombre2) {
		do {
			if(saisie>nombre1 && saisie<nombre2) {
				break;
			}
			else {
				System.out.println("Entrer une valeure comprise entre 0 et 100 : ");
				saisie = clavier.nextInt();
			}

		}while(saisie<0 || saisie>100);

	}
	
}
