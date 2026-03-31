package M_Expressoeõs_Lambda.Exercicios.Application;

import M_Expressoeõs_Lambda.Exercicios.Entities.ProdutoExercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Caminho do Arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<ProdutoExercicio01> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] field = line.split(",");
                list.add(new ProdutoExercicio01(field[0], Double.parseDouble(field[1])));
                line = br.readLine();
            }

            Double precoMedio = list.stream().mapToDouble(ProdutoExercicio01::getPreco).average().orElse(0.0);
            System.out.println("Preco Medio: " + String.format("%.2f", precoMedio));

            List<String> inferiores = list.stream().filter(p -> p.getPreco() < precoMedio)
                    .map(p -> p.getNome()).sorted(Comparator.reverseOrder()).toList();

            inferiores.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        sc.close();
    }
}
