package TD3;

public class Main {

	public static void main(String[] args) {
		
		Point o=new Point(0,0);
		Point pg=new Point(-1,1);
		Point pd=new Point(1,1);
		
		Cercle c1 = new Cercle(o,2);
		Cercle cd = new Cercle(pd,0.4f);
		Cercle cg = new Cercle(pg,0.4f);
		
		Segment s1 = new Segment(o,pd);
		Segment s2 = new Segment(o,pg);
		
	}

}

