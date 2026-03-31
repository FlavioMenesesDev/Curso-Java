package C_DataHora;

import java.time.LocalDate;

public class Imutabilidade {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2004, 12, 11);

        LocalDate date2 = date.withYear(2025);
        LocalDate date3 = date.withMonth(5);
        LocalDate date4 = date.withDayOfMonth(24);
        LocalDate date5 = date.withYear(2025).withMonth(12).withDayOfMonth(31);

        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);


    }
}
