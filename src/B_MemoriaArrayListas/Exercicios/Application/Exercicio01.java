package B_MemoriaArrayListas.Exercicios.Application;

import B_MemoriaArrayListas.Exercicios.Entities.Exercicio1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos? ");
        int n = sc.nextInt();

        double soma = 0;

        Exercicio1[] produ = new Exercicio1[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preco: ");
            double price = sc.nextInt();
            produ [i] = new Exercicio1(name, price);
            soma += produ[i].getPrice();
        }

        for(int i=0 ; i<n ; i++){
            System.out.println(produ[i].getName());
            System.out.println(produ[i].getPrice());
        }

        System.out.println("Media: "+(soma/n));
    }
}
