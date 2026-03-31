package M_Expressoeõs_Lambda.Exercicios_DeepSeek;

import K_Interfaces.Comparable.Model.Produto;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Exercicio01 {

        static class Produto {
            String nome;
            double preco;
            String categoria;
            int estoque;

            public Produto(String nome, double preco, String categoria, int estoque) {
                this.nome = nome;
                this.preco = preco;
                this.categoria = categoria;
                this.estoque = estoque;
            }

            public String getNome() { return nome; }
            public double getPreco() { return preco; }
            public String getCategoria() { return categoria; }
            public int getEstoque() { return estoque; }

            public void setNome(String nome) {
                this.nome = nome;
            }
            public void setPreco(double preco) {
                this.preco = preco;
            }
            public void setCategoria(String categoria) {
                this.categoria = categoria;
            }
            public void setEstoque(int estoque) {
                this.estoque = estoque;
            }

            @Override
            public String toString() {
                return String.format("%s - R$%.2f - %s - estoque: %d",
                        nome, preco, categoria, estoque);
            }
        }

        public static void main(String[] args) {
            // Lista base para os exercícios
            List<Produto> produtos = Arrays.asList(
                    new Produto("Notebook", 3500.00, "Eletrônicos", 10),
                    new Produto("Mouse", 150.00, "Eletrônicos", 50),
                    new Produto("Teclado", 250.00, "Eletrônicos", 30),
                    new Produto("Cadeira", 800.00, "Móveis", 5),
                    new Produto("Mesa", 1200.00, "Móveis", 3),
                    new Produto("Monitor", 1200.00, "Eletrônicos", 8),
                    new Produto("Celular", 2000.00, "Eletrônicos", 15),
                    new Produto("Luminária", 100.00, "Móveis", 20)
            );

            // ========== EXERCÍCIOS ==========

            // EXERCÍCIO 1: PREDICATE (teste)
            System.out.println("=== EXERCÍCIO 1: PREDICATE ===");
            exercicio1(produtos);

            // EXERCÍCIO 2: CONSUMER (fazer algo)
            System.out.println("\n=== EXERCÍCIO 2: CONSUMER ===");
            exercicio2(produtos);

            // EXERCÍCIO 3: FUNCTION (transformar)
            System.out.println("\n=== EXERCÍCIO 3: FUNCTION ===");
            exercicio3(produtos);

            // EXERCÍCIO 4: STREAM + PIPELINE
            System.out.println("\n=== EXERCÍCIO 4: STREAM ===");
            exercicio4(produtos);

            // EXERCÍCIO 5: DESAFIO FINAL
            System.out.println("\n=== EXERCÍCIO 5: DESAFIO FINAL ===");
            exercicio5(produtos);
        }

        // ========== RESOLVA AQUI ==========

        static void exercicio1(List<Produto> produtos) {
           Predicate<Produto> caro = p -> p.getPreco() > 1000;
           Predicate<Produto> estoqueBaixo = p -> p.getEstoque() < 5;

           produtos.stream().filter(caro).filter(estoqueBaixo).forEach(System.out::println);

           Predicate<Produto> categoria = p -> p.getCategoria().equals("Eletrônicos");

           int contCategoria = (int)produtos.stream().filter(categoria).filter(p -> p.getPreco() < 500).count();

           System.out.println("Categoria Eletrônicos e menor que 500: " + contCategoria);
        }

        static void exercicio2(List<Produto> produtos) {
            Consumer<Produto> imprime = p -> System.out.println("Produto: " + p.getNome() + " | Preço: R$" + p.getPreco());
            Consumer<Produto> desconto15 = p -> p.setPreco(p.getPreco() * 0.85);

            produtos.forEach(imprime);

            List<Produto> descontados = produtos.stream().filter(p -> p.getCategoria().equals("Móveis")).toList();
            descontados.forEach(desconto15);
            descontados.forEach(imprime);

            Consumer<Produto> estoque = p -> {
                if (p.getEstoque() < 10){
                    p.setEstoque(p.getEstoque() + 10);
                }
            };

            produtos.forEach(estoque);
        }

        static void exercicio3(List<Produto> produtos) {
            Function<Produto, String> nomeUpper = p -> p.getNome().toUpperCase();
            Function<Produto, Double> imposto = p -> p.getPreco() * 1.25;
            Function<Produto, String> formato = p -> p.getNome() + " - " + p.getCategoria();

            List<String> nomeMaiusculo = produtos.stream().map(nomeUpper).toList();
            List<Double> precoImposto = produtos.stream().map(imposto).toList();
            List<String> nomeFormatado = produtos.stream().map(formato).toList();

        }

        static void exercicio4(List<Produto> produtos) {
            List<String> filtro1 = produtos.stream().filter(p -> p.getCategoria().equals("Eletrônicos")).filter(p -> p.getPreco() > 500)
                    .map(p -> p.getNome()).sorted().toList();

            List<String> filtro2 = produtos.stream()
                    .filter(p -> p.getEstoque() > 10)
                    .map(p -> {
                        p.setPreco(p.getPreco() * 0.95);
                        return p;
                    })
                    .map(p -> p.getNome().toUpperCase()).toList();

            List<Produto> filtro3 = produtos.stream().sorted(Comparator.comparing(Produto::getPreco)).limit(3).toList();

            Double precoMedioEletronicos = produtos.stream().filter(p -> p.getCategoria().equals("Eletrônicos")).mapToDouble(Produto::getPreco).average().orElse(0.0);
            Double precoMedioMoveis = produtos.stream().filter(p -> p.getCategoria().equals("Móveis")).mapToDouble(Produto::getPreco).average().orElse(0.0);

            Integer estoqueMoveis = produtos.stream().filter(p -> p.getCategoria().equals("Móveis")).mapToInt(Produto::getEstoque).sum();
            Integer estoqueEletronicos = produtos.stream().filter(p -> p.getCategoria().equals("Eletrônicos")).mapToInt(Produto::getEstoque).sum();

            Double valorEstoqueEletronicos = precoMedioEletronicos * estoqueEletronicos;
            Double valorEstoqueMoveis = precoMedioMoveis * estoqueMoveis;


        }
        static void exercicio5(List<Produto> produtos) {
            Map<String, List<Produto>> map = produtos.stream().collect(Collectors.groupingBy(Produto::getCategoria));

            map.forEach((categoria, lista) -> {
                System.out.println("RELATORIO " + categoria.toUpperCase() + ":");

                int quantidade = lista.size();
                System.out.println("Quantidade: " + quantidade);

                double precoMedio = lista.stream().mapToDouble(Produto::getPreco).average().orElse(0.0);
                System.out.println("Preco Medio: " + precoMedio);

                Produto maisCaro = lista.stream().max(Comparator.comparing(Produto::getPreco)).orElse(null);
                System.out.println("Produto mais caro: " + maisCaro.getNome());

                double valorEstoque = precoMedio * produtos.size();
                System.out.println("Valor Total Estoque: " + valorEstoque);
            });

            Consumer<Produto> desconto10 = p -> p.setPreco(p.getPreco() * 0.90);
            produtos.stream().filter(p -> p.getPreco() > 1000).forEach(p -> p.setPreco(p.getPreco() * 0.90));
            produtos.stream().filter(p -> p.getEstoque() < 5).forEach(p -> p.setPreco(p.getPreco() * 0.95));

            List<Produto> menorMil = produtos.stream().filter(p -> p.getPreco() < 1000).toList();

            Predicate<Produto> criterio1 = p -> p.getEstoque() > 100;
            Predicate<Produto> criterio2 = p -> p.getPreco() < 100;
            Predicate<Produto> criterio3 = p -> p.getEstoque() < 10;
            Predicate<Produto> criterio4 = p -> p.getCategoria().equals("Móveis");


            List<Produto> listaCriterio1 = utilitarioExercicio5.filtro(produtos, criterio1);
            System.out.println("Criterio 1: " + listaCriterio1);

            List<Produto> listaCriterio2 = utilitarioExercicio5.filtro(produtos, criterio2);
            System.out.println("\nCriterio 2: " + listaCriterio2);

            List<Produto> listaCriterio3 = utilitarioExercicio5.filtro(produtos, criterio3);
            System.out.println("\nCriterio 3: " + listaCriterio3);

            List<Produto> listaCriterio4 = utilitarioExercicio5.filtro(produtos, criterio4);
            System.out.println("\nCriterio 3: " + listaCriterio4);

            produtos.stream().filter(p -> p.getNome().length() > 5)
                    .sorted(Comparator.comparing(Produto::getPreco)).limit(3).
                    map(p -> p.getNome() + " - R$" + p.getPreco()).forEach(System.out::println);

        }

        public class utilitarioExercicio5{
            public static List<Produto> filtro (List<Produto> lista, Predicate<Produto> criterio){
                return lista.stream().filter(criterio).toList();
            }
        }
    }