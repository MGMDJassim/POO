package TD4;

public class Rectangle {
    Point ext1;
    Point ext2;
    String name;

    public Rectangle(Point x, Point y){
        ext1 = x;
        ext2 = y;
        name = x.name + y.name;
    }

		//une façon de le faire

    public double getPPAbs(){
        if(ext1.pegX(ext2)){
            return ext1.getX();
        }
        else{
            return ext2.getX();
        }
    }

    public double getPGAbs(){
        if(ext1.pegX(ext2)){
            return ext2.getX();
        }
        else{
            return ext1.getX();
        }
    }
    public double getPPOrd(){
        if(ext1.pegY(ext2)){
            return ext1.getY();
        }
        else{
            return ext2.getY();
        }
    }
    public double getPGOrd(){
        if(ext1.pegY(ext2)){
            return ext2.getY();
        }
        else{
            return ext1.getY();
        }
    }

	
    public void translate(double x, double y){
        ext1.translate(x, y);
        ext2.translate(x, y);
    }


    public void symetrie(){
        ext1.symetrie();
        ext2.symetrie();
    }

    public double surface(){
        return ((getPGOrd() - getPPOrd()) * (getPGAbs()-getPPAbs()));
    }

    public String info(){
        return name + "[" + ext1.info() + "," + ext2.info() + "]" ;
    }

}
