package modele;

import java.util.ArrayList;

public class Plateau {
	
	private ArrayList<Forme> listeObstacles = new ArrayList<>();
	private ArrayList<Forme> listeFormesPerso = new ArrayList<>();
	
	public Plateau (int nombreFormes) {
		
	}
	
	public void ajouterObstacles(Forme forme) {
		this.listeObstacles.add(forme);
	}
	
	public void ajouterFormesPerso (Forme forme) {
		this.listeFormesPerso.add(forme);
	}
}
