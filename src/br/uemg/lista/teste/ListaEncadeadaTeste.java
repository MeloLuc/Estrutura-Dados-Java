package br.uemg.lista.teste;

import br.uemg.lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    
    public static void main(String[] args) {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        System.out.println(lista);
    }
}
