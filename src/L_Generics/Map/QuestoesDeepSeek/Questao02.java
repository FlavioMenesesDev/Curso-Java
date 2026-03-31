package L_Generics.Map.QuestoesDeepSeek;

import java.util.HashMap;
import java.util.Map;

public class Questao02 {
    public static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Flavio", 21);
        pessoas.put("Keyt", 47);
        pessoas.put("Leudo", 47);

        System.out.println("\nChave");
        for (String j : pessoas.keySet()){
            System.out.println(j);
        }
        System.out.println("\nValor");
        for (String j : pessoas.keySet()){
            System.out.println(pessoas.get(j));
        }

        System.out.println("\nChave e Valor");
        for (String j : pessoas.keySet()){
            System.out.println(j +" "+ pessoas.get(j));
        }
    }
}
