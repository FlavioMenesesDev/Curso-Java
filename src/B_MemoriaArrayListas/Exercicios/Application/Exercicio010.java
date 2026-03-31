package B_MemoriaArrayListas.Exercicios.Application;

import B_MemoriaArrayListas.Exercicios.Entities.Exercicio10;

import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int f = 0;

        System.out.print("Quantos pessoas? ");
        int n = sc.nextInt();

        Exercicio10[] p = new Exercicio10[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da "+(i+1)+"a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            p[i] = new Exercicio10(nome, idade);

            if (p[i].getIdade() > maior){
                maior = p[i].getIdade();
                f = i;
            }
        }

        System.out.println("Pessoa mais velha: "+p[f].getNome());

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getNome());
        }
    }

}
