package PK6;
import java.util.*;
public class Exo7Chap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int b = 1;
		int a;
		int conteur = 0;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un entier");
		a = clavier.nextInt();
		for(i=2;i<=a;i++) {
			b = b*i;
			conteur++;
		}
		System.out.println(b);
		System.out.println(i);
		System.out.println(conteur);
	}

}
