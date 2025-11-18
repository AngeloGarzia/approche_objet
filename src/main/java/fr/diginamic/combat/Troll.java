package fr.diginamic.combat;

public class Troll extends Creature {

//constructeur de Trolls
    public Troll()   {
        this.forceCreature =10+randCreature.nextInt(6);
       this.pointSanteCreature=20+randCreature.nextInt(6);

                    }
//

    @Override
    public String getNomCreature() {
        return "Troll";
    }
}
