package br.uemg.vetor.teste;


import br.uemg.vetor.VetorEstruturaEstatica;

public class TesteVetorEstatico {

    public static void main(String[] args) {
        
        VetorEstruturaEstatica<String> vetor = new VetorEstruturaEstatica<>(3);

		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento A");
		
		int pos = vetor.busca("A");
		if (pos > -1){
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe no vetor");
		}

		System.out.println(vetor);
	}
}

