package modele;

import java.awt.Point;

public class Triangle extends Forme {

	private Point point;
	
	public Triangle(Point point) {
		this.point = point;
	}
	public boolean deplacer(Point pointDepart, Point pointArrive) {
		if ( true ) { // TO DO - Remplacer true par la vérification du déplacement
			
			Point distance = new Point ((int)(pointArrive.getX() - pointDepart.getX()), (int) (pointArrive.getY() - pointDepart.getY()));
			this.point = new Point((int)(this.point.getX() + distance.getX()),(int)(this.point.getY()+ distance.getY()));

		}
		return false;
	}
	@Override
	public String getNomClasse() {
		return "Triangle";
	}

}


