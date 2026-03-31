package K_Interfaces.Comparable.Model;

public class Produto implements Comparable<Produto>{
    private String nome;
    private Double price;

    public Produto(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Produto o) {
        return price.compareTo(o.getPrice());
    }

    @Override
    public String toString() {
        return "Produto:\n" + nome + '\'' +
                "Preco: " + price;
    }
}
