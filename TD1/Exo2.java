package TD1;
import java.util.Scanner;

public class Exo2 {
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir A :");
            int A = sc.nextInt();

            System.out.println("Veuillez saisir B :");
            int B = sc.nextInt();

            System.out.println("Veuillez saisir C :");
            int C = sc.nextInt();
            
            int tmp = A;
            B = C;
            C = A;
            A = B;
            System.out.println("La valeur de A est " + A +"\n La valeur de B est " + B + "La valeur de C est " + C);
    }

}