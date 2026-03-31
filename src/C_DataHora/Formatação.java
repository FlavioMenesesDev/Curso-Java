package C_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatação {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.now();
        LocalDateTime d05 = LocalDateTime.parse("2025-12-28T17:50:30");

        Instant d06 = Instant.parse("2025-12-28T17:50:30Z");

        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Para Usar no Instant (Data Global) Precisa colocar o fuso horario
        DateTimeFormatter format03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d04 = "+d04.format(format01));
        System.out.println("d04 = "+format01.format(d04));
        System.out.println("d04 = "+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println();

        System.out.println("d05 = "+ d05.format(format01));
        System.out.println("d05 = "+ d05.format(format02) + " Horario GMT (Londres)");
        System.out.println("d06 = "+format03.format(d06) + " Horario Brasil");




    }
}
