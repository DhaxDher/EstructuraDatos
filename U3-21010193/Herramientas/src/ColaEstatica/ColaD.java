package ColaEstatica;

import MemoriaDinamica.Nodo;

public class ColaD <T> implements ColaTDA<T> {
	private Nodo cola;
	private Nodo f;
	public ColaD() {
		cola=null;
	}
	public boolean isEmpty() {
		return(cola==null);
	}
	public void push(T dato) {
		Nodo u=new Nodo(dato);
		if(isEmpty())
			cola=u;
		else
		{
			f.sig=u;
		}
		f=u;
	}
	public T pop() {
		Nodo u= cola;
		T dato=(T) cola.getInfo();
		cola=cola.getSig();
		u=null;
		return dato;
	}
	public T peek() {
		return (T) (cola.getInfo());
	}
	public void free() {
		cola=null;
		f=null;
		
	}
	public String toString() {
		Nodo u=cola;
		return toString(u);
	}
	private String toString(Nodo i) {
		return(i!=null)?"==>"+"["+i.getInfo()+"]\n"+toString(i.getSig()):"";
	}

}
