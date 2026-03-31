package A_IntroducaoPOO.Application;

import A_IntroducaoPOO.Class.EstoqueSobrecarga;

import java.util.Scanner;

public class EstoqueTestSobrecarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int adicionar , remover;
        int qntEstoque;
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preco: ");
        double preco = sc.nextDouble();
        System.out.println();
        sc.nextLine();

        EstoqueSobrecarga p1 = new EstoqueSobrecarga(nome, preco);

        p1.imprimi();

        System.out.println();
        System.out.println("Para SAIR Digite: Não");
        System.out.println("Deseja Alterar? ");
        p1.situacao = sc.nextLine().trim();

        if (p1.situacao .equalsIgnoreCase("sim")){
            do {
                System.out.println();
                System.out.println("Para SAIR Digite: Sair");
                System.out.print("Deseja Adicionar ou Remover? ");
                p1.situacao = sc.nextLine().trim();
                if (p1.situacao .equalsIgnoreCase("Remover")){
                    System.out.print("Quantos Produtos quer remover? ");
                    remover = sc.nextInt();
                    sc.nextLine();
                    p1.saidaEstoque(remover);
                } else if (p1.situacao .equalsIgnoreCase("Adicionar")) {
                    System.out.print("Quantos Produtos quer adicionar? ");
                    adicionar = sc.nextInt();
                    sc.nextLine();
                    p1.entradaEstoque(adicionar);
                } else if (!p1.situacao.equalsIgnoreCase("sair")) {
                    System.out.println("Opcao Invalida");
                }
            }while (!p1.situacao .equalsIgnoreCase("sair"));
        }

       sc.close();
    }
}
