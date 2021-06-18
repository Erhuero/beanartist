package fr.eseo.poo.projet.artiste.modele.formes;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public abstract class Forme {
	
	public static final double LARGEUR_PAR_DEFAUT = 0;
	public static final double HAUTEUR_PAR_DEFAUT = 0;
	private Coordonnees position;
	private double largeur, hauteur;
	
	public Forme(Coordonnees position, double largeur, double hauteur) {
		this.setPosition(position);
		this.setLargeur(largeur);
		this.setHauteur(hauteur);
	}
	
	public Forme(double abscisse, double ordonnee, double largeur, double hauteur) {
		this(new Coordonnees(abscisse, ordonnee), largeur, hauteur);
	}
	
	public Forme(double largeur, double hauteur) {
		this(new Coordonnees(), largeur, hauteur);
	}
	
	public Forme(Coordonnees position) {
		this(position, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}
			
	public Forme() {
		this(new Coordonnees());
	}
		
	public Coordonnees getPosition() {
		return this.position;
	}
	
	public void setPosition(Coordonnees position){
		this.position = position;
	}
	
	public double getLargeur() {
		return this.largeur;
	}
	
	public void setLargeur(double largeur){
		this.largeur = largeur;
	}
	
	public double getHauteur() {
		return this.hauteur;
	}
	
	public void setHauteur(double hauteur){
		this.hauteur = hauteur;
	}
	
	
	public double getCadreMaxX() {
		//return this.getAbscisse() + this.getLargeur();
				
		/*
		double maxX = this.getPosition().getAbscisse() - this.getAbscisse();
	    return (maxX < this.getPosition().getAbscisse()) ? this.getPosition().getAbscisse() : maxX;
		*/
		Coordonnees coordonnees = getPosition();
		return coordonnees.getAbscisse()+getLargeur();
	}
	
	public double getCadreMaxY() {
		//return this.getOrdonnee() + this.getHauteur();
		Coordonnees coordonnees = getPosition();
		return coordonnees.getOrdonnee() + getHauteur();
	}

	public double getCadreMinX() {
		//retourne par defaut le coin superieur gauche
		//return this.getAbscisse();
		/*
		double minX = this.getPosition().getAbscisse() + this.getAbscisse();
	       
        return (minX > this.getPosition().getAbscisse()) ? this.getPosition().getAbscisse() : minX;
	*/
		Coordonnees coordonnees = getPosition();
		return coordonnees.getAbscisse();
	}	
		
	public double getCadreMinY() {
		//retourne par defaut le coin superieur gauche
		//return this.getOrdonnee();
		Coordonnees coordonnees = getPosition();
		return coordonnees.getOrdonnee();		
	}
	
	public void deplacerDe(double deltaX, double deltaY){
		this.getPosition().deplacerDe(deltaX, deltaY); ;
	}
	
	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee){
		this.getPosition().deplacerVers(nouvelleAbscisse, nouvelleOrdonnee);
	}
	
	public abstract double aire();
	
	public abstract double perimetre();
	

}
