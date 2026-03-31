package L_Generics.Map.QuestoesDeepSeek;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Questao01 {
    public static void main(String[] args) {

        Map<String, Double> alunos = new HashMap<>();

        alunos.put("Flavio", 8.0);
        alunos.put("Meneses", 9.0);
        alunos.put("Nascimento", 8.5);

        System.out.println(alunos.containsKey("Flavio"));

        alunos.replace("Flavio", 10.0);
        System.out.println("Nota Atualizada: " + alunos.get("Flavio"));

        alunos.remove("Flavio");

        System.out.println();
        for (String j : alunos.keySet()){
            System.out.println(alunos.get(j));
        }
    }
}
