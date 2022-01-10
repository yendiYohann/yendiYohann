package PK3;
import java.util.*;
public class Point {
	private char nom;
	private double abscisse;
	private Scanner clavier = new Scanner(System.in);
	public  char setnom(char newnom) {
		Scanner clavier = new Scanner(System.in);
		return this.nom=newnom;
	}
	public void getnom() {
		System.out.println(nom);
	}
	public  double setabscisse(double newabscisse) {
		return this.abscisse=newabscisse;
	}
	public void getabscisse() {
		System.out.println(abscisse);
	}
	public double translation(double newabs) {
		return this.abscisse = abscisse +newabs;
	}
	public static void Affiche(char nom,double abscisse) {
		System.out.println("Nom : "+nom+"\n Abscisse : "+abscisse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point goup = new Point();
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer le nom : ");
		char a = clavier.next().charAt(0);
		goup.setnom(a);
		System.out.println("Entrer l'abscisse");
		double b = clavier.nextDouble();
		
		goup.setabscisse(b);
		goup.setnom(a);
		Affiche(goup.nom,goup.abscisse);
		goup.translation(4);
		Affiche(goup.nom,goup.abscisse);
	}

}
