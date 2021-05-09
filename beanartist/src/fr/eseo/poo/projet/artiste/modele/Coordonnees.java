package fr.eseo.poo.projet.artiste.modele;

public class Coordonnees {
	public double ABSCISSE_PAR_DEFAUT;
	public double ORDONNEE_PAR_DEFAUT;
	
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
		this.ABSCISSE_PAR_DEFAUT = deltaX;
		this.ORDONNEE_PAR_DEFAUT = deltaY;
	}
	
	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee) {
		this.ABSCISSE_PAR_DEFAUT = nouvelleAbscisse;
		this.ORDONNEE_PAR_DEFAUT = nouvelleOrdonnee;
	}
	
	public double distanceVers(Coordonnees autreCoordonnees) {
		return ABSCISSE_PAR_DEFAUT;
	}
	
	public double angleVers(Coordonnees autreCoordonnees) {
		return ABSCISSE_PAR_DEFAUT;
		
	} 
	
	public String toString() {
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
}
