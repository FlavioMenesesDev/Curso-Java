package H_Polimorfismo.Program;

import H_Polimorfismo.Entities.ImportedProduct;
import H_Polimorfismo.Entities.Product;
import H_Polimorfismo.Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> product = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #"+(i+1)+" data:");
            System.out.print("commom, usedo or imported (c/u/i)? ");
            Character c = sc.next().charAt(0);
            sc.nextLine();

            if (c == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                Double customsfee = sc.nextDouble();

                product.add(new ImportedProduct(name, price, customsfee));

            } else if (c == 'u') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manufacture date: ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), format);

                product.add(new UsedProduct(name, price, manufactureDate));

            }else{
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();

                product.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product j : product) System.out.println(j.priceTag());

        sc.close();
    }
}
