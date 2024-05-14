package br.uemg.fila.teste;

import br.uemg.fila.FilaPrioridade;

public class TestePrioridade {

    public static void main(String[] args) {
        
        FilaPrioridade<Integer> fila = new FilaPrioridade<>();
        
        fila.enfileirarPrioridade(1);
        fila.enfileirarPrioridade(5);
        fila.enfileirarPrioridade(3);
        fila.enfileirarPrioridade(-1);
        fila.enfileirarPrioridade(7);
        fila.enfileirarPrioridade(-3);
        System.out.println(fila);
    }
}
