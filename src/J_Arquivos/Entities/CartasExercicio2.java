package J_Arquivos.Entities;

public class CartasExercicio2 {
    private String name;
    private Double price;
    private Integer qnt;

    public CartasExercicio2() {
    }

    public CartasExercicio2(String name, Double price, Integer qnt) {
        this.name = name;
        this.price = price;
        this.qnt = qnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQnt() {
        return qnt;
    }

    public void setQnt(Integer qnt) {
        this.qnt = qnt;
    }

    public double soma(){
        return price * qnt;
    }
}
