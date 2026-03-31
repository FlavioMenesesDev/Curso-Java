package L_Generics.Map.QuestoesDeepSeek;

import java.util.ArrayList;
import java.util.List;

public class Questao03_Alunos {

    private String nome;
    private Double media;
    private List<Double> notas = new ArrayList<>();

    public Questao03_Alunos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void addNota(double nota){
        notas.add(nota);
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public double calcularMedia (){
        double media = 0;
        for (double j : notas){
            media += j;
        }
        return media/notas.size();
    }

    @Override
    public String toString() {
        return "\nNome:" + nome + "\nNotas=" + notas + "\nMedia: " + calcularMedia();
    }
}
