package Listes;

import java.util.Objects;

public class Ville {
    private String  nom;
    private  int    nbHabitant;

    public Ville(String nom, int nbHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitant(int nbHabitant) {
        this.nbHabitant = nbHabitant;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitant=" + nbHabitant +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ville ville)) return false;
        return nbHabitant == ville.nbHabitant && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHabitant);
    }
}







