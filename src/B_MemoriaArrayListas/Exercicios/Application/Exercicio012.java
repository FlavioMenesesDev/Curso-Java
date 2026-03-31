package B_MemoriaArrayListas.Exercicios.Application;

import B_MemoriaArrayListas.Exercicios.Entities.Exercicio12;

import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos foram alugados? ");
        int n = sc.nextInt();

        if (n > 10){
            System.out.println("So temos 10 quartos!");
            return;
        }

        Exercicio12[] aluno = new Exercicio12[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Inquilino "+(i+1));
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            aluno[quarto] = new Exercicio12(nome, email, quarto);

            System.out.println();
        }

        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i] != null ){
                System.out.println(aluno[i].getQuarto()+": "+aluno[i].getNome()+", "+aluno[i].getEmail());
            }
        }



        sc.close();
    }
}


