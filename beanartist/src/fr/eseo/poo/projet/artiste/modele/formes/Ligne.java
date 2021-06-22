package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Ligne extends Forme {
	
	public static final double EPSILON = 0.01;
	
	public Ligne() {
		this(new Coordonnees());
	}
	
	public Ligne(double largeur, double hauteur) {
		super(largeur, hauteur);
		}
	
	public Ligne(Coordonnees coordonnees) {
		super(coordonnees);
	}
	
	 public Ligne(Coordonnees coordonnees, double largeur, double hauteur) {
		 super(coordonnees, largeur, hauteur);
	 }
	 
	 public Coordonnees getC1(){//premier point
		return super.getPosition();
	 }
	 
	 public Coordonnees getC2(){//second point
		 return new Coordonnees(this.getC1().getAbscisse() + super.getLargeur(), this.getC1().getOrdonnee() + super.getHauteur());
	 }
	 
	 public void setPosition(Coordonnees position){
		 super.setPosition(position);
	 }
	 
	 public void setC1(Coordonnees coordonnees){
		super.setLargeur(this.getC2().getAbscisse() - coordonnees.getAbscisse());
		super.setHauteur(this.getC2().getOrdonnee() - coordonnees.getOrdonnee());
		this.setPosition(coordonnees);
	 }
	
	 public void setC2(Coordonnees coordonnees) {//nouvelle coordonnee moins abscisse initiale
		
		 //super.getC1().getAbscisse() + super.getLargeur(), this.getC1().getOrdonnee() + super.getHauteur());
		 super.setLargeur(coordonnees.getAbscisse() - this.getC1().getAbscisse());
		 super.setHauteur(coordonnees.getOrdonnee() - this.getC1().getOrdonnee());
	 }
	
	@Override
	public String toString() {
		DecimalFormat formeDecimale = new DecimalFormat("0.0#");
		double angle = this.getC1().angleVers(this.getC2());
		
		if(angle < 0)
			angle += 2 * Math.PI;
		
		return "[" + this.getClass().getSimpleName() + "]"+ " c1 : "  + this.getC1() 
				+ " c2 : " + this.getC2()
				+ " longueur : " + formeDecimale.format(this.perimetre()) + " angle : " 
				+ formeDecimale.format(Math.toDegrees(angle)) + "°";
	}

	public static void main(String[] args) {
		Ligne lg = new Ligne(new Coordonnees(1, 2));
		Ligne lg2 = new Ligne(new Coordonnees(3, 6), 5, 5);
		System.out.println(lg.getC2());		
		System.out.println(lg);
		System.out.println("--------------------------------");
		System.out.println(lg2.getC2());
		System.out.println(lg2);
	}
	
	@Override
	public double aire() {//les methodes abstraites doivent �tre implementes dans une classe concrete qui a des methodes concretes
		return 0;//car les lignes n ont pas d aire
	}

	@Override
	public double perimetre() {	
		//return Math.sqrt(((Math.pow(coordonnees2.getAbscisse() - coordonnees1.getAbscisse(), 2)) + ((Math.pow(coordonnees2.getOrdonnee() - coordonnees1.getOrdonnee(), 2)))));
		//return Math.floor(Math.sqrt(Math.pow(super.getLargeur(), 2) + Math.pow(super.getHauteur(), 2)) * 100) / 100;
		return Math.sqrt(Math.pow(super.getLargeur(), 2) + Math.pow(super.getHauteur(), 2));
	}

	@Override
	public boolean contient(Coordonnees coordonnees) {
		return 	((this.getC1().distanceVers(coordonnees) + this.getC2().distanceVers(coordonnees))-
				this.getC1().distanceVers(this.getC2())) <= EPSILON;
	}
	
	
	
}



