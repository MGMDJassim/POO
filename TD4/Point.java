package TD4;

public class Point{
    private double abs;
    private double ord;
    String name;

    Point origine = new Point(0,0,"o");

    public Point(double x, double y, String n){
        abs = x;
        ord = y;
        name = n;
    }

 

    public double getX(){
            return abs - origine.abs;
    }

    public double getY(){
            return ord - origine.ord;
    }

    public boolean pegX(Point p){
        return abs<p.abs;
    }

    public boolean pegY(Point p){
        return ord<p.ord;
    }

    public void translate(double x, double y){
        abs += x;
        ord += y; 
    }

    public void symetrie (){
        abs = origine.getX()-abs;
        ord = origine.getY()-ord;
    }

    public String info(){
        return name + ": ( " + abs + ","+ ord + ")";
    }
}
