package modele;

import java.awt.Point;

public class Rectangle extends Forme{

	private Point supgauche;
	private Point infdroit;
	
	public Rectangle(Point supgauche, Point infdroit) {
		
		this.supgauche = supgauche;
		this.infdroit = infdroit;
		
	}
	
	@Override
	public boolean deplacer(Point pointDepart, Point pointArrive) {
		if (true ) { // TO DO - Remplacer true par la vérification du déplacement
			
			Point distance = new Point ((int)(pointArrive.getX() - pointDepart.getX()), (int) (pointArrive.getY() - pointDepart.getY()));
			this.supgauche = new Point((int)(this.supgauche.getX() + distance.getX()),(int)(this.supgauche.getY()+ distance.getY()));
			this.infdroit = new Point((int)(this.infdroit.getX() + distance.getX()),(int)(this.infdroit.getY()+ distance.getY()));

		}
		return false;
	}

	

}
