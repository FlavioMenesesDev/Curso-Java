package E_Enum_e_composicao.entities;

import E_Enum_e_composicao.entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer id,Date moment,  OrderStatus status) {
        this.status = status;
        this.moment = moment;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
