package src.fr.eseo.poo.projet.artiste.modele.formes;
import src.fr.eseo.poo.projet.artiste.modele.Coordonnees;

public abstract class Forme {
	
	public double LARGEUR_PAR_DEFAUT;
	public double HAUTEUR_PAR_DEFAUT;
	private Coordonnees position;
			
	public Forme() {
		
	}

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
		//retourne par defaut le coin superieur gauche
		return  position.getOrdonnee();
	}	
	
	public double getCadreMinY() {
		//retourne par defaut le coin superieur gauche
		return position.getAbscisse();		
	}
	
	public double getCadreMaxX() {
		return position.getOrdonnee() + this.LARGEUR_PAR_DEFAUT;
	}	

	public double getCadreMaxY() {
		return position.getOrdonnee() + this.HAUTEUR_PAR_DEFAUT;
	}
	
	public void setPosition(Coordonnees position){
		this.position = position;
	}
	
	public void setLargeur(double largeur){
		this.position.setAbscisse(largeur);
	}
	
	public void setHauteur(double hauteur){
		this.position.setOrdonnee(hauteur);
	}
	
	public void deplacerDe(double deltaX, double deltaY){
		this.setLargeur(position.getOrdonnee() + deltaX);
		this.setHauteur(position.getAbscisse() + deltaY);
	}
	
	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee){
		this.setLargeur(nouvelleAbscisse);
		this.setHauteur(nouvelleOrdonnee);
	}
	
	public abstract double aire();
	
	public abstract double perimetre();

}
