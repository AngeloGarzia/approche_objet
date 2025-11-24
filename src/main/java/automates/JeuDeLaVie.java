package automates;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Thread;

import static java.lang.Thread.sleep;

public class JeuDeLaVie {

    public static void main(String[] args) throws InterruptedException{
        //Decalaration des variables
        boolean [][] montableau=new boolean[20][20]; //tableau de boleen 20 lignes par 20 colonnes
        boolean[][] secondTableau =new boolean[montableau.length][montableau[0].length]; //tableau de meme taille que monTableau
         //int tailleLigneFichier;//longueur en caratere d'une ligne du fichier rle
         int ligneTableau;
         int coloneTableau;
         int counterLigne=0;
         int couterColonne=0;
         int lTableau=0;
         int cTableau=0;

        //  ouverture du fichier rle
        String filePath = "C:\\Users\\dell\\IdeaProjects\\approche-objet\\src\\main\\java\\automates\\Structure.rle";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String ligneFichier;
            while ((ligneFichier = br.readLine()) != null && !ligneFichier.contains("!")) {
                //System.out.println("LIGNE "+counterLigne);
             //   System.out.println(ligneFichier); //affichage de controle de la ligne
            //decryptage de la ligne selon rle
                int pos = ligneFichier.indexOf('$');  // trouver la position du '$'

                String ligneATraiter = ligneFichier.substring(0, pos);  // extraire avant


            //  boucle pour decortiquer la ligne

                //   spliter  la ligne dans un tableau
                String [] cutChaine=ligneATraiter.split(" "); //tableau cutchaine avec les element de la ligne

                for (int i=0 ;i<cutChaine.length;i++){
                    //System.out.println("element de la ligne :"+i);
                    //traitement de l'element si o b ,ou nombre
                    String elementCutChaine=cutChaine[i];
                    switch (elementCutChaine){

                                case "o":// l'elemnt est un o il faut ajouter une celulle vivante
                                    lTableau=counterLigne;
                                    montableau[lTableau][cTableau]=true;
                                   // System.out.println("ligne tableau:"+lTableau+" colone tableau "+cTableau);
                                     cTableau++;
                                break;


                                case "b"://ajouter une cellule morte
                                    lTableau=counterLigne;
                                    montableau[lTableau][cTableau]=false;
                                   // System.out.println("ligne tableau:"+lTableau+" colone tableau "+cTableau);
                                    cTableau++;
                                break;

                                default:
                                    if (elementCutChaine.indexOf('o') != -1){// si on trouve un o dans l'element
                                        elementCutChaine=elementCutChaine.substring(0,elementCutChaine.indexOf('o'));
                                        //recupere la chaine avant 'o'
                                        //on a a desormais le nombre "Y" de b a implanter dans la table

                                        int y=Integer.parseInt(elementCutChaine.trim());
                                      ;

                                        //faire la boucle pour implementer y fois une cellule vivante dans le tableau
                                        int z;
                                        for (z=0;z<y;z++){
                                            lTableau=counterLigne;
                                            montableau[lTableau][cTableau]=true;
                                         //   System.out.println("ligne tableau:"+lTableau+" colone tableau "+cTableau);
                                            cTableau++;

                                        }



                                    }
                                    if (elementCutChaine.indexOf('b') != -1){// si on trouve un b dans l'element
                                        elementCutChaine=elementCutChaine.substring(0,elementCutChaine.indexOf('b'));
                                        //recupere la chaine avant 'b'
                                        //on a a desormais le nombre "Y" de b a implanter dans la table
                                        int y=Integer.parseInt(elementCutChaine);

                                        //faire la boucle pour implementer y fois une cellule morte dans le tableau
                                        int z;
                                        for (z=0;z<y;z++){
                                            lTableau=counterLigne;
                                            montableau[lTableau][cTableau]=false;
                                       //     System.out.println("ligne tableau:"+lTableau+" colone tableau "+cTableau);
                                            cTableau++;


                                        }



                                    }

                        }
//


                }

                counterLigne++;
                cTableau=0;
               // System.out.println("ligne "+counterLigne);

       }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

        //affichage generation actuelle
        afficherTableau2D(montableau);
        sleep(200);
        for (int generation=0 ;generation<10000;generation++){

        //  calacul la nouvelle generation
            nouvelleGeneration(montableau,secondTableau);
        //affichage nouvelle generation
            afficherTableau2D(secondTableau);
            sleep(200);
        //copie le tableau ssecondtableau dans mon tableau
            transfereTableau2D(secondTableau,montableau);
        }


    }
    //fin de main

/*  *******************************************************************************************************************
    ********************methode d'affichage d'un tbleau 2d dans la console*********************************************
    * *****************************************************************************************************************
*/
    public static void afficherTableau2D(boolean[][] tableau) {
     effacerConsole();
        System.out.println("**********************");
     for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {

                if (tableau[i][j]==true)  {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.println(); // saute à la ligne après chaque ligne du tableau
        }

    }   //fin de la methode afficherTAbleau2d

/*  *******************************************************************************************************************
    ***************************cette metode copie le tableau A vers le tableau B
 */
    public static void transfereTableau2D(boolean tableauA[][],boolean tableauB[][]){
    //cette methode copie le tableau A vers le B quelque soit la taille
        for (int i = 0; i < tableauA.length; i++) {
            for (int j = 0; j < tableauA[i].length; j++) {
            tableauB[i][j] = tableauA[i][j];
        }
    }

}// ***************************fin de transfereTableau*****************************************************************

/*  **********************************methode nouvelle generation************************************

***********************************************************************************************************************

 */
    public static void  nouvelleGeneration(boolean tableauA[][],boolean tableauB[][]){
        // tableau A generation actuelle , tableau B nouvelle generation
        //regle de mort et de naissance

        // creation d'un deuxieme tableau pour la generation d'apres

        int adjacenteMivante=0;
        int adjacenteMorte=0;
        //traitement  ligne une par une
        for( int i=0 ;i<tableauA.length;i++){

            //traitement des colonnes une par une
            for (int j=0 ;j<tableauA[0].length;j++ ){

                // le tableau est positionné sur la colonne j a la ligne i

                //1 iere celulle adjacente
                int x=i-1;
                int  y=j-1;
                if (Methode.testVariables(x,y)){
                    if (tableauA[x][y]==true){
                        adjacenteMivante++;
                    }
                    else {
                        adjacenteMorte++;
                    }
                }


                //2iem
                x=i-1;
                y=j;
                if (Methode.testVariables(x,y)){
                    if (tableauA[x][y]==true){
                        adjacenteMivante++;
                    }
                    else {
                        adjacenteMorte++;
                    }
                }
                //3ieme
                x=i-1;
                y=j+1;
                if (Methode.testVariables(x,y)){
                    if (tableauA[x][y]==true){
                        adjacenteMivante++;
                    }
                    else {
                        adjacenteMorte++;
                    }
                }
                //4ieme
                x=i;
                y=j-1;
                if (Methode.testVariables(x,y)){
                    if (tableauA[x][y]==true){
                        adjacenteMivante++;
                    }
                    else {
                        adjacenteMorte++;
                    }
                }
                // 5iemme
                x=i;
                y=j+1;
                if (Methode.testVariables(x,y)){
                    if (tableauA[x][y]==true){
                        adjacenteMivante++;
                    }
                    else {
                        adjacenteMorte++;
                    }
                }
                //6ieme
                x=i+1;
                y=j-1;
                if (Methode.testVariables(x,y)){
                    if (tableauA[x][y]==true){
                        adjacenteMivante++;
                    }
                    else {
                        adjacenteMorte++;
                    }
                }
                //7ieme
                x=i+1;
                y=j;
                if (Methode.testVariables(x,y)){
                    if (tableauA[x][y]==true){
                        adjacenteMivante++;
                    }
                    else {
                        adjacenteMorte++;
                    }
                }
                //8ieme
                x=i+1;
                y=j+1;
                if (Methode.testVariables(x,y)){
                    if (tableauA[x][y]==true){
                        adjacenteMivante++;
                    }
                    else {
                        adjacenteMorte++;
                    }
                }
                //  System.out.println("Celulle vivante="+adjacenteMivante+" celulle morte="+adjacenteMorte);
                // traitement de la celulle a la prochaine generation
                //cas d'une celulle vivante
                if (tableauA[i][j]==true){//cellule vivante
                    if (adjacenteMivante==2 ||adjacenteMivante==3){
                        tableauB[i][j]=true; //elle survie a la prochaine generation
                    }
                    if (adjacenteMivante<2 || adjacenteMivante>3){
                        tableauB[i][j]=false; //elle meurt a la prochaine generation
                    }
                }
                //cas d'une cellule morte

                if (tableauA[i][j]==false){//cellule morte
                    if (adjacenteMivante==3){
                        tableauB[i][j]=true; //elle revie a la prochaine generation
                    }
                    else {
                       tableauB[i][j]=false; //elle reste morte a la prochaine generation
                    }
                }

                adjacenteMorte=0;
                adjacenteMivante=0;




            }


        }

    }//******************************fin de methode nouvelle generation
//  *************************************methode d'effacement de la console****************************************
    static void effacerConsole() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
    //*********************************fin de la methode d'effacement


}   //fin de class principale
