package B_MemoriaArrayListas.Exercicios.Application;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int soma = 0;
        int contPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];

            if (numeros[i]%2 == 0){
                contPares += 1;
            }
        }

        if (contPares == 0){
            System.out.println();
            System.out.println("Nao tem numero par!");
        }else{
            System.out.println();
            System.out.println("Numeros Pares:");
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i]%2 == 0){
                    System.out.print(numeros[i]+" ");
                }
            }
            System.out.println();
            System.out.println("Quantidade Pares: "+contPares);
        }
    }
}
