package ColaEstatica;

import java.util.ArrayList;

public class ColaC <T> implements ColaTDA<T> {
	private ArrayList cola;
	byte u;
	
	public ColaC() {
		cola=new ArrayList();
		u=0;
	}
	public int Size() {
		return cola.size()-1;
	}
	public boolean isEmpty() {
		return cola.isEmpty();
	}
	public void vaciar() {
		cola.clear();
		u=0;
	}
	public void push(Object dato) {
		cola.add(dato);
		u++;
	}
	public T pop() {
		T dato = (T) cola.get(0);
		cola.remove(0);
		u--;
		return dato;
	}
	public T peek() {
		return (T)cola.get(0);
	}
	public String toString() {
		return toString (0);
	}
	private String toString(int i) {
		return (i<u)?""+i+"["+cola.get(i)+"]=>"+toString(i+1):"";
	}

}
