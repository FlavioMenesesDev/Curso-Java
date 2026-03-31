package L_Generics.Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T>{
        private List<T> itens = new ArrayList<>();
        private Integer capacidadeMaxima;

    public Repositorio(Integer capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void adicionar(T item) {
        if (itens.size() >= capacidadeMaxima) {
            throw new IllegalStateException("Repositório cheio! Capacidade máxima: " + capacidadeMaxima);
        }
        itens.add(item);
    }

    public T remover (int indice){
        if (indice < 0 || indice > capacidadeMaxima){
            throw new IndexOutOfBoundsException("Indice Invalido" + indice);
        }
        T temp = itens.get(indice);
        itens.remove(indice);
        return temp;
    }

    public T buscar (int indice){
        if (indice < 0 || indice >= itens.size()){
            throw new IndexOutOfBoundsException("Indice Invalido" + indice);
        }
        return itens.get(indice);
    }

    public List<T> listarTodos(){
        return itens;
    }

    public int tamanho(){
        return itens.size();
    }

    public boolean estaVazio(){
        return itens.isEmpty();
    }

    public boolean estaCheio(){
        return itens.size() == capacidadeMaxima;
    }
}
