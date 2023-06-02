package TestPrueba;
import javax.swing.JOptionPane;

import Actualizacion.DatoSimple;
import EntradaySalida.Tools;
public class TestDatos {

	public static void main(String[] args) {
		String menu= "Agregar,Buscar,Eliminar,Imprimir,Salir";
		menu3(menu);
	}

	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n = JOptionPane.showOptionDialog(null," SELECCIONA  DANDO CLICK ", " M E N U", JOptionPane.NO_OPTION, //sin botones
				JOptionPane.QUESTION_MESSAGE,null, // utiliza icono predeterminado
		valores,valores[0]);  //////////////////// botón determinado
		return ( valores[n]);
		}
	
	
	public static void menu3(String menu)
	{  
		byte var = 10, pos =0;
		DatoSimple obj = new DatoSimple(var);
		String sel="";
		do {
		sel=boton(menu);
		switch(sel){
		case "Agregar":
			obj.almacenarDato();
				break;    
		case "Buscar":
			if (obj.validaVacio())
				Tools.imprimeError("Array Vacio");
			else {
				pos=obj.buscarSecuencial(Tools.leerString("Nombre a buscar "));
				
				if (pos!= -1) 
					Tools.imprimePantalla("Se muestra en posicion " + pos);
				else Tools.imprimeError("Dato no encontrado ");
			}
				break;
				
		case "Eliminar":
			if (obj.validaVacio())
					Tools.imprimeError("Arreglo vacio");
			else 
			{
				pos = obj.buscarSecuencial(Tools.leerString("Ingrese el nombre a buscar"));
				if (pos!=-1)
				{
					obj.eliminarDato(pos);
					Tools.imprimePantalla("Datos del arreglo"+ obj.imprimeDatos());
				}
				else 
					Tools.imprimeError("Dato no encontrado");
			}
				break;
				
		case "Imprimir":if(obj.validaVacio())
			Tools.imprimeError("Arreglo vacio");
		else
			Tools.imprimePantalla("Datos del arreglo " + obj.imprimeDatos());
		break;
		
		case "Salir": break;
		
		}//switch
		}while(!sel.equalsIgnoreCase("Salir"));
	}
}
