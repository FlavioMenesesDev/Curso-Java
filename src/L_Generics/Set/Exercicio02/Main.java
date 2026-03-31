package L_Generics.Set.Exercicio02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Alunos> alunos = new HashSet<>();

        System.out.printf("How Many students for course A? ");
        int nA = sc.nextInt();

        for (int i = 0; i < nA; i++) {
            alunos.add(new Alunos(sc.nextInt()));
        }

        System.out.printf("How Many students for course B? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            alunos.add(new Alunos(sc.nextInt()));
        }

        System.out.printf("How Many students for course C? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            alunos.add(new Alunos(sc.nextInt()));
        }

        System.out.println("Total Students: " + alunos.size());





        sc.close();
    }
}
