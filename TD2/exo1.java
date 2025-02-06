package TD2;


import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        String[] tabString = creerTabString();
        afficher(tabString);
        
        double[] tabDouble = creerTabDouble();
        afficher(tabDouble);
    }
    
//Quesetion 1
    public static String[] creerTabString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre d'éléments du tableau : ");
        int taille = scanner.nextInt();
        scanner.nextLine(); // consomme le '\n' laissé par nextInt()

        String[] tableau = new String[taille];
        for (int i = 0; i < taille; i++) {
            System.out.println("Entrez l'élément " + (i+1) + " : ");
            tableau[i] = scanner.nextLine();
        }
        return tableau;
    }
//Question 2
    public static double[] creerTabDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre d'éléments du tableau : ");
        int taille = scanner.nextInt();

        double[] tableau = new double[taille];
        for (int i = 0; i < taille; i++) {
            System.out.println("Entrez l'élément " + (i+1) + " : ");
            tableau[i] = scanner.nextDouble();
        }
        return tableau;
    }
//Question 3
    public static void afficher(String[] tab)
    {
      if(tab != null)
      {
          System.out.print("Tableau : [");
            
          for(int i=0; i < tab.length - 1; i++){
              System.out.print(tab[i] + ",");
          }
          if(tab.length > 0){
              System.out.print(tab[tab.length - 1]);
          }
          
          System.out.println("]");
      }
    }
    public static void afficher(double[] tab){
      if(tab != null){
          System.out.print("Tableau : [");
            
          for(int i=0; i < tab.length - 1; i++){
              System.out.print(tab[i] + ",");
          }
          if(tab.length > 0){
              System.out.print(tab[tab.length - 1]);
          }
          
          System.out.println("]");
      }
    } 
//Quesiton 4
    public static void copierZone(String[] scr, String[] dst,int i1d,int i1f,int i2d){
      
        i1d = Math.max(0, i1d);
        i1d = Math.min(i1d, scr.length -1);
        
        i1f = Math.max(0, i1f);
        i1f = Math.min(i1f, scr.length -1);
        
        i2d = Math.max(0, i2d);
        i2d = Math.min(i2d, dst.length -1);
        
        int nbc = (i1f-i1d) +1;
        nbc = Math.min(nbc, dst.length-i2d);
        
        for(int i = 0; i < nbc; i++){
          dst[i2d + i] = scr[i1d + i];
        }
    }
      public static void copierZone(double[] scr, double[] dst,int i1d,int i1f,int i2d){
        
        i1d = Math.max(0, i1d);
        i1d = Math.min(i1d, scr.length -1);
        
        i1f = Math.max(0, i1f);
        i1f = Math.min(i1f, scr.length -1);
        
        i2d = Math.max(0, i2d);
        i2d = Math.min(i2d, dst.length -1);
        
        int nbc = (i1f-i1d) +1;
        nbc = Math.min(nbc, dst.length-i2d);
        
        for(int i = 0; i < nbc; i++){
          dst[i2d + i] = scr[i1d + i];
        }
    }
//Quesiton 5
    public static String[] agrandir(int taille, String[] tab){
        taille = taille + tab.length;
        taille = Math.max(0, taille);
        
        String[] res = new String[taille];
        
        int nb = Math.min(tab.length, taille);
        
        copierZone(tab, res, 0, nb-1, 0);
        
        return res;
    }
      public static double[] agrandir(int taille, double[] tab){
        taille = taille + tab.length;
        taille = Math.max(0, taille);
        
        double[] res = new double[taille];
        
        int nb = Math.min(tab.length, taille);
        
        copierZone(tab, res, 0, nb-1, 0);
        
        return res;
    }
    //Question 6
    public static String[] fusionner(String[] tab1, String[] tab2) {
        String[] resultat = new String[tab1.length + tab2.length];
        System.arraycopy(tab1, 0, resultat, 0, tab1.length);
        System.arraycopy(tab2, 0, resultat, tab1.length, tab2.length);
        return resultat;
    }
    public static double[] fusionner(double[] tab1, double[] tab2) {
        double[] resultat = new double[tab1.length + tab2.length];
        System.arraycopy(tab1, 0, resultat, 0, tab1.length);
        System.arraycopy(tab2, 0, resultat, tab1.length, tab2.length);
        return resultat;
    }
    //Question 7 
    public static String[] insererString(String[] tab, int indice, String v) {
        String[] tab1 = agrandir(1, tab);
        indice = Math.max(indice, 0);
        indice = Math.min(indice, tab.length);
        
        copierZone(tab, tab1, indice, tab.length, indice + 1);
        
        tab1[indice] = v;
        
        return tab1;
    }
     public static double[] insererDouble(double[] tab, int indice, double v) {
        double[] tab1 = agrandir(1, tab);
        indice = Math.max(indice, 0);
        indice = Math.min(indice, tab.length);
        
        copierZone(tab, tab1, indice, tab.length, indice + 1);
        
        tab1[indice] = v;
        
        return tab1;
    }
    //Quesiton 8 
    public static String[] supprString(String[] tab,  String v){
        String[] newTab = null;
        for(int i = 0; i < tab.length; i++ ){
            if(tab[i]!=v){
                newTab[i] = tab[i]; 
            }
            else{
                i++;
            }
        }
        return newTab;
    }
    public static double[] supprDouble(double[] tab,  double v){
        double[] newTabDouble = null;
        for(int i = 0; i < tab.length; i++ ){
            if(tab[i]!=v){
                newTabDouble[i] = tab[i]; 
            }
            else{
                i++;
            }
        }
        return newTabDouble;
    }

}