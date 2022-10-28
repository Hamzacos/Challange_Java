package Demenagement;

import java.util.ArrayList;

public class SimpleObjet implements objet {


    private String name;

    // ArrayList<objet> simplobjet = new ArrayList<objet>();

    public SimpleObjet(String Nom) {
		name = Nom;
        
	}

	public String getNom(){
		return name;
	}
	
    @Override
    public void add(objet i) {
        // TODO Auto-generated method stub
        // simplobjet.add(0, i);
        
    }

    @Override
    public void afficher() {
            System.out.println(getNom());        
    }

    @Override
    public boolean Find(String nomObjet) {
        return name.equals(nomObjet);
    }
    
}
