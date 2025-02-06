package TD5;

// Classe Cellule
class Cellule {
    private String contenu;public Cellule(String contenu) {
        this.contenu = contenu;
    }
    
    public String getVal() {
        return contenu;
    }
    
    public void setVal(String nouveauContenu) {
        contenu = nouveauContenu;
        }
    }
