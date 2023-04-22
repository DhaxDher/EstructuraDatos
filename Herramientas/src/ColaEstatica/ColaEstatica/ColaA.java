package ColaEstatica;

import EntradaSalida.tools;

public class ColaA <T> implements ColaTDA<T>{
	private T cola[];
	private byte u;
	
	public ColaA(int max) {
		cola=(T[])(new Object[max]);
		u=-1;
	}
	
	public boolean isEmpty() {
		return (u==-1);
	}
	public boolean isSpace() {
		return(u<cola.length-1);
	}
	public void push(T dato) {
		if(isSpace()) {
			u++;
			cola[u]=dato;
		}
		else tools.ImprimeErrorMsje("Estructura cola llena");
	}
	public T pop() {
		T dato= cola[0];
		for(int i=cola.length-1; i>u; i--){
			   cola[i]=cola[u+1];
		//invocar a corrimiento inmediato
		//metodo de recorrer del tema 1, cola de u+1
		}
			  u--;
		return dato;
	}
	public T peek() {
		return (T)cola[0];
	}
	public String toString() {
		return toString(0);
	}
	private String toString(int i) {
		return (i<=u)?"u===>"+i+"["+cola[i]+"]   "+toString(i+1):"";
	}
	

}
