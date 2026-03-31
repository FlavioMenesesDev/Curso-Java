package M_Expressoeõs_Lambda.Exercicios.Entities;

public class EmployeeExercicio02 {

    private String nome;
    private String email;
    private Double salario;

    public EmployeeExercicio02(Double salario, String email, String nome) {
        this.salario = salario;
        this.email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


}
