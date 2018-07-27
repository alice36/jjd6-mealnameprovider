package pl.javastart.zadaniemockito;

import java.util.Calendar;
import java.util.Date;

public class OldJavaDates {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_MONTH, 27);
        cal.set(Calendar.MONTH, Calendar.JULY);
        cal.set(Calendar.YEAR, 2018);

        Date date = cal.getTime();
        long time = date.getTime();
        System.out.println(time);

        System.out.println("Wykonanie zajęło: " + (System.nanoTime() - startTime) + " ns");
    }

}
