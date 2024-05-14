package br.uemg.fila;

public class FilaPrioridade<T> extends Fila<T> {

    public void enfileirarPrioridade (T elemento) {

        @SuppressWarnings("unchecked")
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for(i =0; i < this.tamanho; i++) {
            if(chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        adiciona(i, elemento);
    }
}
