package Listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {

        ArrayList<Integer> maListe =new ArrayList<>();
        maListe.add(-1);
        maListe.add(5);
        maListe.add(7);
        maListe.add(3);
        maListe.add(-2);
        maListe.add(4);
        maListe.add(8);
        maListe.add(5);

        System.out.println(maListe);
        System.out.println("la taille est "+maListe.size());
        int grand= Collections.max(maListe);
        System.out.println("Le plus grand est "+grand);

        int petit=Collections.min(maListe);
        maListe.remove(Integer.valueOf(petit));

        System.out.println("On a supprimer:"+petit+" "+maListe);
//  suppression des negatifs

            for (int i=0; i<maListe.size();i++){
                if (maListe.get(i)<0){
                    int y=Math.abs(maListe.get(i));
                    maListe.set(i,y);
                }

            }
            System.out.println(maListe);


            }
}
