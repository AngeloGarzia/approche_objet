package fr.diginamic.chaines;
import fr.diginamic.entites.Salarie;
public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5;";
//  Affichage du premeier caratere de la chaine

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        System.out.println("La chaine mesure "+chaine.length()+" carateres");


        System.out.println("Le premier caractaire ; se trouve a l'index:"+ chaine.indexOf(';') );

        System.out.println("Nom de famille:"+chaine.substring(0,6));

 //     extraire le nom de famille jusqu'au premier ;
        int i= chaine.indexOf(';'); //index de fin de premiere chaine extraite (;)
        int y= chaine.indexOf(';',i+1); //index de fin de deuxieme chaine extraite (;)
        int z= chaine.indexOf(';',y+1); //index de fin de troisieme chaine extraite (;)
        //Exctration du Nom en Majuscule
        String chaineNom=chaine.substring(0,i);
        chaineNom=chaineNom.toUpperCase();

        //Exctration du Prenom en minuscule
        String chainePrenom=chaine.substring(i+1,y);
        chainePrenom=chainePrenom.toLowerCase();

        //Exctration du salaire
        String chaineSalaire=chaine.substring(y+1,z);




        System.out.println(chaineNom+" "+chainePrenom+" gagne:"+chaineSalaire );





 //     Enlevons les espaces de la chaine salaire
        chaineSalaire=chaineSalaire.replace(" ","");

        System.out.println(chaineNom);
 //     puis transformons nomChaine en double

        double valeurSalaire=Double.parseDouble(chaineSalaire);

//      instance salarie
        Salarie monSalarie= new Salarie(chaineNom,chainePrenom,valeurSalaire) ;
        System.out.println(monSalarie.getNom()+" "+monSalarie.getPrenom()+" "+monSalarie.getSalaire());






    }





}
