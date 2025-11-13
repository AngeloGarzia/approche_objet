package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;


    //constructeur
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                '}';
    }

    public void afficher() {
        System.out.println(nom.toUpperCase() + " " +prenom);
    }

    public void modifierNom(String varnom) {
         this.nom=varnom;
    }
//Dans la classe Personne, ajoutez une méthode void qui prend en paramètre un String
//et permet de modifier la variable d’instance nom de Personne.

    public void modifierPrenom(String varprenom) {
        this.prenom=varprenom;

    }
    public void modifierAdresse(AdressePostale varadr) {
        this.adresse=varadr;




    }


}
