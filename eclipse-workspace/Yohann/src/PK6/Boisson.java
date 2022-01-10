package PK6;
/*Chapitre 5 exo 1*/
import java.util.*;
public class Boisson {
	static int nombre = 0;
	static int methode;
	static Scanner clavier = new Scanner(System.in);
	public int Ajouter_sucre(int newnombre,Scanner clavier) {
		return this.nombre = nombre+ newnombre;
	}
	public void test_Boisson(int methode) {
		if (methode<4) {
			System.out.println("Le sucre n'est pas assez sucré");
		}
		else {
			System.out.println("La boisson est sucré vous avez mis a l'interieure "+nombre+"sucres");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Clavier = new Scanner(System.in);
		System.out.println("Entrer le nombre de sucre a ajouter : ");
		int newnombre = Clavier.nextInt();
		Boisson malta = new Boisson();
		malta.Ajouter_sucre(newnombre,Clavier);
		malta.test_Boisson(nombre);
		malta.Ajouter_sucre(newnombre,Clavier);
		malta.test_Boisson(nombre);
	}

}
