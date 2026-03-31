package A_IntroducaoPOO.Exercicios.Application;

public class Aluno03 {
    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public String toString(){
        double media = n1 + n2 + n3;
        if (media >= 60){
            String result = "PASS";
            return "Final Grade = " + media+"\n"+result;
        }else{
            String result = "Failed";
            double falta = 60 - media;
            return "Final Grade = " + media+"\n"+result+"\nMissing "+falta+" Points";
        }

    }
}
