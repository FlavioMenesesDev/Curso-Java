package M_Expressoeõs_Lambda.Exercicios.Entities;

public class ProdutoExercicio01 {

    private String nome;
    private Double preco;

    public ProdutoExercicio01(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString (){
        return nome + ", " + String.format("%.2f", preco);
    }
}
