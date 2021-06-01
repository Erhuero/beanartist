package fr.eseo.poo.projet.artiste.modele.formes;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public abstract class Forme {
	
	public static final double LARGEUR_PAR_DEFAUT = 0;
	public static final double HAUTEUR_PAR_DEFAUT = 0;
	private Coordonnees position;
			
	public Forme() {
		
	}

	public Forme(double largeur, double hauteur) {
		this.setLargeur(largeur);
		this.setHauteur(hauteur);
		
	}
	
	public Forme(Coordonnees position) {
		this(position, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}
	
	public Forme(Coordonnees position, double largeur, double hauteur) {
		this.setPosition(position);
		this.setLargeur(largeur);
		this.setHauteur(hauteur);
	}
	
	public Coordonnees getPosition() {
		return this.position;
	}
	
	public double getLargeur() {
		return 0;
	}
	
	public double getHauteur() {
		return 0;
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
