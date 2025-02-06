package TD3;

//Cercle
public class Cercle {
	Point origine;
	float rayon;
	
	
	public Cercle(Point p, float c){
		origine = p;
		rayon=c;
	}

	public Cercle(float a, float b, float c) {
		origine=new Point(a,b);
		rayon=c;
	}
}
