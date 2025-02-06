package TD4;
public class Main {
    public static void main(String[] args) {
		Point a=new Point(3,4,"a");
		Point b=new Point(4,2,"b");
		Point c=new Point(-4,2,"c");
		Point d=new Point(4,-4,"d");
		Point e=new Point(-1,1,"e");
		Point f=new Point(1,-4,"f");
		Point g=new Point(2,-1,"g");
		Point h=new Point(3,-2,"h");
		Point i=new Point(-3,-1,"i");
		Point j=new Point(-2,-2,"j");
		
		Dessin dess = new Dessin();
		dess.ajout(new Rectangle(a,b));
		dess.ajout(new Rectangle(c,d));
		dess.ajout(new Rectangle(e,f));
		dess.ajout(new Rectangle(g,h));
		dess.ajout(new Rectangle(i,j));
		//dess.affiche();
		System.out.println(dess.surface());
		}
}