package TD1;

import java.util.Scanner;

public class exo5 {

    // Fonction pour afficher le tableau des noms
    static void displayTab(String[] tab){
        for(int i=0; i < tab.length; i++)
        {  
             System.out.print(tab[i] + " ");  
        } 
        System.out.println();    
   }

    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);

        System.out.println("Quelle le nombre de copies ? ");
        int max = lecteur.nextInt();
        lecteur.nextLine(); 
        String[] names = new String[max];
        double[] notes = new double[max];
        
        for(int i = 0; i < max; i++) {
            System.out.print("Saisir le nom " + (i+1) + ": ");
            names[i] = lecteur.nextLine();
            System.out.print("Saisir la note " + (i+1) + ": ");
            notes[i] = lecteur.nextDouble();
            lecteur.nextLine(); 
        }
        
        for (int i = 0; i < notes.length - 1; i++)  
        {
             int index = i;  
             for (int j = i + 1; j < notes.length; j++)
             {
                  if (notes[j] > notes[index]){ 
                       index = j;
                  }
             }

             String temp2 = names[index];
             double temp = notes[index];
             notes[index] = notes[i]; 
             notes[i] = temp;
             names[index] = names[i]; 
             names[i] = temp2;
        }
       
        displayTab(names);
        lecteur.close();
    }
}