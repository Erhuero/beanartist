package src.fr.eseo.poo.projet.artiste.modele.formes;

import src.fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Cercle extends Ellipse {

	public Cercle() {
		
	}
	
	public Cercle(double taille) {
		this.LARGEUR_PAR_DEFAUT = taille;
	}
	
	public Cercle(Coordonnees coordonnees) {
		
		}
	
	public Cercle(Coordonnees coordonnees, double largeur, double hauteur) {
		super(coordonnees, largeur, hauteur);
		
	}
	
	public void setHauteur(double hauteur) {
		
	}
	
	public void setLargeur(double largeur) {
		
	}
	
	public double perimetre() {
		return 0;
		
	}
}
