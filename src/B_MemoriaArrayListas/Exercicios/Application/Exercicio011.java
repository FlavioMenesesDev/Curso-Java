package B_MemoriaArrayListas.Exercicios.Application;

import B_MemoriaArrayListas.Exercicios.Entities.Exercicio11;

import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;

        System.out.print("Quantos pessoas? ");
        int n = sc.nextInt();

        Exercicio11[] p = new Exercicio11[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome, primeira e segunda nota do "+(i+1)+"o aluno:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2.0;

            p[i] = new Exercicio11(nome, nota1, nota2, media);
        }

        System.out.println();
        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < p.length; i++) {
            if (p[i].getMedia() >= 6){
                System.out.println(p[i].getNome());
                cont++;
            }
        }

        if (cont == 0){
            System.out.println("Nenhum aprovado");
        }
    }
}
