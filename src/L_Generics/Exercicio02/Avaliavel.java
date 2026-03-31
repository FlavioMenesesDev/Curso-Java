package L_Generics.Exercicio02;

public interface Avaliavel {
    void avaliar(double nota);

    double getMediaAvaliacoes();

    default boolean recomendado(){
        return getMediaAvaliacoes() >= 4.0;
    }


}
