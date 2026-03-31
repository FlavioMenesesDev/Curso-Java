package L_Generics.Exercicio02;

public enum Classificacao {
    LIVRE(0),
    DEZ(10),
    DOZE(12),
    QUATORZE(14),
    DEZESSEIS(16),
    DEZOITO(18);

    private int idade;

    Classificacao(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
