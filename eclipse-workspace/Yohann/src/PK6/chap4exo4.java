package PK6;
import java.util.*;
public class chap4exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nombre;
		double a;
		int conteur= 0;
		nombre =  10*Math.random();
		System.out.println("Vous avez reussit le nombre était : "+nombre);
		Scanner clavier = new Scanner(System.in);
		do {
			System.out.println("Entrer un entier : ");
			a= clavier.nextDouble();
			conteur++;
			if(a==nombre) {
				continue;
			}else if(a!=nombre && a<nombre){
				System.out.println("Mauvaise réponse la valeure a trouver est plus grande");
			}
			else if(a!=nombre && a>nombre){
				System.out.println("Mauvaise réponse la valeure a trouver est plus petite");
			}
		}while(a!=nombre);
		
		System.out.println("Vous avez reussit le nombre était : "+nombre);
		System.out.println("Vous avez éffectué : "+conteur+" tentatives");

	}

}
//Reponse  : Il faut avoir beaucoup de chance
