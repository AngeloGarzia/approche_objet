package fr.diginamic.maison;
import java.util.ArrayList;
import java.util.List;

public class Maison {
    //l'attribut de Maison est une liste de piece nommée pieceMaison
    private List<Piece> pieceDeMaison ;


    //Constructeur pour Maison

    public Maison() {

        this.pieceDeMaison = new ArrayList<>(); //nouvelle instance d' Arrayliste
                    }

    //Metode pour ajouer piece:

    public void ajouterPiece(Piece pieceMaison)   {

        if(pieceDeMaison !=null) {        //verifcation que l'objet pieceMaison n'est pas null

          pieceDeMaison.add(pieceMaison);
                                }
                                                }

    public List<Piece> getPieceDeMaison() {
        return pieceDeMaison;
    }
//  Superficie totale de la liste pieceMaison
    public double superficieTotale()    {
        double total=0;
        for (Piece pieceDeMaison: pieceDeMaison){
            total+=pieceDeMaison.getSuperficie();

                                                }
        return total;

                                        }

    //  Superficie d'un etage de liste pieceMaison
    public double superficieEtage(int numeroEtage)    {
        double total=0;
        for (Piece pieceDeMaison: pieceDeMaison){

            if (pieceDeMaison.getEtage()==numeroEtage)  {
            total+=pieceDeMaison.getSuperficie();
                                                        }

        }
        return total;

    }
//  nombre piece d'un type donné
    public int NombrePiecesParType(Class<? extends Piece> type) {
    int total = 0;
    for (Piece pieceDeMaison : pieceDeMaison) {
        if (type.isInstance(pieceDeMaison)) {
            total++;
        }
    }
    return total;
}

//  superficie  d'un type donné
    public double SuperficiereParType(Class<? extends Piece> type) {
        double total = 0;
        for (Piece pieceDeMaison : pieceDeMaison) {
            if (type.isInstance(pieceDeMaison)) {
                total+=pieceDeMaison.getSuperficie();
            }
        }
        return total;
    }



}//fin de class Maison
