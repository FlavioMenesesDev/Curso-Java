package K_Interfaces.Default.Model;

public class D implements B, C{

    @Override
    public String mensagem() {
        System.out.println("Eu sou o D, Filho de " + B.super.mensagem() + " e " + C.super.mensagem());
        return null;
    }
}
