package B_MemoriaArrayListas.Exercicios.Application;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        double maior = 0;
        int[] posicaoMaior = new int[n];
        int contMaior = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite: ");
            numeros[i] = sc.nextDouble();

            if (numeros[i] > maior){
                maior = numeros[i];
                posicaoMaior[contMaior] = i;
            }else if (numeros[i] == maior){
                contMaior += 1;
                posicaoMaior[contMaior] = i;
            }
        }

        System.out.println();
        System.out.println("Maior valor = "+maior);

        if (contMaior == 0){
            System.out.println("Posicao do maior valor = "+posicaoMaior[0]);
        }else{
            System.out.println("Posicoes dos maiores valores: ");
            for (int i = 0; i < (contMaior+1); i++) {
                System.out.print(posicaoMaior[i]+" ");
            }
        }

        sc.close();
    }
}
