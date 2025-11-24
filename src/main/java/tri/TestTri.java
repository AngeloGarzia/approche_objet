package tri;
import fichier.Ville;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTri {
    public static void main(String[] args) {
//  Declaration des variables
        ArrayList<Ville> maVilles = new ArrayList<>();
        String nomVille;
        String departement="" ;
        String region;
        int populationTotale;

        Path monFichier = Paths.get("C:\\Users\\dell\\IdeaProjects\\approche-objet\\src\\main\\java\\fichier\\recensement.csv");
        try {
            List<String> mesLinesDeFichiers = Files.readAllLines(monFichier);
            mesLinesDeFichiers.remove(0);
            for (String uneLigne : mesLinesDeFichiers) { //la prmeiere ligne affiche les informations du fichier

                // Affichage ligne par ligne
                //extraction des champs separés par le point virgule
                //spliter les champs

                String[] tokens = uneLigne.split(";");
                departement = tokens[2].trim().replaceAll(" ", "");
                nomVille = tokens[6];
                region = tokens[1];
                populationTotale = Integer.parseInt( tokens[9].trim().replaceAll(" ", ""));

                // ajout des champs dans la arrayliste maLste

                Ville v = new Ville(nomVille, departement, region, populationTotale);
                maVilles.add(v);


            }
            Collections.sort(maVilles); //tri la liste de ville de +de 25k

            for (int i = 0; i < maVilles.size(); i++) {
                System.out.println(maVilles.get(i).getNomDeLaVille()+" "+maVilles.get(i).getPouplationTotale());
            }
                //tri



        }
     catch (
    IOException e) {
        e.printStackTrace();
    }

    }//fin de main
}
