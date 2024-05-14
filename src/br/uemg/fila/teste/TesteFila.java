package br.uemg.fila.teste;

import br.uemg.fila.Fila;

public class TesteFila {

    public static void main(String[] args) {
       
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.println(fila);
        System.out.println(fila.espiar());
        System.out.println(fila.desenfilerar());
        System.out.println(fila.desenfilerar());
        System.out.println(fila.desenfilerar());
        System.out.println(fila.desenfilerar());
    }
}
