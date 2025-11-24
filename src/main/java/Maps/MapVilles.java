package Maps;

import Listes.Ville;

import java.util.HashMap;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {
        Map<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Balaruc", new Ville("Balaruc", 7002));
        mapVilles.put("Lyon", new Ville("Lyon", 517000));
        mapVilles.put("Marseille", new Ville("Marseille", 861000));
        mapVilles.put("Bordeaux", new Ville("Bordeaux", 252000));

        String villeMoins="";
        int nHabitant=0;
        for (String cle: mapVilles.keySet() ){
               Ville v=mapVilles.get(cle);
            if (v.getNbHabitant()>nHabitant){
                villeMoins=cle;
            }


        }
        System.out.println("Ville la  moins peuplée :"+villeMoins );

        mapVilles.remove(villeMoins);
        for (Ville v: mapVilles.values() ){
            System.out.println(v.getNom());
        }


    }
}
