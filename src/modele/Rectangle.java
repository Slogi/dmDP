package modele;

import java.awt.Point;

public class Rectangle extends Forme{

	private Point premierPoint;
	private Point deuxiemePoint;
	
	public Rectangle(Point premierPoint, Point deuxiemePoint) {
		
		
		this.premierPoint = premierPoint;
		this.deuxiemePoint = deuxiemePoint;
		
	}
	
	@Override
	public boolean deplacer(Point pointDepart, Point pointArrive) {
		if (true ) { // TO DO - Remplacer true par la vérification du déplacement
			
			Point distance = new Point ((int)(pointArrive.getX() - pointDepart.getX()), (int) (pointArrive.getY() - pointDepart.getY()));
			this.premierPoint = new Point((int)(this.premierPoint.getX() + distance.getX()),(int)(this.premierPoint.getY()+ distance.getY()));
			this.deuxiemePoint = new Point((int)(this.deuxiemePoint.getX() + distance.getX()),(int)(this.deuxiemePoint.getY()+ distance.getY()));

		}
		return false;
	}

	

}
