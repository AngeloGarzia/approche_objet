package fr.diginamic.entites;

public class Salarie {
    private String nom;
    private String prenom;
    private double salaire;
//  Constructeur de Salarie
    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

// Les Guetter
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaire() {
        return salaire;
    }
//  Les setter


    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}





