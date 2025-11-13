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

    System.out.println(pers1.nom+" "+pers2.nom);


    }

}