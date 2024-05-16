package br.uemg.lista.teste;

import java.util.LinkedList;

import br.uemg.lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    
    public static void main(String[] args) {
            
        testeLinkedList();

    }

    public static void testeLinkedList() {

        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.addFirst(0);
        lista.addLast(3);
        lista.add(2, 2);
        lista.add(4);
        lista.add(5);


        System.out.println(lista);

        lista.remove(); //remove os primeiro
        lista.removeFirst();
        lista.remove(0);

        lista.removeLast();

        System.out.println(lista);

        System.out.println(lista.contains(1));  //false
        System.out.println(lista.contains(10));  //false
        System.out.println(lista.contains(3));  //true
        System.out.println(lista.contains(4));  //true
    }

    public static void testeRemoveQualquer() {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista);

        /*lista.remove(10);*/ // exception

        lista.remove(1);
        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);

        /*lista.remove(0);*/  //exception



        
    }

    public static void testeRemoveFinal() {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        /*lista.removeFinal(); exception*/
        
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista);

        lista.removeFinal();
        System.out.println(lista);
        lista.removeFinal();
        System.out.println(lista);
        lista.removeFinal();
        System.out.println(lista);
    }

    public static void testeRemoveInicio() {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        /*lista.removeInicio(); exception*/
        
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista);
        System.out.println(lista.peekInicioUltimo());

        lista.removeInicio();
        System.out.println(lista);

        lista.removeInicio();
        System.out.println(lista);

        lista.removeInicio();
        System.out.println(lista);

        System.out.println(lista.peekInicioUltimo());
    }

    public static void testeLimpaTudo() {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);
        System.out.println(lista);

        lista.limpa();
        System.out.println(lista);
    }

    public static void testeAdiciona() {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        //lista.adiciona(0,2);

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);

        System.out.println(lista);

        lista.adiciona(0, 0);
        lista.adiciona(4, 33);
        lista.adiciona(7, 6);
        //lista.adiciona(10, 6); exception


        System.out.println(lista);

    }

    public static void testeBusca() {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        System.out.println(lista.busca(1)); //0
        System.out.println(lista.busca(3)); //2
        System.out.println(lista.busca(6)); //-1

        System.out.println(lista.buscaPosicao(0));  //1
        System.out.println(lista.buscaPosicao(3));  //4
        System.out.println(lista.buscaPosicao(4)); //5
        //System.out.println(lista.buscaPosicao(10)); EXCEPTION
    }
}
