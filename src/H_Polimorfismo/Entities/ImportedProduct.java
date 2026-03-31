package H_Polimorfismo.Entities;

public class ImportedProduct extends Product {
    private Double costomsFee;

    public ImportedProduct(String name, Double price, Double costomsFee) {
        super(name, price);
        this.costomsFee = costomsFee;
    }

    public Double getCostomsFree() {
        return costomsFee;
    }

    public void setCostomsFree(Double costomsFree) {
        this.costomsFee = costomsFree;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + String.format("%.2f", getPrice()) + " (Customs fee: $ " + String.format("%.2f", costomsFee) + ")";
    }
}
