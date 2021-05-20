package src.fr.eseo.poo.projet.artiste.modele.formes;

import src.fr.eseo.poo.projet.artiste.modele.Coordonnees;
import src.fr.eseo.poo.projet.artiste.modele.formes.Forme;

public class Ligne extends Forme {
	
	public Ligne() {
		
	}
	
	public Ligne(double largeur, double hauteur) {
		this.HAUTEUR_PAR_DEFAUT=largeur;
		this.LARGEUR_PAR_DEFAUT=hauteur;
		}
	
	public Ligne(double coordonnees) {
		this.HAUTEUR_PAR_DEFAUT=coordonnees;
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

	public void setC1(Coordonnees c) {
		// TODO Auto-generated method stub
		
	}

	public Object getC1() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}



