package Dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

// Création avec Calendar 19/05/2016 23:59:30
        Calendar cal = Calendar.getInstance();
        cal.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date dateCal = cal.getTime();
        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date : " + formatJourMoisAnnee.format(dateCal));

        // Date du jour avec Calendar
        Calendar calJour = Calendar.getInstance();
        Date dateCalJour = calJour.getTime();
        SimpleDateFormat formatDetail = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("aujourd'hui: ) : " + formatDetail.format(dateCalJour));

        //intenationnal
        Calendar calJour2 = Calendar.getInstance();
        Date dateCalJour2 = calJour.getTime();
        SimpleDateFormat formatDetail2 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINA);
        System.out.println("aujourd'hui: ) : " + formatDetail2.format(dateCalJour));



    }
}
