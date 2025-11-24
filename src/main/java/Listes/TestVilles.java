package Listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> mesVille =new ArrayList<>();

        mesVille.add(new Ville("Nice",343000));
        mesVille.add(new Ville("Narbonne",53000));
        mesVille.add(new Ville("Carcassonne ",47800));
        mesVille.add(new Ville("Lyon",484000));
        mesVille.add(new Ville("Foix",9700));
        mesVille.add(new Ville("Pau",77200));
        mesVille.add(new Ville("Marseille",850700));
        mesVille.add(new Ville("Tarbes",40600));


//  Ville la plus peuplée
        Ville VillePlusPeuple= new Ville("",0);
       for (Ville v:mesVille) {
           if (v.getNbHabitant()> VillePlusPeuple.getNbHabitant()){
               VillePlusPeuple=v;
           }

       }
        System.out.println(VillePlusPeuple);

//  Ville la moins peuplée et suppression
        Ville VilleMoinsPeuple= new Ville("",0);
        for (Ville v:mesVille) {
            if (v.getNbHabitant()< VillePlusPeuple.getNbHabitant()){
                VilleMoinsPeuple=v;

            }

        }
        mesVille.remove(VilleMoinsPeuple);
        System.out.println(mesVille+" On a supprimé "+VilleMoinsPeuple);

 //      Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules


        for (Ville v:mesVille) {
            if (v.getNbHabitant()> 100000){
                String VarVille=v.getNom().toUpperCase();
                v.setNom(VarVille);
            }


        }
        System.out.println(mesVille);



    }
}
