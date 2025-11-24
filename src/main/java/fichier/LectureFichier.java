package fichier;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LectureFichier {
    public static void main(String[] args) {
        //Declaration des variable
        String departement="" ;
        String ville;
        String region;
        int populationTotale;
        ArrayList<Ville> maListe =new ArrayList<>();
        ;

        Path monFichier = Paths.get("C:\\Users\\dell\\IdeaProjects\\approche-objet\\src\\main\\java\\fichier\\recensement.csv");

        try {
            List<String> mesLinesDeFichiers = Files.readAllLines(monFichier);// crer un lsite de de ligne separé par la virgule
            System.out.println("Infomation du fichier:");
            System.out.println(mesLinesDeFichiers.get(0));
            mesLinesDeFichiers.remove(0);
            for (String uneLigne:mesLinesDeFichiers) { //la prmeiere ligne affiche les informations du fichier

                // Affichage ligne par ligne
                //extraction des champs separés par le point virgule
                //spliter les champs

                String[] tokens = uneLigne.split(";");
                departement=tokens[2].trim().replaceAll(" ", "");
                ville=tokens[6];
                region=tokens[1];
                populationTotale = Integer.parseInt( tokens[9].trim().replaceAll(" ", ""));

                // ajout des champs dans la arrayliste maLste

                Ville v=new Ville(ville,departement,region,populationTotale);
                maListe.add(v);
                //System.out.println(region+" "+departement+" "+ville+" "+populationTotale);



            }
            // creation d'un fichier de sortie contenant les ville de +25k h
            Path cheminFichier = Paths.get("C:\\Users\\dell\\IdeaProjects\\approche-objet\\src\\main\\java\\fichier\\nouveau_fichier.csv");

            try (BufferedWriter monFichierVille = Files.newBufferedWriter(cheminFichier)) {
                // Écrire la ligne d'en-tête
                monFichierVille.write("Nom ;Code departement ; Nom region ; Population");
                monFichierVille.newLine();

                // Écrire quelques lignes de données

                Collections.sort(maListe); // tri croissant par population de +25 avant ceation du fichier

                for (int i=1 ;i<maListe.size();i++){
                    int tempo =maListe.get(i).getPouplationTotale(); //.replace(" ","");

                    //int y=Integer.parseInt(tempo);
                        int y=tempo;
                    if (y>25000) {
                        String tempo2=maListe.get(i).getNomDeLaVille()+";"+maListe.get(i).getCodeDepartement()+";"+
                        maListe.get(i).getNomDeLaRegion()+";"+maListe.get(i).getPouplationTotale();

                        monFichierVille.write(tempo2);

                        monFichierVille.newLine();
                        System.out.println("y="+y);
                    }
                }

                System.out.println("Fichier CSV créé avec succès !");
            } catch (IOException e) {
                e.printStackTrace();
            }









        } catch (IOException e) {
            throw new RuntimeException(e);
        }
      //  System.out.println(maListe);




    }//fin de main
}
