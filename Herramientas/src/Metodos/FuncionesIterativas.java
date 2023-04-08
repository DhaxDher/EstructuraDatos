package Metodos;

import javax.swing.JOptionPane;

import EntradaSalida.tools;

public class FuncionesIterativas {
	public static void tablaMulti(byte num)
	{
		//string cad="";
		String tabla="";
		for(int j=1;j<=10;j++){
		//	cad+=num+"*"+j+"="+(num*j)+"\n";
			//("tabla de multiplicar: "\n);
		}
	}


public static void imprimeArray(int a[])
{
	String lista="";
	for(byte j=0;j<a.length;j++) {
		lista+=j+"["+a[j]+"]\n";
		tools.ImprimeMsje("\n"+lista);
	}
		
}

public static int sumaDivisiones(int dato)
{
	int k=1, suma=0;
	do {
		if(dato%k==0)
			suma+=k;
		k++;
	}
	while(k<dato);
	return suma;
}
public static boolean sonAmigos(int num1, int num2) {
    int sumaDivisores1 = sumaDivisoresPropios(num1);
    int sumaDivisores2 = sumaDivisoresPropios(num2);
    return (sumaDivisores1 == num2 && sumaDivisores2 == num1);
}

public static int sumaDivisoresPropios(int num) {
    int suma = 0;
    for (int i = 1; i <= num/2; i++) {
        if (num % i == 0) {
            suma += i;
        }
    }
    return suma;
}

public static void ordenaBurbuja(int datos[])
{
	int i, j, aux;
	for(i=0;i<datos.length-1;i++)
	
		for(j=i+1;j<datos.length;j++)
	{
		if(datos[i]<datos[j])
		{
			aux=datos[i];
			datos[i]=datos[j];
		datos[j]=aux;
		}
	}
	}
			


public static String verArray(int datos[])
{
	String cad="";
	for(int k=0;k < datos.length;k++)
	{
		cad+= k+"["+datos[k]+"]"+"\n";
	}
	return cad;
}
public static double factorial(int dato)
{
	int f=1,c=1;
	while(c<=dato)
	{
		f*=c;
		c++;
	}return f;
}
public static String decimalOctal(int dato) {
	String octal= "";
	while (dato!=0)
	{
		octal=dato%8+octal;
		dato/=8;
	}
	return octal;
}
public static void leerMatriz(int a[][])
{
	int i,j;
	for(i=0;i<a.length;i++)
		for(j=0;j<a[0].length; j++)
	{
			a[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "dato: "));
	}
}

public static void verMatriz(int a[][])
{
	int i,j;
	String ca="";
	for(i=0;i<a.length;i++) {
		for(j=0;j<a[0].length; j++)
	{
			ca+=a[i][j]+" ";	
	}
		ca+="\n";
	}
	tools.ImprimeMsje("Array bidimensional"+"\n"+ca);
	
}
public static String rectangulo(int altura, int base) {
	String cad="";
	if(altura >0) {
		cad+= " * ";
		if(base>0)
			cad += " * "+ cad + "\n";
			
			return cad + rectangulo(altura-1 , base);
		}
	return cad;
}
}