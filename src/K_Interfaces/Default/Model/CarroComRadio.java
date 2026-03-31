package K_Interfaces.Default.Model;

public class CarroComRadio implements Veiculo, Radio{
    @Override
    public void sintonizar(double frequencia) {
        System.out.println("Sintonizado na Radio: " + frequencia + " hz");
    }

    @Override
    public void mover(String direcao) {
        System.out.println("Movendo-se para " + direcao);
    }
}
