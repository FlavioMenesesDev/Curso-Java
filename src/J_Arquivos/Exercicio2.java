package J_Arquivos;

import J_Arquivos.Entities.CartasExercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File path = new File("c:\\Users\\flame\\OneDrive\\Área de Trabalho\\cartas.txt");

        List<CartasExercicio2> cards = new ArrayList<>();

        System.out.printf("Qnt Cartas: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Carta #"+(i+1));
            System.out.printf("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Preco: ");
            Double price = sc.nextDouble();
            System.out.printf("Qnt: ");
            int qnt = sc.nextInt();

            cards.add(new CartasExercicio2(name, price, qnt));
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            String line = "Nome\tPreco\tQnt\tTotal";
            bw.write(line);
            bw.newLine();
            for (CartasExercicio2 i : cards){
                line = i.getName() + "\t" + i.getPrice() + "\t" + i.getQnt() + "\t" + String.format("%.2f", i.soma());
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
