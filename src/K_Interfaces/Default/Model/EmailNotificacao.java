package K_Interfaces.Default.Model;

public class EmailNotificacao implements Notificavel{
    @Override
    public String enviar(String destinatario, String mensagem) {
        return "Ola " + destinatario + " " + mensagem;
    }

    @Override
    public String urgente() {
        return Notificavel.super.urgente() + "Email";
    }
}
