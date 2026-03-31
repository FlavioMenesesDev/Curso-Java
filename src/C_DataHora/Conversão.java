package C_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Conversão {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.now();
        LocalDateTime d05 = LocalDateTime.parse("2025-12-28T17:50:30");

        Instant d06 = Instant.parse("2025-12-28T01:30:30Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDateTime r5 = LocalDateTime.of(d05.getYear(), d05.getMonth(), d05.getDayOfMonth(), d05.getHour(), d05.getMinute());

        System.out.println("R1 = "+ r1);
        System.out.println("R2 = "+ r2);
        System.out.println("R3 = "+ r3);
        System.out.println("R4 = "+ r4);
        System.out.println();
        System.out.println("R5 = "+ r5);
        System.out.println("D05 = "+ d05);


    }
}
