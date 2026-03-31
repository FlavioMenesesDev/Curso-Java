package H_Polimorfismo.Entities;

public abstract class Exercicio02_Pessoa {
    private String name;
    private Double rendaAnual;

    public Exercicio02_Pessoa(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract double calculo();
}

