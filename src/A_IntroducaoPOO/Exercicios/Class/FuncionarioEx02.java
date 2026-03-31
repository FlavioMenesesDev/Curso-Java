package A_IntroducaoPOO.Exercicios.Class;

import A_IntroducaoPOO.Exercicios.Application.Funcionario02;

import java.util.Scanner;

public class FuncionarioEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario02 funcionario = new Funcionario02();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        funcionario.tax = sc.nextDouble();

        System.out.println(funcionario);
        System.out.print("Qual porcentagem de aumento? ");
        funcionario.incremento = sc.nextDouble();

        funcionario.incrementoSalario();
        System.out.println("Atualizado:" + funcionario);

        sc.close();
    }
}
