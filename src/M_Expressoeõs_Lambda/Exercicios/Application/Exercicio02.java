package M_Expressoeõs_Lambda.Exercicios.Application;

import M_Expressoeõs_Lambda.Exercicios.Entities.EmployeeExercicio02;
import M_Expressoeõs_Lambda.Exercicios.Entities.ProdutoExercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Caminho do Arquivo: ");
        String path = sc.nextLine();

        System.out.printf("Salario: ");
        Double salarioBase = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<EmployeeExercicio02> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] field = line.split(",");
                list.add(new EmployeeExercicio02(Double.parseDouble(field[2]), field[1], field[0]));
                line = br.readLine();
            }

            List<String> emails = list.stream().filter(p -> p.getSalario() > 2000).map(EmployeeExercicio02::getEmail).sorted().toList();

            System.out.println("Email Salarios Maiores que 2mil:");
            emails.forEach(System.out::println);

            Double sumSalarios = list.stream().filter(p -> p.getNome().charAt(0) == 'M')
                    .mapToDouble(EmployeeExercicio02::getSalario).sum();

            System.out.println("Soma Salario Funcionario incial M: R$" + String.format("%.2f" , sumSalarios));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        sc.close();
    }
}
