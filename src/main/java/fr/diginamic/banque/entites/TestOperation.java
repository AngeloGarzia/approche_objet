package fr.diginamic.banque.entites;

import javax.naming.PartialResultException;

public class TestOperation {
    public static void main(String[] args) {
        //ceer des operations

        Debit op1 =new Debit("10/01/2025",100) ;
        Debit op2 =new Debit("13/02/2025",200) ;
        Credit op3=new Credit("25/12/2021",452);
        Credit op4=new Credit("17/02/2025",822);



//      Tableau de compte

        Operation[] Arrayop = {op1,op2,op3,op4};
        int i;
        for (i=0 ;i<Arrayop.length ;i++){
            System.out.println(Arrayop[i]);
        }
        double somme=0;
        for (i=0 ;i<Arrayop.length ;i++){
            if (Arrayop[i].getType()=="DEBIT")   {
                somme-=Arrayop[i].getMontant();
               // System.out.print(Arrayop[i].getMontant()+"-");
                                                }
            if (Arrayop[i].getType()=="CREDIT")   {
                somme+=Arrayop[i].getMontant();
                //System.out.print(Arrayop[i].getMontant()+"+");
                             }


        }
        System.out.println();
        System.out.println(somme);

    }
}