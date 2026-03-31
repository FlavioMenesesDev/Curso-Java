package A_IntroducaoPOO.Exercicios.Application;

import A_IntroducaoPOO.Exercicios.Class.RetanguloEx01;

import java.util.Scanner;

public class Retangulo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RetanguloEx01 ret = new RetanguloEx01();

        System.out.println("Altura e Largura do Retangulo:");
        ret.altura = sc.nextDouble();
        ret.largura = sc.nextDouble();


        System.out.println("Area = "+ret.CalculoArea());
        System.out.println("Perimetro = "+ret.CalculoPerimetro());
        System.out.println("Diagonal = "+ret.CalculoDiagonal());
        sc.close();

    }
}
