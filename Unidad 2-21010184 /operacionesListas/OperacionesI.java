package OperacionesListas;

public interface OperacionesI <T>{
	public void altas(T dato);
	public void bajas(T dato);
	public boolean validaVacio();
	public String imprime();
	public byte buscar(T dato);
	public void modifica(T dato);
}
