package ColaEstatica;
import java.util.Iterator;
import java.util.Queue;
import java.util.*;

public class ColaB<T> implements ColaTDA<T> {
private Queue cola;

public ColaB() {
	cola=new LinkedList();
}
public int Size() {
	return cola.size();
}
public boolean isEmpty() {
	return(cola.isEmpty());
}
public T peek() {
	return(T)(cola.element());
}
public void vaciar() {
	cola.clear();
}
public void push(T dato) {
	cola.add(dato);
}
public T pop() {
	T dato;
	dato=(T)cola.element();
	cola.remove();
	return dato;
}
//Para el toString se va a llamar iteradores
public String toString() {
	String cad="";
	byte j=0;
	for(Iterator i = cola.iterator();i.hasNext();) {
		cad+="["+i.next()+"]"+j;
		j++;
	}
	return cad;
}

}
