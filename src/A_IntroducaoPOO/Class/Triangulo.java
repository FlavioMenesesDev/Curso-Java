package A_IntroducaoPOO.Class;

public class Triangulo {
    public double a, b, c, p, area;

    public void area (){
        p = (a + b + c) / 2.0;
        this.area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void imprimi(){
        System.out.println("Area: "+String.format("%.4f" , area));
    }

}
