package K_Interfaces.Default.Application;

import K_Interfaces.Default.Model.EmailNotificacao;
import K_Interfaces.Default.Model.SmsNotificacao;

public class ProgramExercicio03 {
    public static void main(String[] args) {

        String[] destinatarios = new String[]{"Flavio", "Meneses", "Nascimento"};

        EmailNotificacao en = new EmailNotificacao();
        SmsNotificacao sn = new SmsNotificacao();

        String temp = en.enviar("Flavio", "tudo certo?");
        String temp2 = sn.enviar("Meneses", "Boa noite");

        System.out.println(temp);
        System.out.println(temp2);

        System.out.println();
        en.copia(destinatarios);


    }
}
