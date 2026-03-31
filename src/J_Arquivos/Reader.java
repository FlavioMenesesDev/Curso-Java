package J_Arquivos;

import java.io.*;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        String patch = ("c:\\Users\\flame\\OneDrive\\Área de Trabalho\\in.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(patch))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
