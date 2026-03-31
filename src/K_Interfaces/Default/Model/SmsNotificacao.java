package K_Interfaces.Default.Model;

public class SmsNotificacao implements Notificavel{
    @Override
    public String enviar(String destinatario, String mensagem) {
        return "Ola " + destinatario + " " + mensagem + "SMS";
    }

    @Override
    public String urgente() {
        return Notificavel.super.urgente() + "SMS";
    }
}
