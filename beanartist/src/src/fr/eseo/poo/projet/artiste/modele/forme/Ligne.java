package src.fr.eseo.poo.projet.artiste.modele.forme;

import src.fr.eseo.poo.projet.artiste.modele.Coordonnees;
import src.fr.eseo.poo.projet.artiste.modele.formes.Forme;

public class Ligne extends Forme {
	
	public Ligne() {
		
	}
	
	public Ligne(double largeur, double hauteur) {
		this.HAUTEUR_PAR_DEFAUT=largeur;
		this.LARGEUR_PAR_DEFAUT=hauteur;
		}
	
	public Ligne(Coordonnees coordonnees) {
		
	}
	
	 public Ligne(Coordonnees coordonnees, double largeur, double hauteur) {
		 
	 }
	 
	 public Coordonnees getC1(){
		 return null;
	 }
	 
	 public Coordonnees getC2(){
		 return null;
	 }
	 
	 public void setC1(Coordonnees coordonnees){
		
	 }
	
	 public void setC2(Coordonnees coordonnees) {
		 
	 }
	 
	 public String toString(){
		 return null;
	 }
	 
	@Override
	public double aire() {//les methodes abstraites doivent être implementes dans une classe concrete qui a des methodes concretes
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 0;
	}


	

	
	
	
}



