package fr.diginamic.essais;
import fr.diginamic.maison.*;



public class TestMaison {
    public static void main(String[] args) {

        Maison maMaison = new Maison() ;
//      Maison 3 chambres àl'etage , 1 wca chaque etage
        maMaison.ajouterPiece(new Piece.Chambre(12, 1));
        maMaison.ajouterPiece(new Piece.Chambre(18, 1));
        maMaison.ajouterPiece(new Piece.Chambre(15, 1));
        maMaison.ajouterPiece(new Piece.Salon(45, 0));
        maMaison.ajouterPiece(new Piece.Cuisine(20, 0));
        maMaison.ajouterPiece(new Piece.SalleDeBain(7, 1));
        maMaison.ajouterPiece(new Piece.wc(2, 0));
        maMaison.ajouterPiece(new Piece.wc(2, 1));

        System.out.println(maMaison.getPieceDeMaison());
        System.out.println("Superficie totale :"+maMaison.superficieTotale());
        System.out.println("Superficie de RDC :"+maMaison.superficieEtage(0));
        System.out.println("Nombre de Chambres :"+maMaison.NombrePiecesParType(Piece.Chambre.class));
        System.out.println("Superfice des Cambre: "+maMaison.SuperficiereParType(Piece.Chambre.class));

    }
}
