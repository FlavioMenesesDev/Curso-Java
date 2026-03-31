package A_IntroducaoPOO.Exercicios.Class;

public class RetanguloEx01 {
    public double altura;
    public double largura;
    public double area;
    public double perimetro;
    public double diagonal;

    public double CalculoArea (){
        return altura * largura;
    }

    public double CalculoPerimetro () {
        return altura + largura * 2.0;
    }

    public double CalculoDiagonal (){
       return Math.sqrt(altura*altura + largura*largura);
    }
}
