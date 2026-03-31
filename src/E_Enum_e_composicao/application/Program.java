package E_Enum_e_composicao.application;

import E_Enum_e_composicao.entities.Order;
import E_Enum_e_composicao.entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OrderStatus os1 = OrderStatus.valueOf("PENDING_PAYMENT");

        Order order = new Order(1080, new Date(), os1);

        System.out.println(order);
    }
}
