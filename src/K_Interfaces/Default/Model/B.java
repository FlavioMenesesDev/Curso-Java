package K_Interfaces.Default.Model;

public interface B extends A{
    @Override
    default String mensagem() {
        return "B";
    }
}
