package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
                CalculMoyenne nouveauCalacul =new CalculMoyenne();
                nouveauCalacul.ajoutValeur(10.56);
                nouveauCalacul.ajoutValeur(15.6);
                nouveauCalacul.ajoutValeur(5.13);
                nouveauCalacul.ajoutValeur(0.76);
                nouveauCalacul.ajoutValeur(1.48);
                // CALCUL DE LA MOYENNE

                double moyenne=nouveauCalacul.calcul();
        System.out.println("La moyenne des valeurs est : " + moyenne);

    }
}
