package L_Generics.Map.QuestoesDeepSeek;

import java.util.Comparator;
import java.util.Objects;

public class Questao04_Pessoas implements Comparable<Questao04_Pessoas> {

    private String nome;
    private Integer idade;

    public Questao04_Pessoas(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Questao04_Pessoas that = (Questao04_Pessoas) o;
        return Objects.equals(nome, that.nome) && Objects.equals(idade, that.idade);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(idade);
        return result;
    }

    @Override
    public String toString() {
        return "\nnome: " + nome +
                " idade=" + idade + "\n";
    }

    @Override
    public int compareTo(Questao04_Pessoas other) {
        return getIdade().compareTo(other.getIdade());
    }
}
