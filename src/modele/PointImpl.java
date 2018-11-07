package modele;

import java.awt.Point;

public class PointImpl extends Forme {

	private Point point;
	
	public PointImpl(boolean deplacable, Point point) {
		this.deplacable = deplacable;
		this.point = point;
	}
	public boolean deplacer(Point pointDepart, Point pointArrive) {
		if ( this.deplacable && true ) { // TO DO - Remplacer true par la vérification du déplacement
			
			Point distance = new Point ((int)(pointArrive.getX() - pointDepart.getX()), (int) (pointArrive.getY() - pointDepart.getY()));
			this.point = new Point((int)(this.point.getX() + distance.getX()),(int)(this.point.getY()+ distance.getY()));

		}
		return false;
	}

	@Override
	public boolean getDeplacable() {
		// TODO Auto-generated method stub
		return this.deplacable;
	}

}
