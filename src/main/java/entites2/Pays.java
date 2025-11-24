package entites2;

import java.util.Objects;

public class Pays {

    private String nom;
    private int population;

    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }


    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pays pays)) {
            return false;
        }
        return population == pays.population && Objects.equals(nom, pays.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, population);
    }
}
