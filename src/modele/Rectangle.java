package modele;

import java.awt.Point;

public class Rectangle extends Forme{

	private Point supGauche;
	private Point infDroit;
	
	public Rectangle(Point supgauche, Point infdroit) {
		
		this.supGauche = supgauche;
		this.infDroit = infdroit;
		
	}
	
	@Override
	public boolean deplacer(Point pointDepart, Point pointArrive) {
		if (true ) { // TO DO - Remplacer true par la vérification du déplacement
			
			Point distance = new Point ((int)(pointArrive.getX() - pointDepart.getX()), (int) (pointArrive.getY() - pointDepart.getY()));
			this.supGauche = new Point((int)(this.supGauche.getX() + distance.getX()),(int)(this.supGauche.getY()+ distance.getY()));
			this.infDroit = new Point((int)(this.infDroit.getX() + distance.getX()),(int)(this.infDroit.getY()+ distance.getY()));

		}
		return false;
	}

	@Override
	public String getNomClasse() {
		return "Rectangle";
	}

	public Point getSupGauche() {
		return supGauche;
	}

	public void setSupGauche(Point supGauche) {
		this.supGauche = supGauche;
	}

	public Point getInfDroit() {
		return infDroit;
	}

	public void setInfDroit(Point infDroit) {
		this.infDroit = infDroit;
	}

}
