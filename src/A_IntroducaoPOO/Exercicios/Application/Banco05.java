package A_IntroducaoPOO.Exercicios.Application;

public class Banco05 {
    private int numeroConta;
    private String nome;
    private double saldo;
    private double taxaSaque = 5.0;

    public double getNumeroConta(){
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public Banco05(int numeroConta, String nome, double saldo){
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(saldo);
    }

    public Banco05(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public double deposito(double deposito){
        saldo += deposito;
        return saldo;
    }

    public double saque(double saque){
        saldo -= saque;
        saldo -= taxaSaque;
        return saldo;
    }

    public String toString(){
        return "Conta: "+numeroConta+
                ", Nome: "+nome+
                ", Saldo: R$"+String.format("%.2f", saldo);
    }
}
