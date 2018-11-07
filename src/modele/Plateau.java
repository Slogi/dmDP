package modele;

import java.util.ArrayList;

public class Plateau {
	
	private ArrayList<Forme> listFormesInitiales = new ArrayList<>();
	private ArrayList<Forme> listeFormes = new ArrayList<>();
	
	public Plateau (int nombreFormes) {
		
	}
	
	public void ajouterFormesInitiales(Forme forme) {
		this.listFormesInitiales.add(forme);
	}
	
	public void ajouterFormes (Forme forme) {
		this.listeFormes.add(forme);
	}
}
