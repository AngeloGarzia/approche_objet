package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    private double taux;

    //constructeur

    public CompteTaux(String numero, double solde, double taux) {
        super(numero, solde); //attribut mere
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "compteTaux{" +
                "taux=" + taux +"%" +" pour le compte n°"+getNumero()+ " solde "+getSolde()+                '}';
    }
}