package Listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> mesVilles =new ArrayList<>();

        mesVilles.add("Nice");//Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
        mesVilles.add("Carcassonne");
        mesVilles.add("narbonne");
        mesVilles.add("Lyon");
        mesVilles.add("Foix");
        mesVilles.add("pau");
        mesVilles.add("marseille");
        mesVilles.add("Tarbes");

//  Trouver la ville la plus longue

        String villeLongue="";
            for (String s:mesVilles){
                if (s.length()> villeLongue.length()){
                    villeLongue=s;
                    }
        }
        System.out.println("La ville la plus longue est:"+villeLongue);

//  Modifie chaque ville avec la premeiere lettre en majuscule

        String varVille="";
        for (int i=0 ;i<mesVilles.size();i++){
            varVille=mesVilles.get(i).substring(0,1); //extraction premiere lettre
            varVille=varVille.toUpperCase()+mesVilles.get(i).substring(1);//concatener premiere lettre en majuscule et le reste
            mesVilles.set(i,varVille);

        }
        System.out.println(mesVilles);

//  Supprimer les ville qui commence par N

        Iterator<String> iter= mesVilles.iterator();

        while (iter.hasNext()) {
            String maChaine =iter.next();
            if (maChaine.startsWith("N")) {
                iter.remove();
            }
        }
        System.out.println(mesVilles);













    }
}
