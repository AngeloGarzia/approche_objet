package Dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        //date du jour avec date:
        Date dateDuJour = new Date();
        SimpleDateFormat dateModel = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormattee = dateModel.format(dateDuJour);

        System.out.println(dateFormattee);

        // Instance Date à la date du 19/05/2016 à 23:59:30
        Calendar cal = Calendar.getInstance();
        cal.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date dateSpecifique = cal.getTime();
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date : " + format2.format(dateSpecifique));

        // Instance Date système
        Date dateSysteme = new Date();
        System.out.println("Date: " + format2.format(dateSysteme));


    }
}
