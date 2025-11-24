package fichier;
import  java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;


public class CreerFichier {
    public static void main(String[] args) {
        //creation d'un fichier csv

        Path cheminFichier = Paths.get("C:\\Users\\dell\\IdeaProjects\\approche-objet\\src\\main\\java\\fichier\\nouveau_fichier.csv");

        try (BufferedWriter monFichier = Files.newBufferedWriter(cheminFichier)) {
            //Première ligne comme le fichier original
            monFichier.write("ID;Region;CodeDepartement;CodeArrondissement;CodeCanton;CodeCommune;NomCommune;Population;Femmes;Hommes;");
            monFichier.newLine();

            // LECTURE DU FICHIER original et copy des 100 premiere ligne dans le nouveau fichier
            //**********************************************************************************************************
            Path monFichierOriginal = Paths.get("C:\\Users\\dell\\IdeaProjects\\approche-objet\\src\\main\\java\\fichier\\recensement.csv");

            try {
                List<String> mesLinesDeFichiers = Files.readAllLines(monFichierOriginal);// crer un lsite de de ligne separé par la virgule
                System.out.println("Infomation du fichier:");
                System.out.println(mesLinesDeFichiers.get(0));
                for (int i=1; i<101;i++) { //la prmeiere ligne affiche les informations du fichier

                    // Affichage ligne par ligne
                    String uneLigne =mesLinesDeFichiers.get(i);

                    //ajout de cette ligne dans le nouveau fichier

                    monFichier.write(uneLigne);
                    monFichier.newLine();

                }



            } catch (IOException e) {
                throw new RuntimeException(e);
            }


// Erreur de creation de fichier
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
