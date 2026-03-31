package K_Interfaces.Default.Model;

public interface Notificavel {
    String enviar(String destinatario, String mensagem);

    default String urgente(){
        return "URGENTE";
    }

    default void copia(String[] destinatarios){
        for (String n : destinatarios){
            System.out.println(n + " Tem reuniao as 10h");
        }
    }
}
