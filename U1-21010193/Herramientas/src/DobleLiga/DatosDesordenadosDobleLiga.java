package DobleLiga;
import MemoriaDinamica.Nodo;
import OperacionesListas.OperacionesI;

public class DatosDesordenadosDobleLiga <T> implements OperacionesI<T>{
private Nodito puntero;
private Nodito f;

public DatosDesordenadosDobleLiga() {
	puntero=null;
}
@Override
public void insertaFrente(T dato) {
	Nodito p = new Nodito(dato);
	if(listaVacia()) {
		puntero=p;
		f=p;
		puntero.izq=p;
		puntero=p;
	}
	else {
		p.der=puntero;
		puntero.izq=p;
		puntero=p;
	}
	
}
@Override
public void insertaFinal(T dato) {
	Nodito p=new Nodito(dato);
	if(listaVacia()) {
		puntero=p;
	}
	else {
		f.der=p;
		p.izq=f;
	}
	f=p;
	
}
@Override
public boolean listaVacia() {
	// TODO Auto-generated method stub
	return (puntero==null);
}
@Override
public String imprime() {
	String cad="Derecha a izquierda\n";
	for(Nodito j=f;j!=null;j=j.izq) 
		cad+=j.info+"-->";
	cad+="\n Izquierda a derecha \n";
	for(Nodito j= puntero;j!=null;j=j.der)
		cad+=j.info+"--->";
	return cad;
	
}
@Override
public Nodito buscaSecLista(T dato) {
	Nodito <T> i=puntero;
	if(i==puntero) {
	while(i!=null && !(dato.equals((Object)i.getInfo()))) {
		i=i.getDer();}
	}
	else
	if(i==f) {
		return (i);
	}
		return (i);
}
		
		
@Override
public void eliminar(Nodito i) {
		if(i==puntero && i==f) {
			i=null;
		}
	else {
		if(i==f) {
			//f=f.izq;
			//f.der=null;
			//i=null;
			f=i.izq;
			i.izq.der=null;
		}
		else {
			if(i==puntero) {
				puntero=puntero.der;
				puntero.izq=null;
			}
				
		
		else {
		i.der.izq=i.izq;
		i.izq.der=i.der;
		
		}}
	}
	i=null;
}
/*Investigacion, que es un arbol general
 * que es un bosque en prog
 * que son arboles similares
 * arboles equivalentes
 * reglas para balancear el arbol general
 * que es un nodo raiz
 * nodo padre
 * nodo terminales u hojas
 * nodos interiores
 * nodos hermanos
 * grado de un arbol
 * altura de un arbol
 * que es un arbol binario
 * buscar en libros de estructura de datos sin lenguaje de programacion
 */
@Override
public void vaciarLista() {
	// TODO Auto-generated method stub
	
}
@Override
public void modificar() {
	// TODO Auto-generated method stub
	
}
@Override
public void ordenar() {
	// TODO Auto-generated method stub
	
}
@Override
public Nodo buscarSecLista(T dato) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void elimina() {
	// TODO Auto-generated method stub
	
}
@Override
public void eliminar(T dato) {
	// TODO Auto-generated method stub
	
}

}
