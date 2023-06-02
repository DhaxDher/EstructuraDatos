//Es memoria estatica
package Actualizacion;
import EntradaSalida.tools;

public class DatosOrdenados{
private int ordenados[];//Definir en privado el array

private byte p; // Es un sub indice, equivalente a la posicion

//Despues se pone constructor que recibe tamaño para dimensionar(Reservar), debe tener el mismo nombre de la clase y nos dara un tamaño
public DatosOrdenados(int tam)//Un constructor no lleva punto y coma

{ //Todo constructor debe tener llave de inicio y final
   ordenados = new int[tam];// Se crea el arreglo para las posiciones
   p=-1;//Subindice, -1 para validar si esta vacio, porque las posiciones del array comienzan desde 0
}

public boolean validaVacio()
{
return(p==-1);
}

public String imprimeDatos()
{
  String cad="";
  for(int i=0;i<=p;i++){
     cad+=i+"["+ordenados[i]+"]"+"\n";//Se utiliza para imprimir los datos, sumando a cad la cadena consecutivamente y dandole un formato a la impresion
    }
   return "\n"+cad;
}
public byte busSecuencialOrdenada( int dat) //Estar bien atentos y saber si es un caracter, entero o cadena.
  {
    byte i=0;
    while(i<=p && ordenados[i]<dat)
    i++;
    return (byte)((i>p||ordenados[i]>dat)?-i:i);//Es otra forma de hacer el if, si es verdadero devuelve -i, falso i, si retorno valor positivo quiere decir que si se encuentra el valor
}
public void eliminaDato(int pos){ //La posicion te la da busqueda ordenada y se va haciendo un corrimiento
   for(int j=pos; j<p; j++) {
ordenados[j]= ordenados[j+1];
 }
 p--;
}

public void recorrePosiciones(byte pos){//El metodo recorre posiciones hacia el lado derecho para poder insertar un dato de forma ordenada
for(int j=p+1; j>pos; j--){
   ordenados[j]=ordenados[j-1];
  }
}
public void insertandoOrdenado()
{
  int dato= tools.LeerEntero("Dato a insertar:");
  if(validaVacio()) {ordenados[p+1]=dato;p++;}  
   else
   {
     byte pos=busSecuencialOrdenada(dato);

     if(pos>0) tools.ImprimeErrorMsje("Ya existe el dato");//Cantidad i positiva significa que ya se encuentra
        else
         {   pos*=-1; // convierte a la i en positivo
             recorrePosiciones((byte) (pos));
             ordenados[pos]=dato;
             p++;
           }
   }
}
public void modificaDato(byte existe) {
	int dato=0;
	
	if(existe==0)
	{
		do {
			dato=tools.LeerEntero("Escribe el nuevo dato menor a: "+ordenados[existe+1]);
			
		} while(dato>ordenados[existe+1]);
		ordenados[existe]=dato;
	}
	else
	{
		if(existe==p)
			do {
				dato=tools.LeerEntero("Escribe el nuevo dato mayor a:" +ordenados[existe-1]);
			} while(dato<ordenados[existe-1]);
		   ordenados[existe]=dato;
	}
	//else
		//if(existe>0 && existe<p)
			
}

}