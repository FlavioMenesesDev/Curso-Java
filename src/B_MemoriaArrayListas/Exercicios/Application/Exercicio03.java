package B_MemoriaArrayListas.Exercicios.Application;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        System.out.print("Valores =");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" "+numeros[i]);
        }

        System.out.println();
        System.out.println("Soma = "+soma);

        double avg = soma / n;
        System.out.println("Media = "+avg);
    }
}
