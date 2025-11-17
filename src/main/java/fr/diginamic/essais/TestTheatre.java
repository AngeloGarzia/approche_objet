package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
// instance de theatre
        Theatre monTheatre =new Theatre("Le splandidie",100,10,0);

//  ajout d'une commande de billets
        monTheatre.inscrire(25,10);

        System.out.println("Il y a "+monTheatre.getTotalClientInscrit()+" inscrits pour une recette de "
                + monTheatre.getRecetteTotal()+" €");;
//  ajout d'une commande de billets
        monTheatre.inscrire(25,10);

        System.out.println("Il y a "+monTheatre.getTotalClientInscrit()+" inscrits pour une recette de "
                + monTheatre.getRecetteTotal()+" €");;
//  ajout d'une commande de billets
        monTheatre.inscrire(25,10);

        System.out.println("Il y a "+monTheatre.getTotalClientInscrit()+" inscrits pour une recette de "
                + monTheatre.getRecetteTotal()+" €");;

//  ajout d'une commande de billets
        monTheatre.inscrire(16,10);

        System.out.println("Il y a "+monTheatre.getTotalClientInscrit()+" inscrits pour une recette de "
                + monTheatre.getRecetteTotal()+" €");;


//  constructeur instance mon theatre

    }


}

