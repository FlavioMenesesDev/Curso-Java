package A_IntroducaoPOO.Exercicios.Class;

import A_IntroducaoPOO.Exercicios.Application.Banco05;

import java.util.Scanner;

public class BancoEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco05 p1;

        System.out.print("Numero da Conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Nome do Titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("(Sim / Nao)\nIra ser feito Deposito Inicial? ");
        String resp = sc.nextLine();

        if (resp.equalsIgnoreCase("sim")){
            System.out.print("Deposito Inicial: R$");
            double depositoInicial = sc.nextDouble();
            p1 = new Banco05(numeroConta, nome, depositoInicial);
        }else{
            p1 = new Banco05(numeroConta, nome);
        }

        System.out.println();
        System.out.println(p1);

        System.out.println();
        System.out.print("Informe o valor do Deposito: R$");
        double deposito = sc.nextDouble();
        p1.deposito(deposito);
        System.out.println("Atualizado:");
        System.out.println(p1);

        System.out.println();

        System.out.print("Informe o valor do Saque: R$");
        double saque = sc.nextDouble();
        p1.saque(saque);
        System.out.println("Atualizado:");
        System.out.println(p1);

        sc.close();
    }
}
