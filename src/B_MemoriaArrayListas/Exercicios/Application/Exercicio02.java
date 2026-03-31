package B_MemoriaArrayListas.Exercicios.Application;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        int[] numeros = new int [n];

        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Numeros Negativos:");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0){
                System.out.println(numeros[i]);
                cont++;
            }
        }

        if (cont == 0){
            System.out.println("Nenhum negativo");
        }

        sc.close();
    }
}
