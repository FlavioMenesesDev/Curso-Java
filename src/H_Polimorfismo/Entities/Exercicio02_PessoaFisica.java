package H_Polimorfismo.Entities;

public class Exercicio02_PessoaFisica extends Exercicio02_Pessoa{
    private Double gastosSaude;

    public Exercicio02_PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculo(){
        double tax;
        if (getRendaAnual() < 20.000){
            tax = getRendaAnual() * 0.15;
        }else{
            tax = getRendaAnual() * 0.25;
        }
        tax -= getGastosSaude() * 0.5;

        if (tax < 0){
            return 0.0;
        }else {
            return tax;
        }
    }
}
