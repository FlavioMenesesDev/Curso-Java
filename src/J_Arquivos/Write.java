package J_Arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) {
        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String patch = ("c:\\Users\\flame\\OneDrive\\Área de Trabalho\\out.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(patch))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
