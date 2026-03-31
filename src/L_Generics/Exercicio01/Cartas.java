package L_Generics.Exercicio01;

public class Cartas {
    private String nome;
    private String raridade;
    private Double preco;

    public Cartas(String nome, String raridade, Double preco) {
        this.nome = nome;
        this.raridade = raridade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        String temp = "\nNome: " + nome + "\nRaridade: " + raridade + "\nPreço: " + String.format("%.2f", preco);
        return temp;
    }
}
