package L_Generics.Set.Exercicio02;

public class Alunos {
    private Integer id;

    public Alunos(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Alunos alunos = (Alunos) o;
        return id.equals(alunos.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
