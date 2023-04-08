package PilaEstatica;

public interface PilaTDA <T>{
	public boolean isEmpty();//Regresa true si la pila no tiene elementos
	public T pop();//Debe quitar el elemento que esta en el tope y regresarlo
	public void push(T dato);//Inserta el dato en el tope de la pila
	public T peek(); //Regresa el elemento que esta en el tope, sin quitarlo
	//public void freePila(); //Limpia pila
	

}
