package K_Interfaces.Default.Application;

import K_Interfaces.Default.Model.C;
import K_Interfaces.Default.Model.CarroComRadio;

public class ProgramExercicio02 {
    public static void main(String[] args) {
        CarroComRadio cr = new CarroComRadio();

        cr.sintonizar(110);
        cr.mover("Frente");
    }
}
