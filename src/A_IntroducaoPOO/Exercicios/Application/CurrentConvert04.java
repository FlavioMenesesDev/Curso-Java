package A_IntroducaoPOO.Exercicios.Application;

public class CurrentConvert04 {
    public static double iof = 0.06;
    public double valueDolar;
    public double qntDolar;

    public String toString(){
        return "Valor em Reias: R$"+String.format("%.2f", (valueDolar * qntDolar) * iof + (valueDolar * qntDolar));
    }
}
