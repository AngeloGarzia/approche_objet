package fr.diginamic.banque.entites;

public abstract class Operation {
 private String date;
 private double montant;

 // Constructeur d'Operation
    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }
//  To string operation
    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant+" " +getType()+
                '}';
    }

    public abstract String getType();


    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}


