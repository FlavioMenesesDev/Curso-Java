package A_IntroducaoPOO.Application;

import A_IntroducaoPOO.Class.Estoque;

import java.util.Scanner;

public class EstoqueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int adicionar , remover;
        Estoque produto = new Estoque();

        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preco: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade Estoque: ");
        produto.qntEstoque = sc.nextInt();
        System.out.println();
        sc.nextLine();

        produto.imprimi();


       do {
           System.out.println();
           System.out.println("Escreva: Adicionar, Remover ou Nao");
           System.out.println("Deseja Alterar? ");
           produto.situacao = sc.nextLine().trim();
           if (produto.situacao .equalsIgnoreCase("Remover")){
               System.out.print("Quantos Produtos quer remover? ");
               remover = sc.nextInt();
               sc.nextLine();
               produto.saidaEstoque(remover);
           } else if (produto.situacao .equalsIgnoreCase("Adicionar")) {
               System.out.print("Quantos Produtos quer adicionar? ");
               adicionar = sc.nextInt();
               sc.nextLine();
               produto.entradaEstoque(adicionar);
           } else if (!produto.situacao.equalsIgnoreCase("nao")) {
               System.out.println("Opcao Invalida");
           }
       }while (!produto.situacao .equalsIgnoreCase("Nao"));

       sc.close();
    }
}
