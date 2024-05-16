package br.uemg.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    
    private final int NAO_ENCOTRADO = -1;
    private final String NAO_EXISTE = "Posição inválida";
    private final String LISTA_VAZIA = "Está lista está vazia";

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

    public void adiciona(int posicao, T elemento) {

        if (posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        if(posicao == 0){  //inicio
            adicionaInicio(elemento);
        } else if (posicao == this.tamanho) {
            adiciona(elemento);
        } else {
            No<T> noAnterior = this.buscaNo(posicao-1);
            No<T> noProximo = noAnterior.getProximo();
            No<T> noNovo = new No<>(elemento, noProximo);
            noAnterior.setProximo(noNovo);
            this.tamanho++;
        }
    }

    private void adicionaInicio(T elemento){

        if(this.tamanho == 0){
            adiciona(elemento);
        } else {
            No<T> novoNo = new No<>(elemento, this.inicio);
            this.inicio = novoNo;
            this.tamanho++;
        }
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

    public T removeInicio() {

        if(this.tamanho == 0) {
            throw new RuntimeException(LISTA_VAZIA);
        }
        //guardando dados do No. (auxiliares)
        T removido = this.inicio.getElemento();
        No<T> proximo = inicio.getProximo();
        //limpando memória
        this.inicio.setElemento(null);
        this.inicio.setProximo(null);
        //setando inicio
        this.inicio = proximo;
        this.tamanho--;

        if(this.tamanho == 0) {
            this.ultimo = null;
        }

        return removido;
    }

    public T removeFinal() {

        if(this.tamanho == 0) {
            throw new RuntimeException(LISTA_VAZIA);
        }
        if(this.tamanho == 1) {
            return removeInicio();
        }
        No<T> noPenultimo = buscaNo(this.tamanho-2);
        T removido = noPenultimo.getProximo().getElemento();
        //
        noPenultimo.getProximo().setElemento(null);
        noPenultimo.getProximo().setProximo(null);
        noPenultimo.setProximo(null);
        this.ultimo = noPenultimo;
        this.tamanho--;
        
        return removido;
    }

    public T remove(int posicao) {

        if(posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }
        if(posicao == 0) {
            return removeInicio();
        }
        if(posicao == this.tamanho-1) {
            return removeFinal();
        }
        No<T> noAnterior = buscaNo(posicao-1);
        No<T> noAtual = noAnterior.getProximo();
        No<T> noProximo = noAtual.getProximo();

        noAnterior.setProximo(noProximo);
        noAtual.setProximo(null);
        this.tamanho--;
        
        return noAtual.getElemento();
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
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        No<T> atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public String peekInicioUltimo() {

        StringBuilder frase = new StringBuilder();
        if(this.inicio == null) {
            frase.append("Inicio = null");
            frase.append(" | Ultimo = null");
        } else {
            frase.append("Inicio = "+ this.inicio.getElemento());
            frase.append(" | Ultimo = "+ this.ultimo.getElemento());
        }
        return frase.toString();
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
