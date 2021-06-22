package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Cercle extends Ellipse {
	
	public static final int HAUTEUR_PAR_DEFAUT = 100;
	
	public Cercle() {
		this(new Coordonnees(), HAUTEUR_PAR_DEFAUT);
	}
	
	public Cercle(double taille) {
		
		super(taille, taille);
	}
	
	public Cercle(Coordonnees coordonnees) {
		this(coordonnees, HAUTEUR_PAR_DEFAUT);
		}
	
	public Cercle(Coordonnees coordonnees, double taille) {
		super(coordonnees, taille, taille);
	}
	
	public void setHauteur(double hauteur) {
		if(hauteur < 0) {
			throw new IllegalArgumentException("Attention, la valeur est négative");
		} else {
			super.setLargeur(hauteur);
			super.setHauteur(hauteur);
		}
		//super.setLargeur(hauteur);
		//super.setLargeur(hauteur);
	}
	
	public void setLargeur(double largeur) {
		if(largeur < 0) {
			throw new IllegalArgumentException("Attention, la valeur est négative");
		} else {
			super.setLargeur(largeur);
			super.setHauteur(largeur);
		}
		
		//super.setLargeur(largeur);
		//super.setHauteur(largeur);
	}	
	
	@Override
	public double perimetre() {
		return 2 * Math.PI * (super.getHauteur()/2);
	}
	
	//TestCercle007Fn.testtoString.1 expected [[Cercle] : pos (43,67 , 87,39) dim 66,0 x 66,0 périmètre : 207,35 aire : 3421,19] 
	//		but found                         [[Cercle] : pos (43,67 , 87,39) dim 66.0 x 66.0 périmètre : 207,35 aire : 3421,19]
	
	/*
	@Override
	public String toString() {
		DecimalFormat formatDecimal = new DecimalFormat("0.0#");
		return "[" + this.getClass().getSimpleName() 
				+ "] : pos " + formatDecimal.format(super.getPosition()) 
				+ " dim " + formatDecimal.format(super.getLargeur()) 
				+ " x " + formatDecimal.format(super.getLargeur()) 
				+ " périmètre : " + formatDecimal.format(this.perimetre()) 
				+ " aire : " + formatDecimal.format(this.aire());
	}
	*/
}
