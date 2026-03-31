package B_MemoriaArrayListas.Exercicios.Application;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        int[] vetA = new int[n];
        int[] vetB = new int[n];

        System.out.println("Digite os valores A:");
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores B:");
        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = sc.nextInt();
        }

        System.out.println("Vetor Resultante:");
        for (int i = 0; i < vetA.length; i++) {
            System.out.println(vetA[i] + vetB[i]);
        }
    }
}
