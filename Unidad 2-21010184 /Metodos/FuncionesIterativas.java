package Actualizacion;
import javax.swing.JOptionPane;

import EntradaySalida.Tools;

public class FuncionesIterativas {
	

	public static void tabladeMultiplicar(byte num) {
		String tablas= " ";
		
		for (int j=1;j<=10;j++) {
			tablas+=num+"*"+j+"="+(num*j)+"\n";
		}
		Tools.imprimePantalla("Tabla de multiplicar\n"+tablas);
	}
	public static void imprimeArray( int a[]) {
		String lista=" ";
		
		for (byte j=0; j<a.length;j++)
			
			lista+=j + "["+a[j]+"]\n";
		
		Tools.imprimePantalla("LSITA DEL ARREGLO: \n"+lista);
	}
	public static int sumaDivisiones (int dato) {

		int k=1,suma=0;
		do 
		{
			if (dato % k==0)
				suma+=k;
			k++;
		}
		while (k<dato);
		return suma;
	}
	
	
	
	
	public static void ordenaBurbuja(int datos[]) {
		int i,j,aux;
		for (i=0; i<datos.length-1;i++)
		
			for (j=i+1; j<datos.length; j++)
			{
				if (datos[i]> datos[j]) {
					aux=datos[i];
					datos[i]=datos[j];
					datos[j]=aux;
				}
			}
	}
	
	public static String verArray(int datos[]) {
		String cad= " ";
		for (int k=0;k<datos.length;k++) {
		
			cad+= k+ "["+datos[k]+"]"+"\n";
		}
		return cad;
	}
	
	
	
	public static double Factorial(int dato) {
		int f=1, c=1;
		while (c<=dato) {
			f*=c;
			c++;
		}
		return f;
		
	}
	
	
	
	
	
	public static void verMatriz (int a[][]) {
		int i, j;
		String ca= " ";
		
		for (i  = 0; i<a.length; j++)
			
			for (j=0; j < a.length; j++)
				
				ca +=a[i][j] + " ";			
		
	}
	
	public static void leermatriz (int a [][]) {
		int i, j;
		
		for (i  = 0; i<a.length; j++)
			
			for (j=0; j < a.length; j++) {
				
				a[i][j] = Integer.parseInt(JOptionPane.showInputDialog(" Mensaje"));
			}	
		
	}
	
	
}
