package A_IntroducaoPOO.Class;

public class EstoqueSobrecarga {
    public String nome;
    public double preco;
    public int qntEstoque;
    public String situacao;

    public EstoqueSobrecarga(){}

    public EstoqueSobrecarga(String nome, double preco, int qntEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qntEstoque = qntEstoque;
    }

    public EstoqueSobrecarga(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        qntEstoque = 0;
    }

    public void entradaEstoque(int adicionar){
        this.qntEstoque += adicionar;
        System.out.println();
        System.out.println("Atualizado");
        imprimi();
    }

    public void saidaEstoque(int retirar){
        this.qntEstoque -= retirar;
        System.out.println();
        System.out.println("Atualizado");
        imprimi();
    }

    public void imprimi(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Preco: R$"+this.preco);
        System.out.println("Quantidade Estoque: "+this.qntEstoque);
        System.out.println("Total Estoque: R$"+String.format("%.2f" , this.qntEstoque*this.preco));
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
