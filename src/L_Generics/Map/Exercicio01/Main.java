package L_Generics.Map.Exercicio01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\flame\\OneDrive\\Área de Trabalho\\in.txt";
        Map<String, Integer> map = new HashMap<>();
        int votos = 0;
        String key;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null){
                String[] field = line.split(",");
                key = field[0];
                if (map.containsKey(key)){
                    votos = map.get(key);
                    votos += Integer.parseInt(field[1]);

                    map.put(key, votos);
                }else{
                    votos = Integer.parseInt(field[1]);
                    map.put(key, votos);
                }
                votos = 0;
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }

        for (String j : map.keySet()){
            System.out.println(j + ": " + map.get(j));
        }
    }
}
