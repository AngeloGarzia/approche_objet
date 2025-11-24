package Chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
    long debut = System.currentTimeMillis();
        StringBuilder monBuilder = new StringBuilder();

        for (int i = 1; i <= 100000; i++) {
            monBuilder.append(i);
        }


    long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
        long debut2 = System.currentTimeMillis();
        String chaine="" ;

        for (int i = 1; i <= 100000; i++) {
            chaine=chaine+2;
        }


        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin2- debut2));



    }

}
