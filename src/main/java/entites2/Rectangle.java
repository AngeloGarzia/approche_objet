package entites2;

public class Rectangle implements ObjetGeometrique{
    private double longeur;
    private double largeur;


    public Rectangle(double longeur, double largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return largeur+longeur;
    }

    @Override
    public double surface() {
        return largeur*longeur;
    }
}
