package fr.diginamic.banque.entites;

import java.util.Arrays;

public class TestBanque {
    public static void main(String[] args) {
    Compte monCompte =new Compte("06660666",100.66);

//  affichage de mon solde

      System.out.println(monCompte.getSolde());

//  Modifier mon solde

        monCompte.setSolde(9999.3); //modifie mon solde
        System.out.println(monCompte.getSolde()+ "dans le compte "+ monCompte.getNumero());

//  Affichage de mon compte avec la methode toString

        System.out.println(monCompte.toString());


 // Compte taux

        CompteTaux pel =new CompteTaux("123456",500,3.5);

        System.out.println(pel.toString());

//  Tableau de compte
        Compte[] ArrayCompte = {monCompte,pel};
       int i;
        for (i=0 ;i<ArrayCompte.length ;i++){
            System.out.println(ArrayCompte[i].toString());
        }

















    }
}
