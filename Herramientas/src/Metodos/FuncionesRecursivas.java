package Metodos;

import javax.swing.JOptionPane;

import EntradaSalida.tools;

public class FuncionesRecursivas {
	public static int funcionIterativa1(int j, int n)
	{
		if (j<=n)
		{
	System.out.println(j);
	return funcionIterativa1(j+1,n);
		}
		else return n;
	}

public static String funcionIterativa2(int j, int n)
{
	if(j<=n)
	{
		//tools.imprimePantalla("\n"+j);
		
		return "\n" +j+funcionIterativa2(j+1,n);
	}
	else return "";
	//return (j<=n)? "\n"+j+funcionIterativa2(j+1,n):"";
}
public static String funcionIterativa3 (int j, int n)
{   //Condicion base   invocacion de la clase a si misma
	return (j<=n)? "\n"+j+funcionIterativa3(j+1,n):"";
}
public static String tablaMulti(int num, int i) {
	if(i<=10)
	{
		return num+"*"+i+"="+(num*i)+"\n"+tablaMulti(num, (i+1));
	}
	else return "";
}
public static int sumaDivisores2(int dato, int k)
{
	int suma=0;
	if(k<dato) {
		if(dato%k==0)	suma+=k;
		return suma+sumaDivisores2(dato,k+1);
		
	}
	 return suma;
		
}

public static int sumaDivisoresAmigos(int dato1, int dato2, int k)
{
	int suma1=0;
	int suma2=0;
	if(k<dato1||k<dato2) {
		if(dato1%k==0||dato2%k==0)	
		suma1+=k;
		suma2+=k;
		
		return suma1+sumaDivisoresAmigos(dato1, dato2, k+1);
		
	}
	 return suma1;
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
public static String verArray(int j, int datos[]) {
	if(j<datos.length) {
		return "\n" + j + "["+datos[j]+"]"+verArray((j+1),datos);
	}
	else {
		return "";
	}
}
public static String ordenaBurbuja(int datos[], int i) {
	if(i<datos.length-1) {
		return burbujaIntercambio(datos,i,i+1)+ordenaBurbuja(datos,i+1);
	}else {
		return "";
	}
}
public static String burbujaIntercambio(int datos[],int i,int j) {
	int aux=0;
	if(j<datos.length) {
		if(datos[i]>datos[j]) {
			aux=datos[i];
			datos[i]=datos[j];
			datos[j]=aux;
		}
		return burbujaIntercambio(datos,i,j+1);
	}
	return "";
}
public static String printFact(int numero, long factorial) {
    return (numero <=  20)? numero + " = " + factorial + "\n" + printFact(numero + 1, factorial * (numero + 1))
    : "";
}
public static int deciOctal(int nOctal, int cont, int decimal)
{
	if(decimal!=0)
		return deciOctal((nOctal+((decimal%8)*cont)),cont*10, decimal/8);
	return nOctal;
}
public static String valorOctal(int dato, int i)
{
	if(dato<=i) {
		return "\n"+dato+"En octal"+deciOctal(0,1,dato)+valorOctal(dato+1,i);
	} else {
		return "";
	}
}
public static String listadoFac(int k)
{
	if(k<=15)
	{
		return k+"\n"+factorialRecur(k,1)+listadoFac(k+1);
	}
	else return "";
	
}
public static double factorialRecur(int dato, int c) {
	if(dato==0||dato==1) return 1;
	else
		if(c<=dato)
		return c*factorialRecur(dato,c+1);
		else return 1;
}
public static String decimalOctalRecur(int dato)
{
	if(dato!=0)
	{
		return dato%8 + decimalOctalRecur(dato/8);
	}
	else return "";
}
public static String listadoOctal(int k)
{
	if(k<=20)
	{
		return k+"\n"+decimalOctalRecur(k)+listadoOctal(k+1);
	}
	else return "";
}
public static String leerMatrizR(int a[][], int i, int j)
{
	if(i<a.length) {
	a[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "dato: "));
	}
	if (j<a[0].length-1) {
		return a[i][j]+leerMatrizR(a,i,j+1);
	}
	if(j==a[0].length-1) {
		return a[i][j]+leerMatrizR(a,i+1,0);
	}
	
	else {
		return "";
	}
	
}

/*public static void leerMatriz(int a[][])
{
	int i,j;
	for(i=0;i<a.length;i++)
		for(j=0;j<a[0].length; j++)
	{
			a[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "dato: "));
	}*/
public static String veerMatrizR(int a[][], int i, int j)
{
	String ca="";
	ca+=a[i][j]+"";
	
	
	if (j<a[0].length-1) {
		return ca+veerMatrizR(a,i,j+1)+leerMatrizR(a,i,j+1);
	}
	if(j==a[0].length-1){
		return ca+veerMatrizR(a,i+1,0)+leerMatrizR(a,i+1,j);
	}
	
	else {
		return"";
	}
	
}
public static String verMatrizR(int a[][], int j, int i) {
	String ca="";
	if(i<a.length) {
		if(j<a[0].length){
		{
			ca+=a[i][j]+"";
			tools.ImprimeMsje("Array bidimensional"+"\n"+ca);
		}
		return ca+"\n"+ leerMatrizR(a, i, j)+verMatrizR(a,i+1,j+1);
		}
	}
	return "";
}
public static String Valores(int a[], int b[], int i) {
	int contador=1;
	String cad="";
	if(a[i]>1) {
		a[i+1]=a[i]/2;
		contador++;
	
	if (i<contador) {
		b[i+1]=b[i]*2;	
	}
	if(a[i]%2!=0) {
		cad+=b[i];
	}
	return cad + Valores(a,b,i+1);
	}
	else {
		return "";
	}
	
}
/*public static int ackerman(int m, int n, int valor) {
	if(m==0) {
		valor=n+1;
	}
	if(m>0 && n==0) {
		valor=m+(n-1);
		valor=(m-1)+valor;
	}
	if(m>0&&n>0) {
		valor=m-1;
		valor=valor+1;
	}
	return valor+ackerman()
}
/*public static void verMatriz(int a[][])
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
	
}*/
}
//Diseñar un metodo de clase que reciba como parametro un valor entero e imprima la tabla de multiplicar.