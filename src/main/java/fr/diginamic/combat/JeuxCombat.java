package fr.diginamic.combat;
import java.util.Random;
import java.util.Scanner;
import fr.diginamic.combat.*;
import fr.diginamic.combat.Personnage;

public class JeuxCombat {
    private static Scanner scanner = new Scanner(System.in);
    private static Personnage monPersonnage = null;
    private static Creature monEnnemi =null;




    public static void main(String[] args) {



        //Menu 2 choix

        int choix;
        boolean fini=false;
        do {

            System.out.println("Faites votre choix:1) Nouveau personnage");
            System.out.println("                   2) Lancer combat");
            System.out.println("                   3) quitter");
            choix=scanner.nextInt();
            switch (choix) {
                 case 1: monPersonnage=nouveauPersonnage(); //creeation de l'objet
                     // monPersonnage via la methode nouveaupersonnage


                     System.out.println(monPersonnage.getForcePersonnage());
                     break;

                 case 2:
                        //si mon personnage est creer et que ses point santé sont superieurs a zero
                        if (monPersonnage!=null && monPersonnage.getPointSantePersonnage()>0)   {
                            //Debut du combat
                            // tirage aleatoire d'une creature
                             Random randCreature= new Random();
                                switch (1+randCreature.nextInt(3))  {
                                    case 1:
                                        Loup monLoup=new Loup();
                                        System.out.println("Votre ennemi est un Loup avec "+monLoup.pointSanteCreature+" de points santé"+
                                                " et "+monLoup.forceCreature +" de force");
                                                monEnnemi=monLoup;
                                        tourCombat();

                                        break;
                                    case 2:
                                        Gobelin monGoblin=new Gobelin();
                                        System.out.println("Votre ennemi est un Goblin avec "+monGoblin.pointSanteCreature+" de points santé"+
                                                " et "+monGoblin.forceCreature+ " de force");
                                                monEnnemi=monGoblin;
                                        tourCombat();
                                        break;
                                    case 3:
                                        Troll monTroll=new Troll();
                                        System.out.println("Votre ennemi est un Troll avec "+monTroll.pointSanteCreature+" de points santé"+
                                                " et "+monTroll.forceCreature+" de force");
                                                monEnnemi=monTroll;
                                        tourCombat();
                                        break;



                                }



                                                                                                }
                        else        {
                            System.out.println("Veuillez en creer un Personnage");
                            break;
                                    }


                case 3:     {
                    fini=true;
                    break;
                            }
                            }
            }while (!fini);
        System.out.println("Fin du jeu");





    }// fin de main
    private static void tourCombat(){
        Random randForce =new Random(1);
        int attaqueMonPersonnage= monPersonnage.getForcePersonnage()+1+randForce.nextInt(9);
        int attaqueMonEnnemi=monEnnemi.forceCreature;
        System.out.println(attaqueMonPersonnage+" "+attaqueMonEnnemi);

                                }

    private static Personnage nouveauPersonnage()   {
        //utilisation du constructeur Personnage pour creer un nouveau
        System.out.println("Creation de mon personnage");
        return new Personnage();

                                                    }

}
