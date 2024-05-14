package br.uemg.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueueJava {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        //enqueue
        fila.add(1);
        fila.add(3);
        fila.add(5);
        fila.add(4);

        System.out.println(fila);
        System.out.println(fila.peek());
        
        //dequeue
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());

        System.out.println(fila);

    }
    

    
}
