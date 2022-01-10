package Parti_homme;

import java.util.*;
import java.util.Arrays;

public class Client extends Compte{
	protected String nom;
	protected String prenom;
	protected String address;
	protected int numero;
	protected double solde;
	protected Object Compte;
	static int nombre = 1;
	
	
	static ArrayList<Client> liste = new ArrayList<Client>();
	
	static void Affiche(String mot) {
		System.out.println(mot);
	}
	
	public Client(String nom,String prenom,String Address) {
		this.nom = nom;
		this.prenom = prenom;
		this.address = Address;
		this.numero = nombre;
		nombre = nombre+1;
	}
	public Client() {
		this.nom = "";
		this.prenom = "";
		this.address = "";
		this.numero = 0;
		nombre = nombre+1;
	}
	public Client(String nom,String prenom,String Address,Object client) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.address = Address;
		this.numero = nombre;
		this.solde = (double) client;
		nombre = nombre+1;
	}
	public void Attribution_solde(Object solde) {
		this.Compte = solde;
	}
	
	static void Ajout_client(Client nom) {
		Scanner clavier = new Scanner(System.in);
		nom = new Client();
		Affiche("Entrer votre nom : ");
		nom.nom = clavier.nextLine();
		Affiche("Entrer prenom : ");
		nom.prenom = clavier.nextLine();
		Affiche("Entrer l'address");
		nom.address = clavier.nextLine();	
		rec(nom);
		nom.numero = nombre-1;
	}
	
	static void retrait() {
		Scanner clavier = new Scanner(System.in);
		Affiche("Entrer le numero du compte ou vous voulez effectuer le retrait : ");
		int numero = clavier.nextInt();
		Affiche("Entrer le montant que vous voulez lui retirer");
		double montant = clavier.nextDouble();
		
		try {
		if (montant>liste.get(numero-1).solde) {
			System.out.println("Desolé mais votre solde est inssuffisant");
		}
		else {
			liste.get(numero-1).solde = liste.get(numero-1).solde-montant;
			
		}
		}catch(Exception e) {
			Affiche("Désolé le compte n'existe pas");
		}
		
	}
	
	static void verssement() {
		Scanner clavier = new Scanner(System.in);
		Affiche("Entrer le numero du compte ou vous voulez effectuer le verssement : ");
		int numero = clavier.nextInt();
		Affiche("Entrer le montant que vous voulez lui Ajouter");
		double new_montant = clavier.nextDouble();
		try {
			
				liste.get(numero-1).solde = liste.get(numero-1).solde+new_montant;
				
	
			}catch(Exception e) {
				Affiche("Désolé le compte n'existe pas");
				
			}
		
	}
	
	static void rec(Client nom) {
		liste.add(nom);
	}
	public String presente_toi() {
		return "Numero : "+this.numero+" Nom : "+this.nom+" prenom : "+this.prenom+" address : "+this.address+" Compte numero : "+this.numero+" mon solde : "+this.solde;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Affiche("Menu\n1-Ajouter un client\n2-Liste des clients\n3-Ajouter un montant\n4-Retirer un montant\n5-Quitter");
		
		Affiche("Que voulez vous faire ? : ");
		Scanner clavier = new Scanner(System.in);
		int choix = clavier.nextInt();
		while(choix != 645312654) {
		if (choix == 1) {
			try {
			Client name = null;
			Ajout_client(name);
			Affiche("Menu\n1-Ajouter un client\n2-Liste des clients\n3-Ajouter un montant\n4-Retirer un montant\n5-Quitter");
			}
			catch(Exception e) {
				Affiche("Les données entrées sont invalides");
				choix = 1;
				continue;
			}
			
		}
		if(choix == 2) {
			for(int i=0;i<liste.size();i++) {
				System.out.println(liste.get(i).presente_toi());
				}
			Affiche("Menu\n1-Ajouter un client\n2-Liste des clients\n3-Ajouter un montant\n4-Retirer un montant\n5-Quitter");
		}
		if(choix == 3) {
			try {
			verssement();
			Affiche("Menu\n1-Ajouter un client\n2-Liste des clients\n3-Ajouter un montant\n4-Retirer un montant\n5-Quitter");
			}
			catch(Exception e) {
				Affiche("Les données entrées sont invalides");
				choix = 3;
				continue;
			}
			
			
		}
		if(choix == 4) {
			try {
			retrait();
			Affiche("Menu\n1-Ajouter un client\n2-Liste des clients\n3-Ajouter un montant\n4-Retirer un montant\n5-Quitter");
			}
			catch(Exception e) {
				Affiche("Les données entrées sont invalides");
				choix = 4;
				continue;
			}
		}
		if(choix == 5) {
			Affiche("Bye");
			break;
		}
		else {
			Affiche("Choissisez une option du menu : ");
			Affiche("Que voulez vous faire ? : ");
			choix = clavier.nextInt();
		}
		}
		/*
		Compte compte = new Compte();
		Client moi = new Client("Koffivi","Jean","Hedranawoe rue 64");
		System.out.println(moi.numero);
		
		Client toi = new Client("AHARH","Yohann","Hedranawoe rue 64",compte.solde);
		System.out.println(toi.numero);
		
		Client tois = new Client("NEGBANE","MAFUZ","Hedranawoe rue 64");
		System.out.println(tois.numero);
		
		
		
		rec(moi);
		rec(toi);
		rec(tois);
		
		*/
		
		
	/*	
		System.out.println(toi.presente_toi());
		System.out.println(tois.presente_toi());
		
		*/
		/*
		
		for(int i=0;i<liste.size();i++) {
		System.out.println(liste.get(i).presente_toi());
		}
		
		verssement();
		for(int i=0;i<liste.size();i++) {
			System.out.println(liste.get(i).presente_toi());
			}
		
		retrait();*/
		
		
		
	}

}
