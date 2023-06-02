package ArbolBinario;

public class Nodo {
	
	    int valor;
	    Nodo izquierda, derecha;

	    public Nodo(int valor) {
	        this.valor = valor;
	        izquierda = null;
	        derecha = null;
	    }
	}

	public class ImpresionArbolBinario {
	    static void imprimirArbol(Nodo nodo, String prefijo, boolean esUltimo) {
	        if (nodo == null) {
	            return;
	        }

	        imprimirArbol(nodo.derecha, prefijo + (esUltimo ? "    " : "│   "), false);

	        System.out.print(prefijo);
	        System.out.print(esUltimo ? "└──" : "├──");
	        System.out.println(nodo.valor);

	        imprimirArbol(nodo.izquierda, prefijo + (esUltimo ? "│   " : "    "), true);
	    }

	    public static void main(String[] args) {
	        // Crear un árbol binario de ejemplo
	        Nodo raiz = new Nodo(5);
	        raiz.izquierda = new Nodo(3);
	        raiz.derecha = new Nodo(8);
	        raiz.izquierda.izquierda = new Nodo(2);
	        raiz.izquierda.derecha = new Nodo(4);
	        raiz.derecha.izquierda = new Nodo(7);
	        raiz.derecha.derecha = new Nodo(9);

	        // Imprimir el árbol
	        imprimirArbol(raiz, "", true);
	    }
	}
