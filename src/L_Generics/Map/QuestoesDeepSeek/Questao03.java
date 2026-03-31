package L_Generics.Map.QuestoesDeepSeek;

import java.util.*;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Questao03_Alunos aluno = null;

        Map<Questao03_Alunos, List<Double>> notasPorAluno = new HashMap<>();

        System.out.printf("Quantos alunos? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Aluno " + (i+1));
            System.out.printf("Nome: ");
            sc.nextLine();
            aluno = new Questao03_Alunos(sc.nextLine());
            System.out.printf("Quantas notas? ");
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.println("Nota: " + (j+1)+": ");
                aluno.addNota(sc.nextDouble());
            }
            notasPorAluno.put(aluno, aluno.getNotas());
            aluno.setMedia(aluno.calcularMedia());
        }

        for (Questao03_Alunos j : notasPorAluno.keySet()){
            System.out.printf(j.toString());
        }
        sc.close();
    }
}
