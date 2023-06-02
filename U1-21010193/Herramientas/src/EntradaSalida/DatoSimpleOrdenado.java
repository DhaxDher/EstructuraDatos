package EntradaSalida;

public class DatoSimpleOrdenado {
private Object datosOrdenados[];
private byte p;

public DatoSimpleOrdenado(byte tam) {
 datosOrdenados = new Object [tam];
  p=-1;
	}
public boolean validaVacio()
{
	return (p==-1); 
}
public void almacenarDato()
{
	 if(p<datosOrdenados.length)
	 {
		 datosOrdenados[p+1]= tools.LeerEntero("Escribe un numero");
		 p++;
	 }
	 else tools.ImprimeErrorMsje("Array lleno");
	 
}
public  String imprimeDatos()
{
	 String cad="";
	 for (int i = 0; i <=p; i++) {
		 cad+=i+"["+datosOrdenados[i]+"]"+"\n";
		
	}
	return ("\n"+cad);
}
public int busquedaOrdenada(int[] datosOrdenados, int dato) {
	 byte i=0;
	 while(i<datosOrdenados.length && datosOrdenados[i] <dato)
		 i++;
	 return(i>datosOrdenados.length || datosOrdenados[i] > dato)? -i : i;
}
}