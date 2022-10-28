package Demenagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Demenagement {
    private List<box> cartons= new ArrayList<>();
    public Demenagement(){}
    
    public Demenagement( List<box> cartons ){
		this.cartons = cartons;
	}
    public void addBox(box b){
		cartons.add(b);
	}

    public List<box> getCartons() {
        return cartons;
    }

    public void setCartons(List<box> cartons) {
        this.cartons = cartons;
    }

    public void afficher(){
		System.out.println("Les objets de votre demenagement sont : ");
		for (box aff : cartons){
			aff.afficher();
		}
	}

    public int trouve(String nomObjet){
		for(int i=0;i<cartons.size();i++){
            if(cartons.get(i).Find(nomObjet)){
                return cartons.get(i).getboxNum();
            }
        }
        return -1;
	}

    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

                Demenagement demenagement = new Demenagement();
                
                box Box1 = new box(1, 1);
                Box1.add(new SimpleObjet("chargeur"));
                box Box2 = new box(1, 2);
                Box2.add(new SimpleObjet("ordinateur"));
                box Box3 = new box(1, 3);
                Box3.add(new SimpleObjet("verre"));;
                box Box4 = new box(1, 1);
                Box4.add( new SimpleObjet("carnnet"));
                Box3.add(Box4);
                box Box5 = new box(3, 4);
                Box5.add(Box1);
                Box5.add(Box2);
                Box5.add(Box3);

                 box Box6 = new box(3, 6);
                    Box6.add( new SimpleObjet("telephone"));
                    Box6.add( new SimpleObjet("souris"));
                    Box6.add( new SimpleObjet("Ram"));
                demenagement.addBox(Box5);
                demenagement.addBox(Box6);

                int option = 0;
                do{
                    menu();
                    option = input.nextInt();
                    switch(option){
                        case 1:
                            demenagement.afficher();
                        break;
                        case 2:
                        System.out.println("******************** Votre Demenagement contient deux carton **************");
                        System.out.print("ENtrez le numero de carton dans le Demenagement: ");
                        int numCarton = input.nextInt();
                        if(numCarton == 1){
                            Box5.afficher();
                        }else if(numCarton == 2){
                            Box6.afficher();
                        }

                        break;
                        case 3:
                        System.out.print("entrez le nom d'objet : ");
                        String NumBojet = input.next();
                        System.out.println("L'objet Se trouve dans le carton numero :  " + demenagement.trouve(NumBojet));
                        break;
                    }

                }while(option != 3);
                
     }

    }

    public static void menu(){
        System.out.println("============================= MENU ============================");
        System.out.println("1:Afficher le contenu de demenagement");
        System.out.println("2:Afficher le contenu de chaque Box");
        System.out.println("3:Cherer sur un objet");
        System.out.println("===============================================================");
        System.out.println(": Exit program");
        System.out.print("Enter your selection : ");
    }
}
