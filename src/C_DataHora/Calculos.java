package C_DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.now();
        LocalDateTime d05 = LocalDateTime.parse("2025-12-28T17:50:30");

        Instant d06 = Instant.parse("2025-12-28T01:30:30Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("D04: " + d04);
        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);

        System.out.println();

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("D05: " + d05);
        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);

        System.out.println();

        Instant pastWeekInstant = d06.minus(10, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(10, ChronoUnit.DAYS);

        System.out.println("D06: " + d06);
        System.out.println("pastWeekInstant: " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);

        System.out.println();

        // LocalDate precisa ser convetido para LocalDateTime
        // Opção 1: Coloca a Hora e Minuto que quero
        //Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));

        // Opção 2: Inicia a Hora e minuto com 0
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());

        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);

        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(nextWeekInstant, d06);

        System.out.println("T1: " + t1.toDays());
        System.out.println("T2: " + t2.toDays());
        System.out.println("T3: " + t3.toDays());
        System.out.println("T4: " + t4.toDays());


        LocalDate dataNascimento = LocalDate.parse("2004-12-11");
        LocalDate dataAtual = LocalDate.now();

        Duration tempoVivo = Duration.between(dataNascimento.atStartOfDay() , dataAtual.atStartOfDay());

        System.out.println();

        System.out.println("Tempo Vivo - Flávio");
        System.out.println("Dias: "+ tempoVivo.toDays());
        System.out.println("Horas: "+ tempoVivo.toHours());
        System.out.println("Minutos: "+ tempoVivo.toMinutes());

    }
}
