package br.uemg.pilha.teste;

import br.uemg.pilha.Pilha;

public class PilhaTeste {
    
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<Integer>();
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		
		System.out.println(pilha);
		
		System.out.println("Desempilhando: " + pilha.desempilha());
		
        //toString Herdado
		System.out.println(pilha);

        System.out.println("topo: " + pilha.topo());
    }
}
