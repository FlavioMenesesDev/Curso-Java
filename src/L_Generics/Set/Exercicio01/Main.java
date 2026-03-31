package L_Generics.Set.Exercicio01;

import K_Interfaces.Model.Entities.Installment;

import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\flame\\OneDrive\\Área de Trabalho\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<logEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
                LocalDateTime moment = LocalDateTime.parse(fields[1], formatter);

                set.add(new logEntry(username, moment));

                line = br.readLine();
            }
            System.out.println("Total Users: " + set.size());
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
