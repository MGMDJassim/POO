package TD4;

public class Dessin {
    Rectangle [] listRec = new Rectangle[100];

    public void ajout (Rectangle r){
        Rectangle [] temp = new Rectangle[listRec.length];
        for(int i = 0; i <listRec.length; i++){
            temp[i] = listRec[i];
        }
        temp[temp.length-1]=r;
		listRec=temp;
    }

    public void translate(double x, double y){
        for(int i = 0; i<listRec.length; i++){
            listRec[i].translate(x, y);
        }
    }

    public void symetrie(){
        for(int i = 0; i<listRec.length;i++){
            listRec[i].symetrie();
        }
    }

    public double surface(){
        double ppX, pgX, ppY, pgY;
		ppX=listRec[0].getPPAbs();
		pgX=listRec[0].getPGAbs();
		ppY=listRec[0].getPPOrd();
		pgY=listRec[0].getPGOrd();
		for (int i=1; i<listRec.length;i++) {
			if (listRec[i].getPPAbs()<ppX){
				ppX=listRec[i].getPPAbs();
			}
			if (listRec[i].getPGAbs()>pgX){
				pgX=listRec[i].getPPAbs();
			}
			if (listRec[i].getPPOrd()<ppY){
				ppY=listRec[i].getPPOrd();
			}
			if (listRec[i].getPGOrd()>pgY){
				pgY=listRec[i].getPGOrd();
			}
		}
		return (pgX-ppX) * (pgY-ppY);
    }
}