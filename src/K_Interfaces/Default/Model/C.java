package K_Interfaces.Default.Model;

public interface C extends A{

    @Override
    default String mensagem() {
        return "A";
    }
}
