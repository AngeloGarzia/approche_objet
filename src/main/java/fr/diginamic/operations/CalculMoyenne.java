package fr.diginamic.operations;


import java.util.ArrayList;
import java.util.Arrays;

public class CalculMoyenne {
 //      Decalartion de la lise dynamique array
                    ArrayList<Double> array=new ArrayList<>();




//  methode pour ajouter un element a array la taille se gere seule
        public void ajoutValeur(double valeur)  {
                    array.add(valeur);
                                                }



        public  double calcul(){
                    double moyenne=0 ;

                    for (double i: array){

                        moyenne+=i;
                                        }
                    return moyenne/array.size();

        }



                            }
