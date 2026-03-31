package L_Generics.Map.QuestoesDeepSeek;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Questao04 {
    public static void main(String[] args) {

        Set<Questao04_Pessoas> pessoas = new TreeSet<>();

        Questao04_Pessoas pessoa01 = new Questao04_Pessoas("Flavio", 21);
        Questao04_Pessoas pessoa02 = new Questao04_Pessoas("Meneses", 30);
        Questao04_Pessoas pessoa03 = new Questao04_Pessoas("Nascimento", 47);

        pessoas.add(pessoa01);
        pessoas.add(pessoa02);
        pessoas.add(pessoa03);

        for (Questao04_Pessoas j : pessoas) {
            System.out.printf(j.toString());
        }

        Stream<Integer> st1 = Stream.iterate(0, x -> x + 2).limit(10);

        System.out.println(Arrays.toString(st1.toArray()));
    }
}
