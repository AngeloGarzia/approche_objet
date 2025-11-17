package fr.diginamic.banque.entites;

import javax.print.DocFlavor;

public class Compte {
    private String numero;
    private  double solde ;


    //constructeur pour le compte

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;

    }

    // creation d'un guetter solde
    public double getSolde() {
        return solde;
    }
    // creation d'un guetter numero
    public String getNumero() {
        return numero;

    }

    // creation d'un setter
    public void setSolde(double solde) {
        this.solde=solde;
    }


    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                '}';
    }
}
