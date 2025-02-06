package TD1;
//Deuxieme methode pour inverser les arguments
public class EXO2_1 {
    public static void main(String[]args){
		if(args.length == 0){
			System.out.println("Veillez mettre deux argument !");
		}
		if(args.length == 1){
			System.out.println("Il vous manque un argument argument !");
		}
		else{
			String tmp = args[0];
			args[0] = args[1];
			args[1] = args[2];
			args[2]=tmp;
			
			System.out.println("argument 1 : " + args[0]+"\nargument 2 : " + args[1]+"\nargument 3 : " + args[2]);
		}
	}
}
