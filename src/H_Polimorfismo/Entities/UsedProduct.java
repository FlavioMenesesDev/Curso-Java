package H_Polimorfismo.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + "(used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + manufactureDate.format(format) + ")";
    }
}
