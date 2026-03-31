package E_Enum_e_composicao.entities.enums;

public enum Exercicio01_WorkLevel {
    JUNIOR("1"),
    MID_LEVEL("2"),
    SENIOR("3");

    String n;
    Exercicio01_WorkLevel(String n){
        this.n = n;
    }

    public String getN() {
        return n;
    }

}
