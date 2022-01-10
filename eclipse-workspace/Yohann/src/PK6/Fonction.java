package PK6;

import java.util.Arrays;

public class Fonction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] liste = new int[30];
		for(int i=-5,j=0; i<6;i++,j++) {
			System.out.print(f(i)+" ");
			liste[j] = f(i);
			
		}
		Arrays.sort(liste);
		int maxliste = liste[liste.length-1];
		System.out.println("La plus grande valeure entrée est : "+maxliste);
		int a,compteur;
		for(compteur = 0; compteur <= 5; compteur++) {
			a = calculer(compteur);
			System.out.println(a+"a");
		}
		
		
	}//Fin de main
	public static int calculer(int x) {
		int y;
		y = x*x;
		return y;
	}//Fin de calculer
	
	public static int f(int x) {
		int resultat;
		resultat = -x*-x+3*x-2;
		return resultat;
	}

} //Fin de class


