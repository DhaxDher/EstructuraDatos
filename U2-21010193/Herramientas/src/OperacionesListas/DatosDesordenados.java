package OperacionesListas;

import EntradaSalida.tools;
import MemoriaDinamica.Nodo;

public class DatosDesordenados <T> implements OperacionesI<T> {
	private Nodo inicio;
	private Nodo f;
	private Nodo E;
	
	public DatosDesordenados() {
		inicio=null;
	}
	public void vaciarLista() {
		inicio=null;
	}
	public void modificar(Nodo i) {
		i.setInfo(tools.LeerEntero("Nuevo valor:"));
	}

	
	public void insertaFrente(T dato) {
		Nodo<T> p=new Nodo(dato);
		if(listaVacia()) { inicio=p;
		f=p;}
		else {
			p.sig=inicio;
			inicio=p;
		}
	}

	public void insertaFinal(T dato) {
	Nodo p = new Nodo(dato);
	if(listaVacia()) {
		inicio=p;
	}
	else {
		f.sig=p;
	}
		f=p;
	}

	public boolean listaVacia() {
		return(inicio==null);
	}
	
	public void elimina(Nodo i) {
		if(i==inicio) {
			inicio=inicio.sig;
			i=null;
		}
		else {
			Nodo antes=buscarAntecesor(i);
			if(i==f) {
				f=antes;
				f.sig=null;
				i=null;
			}
			else {
				antes.sig=i.sig;
				i=null;
			}
		}
	}
	@Override
	public String imprime() {
		String cad="";
		for(Nodo i=inicio;i!=null;i=i.getSig()) {
			cad+=i.getInfo()+"-->\n";
	}
	return cad;
	}
	@Override
	public Nodo buscarSecLista(T dato) {
		Nodo i=inicio;
		while(i.sig!=null && dato!=i.getInfo())
			i=i.sig;
			if (i!=null) {return i;}
			else {return null;
			}
		}
	public Nodo buscarAntecesor(Nodo i) { 
		Nodo E= inicio;
		while(i!=E.getSig()) {
			E=E.getSig();
		}
			return E;
		
	}
	@Override
	public void elimina() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		
	}
	public void ordenar() {
		Nodo aux= new Nodo(0);
		
		Nodo m,n;
		for(m=inicio;m!=null;m=m.getSig()) 
			for(n=m.sig;n!=null;n=n.getSig()) {
				if((Integer)m.getInfo()>(Integer)n.getInfo()) {
					aux.info= m.info;
					m.info=n.info;
					n.info=aux.info;
				}
					
				}
			}
		
	}
	
	
	//Preparar una interfaz generica que contenga las operaciones altas, bajas, modificar, imprimir, buscar, eliminar, vaciar, valida vacio
