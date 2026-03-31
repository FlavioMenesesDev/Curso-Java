package B_MemoriaArrayListas.Exercicios.Application;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        double[] vet = new double[n];
        double media = 0;
        double cont = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite: ");
            vet[i] = sc.nextDouble();
            media += vet[i];
        }

        media /= n;

        System.out.println();
        System.out.println("Media do Vetor = "+String.format("%.3f" , media));
        System.out.println("Elementos Abaixo da media:");

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media){
                System.out.println(vet[i]);
                cont++;
            }
        }

        if (cont == 0){
            System.out.println("Nenhum abaixo da media");
        }

        sc.close();
    }
}
