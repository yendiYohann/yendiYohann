package PK6;
import java.util.*;
public class chap4exo3 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		double[] liste = new double[600];
		double a;
		int i =0;
		int conteur = 0;
		float somme = 0;
		float moyenne;
		do {
			System.out.println("Entrer un nombre : ");
			a= clavier.nextDouble();
			liste[i] = a;
			i++;
			conteur+=1;
		}while(a!=0);
		for(int j=0;j<conteur;j++) {
			somme+=liste[j];
		}
		Arrays.sort(liste);
		double maxliste = liste[liste.length-1];
		System.out.println("La plus grande valeure entrée est : "+maxliste);
		double minliste = Arrays.stream(liste).min().getAsDouble();
		System.out.println("La plus valeure valeure entrée est : "+minliste);
		moyenne = somme/conteur;
		System.out.println("La moyenne est : "+moyenne);
	}
}
