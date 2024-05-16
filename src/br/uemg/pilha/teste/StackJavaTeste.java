package br.uemg.pilha.teste;

import java.util.Stack;

public class StackJavaTeste {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());  //false
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());  //false
		System.out.println(stack.size()); //3
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
    }
}
