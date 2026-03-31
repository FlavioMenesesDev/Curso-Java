package J_Arquivos.Entities;

public class ProdutoExercicio {
    private String nome;
    private Double preco;
    private Integer qnt;

    public ProdutoExercicio() { }

    public ProdutoExercicio(String nome, Double preco, Integer qnt) {
        this.nome = nome;
        this.preco = preco;
        this.qnt = qnt;
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

    public Integer getQnt() {
        return qnt;
    }

    public void setQnt(Integer qnt) {
        this.qnt = qnt;
    }

    public Double total (){
        return preco * qnt;
    }


}
