package src.fr.eseo.poo.projet.artiste.modele.forme;
import src.fr.eseo.poo.projet.artiste.modele.Coordonnees;

public abstract class Forme {
	
	public double LARGEUR_PAR_DEFAUT;
	public double HAUTEUR_PAR_DEFAUT;
	private Coordonnees position;
			
	public Forme() {}

	public Forme(double largeur, double hauteur) {
		
		this.LARGEUR_PAR_DEFAUT = largeur;
		this.HAUTEUR_PAR_DEFAUT = hauteur;
	}
	
	public Forme(Coordonnees position) {
		this.position = position;
	}
	
	public Forme(Coordonnees position, double largeur, double hauteur) {
		this.position = position;
		this.LARGEUR_PAR_DEFAUT = largeur;
		this.HAUTEUR_PAR_DEFAUT = hauteur;
	}
	
	public Coordonnees getPosition() {
		return this.position;
	}
	
	public double getLargeur() {
		return this.LARGEUR_PAR_DEFAUT=LARGEUR_PAR_DEFAUT; 
	}
	
	public double getHauteur() {
		return this.HAUTEUR_PAR_DEFAUT=HAUTEUR_PAR_DEFAUT;
	}
	
	public double getCadreMinX() {
		return HAUTEUR_PAR_DEFAUT;		
	}	
	
	public double getCadreMinY() {
		return HAUTEUR_PAR_DEFAUT;		
	}
	
	public double getCadreMaxX() {
		return HAUTEUR_PAR_DEFAUT;		
	}	

	public double getCadreMaxY() {
		return HAUTEUR_PAR_DEFAUT;	
	}
	
	public void setPosition(Coordonnees position){
			
	}
	
	public void setLargeur(double largeur){
		
	}
	
	public void setHauteur(double hauteur){
			
	}
	
	public void deplacerDe(double deltaX, double deltaY){
			
	}
	
	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee){
		
	}
	
	public abstract double aire();
	
	public abstract double perimetre();

}
