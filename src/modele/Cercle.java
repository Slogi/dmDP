package modele;

import java.awt.Point;

public class Cercle extends Forme{
	
	private Point centre;
	private double rayon;
	
	public Cercle (boolean deplacable, Point centre, double rayon) {
		
		this.deplacable = deplacable;
		this.centre = centre;
		this.rayon = rayon;
	}
	@Override
	public boolean deplacer(Point pointDepart, Point pointArrive) {
		if ( this.deplacable && true ) { // TO DO - Remplacer true par la vérification du déplacement
			
			Point distance = new Point ((int)(pointArrive.getX() - pointDepart.getX()), (int) (pointArrive.getY() - pointDepart.getY()));
			this.centre = new Point((int)(this.centre.getX() + distance.getX()),(int)(this.centre.getY()+ distance.getY()));
			//this.pointRayon = new Point((int)(this.pointRayon.getX() + distance.getX()),(int)(this.pointRayon.getY()+ distance.getY()));

		}
		return false;
	}
	
	public void setRayon(double r)
	{
		this.rayon=r;
		this.fireChangement();
	}

	public boolean getDeplacable() {
		return this.deplacable;
	}

}
