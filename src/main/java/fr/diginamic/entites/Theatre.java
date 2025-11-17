package fr.diginamic.entites;

public class Theatre {
    private String nomTheatre;
    private int capaciteTheatre;
    private int totalClientInscrit;
    private double recetteTotal;



    public void inscrire(int nombreInscrit, double prixPlace)   {

            if ((nombreInscrit+totalClientInscrit)>capaciteTheatre)    {
                // theatre plein
                System.out.println("Theatre complet vous pouvez reserver maximum "+
                        (capaciteTheatre-totalClientInscrit)+" places");                                                        }
            else                                                        {

                totalClientInscrit+=nombreInscrit;
                recetteTotal=(totalClientInscrit*prixPlace);
                                                                        }



                                                                }


//  Constructeur
    public Theatre(String nomTheatre, int capaciteTheatre, int totalClientInscrit, double recetteTotal) {
        this.nomTheatre = nomTheatre;
        this.capaciteTheatre = capaciteTheatre;
        this.totalClientInscrit = totalClientInscrit;
        this.recetteTotal = recetteTotal;
    }
    public int getTotalClientInscrit() {
        return totalClientInscrit;
    }

    public double getRecetteTotal() {
        return recetteTotal;
    }
}
