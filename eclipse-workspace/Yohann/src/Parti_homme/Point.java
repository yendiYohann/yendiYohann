package Parti_homme;
import java.util.*;

public class Point {
	private char nom;
	private double abscisse;
	
	public void Point(char nom,double abscisse) {
		this.nom = nom;
		this.abscisse = abscisse;
	}
	
	public void translate(double new_abscisse) {
		this.abscisse = new_abscisse;
	}
	
	public String Affiche() {
		return "Nom : "+this.nom+" abscisse : "+this.abscisse;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		Point point = new Point();
		
		System.out.println(point.Affiche());
		System.out.println("Entrez le nom : ");
		String name = clavier.nextLine();
		char valeure = name.charAt(0);
		System.out.println("Entrez l'abscisse : ");
		double abscise = clavier.nextDouble();
		point.Point(valeure,abscise);
		System.out.println(point.Affiche());
		
		point.translate(45);
		System.out.println(point.Affiche());
		
		
		
	}

}
