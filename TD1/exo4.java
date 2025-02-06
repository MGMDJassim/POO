package TD1;

import java.util.Scanner;

public class exo4 {

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Prix :");
		int prix = sc.nextInt();

		int nombreDeCinquante = prix/50;
			prix%=50;
		int nombreDeVingt = prix/20;
			prix%=20;
		int nombreDeCinq = prix/5;
		
		System.out.print("Il faut : \n " + nombreDeCinquante + "X50 \n" + nombreDeVingt + " X20 \n" + nombreDeCinq + "X5");
		

	}

}