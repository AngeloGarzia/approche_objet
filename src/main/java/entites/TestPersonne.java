package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        AdressePostale adr1 =new AdressePostale(5,"impasse des grenadier",
                34540,"balaruc");

        AdressePostale adr2 =new AdressePostale(10,"rue tiers",
                34000,"Montpellier");


        Personne pers1 = new Personne("tatrtenpion","serge",adr1 );



        Personne pers2 = new Personne("tarte","paule",adr2);


        pers1.afficher();
        pers2.modifierNom("Dupond");
        pers2.afficher();


        System.out.println(pers2.nom);
        System.out.println(pers2.prenom);
        System.out.println(pers2.adresse);
        pers2.modifierAdresse(adr1);



            }

}