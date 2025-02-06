package TD1;

import java.util.Scanner;
public class ex3 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir le jour :");
			int jour = sc.nextInt();

			System.out.println("Veuillez saisir le mois :");
			int mois = sc.nextInt();

			System.out.println("Veuillez saisir Cl'année :");
			int annee = sc.nextInt();

			int [] dernierJour = {31,29,31,30,31,30,31,31,30,31,30,31};

//Dans le cas où l'année est bissextile
			if(annee%4 == 0){
					if(mois==2 && jour <29){
						jour++;
					}
					else if(mois ==2 && jour == 29){
						jour=1;
						mois++;
					}
					else if(jour == dernierJour[mois -1] && mois == 12){
						jour = 1;
						mois = 1;
						annee++;
					}
					else if (jour == dernierJour[mois -1]){
						jour = 1;
						mois++;
					}
					else {
						jour++;
					}
				}

//Dans tous les autres cas
			else {

			if (jour == dernierJour[mois -1]){
					jour = 1;
					mois++;
				}
			else if(jour > dernierJour[mois - 1] || mois > 12){
					System.out.println("Erreur!");
				}
			else if(jour == dernierJour[mois -1] && mois == 12){
					jour = 1;
					mois = 1;
					annee++;
				}
			else {
					jour++;
				}
			
			}
System.out.print("Voici votre date : " + jour + "/" + mois + "/" + annee);;
    //Ferme le scanner
    sc.close();
	}
}
