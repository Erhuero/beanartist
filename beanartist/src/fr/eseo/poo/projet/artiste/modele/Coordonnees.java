package fr.eseo.poo.projet.artiste.modele;
import java.text.DecimalFormat;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Coordonnees {
	
	public static final double ABSCISSE_PAR_DEFAUT = 0;
	public static final double ORDONNEE_PAR_DEFAUT = 0;
	private double abscisse, ordonnee;

	public Coordonnees(double abscisse, double ordonnee) {
		
		this.setAbscisse(abscisse);
		this.setOrdonnee(ordonnee);	
	}

	public Coordonnees() {
		
	}

	public double getAbscisse() {
		return abscisse;
	}
	
	public double getOrdonnee() {
		return ordonnee;
	}

	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}
	
	public void setOrdonnee(double ordonnee) {
		this.ordonnee = ordonnee;
	}
	
	public void deplacerDe(double deltaX, double deltaY) {
		
		
		this.setAbscisse(this.getAbscisse() + deltaX);
		this.setOrdonnee(this.getOrdonnee() + deltaY);
		
	}
	
	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee) {
		this.setAbscisse(nouvelleAbscisse);
		this.setOrdonnee(nouvelleOrdonnee);
	}
	
	public double distanceVers(Coordonnees autreCoordonnees) {
		
		return Math.sqrt(((Math.pow(getAbscisse() - getAbscisse(), 2)) + ((Math.pow(getOrdonnee() - getOrdonnee(), 2)))));
	
	}
	
	public double angleVers(Coordonnees autreCoordonnees) {
		
		double angle;
		
		if(autreCoordonnees.getAbscisse() >= abscisse && autreCoordonnees.getOrdonnee() <= ordonnee) {
			
			angle = -(Math.acos((autreCoordonnees.abscisse - abscisse) / distanceVers(autreCoordonnees)));
			
		}
		
		/*
		double angle = Math.asin((this.getOrdonnee() - autreCoordonnees.getOrdonnee()) / this.distanceVers(autreCoordonnees));
		
		if(this.getAbscisse() > autreCoordonnees.getAbscisse()) {
			angle = (this.getOrdonnee() > autreCoordonnees.getOrdonnee()) ? Math.PI - angle : -Math.PI - angle;
		}
		*/
		
		return angle;
	
	} 
	
	@Override
	public String toString() {
		return "(" + getAbscisse() + " , " + getOrdonnee() + ")";
	}
	

}
