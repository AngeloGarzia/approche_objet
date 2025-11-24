package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {

        ArrayList<Pays> paysList = new ArrayList<>();
        paysList.add(new Pays("France", 65000000, "Europe"));
        paysList.add(new Pays("Allemagne", 80000000, "Europe"));
        paysList.add(new Pays("Belgique", 10000000, "Europe"));
        paysList.add(new Pays("Russie", 150000000, "Asie"));
        paysList.add(new Pays("Chine", 1400000000, "Asie"));
        paysList.add(new Pays("Indonésie", 220000000, "Océanie"));
        paysList.add(new Pays("Australie", 20000000, "Océanie"));

        /*
        Utilisez une HashMap pour réaliser un comptage du nombre de pays par continent.
            o
            Astuce : l’idée est de créer une HashMap avec :
            ▪
            en clé une String qui va permettre de stocker le nom du continent et
            ▪
            en valeur un Integer qui va permettre de compter les pays.
         */
        HashMap<String ,Integer>compteur =new HashMap<>();
    for (int i=0 ;i<paysList.size();i++){
        Pays a = paysList.get(i);
        String conti=a.getContinent();

        Integer cmpt=compteur.get(conti); // conteur du continent

            if (cmpt==null){
                cmpt=0;
            }
            cmpt++;

            compteur.put(conti,cmpt);

    }

// affichage du resultat des compteur par continents

        System.out.println("Nombre de pays par continent :");
    for (String c: compteur.keySet()){
        System.out.println(c+" :"+compteur.get(c));
    }




    }
}
