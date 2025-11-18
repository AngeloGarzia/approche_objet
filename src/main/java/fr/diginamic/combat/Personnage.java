package fr.diginamic.combat;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Personnage {
    private int forcePersonnage; // force entre 12 et 18
    private int pointSantePersonnage; // santé entre 20 et 50
    private int scorePersonnage;    //  score
    private int bonusPersonnage;
    private int tourBonusPersonnage;
    private List<Potion> possedePotion; //Liste des potions disponibles
    private  Random randPersonnage= new Random();


//  constructeur de personnage




//  guetter setter
    public int getForcePersonnage() {
        return forcePersonnage;
    }

    public int getPointSantePersonnage() {
        return pointSantePersonnage;
    }

    public int getScorePersonnage() {
        return scorePersonnage;
    }

    public int getBonusPersonnage() {
        return bonusPersonnage;
    }

    public int getTourBonusPersonnage() {
        return tourBonusPersonnage;
    }

    public List<Potion> getPossedePotion() {
        return possedePotion;
    }

    public Random getRandPersonnage() {
        return randPersonnage;
    }

    public  Personnage ()  {

        this.forcePersonnage = 12+randPersonnage.nextInt(7);// forece de 12 a 18

        this.pointSantePersonnage = 20+randPersonnage.nextInt(31); // sante de 20 a 50

        this.scorePersonnage = 0;


        //Initialisation des potions
        this.possedePotion = new ArrayList<>(); // nouvelle liste

        this.possedePotion.add(new Potion("PotionSoin",
                5+randPersonnage.nextInt(6),0) {
        });

        this.possedePotion.add(new Potion("attaquefaible",
                3,1) {
        });

        this.possedePotion.add(new Potion("attaquefort",
                5,2) {
        });






    }// fin de class personnage



//

}


