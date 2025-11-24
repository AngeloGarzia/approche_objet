package entites2;

public class Cercle implements ObjetGeometrique{
private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return rayon*2+Math.PI;
    }

    @Override
    public double surface() {
        return rayon*rayon*Math.PI;
    }
}
