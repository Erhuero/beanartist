package fr.eseo.poo.projet.artiste.modele.formes;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Ligne extends Forme {
	
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
		 this.deplacerVers(position.ABSCISSE_PAR_DEFAUT, position.ORDONNEE_PAR_DEFAUT);
	 }
	 
	 public void setC1(Coordonnees coordonnees1){
		super.setPosition(coordonnees1);
	 }
	
	 public void setC2(Coordonnees coordonnees2) {
		 
		 //super.getC1().getAbscisse() + super.getLargeur(), this.getC1().getOrdonnee() + super.getHauteur());
		 //super.setLargeur(coordonnees2.getAbscisse());
		 //super.setHauteur(coordonnees2.getOrdonnee());		 
	 }
	 
	 public String toString(){
		 return "[Ligne] c1 : " + "("+ getC1() +")" + "c2 : " + "("+ getC2()+ ")" + " longueur : " + perimetre() + " angle " + this.getC1().angleVers(getC2());//met en radian
	 }
	 
	@Override
	public double aire() {//les methodes abstraites doivent �tre implementes dans une classe concrete qui a des methodes concretes
		// TODO Auto-generated method stub
		return 0;//car les lignes n ont pas d aire
	}

	@Override
	public double perimetre() {		
		//return Math.sqrt(((Math.pow(coordonnees2.getAbscisse() - coordonnees1.getAbscisse(), 2)) + ((Math.pow(coordonnees2.getOrdonnee() - coordonnees1.getOrdonnee(), 2)))));
		return Math.floor(Math.sqrt(Math.pow(super.getLargeur(), 2) + Math.pow(super.getHauteur(), 2)) * 100) / 100;
	}	
}



