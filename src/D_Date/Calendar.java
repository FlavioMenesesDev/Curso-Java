package D_Date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Calendar {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2026-01-05T17:27:10Z"));

        System.out.println(d);

        java.util.Calendar cal = java.util.Calendar.getInstance();

        cal.setTime(d);
        cal.add(java.util.Calendar.HOUR_OF_DAY, 12);
        d = cal.getTime();

        System.out.println(d);

        // Pegando Hora, Minutos, Segundos e etc...

        cal.setTime(d);
        int minute = cal.get(java.util.Calendar.MINUTE);
        int hora = cal.get(java.util.Calendar.HOUR_OF_DAY);
        int second = cal.get(java.util.Calendar.SECOND);

        System.out.println("Hora: "+hora);
        System.out.println("Minutos: "+minute);
        System.out.println("Segundos: "+second);


    }
}
