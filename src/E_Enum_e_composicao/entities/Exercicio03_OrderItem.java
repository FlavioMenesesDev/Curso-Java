package E_Enum_e_composicao.entities;

public class Exercicio03_OrderItem {
    private Integer quantity;
    private Double price;

    private Exercicio03_Product product;


    public Exercicio03_OrderItem() { }

    public Exercicio03_OrderItem(Integer quantity, Double price, Exercicio03_Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Exercicio03_Product getProduct() {
        return product;
    }

    public void setProduct(Exercicio03_Product product) {
        this.product = product;
    }

    public double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
