package A_IntroducaoPOO.Application;

import A_IntroducaoPOO.Class.Triangulo;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        x.area();
        y.area();

        x.imprimi();
        y.imprimi();

        if (x.area > y.area){
            System.out.println("Maior: X");
        }else if (y.area > x.area){
            System.out.println("Maior: Y");
        }else{
            System.out.println("Empate");
        }

        sc.close();
    }
}
