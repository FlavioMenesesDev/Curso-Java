package A_IntroducaoPOO.Exercicios.Class;

import A_IntroducaoPOO.Exercicios.Application.CurrentConvert04;

import java.util.Scanner;

public class CurrentConvertEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrentConvert04 convert = new CurrentConvert04();

        System.out.print("Qual preco do Dolar? ");
        convert.valueDolar = sc.nextDouble();
        System.out.print("Quantos Dolares quer comprar? ");
        convert.qntDolar = sc.nextDouble();

        System.out.println(convert);
    }
}
