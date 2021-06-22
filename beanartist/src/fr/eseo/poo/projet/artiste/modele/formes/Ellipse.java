package fr.eseo.poo.projet.artiste.modele.formes;
import java.text.DecimalFormat;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Forme;

public class Ellipse extends Forme{
	//public static final int LARGEUR_PAR_DEFAUT = 100;
	
	public Ellipse() {
		super();
		//super(new Coordonnees());
	}
	
	public Ellipse(double largeur, double hauteur) {
		//super(new Coordonnees(), largeur, hauteur);
		super(largeur, hauteur);
	}
	
	public Ellipse(Coordonnees coordonnees) {
		//super(coordonnees, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
		super(coordonnees);
	}
	
	public Ellipse(Coordonnees coordonnees, double largeur, double hauteur){
		super(coordonnees, largeur, hauteur);
	}
	
	public void setHauteur(double hauteur) {
		if(hauteur < 0) {
			throw new IllegalArgumentException("Attention, la valeur est négative");
		} else {
			super.setHauteur(hauteur);			
		}
		//super.setHauteur(hauteur);
	}
	
	public void setLargeur(double largeur) {
		if(largeur < 0) {
			throw new IllegalArgumentException("Attention, la valeur est négative");
		} else {
			super.setLargeur(largeur);
		}
		//super.setLargeur(largeur);
	}

	@Override
	public double aire() {
		return Math.PI * (super.getHauteur()/2) * (super.getLargeur()/2);
	}

	@Override
	public double perimetre() {
		double h = Math.pow(((super.getHauteur()/2) - (super.getLargeur()/2)) / ((super.getHauteur()/2) + (super.getLargeur()/2)), 2);
		return Math.PI * ((super.getHauteur()/2) + (super.getLargeur()/2)) * (1+((3*h)/(10+Math.sqrt(4-3*h))));
	}
	
	@Override
	public String toString() {
		DecimalFormat formatDecimal = new DecimalFormat("0.0#");
		return "[" + this.getClass().getSimpleName()
				+ "] : pos " + super.getPosition()
				+ " dim " + formatDecimal.format(super.getLargeur())
				+ " x " + formatDecimal.format(super.getHauteur()) 
				+ " périmètre : " + formatDecimal.format(this.perimetre()) 
				+ " aire : " + formatDecimal.format(this.aire());
			}

	@Override
	public boolean contient(Coordonnees coordonnees) {
		// TODO Auto-generated method stub
		//return contient(coordonnees.getX(),coordonnees.getY());
		//return contient(testPosition.getX(),testPosition.getY());
		/*
		double a = super.getHauteur()/2;
		double b = super.getLargeur()/2;
		Coordonnees centre = new Coordonnees(super.getCadreMinX() + b, super.getCadreMinY() + a);
		
		return Math.pow(coordonnees.getAbscisse() - centre.getAbscisse(), 2) / Math.pow(b, 2)
				+ Math.pow(coordonnees.getOrdonnee() - coordonnees.getOrdonnee(), 2) / Math.pow(a, 2) <=1;	
	}
	*/
		double abscisse = (coordonnees.getAbscisse() - (super.getPosition().getAbscisse() + (super.getLargeur()/2)))/(super.getLargeur()/2);
		double ordonnee = (coordonnees.getOrdonnee() - (super.getPosition().getOrdonnee() + (super.getHauteur()/2)))/(super.getHauteur()/2);
		
		return (abscisse*abscisse+ordonnee*ordonnee < 1);
	}
}
