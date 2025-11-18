package fr.diginamic.combat;
import java.util.Random;
public abstract class Creature {
    protected String nomCreature;
    protected int forceCreature;
    protected int pointSanteCreature;
    protected int pointScoreCreature;
    protected Random randCreature =new Random();



    public String getNomCreature() {
        return nomCreature;
    }
//


}

