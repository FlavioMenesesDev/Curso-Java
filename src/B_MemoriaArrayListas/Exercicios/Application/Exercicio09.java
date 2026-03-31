package B_MemoriaArrayListas.Exercicios.Application;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        int[] vet = new int[n];
        double media = 0;
        double cont = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite: ");
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 0){
                media += vet[i];
                cont++;
            }
        }

        if (cont == 0){
            System.out.println("Nenhum numero par");
        }else {
            media /= cont;
            System.out.println("Media dos pares = "+String.format("%.1f" , media));
        }
    }
}
