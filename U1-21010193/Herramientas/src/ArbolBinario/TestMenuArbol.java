package ArbolBinario;
import EntradaSalida.tools;
import MemoriaDinamica.Nodo;

import javax.swing.JOptionPane;
public class TestMenuArbol {
	public static void main(String args[])
	{
		menu3("Insertar,Recorridos,Buscar,Hojas,Altura,Ver,Salir,");
		}
	
	public static String boton(String menu)
	{
		String valores[] = menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","",JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE, null
				,valores,valores[0]);
		return (valores[n]);
	}
	public static void menu3(String menu)
	{
		ArbolBin<Integer> arb;
		arb=new ArbolBin();

	    String op;
		do {
			op=tools.boton(menu);
			
			switch(op) {
			case "Insertar":
			arb.insertarArbol(tools.LeerEntero("Dato"));
				break;
			case "Recorridos":
				if(arb.arbolVacio())
					tools.ImprimeErrorMsje("ARBOL VACIO");
				else {
				tools.ImprimeMsje("Preorden:"+ arb.preorden(arb.getRaiz())+"\n Pos orden: " + arb.posorden(arb.getRaiz())+"\n Inorden izq a der: "
						+arb.inordenizq(arb.getRaiz())+"\n Inorden der a izq: "+arb.inordender(arb.getRaiz()));
				}
	
				break;
			case "Buscar":
				if(arb.arbolVacio())
					tools.ImprimeErrorMsje("ARBOL VACIO");
				else {
					int dato;
					dato=tools.LeerEntero("Dato a buscar:");
					
					if(arb.buscaDato(arb.getRaiz(),dato)!=null) {
						tools.ImprimeMsje("DATO ENCONTRADO");
					}
					else
						tools.ImprimeErrorMsje("DATO NO ENCONTRADO");
				}
				break;
			case "Hojas":
				if(arb.arbolVacio())
					tools.ImprimeErrorMsje("ARBOL VACIO");
				else {
				
				}
				
				break;
			case "Altura":
				if(arb.arbolVacio())
					tools.ImprimeErrorMsje("ARBOL VACIO");
				else {
					
				}
				
				break;
			case "Ver":
				if(arb.arbolVacio())
					tools.ImprimeErrorMsje("ARBOL VACIO");
				else {
					
				}
				break;
			}}
		while(!op.equalsIgnoreCase("Salir"));
	}
}
