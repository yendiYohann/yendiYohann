package PK6;
import java.util.*;
public class chap4exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un entier : ");
		boolean testeur = true;
		while(testeur=true) {
		try {
			a= clavier.nextInt();
			testeur=false;
			break;
		}
		catch(Exception e){
			System.out.println("Entrer un entier : ");
			
		}
	}

}
}
