package J_Arquivos;

import J_Arquivos.Entities.ProdutoExercicio;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        List<ProdutoExercicio> produtos = new ArrayList<>();

        File sourceFile = new File("c:\\Users\\flame\\OneDrive\\Área de Trabalho\\Source.csv");

        boolean success = new File(sourceFile.getParent() + "\\out").mkdir();

        String targetFileStr = sourceFile.getParent() + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
            String itemCsv = br.readLine();
            while (itemCsv != null){
                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                Double preco = Double.parseDouble(fields[1]);
                int qnt = Integer.parseInt(fields[2]);

                produtos.add(new ProdutoExercicio(nome, preco, qnt));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for (ProdutoExercicio item : produtos){
                    bw.write(item.getNome()+","+String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " Criado com Sucesso!");
            }
            catch (IOException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
