package fr.eseo.poo.projet.artiste.modele;
import java.text.DecimalFormat;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Coordonnees {
	public static final double ABSCISSE_PAR_DEFAUT = 0;
	public static final double ORDONNEE_PAR_DEFAUT = 0;
	
	
	public Coordonnees() {
		
	}

	public Coordonnees(double abscisse, double ordonnee) {
		
		abscisse = abscisse;
		ordonnee = ordonnee;
	}

	public double getAbscisse() {
		return ABSCISSE_PAR_DEFAUT;
	}
	
	public double getOrdonnee() {
		return ORDONNEE_PAR_DEFAUT;
	}

	public void setAbscisse(double abscisse) {
		abscisse = abscisse;
	}
	

	public void setOrdonnee(double ordonnee) {
		ordonnee = ordonnee;
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
