package Actualizacion;
import EntradaSalida.tools;

public class DatoSimple {
		
		 private Object datos[];
		 private byte p;
		 
		 public DatoSimple(byte tam)
		 {
			 datos=new Object[tam];
			 p=-1;
			  }
		 public boolean validaVacio()
		 {
			return (p==-1); 
		 }
		 public void almacenarDato()
		 {
			 if(p<datos.length)
			 {
				 datos[p+1]= tools.LeerEntero("Escribe un numero");
				 p++;
			 }
			 else tools.ImprimeErrorMsje("Array lleno");
			 
		 }
		 public  String imprimeDatos()
		 {
			 String cad="";
			 for (int i = 0; i <=p; i++) {
				 cad+=i+"["+datos[i]+"]"+"\n";
				
			}
			return ("\n"+cad);
		 }
		 public byte buscarSecuencial(Object dat) {
			 byte i=0;
			 while(i<=p && !dat.equals(datos[i]))
				 i++;
			 return (dat.equals(datos[i]))?i:-1;
		 }
		 public void eliminaDato(byte pos) {
			 for(int j = pos; j <= p; j++) {
				 datos[j] = datos[j+1];
				 
			 }
			 p--;
		 }
		 public int busquedaOrdenada(int[] datos, int dato) {
			 byte i=0;
			 while(i<datos.length && datos[i] <dato)
				 i++;
			 return(i>datos.length || datos[i] > dato)? -i : i;
		 }
		}

//equals, equalsignorecase es solo para cadenas, no para objetos, regresar la posicion

