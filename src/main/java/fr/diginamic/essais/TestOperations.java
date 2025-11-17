package fr.diginamic.essais;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double resultat=Operations.calcul(10,10,'-');
        System.out.println(resultat);

        resultat=Operations.calcul(10,10,'+');
        System.out.println(resultat);

        resultat=Operations.calcul(10,10,'-');
        System.out.println(resultat);

        resultat=Operations.calcul(10,10,'*');
        System.out.println(resultat);

        resultat=Operations.calcul(10,10,'/');
        System.out.println(resultat);









    }
}
