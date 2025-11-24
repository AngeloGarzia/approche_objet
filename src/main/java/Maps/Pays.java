package Maps;

import java.util.Objects;

public class Pays {
    private String nom;
    private int habitants;
    private String continent;
//  Constructeur
    public Pays(String nom, int habitants, String continent) {
        this.nom = nom;
        this.habitants = habitants;
        this.continent = continent;
    }

//  guetter setter


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHabitants() {
        return habitants;
    }

    public void setHabitants(int habitants) {
        this.habitants = habitants;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    // to string
    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", habitants=" + habitants +
                ", continent='" + continent + '\'' +
                '}';
    }

    //  equals et hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pays pays)) return false;
        return habitants == pays.habitants && Objects.equals(nom, pays.nom) && Objects.equals(continent, pays.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, habitants, continent);
    }
}   //fin de class

