package ArbolBinario;

public class Nodito <T> {
	public T info;
	public Nodito der;
	public  Nodito izq;
	
	public Nodito(T dato) {
		this.info=dato;
		this.izq=null;
		this.der=null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Nodito getDer() {
		return der;
	}

	public void setDer(Nodito der) {
		this.der = der;
	}

	public Nodito getIzq() {
		return izq;
	}

	public void setIzq(Nodito izq) {
		this.izq = izq;
	}

}

