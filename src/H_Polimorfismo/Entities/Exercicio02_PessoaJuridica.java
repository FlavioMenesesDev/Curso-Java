package H_Polimorfismo.Entities;

public class Exercicio02_PessoaJuridica extends Exercicio02_Pessoa{
    private Integer qntFuncionarios;

    public Exercicio02_PessoaJuridica(String name, Double rendaAnual, Integer qntFuncionarios) {
        super(name, rendaAnual);
        this.qntFuncionarios = qntFuncionarios;
    }

    public Integer getQntFuncionarios() {
        return qntFuncionarios;
    }

    public void setQntFuncionarios(Integer qntFuncionarios) {
        this.qntFuncionarios = qntFuncionarios;
    }


    @Override
    public double calculo(){
        if (qntFuncionarios > 10){
            return getRendaAnual() * 0.14;
        }else{
            return getRendaAnual() * 0.16;
        }
    }
}
