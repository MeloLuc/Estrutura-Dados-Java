package br.uemg.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    
    private int NAO_ENCOTRADO = -1;

    public void adiciona(T elemento) {

        No<T> celula = new No<>(elemento);
        if (tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;

        this.tamanho++;
    }

    public void limpa() {

        for(No<T> atual = this. inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;

    }

    public int busca(T elemento) {

        No<T> atual = this.inicio;
        int pos = 0;

        for(int i =0; i < this.tamanho; i++){
            if(atual.getElemento().equals(elemento)){
                return pos;
            }
            atual = atual.getProximo();
            pos++;
        }

        return NAO_ENCOTRADO;
    }

    public T buscaPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    private No<T> buscaNo(int posicao) {

        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        No<T> atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        // caso seja vazia.
        if (tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        No<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho-1; i++){
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        /* OUTRA MANEIRA.
         * //pra sair com um a formatação: [elemento].
         * if(tamanho == 1){
         * builder.append("[").append(atual.getElemento()).append("]");
         * return builder.toString();
         * }
         * //pra sair com um a formatação: [elemento,elemento]. Quando tiver mais de um
         * No.
         * builder.append(atual.getElemento()).append(",");
         * 
         * while(atual.getProximo() != null) {
         * 
         * atual = atual.getProximo();
         * 
         * if(atual.equals(ultimo)){
         * builder.append(atual.getElemento()).append("]");
         * break;
         * }
         * 
         * builder.append(atual.getElemento()).append(",");
         * }
         */

        return builder.toString();
    }

}
