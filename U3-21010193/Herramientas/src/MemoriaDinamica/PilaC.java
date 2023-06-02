package MemoriaDinamica;
import PilaEstatica.PilaTDA;
//pila usando arrayList
import java.util.ArrayList;

public class PilaC <T> implements PilaTDA<T>{
	private ArrayList pila;
	int tope;
	
	public PilaC() {
		pila=new ArrayList();
		tope=-1;
	}
	public int Size() {
		return pila.size();
	}
	public boolean isEmpty() {
		return pila.isEmpty();
	}
	public void vaciar() {
		pila.clear();
		}
	public void push(Object dato) {
		pila.add(dato);
		tope++;
	}
public T pop() {
	T dato=(T)pila.get(tope);
	pila.remove(tope);
	tope--;
	return dato;
}
public T peek() {
	return (T)pila.get(tope);
}
public String toStringP() {
	return toStringP(tope);
}
private String toStringP(int i) {
	return(i>=0)?"tope==>"+i+"["+pila.get(i)+"]\n"+toStringP(i-1):"";
}
}
