package Demenagement;

import java.util.ArrayList;

public class box implements objet {

    private static int currentNum = 1;
    private int boxNum;
    ArrayList<objet> obj = new ArrayList<objet>();
    
	public box(){}
 
    public box(int currentNum, int boxNum) {
		// contenu = new Item[unNbItems];
		// currentNum = this.currentNum;
		boxNum = this.boxNum;
	}
    
    public int getboxNum() {
        return boxNum;
    }
    
    public void setNbItems(int boxNum) {
        this.boxNum = boxNum;
    }


    @Override
    public void add(objet i) {
        // TODO Auto-generated method stub
        obj.add(i);
    }

    @Override
    public void afficher() {

        for(objet DEP : obj ){
            DEP.afficher();
        }
    }

    @Override
    public boolean Find(String nomObjet) {
        // for(int i=0; i<obj.size(); i++){
        //     if(obj.get(i).Find(nomObjet)){
        //     System.out.println("i'm in fin ");
        // }else{
        //     System.out.println("Carton introuvable");
        // }
        //     }
        //     return false;
        for(int i = 0; i< obj.size(); i++){
            objet p=obj.get(i);
            if((p instanceof  SimpleObjet && ((SimpleObjet)p).getNom().equals(nomObjet)) || (p instanceof box && ((box)p).Find(nomObjet))){
                return true;
        }
    }
       return false;
}


     @Override public String toString()
    {
        return "OBJET{"
            + "numero=" + currentNum + "nombre d'item =" + boxNum +'}';
    } 
}
