package C_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Instanciação {
    public static void main(String[] args) {

        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // DateTime: Só mostra o horário
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println(localTime);

        // Local: Usa a minha data e horario
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        //Instant: Usa a data e horario GMT (Tem que ter Segundos)
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-12-31");
        LocalDateTime d05 = LocalDateTime.parse("2025-12-31T23:39");

        Instant d06 = Instant.parse("2025-12-31T23:39:59Z");
        Instant d07 = Instant.parse("2025-12-31T23:39:59-03:00");

        LocalDate d08 = LocalDate.parse("11/12/2004",format01);
        LocalDateTime d09 = LocalDateTime.parse("11/12/2004 01:30",format02);

        // .Of: Aceita receber Ano, mês ,dia, hora, minutos separadamente
        LocalDate d10 = LocalDate.of(2004, 12, 11);
        LocalDateTime d11 = LocalDateTime.of(2004, 12, 11, 11, 30, 55, 150);

        System.out.println("d01: "+d01);
        System.out.println("d02: "+d02);
        System.out.println("d03: "+d03);
        System.out.println("d04: "+d04);
        System.out.println("d05: "+d05);
        System.out.println("d06: "+d06);
        System.out.println("d07: "+d07);
        System.out.println("d08: "+d08);
        System.out.println("d09: "+d09);
        System.out.println("d10: "+d10);
        System.out.println("d11: "+d11);
    }
}
