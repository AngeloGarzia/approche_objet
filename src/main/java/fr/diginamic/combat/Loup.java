package fr.diginamic.combat;
import java.util.Random;
import fr.diginamic.combat.Creature;
public class Loup extends Creature {

//constructeur de loup
    public Loup()   {
       this.forceCreature =3+randCreature.nextInt(6);
       this.pointSanteCreature=5+randCreature.nextInt(6);

                    }
//

    @Override
    public String getNomCreature() {
        return "Loup";
    }
}
