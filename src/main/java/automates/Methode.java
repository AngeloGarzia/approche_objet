package automates;

public class Methode {

    // Méthode qui teste a et b et retourne vrai si a et  b sont positif et
    public static boolean testVariables(int a, int b) {
        if (a>=0 && b>=0 && a<20 && b<20){

            return true;
        }
        else {
            return false;
        }

    }
}
