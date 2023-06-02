package TestEjecucion;
import javax.swing.JOptionPane;
import Actualizacion.DatoSimple;
import EntradaSalida.tools;
public class TestPrueba{
	
	
	public static void main(String args[])
	{
		menu3("Agregar,Imprimir,Buscar,Eliminar,Salir");
		}
	public static String boton(String menu)
	{
		String valores[] = menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","MENU",JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE, null
				,valores,valores[0]);
		return (valores[n]);
	}
	public static void menu3(String menu)
	{
		//int pos=0;
		//int arreglo[] = {12,25,40,60,70,100};
		DatoSimple obj = new DatoSimple((byte)10);
		String sel="";
		do {
			sel=tools.boton(menu);
			switch(sel) {
			case "Agregar":
				obj.almacenarDato();
				break;
			case "Imprimir":
				tools.ImprimeMsje("Datos array" + obj.imprimeDatos());
				break;
			case "Buscar":
				if(obj.validaVacio())
					tools.ImprimeErrorMsje("Array vacio");
				else {
					//pos = obj.buscarOrdenada(arreglo,tools.LeerEntero("Ingrese el valor"));
					byte pos=obj.buscarSecuencial(tools.LeerString("Nombre a buscar"));
					if(pos!=-2)
						tools.ImprimeMsje("Se encuentra en la posicion " + pos);
				
					else tools.ImprimeErrorMsje("Dato no encontrado");
				}
				break;
			case "Eliminar":
				if(obj.validaVacio()) tools.ImprimeErrorMsje("Array vacio");
				else {
					byte index = obj.buscarSecuencial(tools.LeerString("Nombre a buscar"));
					if (index != -1) {
						obj.eliminaDato(index);
						tools.ImprimeMsje("Datos array" + obj.imprimeDatos());
					} else {
						tools.ImprimeErrorMsje("No se encontro en el array");
						
					}
				}
				break;
				
			case "Salir":
				break;
			}
		}
		while(!sel.equalsIgnoreCase("Salir"));
	}
}