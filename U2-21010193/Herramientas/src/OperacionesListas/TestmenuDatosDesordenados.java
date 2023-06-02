package OperacionesListas;
import EntradaSalida.tools;
import MemoriaDinamica.Nodo;

import javax.swing.JOptionPane;
public class TestmenuDatosDesordenados {
	public static void main(String args[])
	{
		menu3("Frente,Final,Eliminar,Modificar,Buscar,Ordenar,Imprimir,Vaciar,Salir,");
		}
	
	public static String boton(String menu)
	{
		String valores[] = menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","PILAS",JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE, null
				,valores,valores[0]);
		return (valores[n]);
	}
	public static void menu3(String menu)
	{
		DatosDesordenados<Comparable> obj = new DatosDesordenados();
	    String op;
		do {
			op=tools.boton(menu);
			
			switch(op) {
			case "Frente":
				obj.insertaFrente(tools.LeerEntero("Dame un valor"));
				tools.ImprimeMsje(obj.imprime());
				break;
			case "Final":
				obj.insertaFinal(tools.LeerEntero("Dame un valor"));
				tools.ImprimeMsje(obj.imprime());
				break;
			case "Eliminar":
				if(obj.listaVacia())
					tools.ImprimeErrorMsje("LISTA VACIA");
				else {
					Nodo i;
					i=obj.buscarSecLista(tools.LeerString("Dato a eliminar"));
					if(i!=null) {
						obj.elimina(i);
						tools.ImprimeMsje("DATO ELIMINADO");
					}
					else {
						tools.ImprimeErrorMsje("Dato no encontrado");
					}
				}
				break;
			case "Modificar":
				if(obj.listaVacia())
					tools.ImprimeErrorMsje("LISTA VACIA");
				else {
					Nodo i;
					i=obj.buscarSecLista(tools.LeerEntero("Dato a modificar"));
					if(i!=null) {
						obj.modificar(i);
						tools.ImprimeMsje("DATO MODIFICADO");
					}
					else {
						tools.ImprimeErrorMsje("Dato no encontrado");
					}
				}
				
				break;
			case "Ordenar":
				if(obj.listaVacia())
					tools.ImprimeErrorMsje("LISTA VACIA");
				else {
					obj.ordenar();
					tools.ImprimeMsje("DATOS ORDENADOS");
				}
				break;
			case "Buscar":
				if(obj.listaVacia()) {
					tools.ImprimeErrorMsje("LISTA VACIA");
				}
				else
				{
			
					Nodo i= obj.buscarSecLista(tools.LeerEntero("Valor a buscar"));
					Nodo E= obj.buscarAntecesor(i);
					if(i!=null) {
					tools.ImprimeMsje("Dato encontrado: "+ i.getInfo()+"\n Dato anterior:"+E.getInfo());
					
					}
					else {
						tools.ImprimeErrorMsje("No se encontro el dato");
					}
					
				}
				break;
			case "Imprimir":
				if(obj.listaVacia())
					tools.ImprimeErrorMsje("LISTA VACIA");
				else
					tools.ImprimeMsje(obj.imprime());
				break;
			case "Vaciar":
				if(obj.listaVacia())
					tools.ImprimeErrorMsje("LISTA VACIA");
				else {
				obj.vaciarLista();
				tools.ImprimeMsje("LISTA VACIADA");
				}
				break;
			
			}}
		while(!op.equalsIgnoreCase("Salir"));
	}
}
