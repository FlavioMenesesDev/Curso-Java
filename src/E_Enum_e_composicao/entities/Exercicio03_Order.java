package E_Enum_e_composicao.entities;

import E_Enum_e_composicao.entities.enums.Exercicio03_OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercicio03_Order {

    private static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private Exercicio03_OrderStatus status;

    private Exercicio03_Client client;

    private List<Exercicio03_OrderItem> items = new ArrayList<>();

    public Exercicio03_Order(LocalDateTime moment, Exercicio03_OrderStatus status, Exercicio03_Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public Exercicio03_OrderStatus getStatus() {
        return status;
    }

    public void setStatus(Exercicio03_OrderStatus status) {
        this.status = status;
    }

    public Exercicio03_Client getClient() {
        return client;
    }

    public void setClient(Exercicio03_Client client) {
        this.client = client;
    }

    public void addItem (Exercicio03_OrderItem item){
        this.items.add(item);
    }

    public void removeItem (Exercicio03_OrderItem item){
        this.items.remove(item);
    }

    public double total(){
        double sum = 0;
        for (Exercicio03_OrderItem c : items){
            sum += c.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(format.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (Exercicio03_OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
