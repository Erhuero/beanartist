package fr.eseo.poo.projet.artiste.modele;
import java.text.DecimalFormat;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Coordonnees {
	public double ABSCISSE_PAR_DEFAUT;
	public double ORDONNEE_PAR_DEFAUT;
	
	
	public Coordonnees() {
		
	}

	public Coordonnees(double abscisse, double ordonnee) {
		
		this.ABSCISSE_PAR_DEFAUT = abscisse;
		this.ORDONNEE_PAR_DEFAUT = ordonnee;
	}

	public double getAbscisse() {
		return ABSCISSE_PAR_DEFAUT;
	}
	
	public double getOrdonnee() {
		return ORDONNEE_PAR_DEFAUT;
	}

	public void setAbscisse(double abscisse) {
		ABSCISSE_PAR_DEFAUT = abscisse;
	}
	

	public void setOrdonnee(double ordonnee) {
		ORDONNEE_PAR_DEFAUT = ordonnee;
	}
	
	public void deplacerDe(double deltaX, double deltaY) {
		this.setAbscisse(deltaX);
		this.setOrdonnee(deltaY);
	}
	
	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee) {
		this.setAbscisse(this.getAbscisse() + nouvelleAbscisse);
		this.setOrdonnee(this.getOrdonnee() + nouvelleOrdonnee);
	}
	
	public double distanceVers(Coordonnees autreCoordonnees) {
		return Math.sqrt(((Math.pow(getAbscisse() - getAbscisse(), 2)) + ((Math.pow(getOrdonnee() - getOrdonnee(), 2)))));
	}
	
	public double angleVers(Coordonnees autreCoordonnees) {
		
		double angle = Math.asin((this.getOrdonnee() - autreCoordonnees.getOrdonnee()) / this.distanceVers(autreCoordonnees));
		
		if(this.getAbscisse() > autreCoordonnees.getAbscisse()) {
			angle = (this.getOrdonnee() > autreCoordonnees.getOrdonnee()) ? Math.PI - angle : -Math.PI - angle;
		}
		
		return angle;
	} 
	
	@Override
	public String toString() {
		return "(" + getAbscisse() + " , " + getOrdonnee() + ")";
	}
	
	
	
	
	
	
	
	
	
	
	
}
