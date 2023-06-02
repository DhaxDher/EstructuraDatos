package Actualizacion;
import EntradaySalida.Tools;
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
			 datos[p+1]=Tools.leerString("Escribe un nombre de persona");
			 p++;
		 }
		 else Tools.imprimeError("Array lleno");
		 
	 }
	 public String imprimeDatos()
	 {
		 String cad=" ";
		 for (int i = 0; i <=p; i++) {
			 cad +=i+"["+datos[i]+"]"+"\n";
			
		}
		 return ("\n" + cad);
	 }
	 
	 public byte buscarSecuencial(Object dat) {
		 byte i=0;
		 
		 while (i<=p && !dat.equals(datos[i]))
		 i++;
		 
		 if(dat.equals(datos[i]))
			 
		 return(i);
		 
		 else {
			 i=-1;
		 }
			 return(i);
		 
	 }
	 public void eliminarDato(byte pos) {
		 for (int j=pos; j<=p; j++) {
	 
	 datos [j]=datos[j+1];
	 
	 }
	 p--;
	 }
	 
	    public int busquedaOrdenada(int[] datos, int dato) {
	        byte i = 0;
	        while (i < datos.length && (Integer)datos[i] < dato)//Menor a mayor
	            //while (i > datos.length && datos[i] > dato) Mayor a menor
	            i++;
	        return (i > datos.length || (Integer)datos[i] > dato)? -i: i;
	    }


}
