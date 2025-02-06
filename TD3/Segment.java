package TD3;

//Segment
public class Segment{
	Point p1;
	Point p2;

	public Segment (Point p1, Point p2){
	this.p1 = p1;
	this.p2 = p2;
	}

	public Segment(float x1, float x2, float y1, float y2) {
		p1=new Point(x1,x2);
		p2=new Point(y1,y2);
	}
}
