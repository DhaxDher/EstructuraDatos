package DobleLiga;
import EntradaSalida.tools;
import MemoriaDinamica.Nodo;

import javax.swing.JOptionPane;
public class TestMenuDobleListaDesordenada {
	public static void main(String args[])
	{
		menu3("Frente,Final,Buscar,Eliminar,Imprimir,Salir,");
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
		DatosDesordenadosDobleLiga obj = new DatosDesordenadosDobleLiga();
	    String op;
		do {
			op=tools.boton(menu);
			
			switch(op) {
			case "Frente":
				obj.insertaFrente(tools.LeerString("Dame un dato"));
				
				break;
			case "Final":
				obj.insertaFinal(tools.LeerString("Dame un dato"));
	
				break;
			case "Eliminar":
				if(obj.listaVacia())
					tools.ImprimeErrorMsje("LISTA VACIA");
				else {
					Nodito i;
				i=obj.buscaSecLista(tools.LeerString("Dato a eliminar"));
				if(i!=null) {
					obj.eliminar(i);
					tools.ImprimeMsje("DATO ELIMINADO \n"+obj.imprime());
				
				}
				else {
					tools.ImprimeErrorMsje("Dato no encontrado");
				}
			}
				
				break;
			case "Modificar":
				if(obj.listaVacia())
					tools.ImprimeErrorMsje("LISTA VACIA");
				else
					
				break;
			case "Ordenar":
				if(obj.listaVacia())
					tools.ImprimeErrorMsje("LISTA VACIA");
				else
					
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
				else
					
				break;
				
			case "Buscar":
				if(obj.listaVacia()) 
					tools.ImprimeErrorMsje("LISTA VACIA");
				else {
					Nodito i=obj.buscaSecLista(tools.LeerString("Nombre a buscar:"));
							if(i!=null)
							tools.ImprimeMsje("Existe:"+i.getInfo()+"\n"+obj.imprime());
							else {
							tools.ImprimeErrorMsje("NO EXISTE");
						
						}
				}
					
				break;
			}}
		while(!op.equalsIgnoreCase("Salir"));
	}
}
