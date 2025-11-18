package fr.diginamic.combat;

public abstract class Potion    {
    private String nomPotion;
    private int effetPotion;
    private int dureCombatPotion;

    public Potion (String nomPotion, int effetPotion,int dureCombatPotion){
        this.nomPotion=nomPotion;
        this.effetPotion=effetPotion;
        this.dureCombatPotion=dureCombatPotion;

                                                                            }

    public String getNomPotion() {
        return nomPotion;
    }

    public int getEffetPotion() {
        return effetPotion;
    }

    public int getDureCombatPotion() {
        return dureCombatPotion;
    }
}

