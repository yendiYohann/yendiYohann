package PK6;
import java.util.*;
public class Chap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,r;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un entier : ");
		a= clavier.nextInt();
		System.out.println("Entrer un entier : ");
		b = clavier.nextInt();
		do {
			r = a%b;
			a=b;
			b=r;
		}while(r!=0);
		System.out.println("Le resultat est: "+a);
		
		
	}

}
