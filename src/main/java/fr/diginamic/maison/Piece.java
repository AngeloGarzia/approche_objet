package fr.diginamic.maison;


public abstract  class Piece            {
    private double superficie;
    private int etage;

    //constructeur Piece
    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;

    }
//guetter de piece
    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }
//


    @Override
    public String toString() {
        return "Piece{" +
                "superficie=" + superficie +
                ", etage=" + etage +
                '}';
    }

    //  Classe fille de piece
    public static class Chambre extends Piece {
        //constructeur chambre
        public Chambre(double superficie, int etage)    {
            super(superficie, etage);
                                                        }
                                        }

        public static class Cuisine extends Piece {
            //constructeur Cuisine
            public Cuisine(double superficie, int etage) {
                super(superficie, etage);
                                                         }
                                            }

        public static class Salon extends Piece    {
            //constructeur Salon
            public Salon(double superficie, int etage) {
                super(superficie, etage);
                                                        }
                                            }

        public static class SalleDeBain extends Piece      {
            //constructeur SalleDeBain
            public SalleDeBain(double superficie, int etage) {
                super(superficie, etage);
                                                             }
                                                    }

        public static class wc extends Piece      {
            //constructeur wc
        public wc(double superficie, int etage) {
            super(superficie, etage);
                                                }
                                            }



                                        }//fin class piece

