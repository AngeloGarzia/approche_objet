package fr.diginamic.combat;

public class Gobelin extends Creature {

//constructeur de gobelins
    public Gobelin()   {
        this.forceCreature =5+randCreature.nextInt(6);
       this.pointSanteCreature=10+randCreature.nextInt(6);

                    }
//

    @Override
    public String getNomCreature() {
        return "Gobelin";
    }
}
