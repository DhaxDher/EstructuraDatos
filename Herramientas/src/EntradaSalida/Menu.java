package EntradaSalida;

public class Menu {

	public static void menu1(String menu) {
		int sel;
		do {
		sel=tools.LeerEntero(menu+"Seleccione opcion");
		switch(sel){
		case 1: break;     
		case 2: break;
		case 3: tools.ImprimeMsje("Fin del programa");break;
		default: tools.ImprimeErrorMsje("Opcion no definida, intenta de nuevo");
		}
		}while(sel!=3);
	}
	
	
	public static void menu2(String menu)
	{
	String sel;
	do {
	sel=tools.desplegable(menu);
	switch(sel){
	case "Agregar":;break;     
	case "Imprimir":  ;break;
	case "Salir": break;
	}//switch
	}while(!sel.equalsIgnoreCase("Salir"));
	}
	
	public static void menu3(String menu)
	{  
	String sel="";
	do {
	sel=tools.boton(menu);
	switch(sel){
	case "Agregar":;break;     
	case "Imprimir":  ;break;
	case "Salir": break;
	}//switch
	}while(!sel.equalsIgnoreCase("Salir"));
	}
}

