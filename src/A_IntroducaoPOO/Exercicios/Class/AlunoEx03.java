package A_IntroducaoPOO.Exercicios.Class;

import A_IntroducaoPOO.Exercicios.Application.Aluno03;

import java.util.Scanner;
public class AlunoEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno03 aluno = new Aluno03();

        System.out.print("Nome:");
        aluno.nome = sc.nextLine();
        System.out.println("Notas:");
        aluno.n1 = sc.nextDouble();
        aluno.n2 = sc.nextDouble();
        aluno.n3 = sc.nextDouble();

        System.out.println(aluno);
        sc.close();
    }
}
