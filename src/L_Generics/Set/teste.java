package L_Generics.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class teste {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        Set<String> set2 = new LinkedHashSet<>(Arrays.asList("iPhone" , "Carro" , "Tv"));

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        Set<String> uniao = new LinkedHashSet<>(set);

        uniao.addAll(set2);

        for (String temp : uniao){
            System.out.println(temp);
        }
    }
}
