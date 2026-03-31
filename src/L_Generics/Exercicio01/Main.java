package L_Generics.Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Repositorio<Cartas> cartas = new Repositorio<>(10);

        System.out.print("Quantas cartas? ");
        int nCartas = sc.nextInt();

        for (int i = 0; i < nCartas; i++) {
            System.out.println();
            System.out.println("Carta " + (i+1));
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Raridade: ");
            String raridade = sc.nextLine();
            System.out.print("Preco: ");
            double preco = sc.nextDouble();

            cartas.adicionar(new Cartas(nome, raridade, preco));
        }

        System.out.println(cartas.listarTodos());
        cartas.remover(1);
        System.out.println(cartas.listarTodos());

        // Clientes
        Repositorio<Cliente> clientes = new Repositorio<>(5);

        System.out.println();
        System.out.print("Quantas clientes? ");
        int nClientes = sc.nextInt();

        for (int i = 0; i < nClientes; i++) {
            System.out.println("Cliente " + (i+1));
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("ID: ");
            int id = sc.nextInt();

            clientes.adicionar(new Cliente(nome, email, id));
        }

        System.out.println();
        if (!clientes.estaCheio()){
            System.out.println("Lista Clientes não está cheia, tem " + clientes.tamanho() + " Clientes Cadastrados");
        }else{
            System.out.println("Lista Clientes está cheia, tem " + clientes.tamanho() + " Clientes Cadastrados");
        }

        if (!clientes.estaVazio()){
            System.out.println("Lista Clientes não está vazia, tem " + clientes.tamanho() + "Clientes Cadastrados");
        }else{
            System.out.println("Lista Clientes está vazia");
        }
    }
}
