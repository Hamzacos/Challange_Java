package com.example;

import java.util.Scanner;
// import java.util.stream.Stream;
import java.util.stream.IntStream;

/**
 * Hello world!
 */
public final class App {
    private static boolean add;

    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        char[][] triangle;
        int row ;
        char symbole;

        try (Scanner option = new Scanner(System.in)) {

            System.out.print("Entrez le Symbole : ");
            symbole = option.nextLine().charAt(0);
           
            do {
                System.out.print("Entrez le nombre de ligne entre 8 et 35 :  ");
                row = option.nextInt();
            } while (row < 8 || row > 35);
            // IntStream.
        //     int r = row;
        //     char s = symbole;
        //     IntStream.range(0, r).forEach(i -> {
        //         // for (int i = 0; i < row; i++) {// }
        //         for (int j = r - i; j > 0; j--) {
        //              System.out.print(" ");
        //         }   
        //         for (int k = 1; k <= (i * 2) - 1; k++) {
        //             System.out.print(s);
        //         }
        //         System.out.println("");

        //     });
            triangle = new char[row][];
            remplirArbre(triangle,symbole);
            afficherArabre(triangle);

         }

    }

   
     static void remplirArbre(char[][] triangle, char symbole){ 
         int nbLigne = triangle.length;
         
         IntStream.range(0, nbLigne).forEach( i ->{
        // for(int i = 0; i < nbLigne; ++i)
            int nbSymbole;
            nbSymbole = i * 2 +  1;
            triangle[i] = new char [nbSymbole];
            for(int j = 0; j < nbSymbole;j++){
                triangle[i][j] = symbole;
            }
        });
    }

     static void afficherArabre(char[][] triangle) {
        int nbLigne = triangle.length;
        IntStream.range(0, nbLigne).forEach(i-> {
        // for(int i = 0; i < nbLigne ; i++)
            int nbEcpace;
            nbEcpace = nbLigne - i;
            for(int j = 0; j < nbEcpace;j++){
                System.out.print(" ");
            }
                int nbColone;
                nbColone = i * 2 + 1 ; 
                for(int k = 0; k < nbColone ; k++){
                    System.out.print(triangle[i][k]);
                }
                System.out.println();

            

        });
    }

}
