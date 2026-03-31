package E_Enum_e_composicao.application;

import E_Enum_e_composicao.entities.Exercicio03_Client;
import E_Enum_e_composicao.entities.Exercicio03_Order;
import E_Enum_e_composicao.entities.Exercicio03_OrderItem;
import E_Enum_e_composicao.entities.Exercicio03_Product;
import E_Enum_e_composicao.entities.enums.Exercicio03_OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio03_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date: ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), format);

        Exercicio03_Client client = new Exercicio03_Client(name, email, birthDate);

        System.out.println();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        Exercicio03_OrderStatus status = Exercicio03_OrderStatus.valueOf(sc.nextLine());

        System.out.println();
        System.out.print("Quantity Product: ");
        int qntProduct = sc.nextInt();
        sc.nextLine();

        Exercicio03_Order order = new Exercicio03_Order(LocalDateTime.now(), status, client);

        for (int i = 0; i < qntProduct; i++) {
            System.out.println("Enter #"+(i+1)+" item data:");
            System.out.print("Name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Exercicio03_Product products = new Exercicio03_Product(nameProduct, price);
            Exercicio03_OrderItem orderItems = new Exercicio03_OrderItem(quantity, price, products);

            order.addItem(orderItems);
        }
        System.out.println();
        System.out.println(order);
        sc.close();
    }
}
