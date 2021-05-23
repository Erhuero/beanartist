package src.fr.eseo.poo.projet.artiste.modele;
import java.text.DecimalFormat;
import src.fr.eseo.poo.projet.artiste.modele.Coordonnees;

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
		return ABSCISSE_PAR_DEFAUT;
	}
	
	public double angleVers(Coordonnees autreCoordonnees) {
		return ABSCISSE_PAR_DEFAUT;
		
	} 
	
	@Override
	public String toString() {
		return "(" + getAbscisse() + " , " + getOrdonnee() + ")";
	}
	
	
	
	
	
	
	
	
	
	
	
}
