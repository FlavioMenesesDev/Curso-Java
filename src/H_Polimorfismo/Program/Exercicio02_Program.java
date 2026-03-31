package H_Polimorfismo.Program;

import H_Polimorfismo.Entities.Exercicio02_Pessoa;
import H_Polimorfismo.Entities.Exercicio02_PessoaFisica;
import H_Polimorfismo.Entities.Exercicio02_PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas Taxas? ");
        int n = sc.nextInt();

        List<Exercicio02_Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Taxa "+(i+1));
            System.out.printf("Fisica ou Juridica? (f/j): ");
            Character p = sc.next().charAt(0);
            sc.nextLine();

            System.out.printf("Nome: ");
            String name = sc.nextLine();
            System.out.printf("Renda Anual: ");
            Double rendaAnual = sc.nextDouble();

            if (p == 'f'){
                System.out.printf("Gastos Saude: ");
                Double gastosSaude = sc.nextDouble();

                pessoas.add(new Exercicio02_PessoaFisica(name, rendaAnual, gastosSaude));

            } else if (p == 'j') {
                System.out.printf("Quantidade Funcionarios: ");
                Integer qntFuncionarios = sc.nextInt();

                pessoas.add(new Exercicio02_PessoaJuridica(name, rendaAnual, qntFuncionarios));

            }else {
                System.out.println("Invalido!");
            }
        }

        System.out.println();
        System.out.println("TAXAS:");

        double sum = 0.0;
        for (Exercicio02_Pessoa p : pessoas){
            System.out.println(p.getName() + " $ " + String.format("%.2f", p.calculo()));
            sum += p.calculo();
        }

        System.out.println();
        System.out.println("TOTAL TAXAS: " + String.format("%.2f", sum));


        sc.close();
    }
}
