package fr.diginamic.banque.entites;

public class Debit extends Operation{

    //constructeur pour debit
    public Debit(String date, double montant) {
        super(date, montant);
    }

    public String getType(){
        return "DEBIT";
    }

}
