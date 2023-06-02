package MemoriaDinamica;

import java.util.Stack;

import PilaEstatica.PilaTDA;

public class PilaB<T> implements PilaTDA<T> {
	private Stack pila;
	
	public PilaB(){
		pila= new Stack();
		
	}
	public int Size() {
		return pila.size();
	}
	public boolean isEmpty() {
		return(pila.empty());
	}
	public T peek() {
		return(T)(pila.peek());
	}
	public void vaciar() {
		pila.clear();
	}
	public void push(T dato) {
		pila.push(dato);
	}
	public T pop() {
		T dato;
		dato=(T) pila.peek();
		pila.pop();
		return dato;
	}
	public String toStringP() {
		return toStringP(Size()-1);
	}
	private String toStringP(int i) {
		return(i>=0)?"tope==>"+i+"["+pila.get(i)+"]\n"+toStringP(i-1):"";
	}

}
