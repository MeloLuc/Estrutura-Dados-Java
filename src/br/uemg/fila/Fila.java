package br.uemg.fila;

import br.uemg.estruturaEstatica.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
    super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    //adiciona o elemento no final da fila
    public void enfileirar(T elemento) {
        this.adiciona(elemento);
    }

    //retorna o primeiro elemento da fila
    public T espiar() {
        return this.elementos[0];
    }

    //desinfilera o primeiro elemento da fila
    public T desenfilerar() {
        
        final int pos = 0;

        if(this.estaVazia()) {
            System.out.println("Fila vazia");
            return null;
        }
        
        T aux = elementos[pos];
        remove(pos);
        return aux;
    }
}
