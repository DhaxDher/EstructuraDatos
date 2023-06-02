package Actualizacion;

import Actualizacion.DatosOrdenados;
import EntradaSalida.tools;
import javax.swing.*;
public class Test {
    static byte tam = 10;
  
    public static void main(String[] args)
    {
        
        String menu2="Agregar,Imprimir,Busqueda,Modificar,Eliminar,Salir";
        menu3(menu2);
    }
    public static String boton(String menu)
    {
        String valores[]=menu.split(",");
        int n;
        n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", " M E N U",
                JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,
                valores,valores[0]);
        return ( valores[n]);
    }
    public static void menu3 (String menu)
    {
        byte pos =0;
        DatosOrdenados obj = new DatosOrdenados(10); 
        	

        String sel="";
        do
        {
            sel=boton(menu);
            switch(sel)
            {
                case "Agregar":
                    obj.insertandoOrdenado();
                break;
                case "Imprimir":
                    if(obj.validaVacio())
                        tools.ImprimeMsje("Arreglo vacio");
                    else
                        tools.ImprimeMsje("Datos del arreglo" + obj.imprimeDatos());
                break;
                case "Busqueda":
                    if(obj.validaVacio())
                        tools.ImprimeErrorMsje("Arreglo vacio");
                    else
                    {
                        pos = obj.busSecuencialOrdenada(tools.LeerEntero("Ingrese el numero"));
                        if (pos >= 0)
                            tools.ImprimeMsje("Se encuentra en la posicion: " + pos);
                        else
                            tools.ImprimeMsje("Se debe de insertar en la posicion" + pos * (-1));
                    }
                break;
                case "Modificar":
                  
                    if(obj.validaVacio())
                    {
                        tools.ImprimeErrorMsje("Array vacio");
                    }
                    else { 
                    	pos=obj.busSecuencialOrdenada(tools.LeerEntero("Numero a modificar:"));
                    
                    
                    if(pos>=0)
                    {
                    	
                    	obj.modificaDato(pos);
                    	
                    	 tools.ImprimeMsje("Dato modificado." + obj.imprimeDatos());
                    }
                    else
                    
                        tools.ImprimeErrorMsje("No se encuentra el dato");
                    }
                break;
                case "Eliminar":
                    if(obj.validaVacio())
                        tools.ImprimeErrorMsje("Arreglo Vacio");
                    else
                        pos = obj.busSecuencialOrdenada(tools.LeerEntero("Ingrese el valor"));
                    if(pos>=0)
                    {
                        tools.ImprimeMsje("Dato eliminado en la posicion: " + pos);
                        obj.eliminaDato(pos);
                    }
                    else
                        tools.ImprimeErrorMsje("Dato no encontrado");
                break;
                case "Salir":;
                break;
            }
        }
        while(!sel.equalsIgnoreCase("Salir"));
    }
}
