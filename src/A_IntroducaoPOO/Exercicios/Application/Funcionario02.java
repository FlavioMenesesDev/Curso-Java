package A_IntroducaoPOO.Exercicios.Application;

public class Funcionario02 {
    public String nome;
    public double salarioBruto;
    public double tax;
    public double incremento;

    public double taxSalario(){
        return salarioBruto - tax;
    }

    public double incrementoSalario(){
        return salarioBruto += ((salarioBruto * incremento) / 100.0);
    }

    public String toString(){
        return "Funcionario: "+ nome +" , R$" +String.format("%.2f", taxSalario());
    }
}
