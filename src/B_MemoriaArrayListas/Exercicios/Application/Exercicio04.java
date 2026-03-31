package B_MemoriaArrayListas.Exercicios.Application;

import B_MemoriaArrayListas.Exercicios.Entities.Exercicio4;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas? ");
        int n = sc.nextInt();

        Exercicio4[] p = new Exercicio4[n];
        double alturaMedia = 0;
        int contMenores = 0;

        for (int i = 0; i < p.length; i++) {
            System.out.println("Dados da "+(i+1)+"a pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            p[i] = new Exercicio4(nome, idade, altura);

            alturaMedia += p[i].getAltura();

            if (p[i].getIdade() < 16){
                contMenores ++;
            }
        }

        alturaMedia /= n;
        System.out.println();
        System.out.println("Altura Media: "+String.format("%.2f" , alturaMedia));

        System.out.print("Pessoas com menos de 16 anos:");
        if (contMenores == 0){
            System.out.println("Nenhum menor!");
        }else{
            double media = (contMenores / (double)n) * 100.0;
            System.out.print(String.format("%.2f", media)+"%");
            System.out.println();
            for (int i = 0; i < contMenores; i++) {
                if (p[i].getIdade() < 16){
                    System.out.println(p[i].getNome());
                }
            }
        }

        sc.close();
    }
}
