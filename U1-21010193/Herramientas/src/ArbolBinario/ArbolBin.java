package ArbolBinario;

public class  ArbolBin <T> {
private Nodito raiz;

public ArbolBin() {
	raiz=null;
}
public Nodito getRaiz() {
	return raiz;
}
public void seRaiz(Nodito raiz) {
	this.raiz=raiz;
}
public boolean arbolVacio() {
	return raiz==null;
}
public void vaciarArbol() {
	raiz=null;
}
public <T> void insertarArbol(T info) {
	Nodito p= new Nodito(info);
	if(arbolVacio()) {
		raiz=p;
	}
	else {
		Nodito padre=buscaPadre(raiz,p);
		
		if(p.hashCode()>=padre.hashCode())
			padre.der=p;
		else
			padre.izq=p;
	}
}
public Nodito buscaPadre(Nodito raiz, Nodito p) {
	Nodito padre=null;
	while(raiz!=null) {
		padre=raiz;
		if((int)p.info>=(int)padre.info)
			raiz=padre.der;
		else
			raiz=padre.izq;
	}
	return padre;
}
public String preorden(Nodito r) {
	if(r!=null) {
		return r.info+"-"+preorden(r.izq)+"-"+preorden(r.der);
	}
	else return"";
}
public String inordenizq(Nodito r) {
	if(r!=null) {
		return inordenizq(r.izq)+"-"+r.info+"-"+inordenizq(r.der);
	}
	else return"";
}
public String inordender(Nodito r) {
	if(r!=null) {
		return inordender(r.der)+"-"+r.info+"-"+inordender(r.izq);
	}
	else return"";
}
public String posorden(Nodito r) {
	if(r!=null) {
		return posorden(r.izq)+"-"+posorden(r.der)+"-"+r.info;
	}
	else return"";
}
public Nodito buscaDato(Nodito r, int dato) {
	Nodito p=null;
	
	while(r!=null) {
		int temp = (int)r.info;
		if(temp==dato) {
			return r;
		}
		else {
			if(dato>temp) {
				r=r.der;
				if(r!=null)
					p=r;
		
			}
			else {
				if(dato<temp) {
				r=r.izq;
				if(r!=null)
					p=r;
				}
			
			}
		}

}
	return p;
}
}