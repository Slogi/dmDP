package modele;

import java.awt.Point;

import util.observer.AbstractModeleEcoutable;

public abstract class Forme extends AbstractModeleEcoutable {
	
	protected boolean deplacable;
	
	public abstract boolean deplacer(Point pointDepart, Point pointArrive);
	
	public abstract boolean getDeplacable();
}
