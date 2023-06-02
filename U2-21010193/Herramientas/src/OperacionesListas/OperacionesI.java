package OperacionesListas;

import DobleLiga.Nodito;
import MemoriaDinamica.Nodo;

public interface OperacionesI <T>{
	public void insertaFrente(T dato);
	public void insertaFinal(T dato);
	public boolean listaVacia();
	public String imprime();
	public Nodo buscarSecLista(T dato);
	public void elimina();
	public void vaciarLista();
	public void modificar();
	public void ordenar();
	Nodito buscaSecLista(T dato);
	void eliminar(T dato);
	void eliminar(Nodito i);
}
