package br.uemg.lista.teste;

import br.uemg.lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    
    public static void main(String[] args) {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);

        System.out.println(lista);

        System.out.println(lista.busca(1)); //0
        System.out.println(lista.busca(3)); //2
        System.out.println(lista.busca(6)); //-1

        System.out.println(lista.buscaPosicao(0));  //1
        System.out.println(lista.buscaPosicao(3));  //4
        System.out.println(lista.buscaPosicao(4)); //5
        //System.out.println(lista.buscaPosicao(10)); EXCEPTION
        
    }
}
