package Actualizacion;

import javax.swing.JOptionPane;

import EntradaySalida.Tools;
public class FuncionesRecursivas {
	
	public static void xD(int numero){
        int suma=0, cont =0;
        while(cont<numero) {
            if (numero % 2 == 0) {
                suma += cont;
                cont++;
            } else
                cont++;
        }
        Tools.imprimePantalla(suma);
    }
	
	public static void recursiva( int numero,int contador,int suma) {
		
		if (contador<numero) {
			
			if (numero%2 ==0 )
				recursiva(numero, contador+1, suma + contador);
				else 
					recursiva(numero,contador+1,suma);
			}
		
		Tools.imprimePantalla(suma);
	}
	
	public static void tablaMultiplicar(byte n){
        String tabla = "";
        int i=1;
        while(i<=10){
            tabla+=n+"x"+i+"="+n*i+"\n";
            i++;
        }
        Tools.imprimePantalla(tabla);
    }
	 
	public static String tabla(int numero, int multi) {
		
		if (multi <=10) 
		
			return "\n" + numero +"x"+ multi + "=" +numero * multi +tabla(numero,multi+1);
		
		else 
			return " ";
	}
	
	public static int potenciaNumeros(int num1, int num2)
    {
        int potencia = num1;

        for (int i = 1; i<=num2; i++)
        {
            potencia = potencia*num1;
        }

        return potencia;
    }
	
	public static int potencia(int num1, int num2, int pot, int cont) {
		
		if (cont < num2)
			
			return potencia(num1, num2, pot*num1, cont+1) ;
		
			return pot;
	}
	
	
	public static String ordenaBurbuja(int datos[],int i) {
		
		if (i < datos.length - 1) {
			
			
			return  burbuja_Intercambio(datos, i, i+1)+ordenaBurbuja(datos,i+1);
		}
		else return "  ";
	}
	
	public static String burbuja_Intercambio(int datos[],int i, int j) {
		int aux=0;
		
		if (j<datos.length) {
			
			if (datos[i]>datos[j]) {
				aux=datos[i];
				datos[i]=datos[j];
				datos[j]=aux;
			}
			return burbuja_Intercambio(datos, i, j+1);
		}
		return " ";
	}
	
	
	
	/*public static String verArray(int j, int a[]) {
        if (j < a.length) {
            return "\n" + j + "[" + a[j] + "]" + verArray((j + 1), a);
        } else return "";
    }*/
	
	public static String verArray(int datos[], int k) {
	    if (k == datos.length) {
	        return "";
	    } else {
	        return k + "[" + datos[k] + "]\n" + verArray(datos, k+1);
	    }
	}
	
	
	
	public static void imprimirFactoriales() {
	    for (int i = 1; i <= 20; i++) {
	        int factorial = 1;
	        for (int j = 1; j <= i; j++) {
	            factorial *= j;
	        }
	        System.out.println(i + "! = " + factorial);
	    }
	}

	
	
	
	
	
	public static int decimalOctal(int nOctal,int cont, int decimal)
    {
        if(decimal!=0)
        	
            return decimalOctal((nOctal+((decimal %8)*cont)),cont*10,decimal/8);
        
        return nOctal;
    }
	
	public static String impresionRecursiva(int j, int n) {
        if (j <= n) {
            return "\n" +j+ " : " + decimalOctal(0,1,j)+impresionRecursiva(j+1,n);
        } else {
            return "";
     
        }
        
        
        
        
        
        
        
    }
	public static String listadodefactoriales(int k) {
		if (k<=15)
		{
			return k+ " Factorial\n "+factorialrecur(k,1)+listadodefactoriales(k+1);
		}
		return " ";
	}
	public static double factorialrecur(int dato, int c) {
		
		if (dato == 0 || dato == 0) return 1;
		
		else
			if
			(c<=dato)
				
			return c * factorialrecur( dato,  c+1);
		
			else return 1;
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
	
	
	
	
	public static void leerMatriz1(int a[][], int i) {
		if(i<a.length) {
			leerMatriz2(a,0,i);
			leerMatriz1(a,i+1);
		}
			
	}
	
	public static void leerMatriz2(int a[][], int j, int i) {
	
		if(j<a[i].length) {
			a[i][j]=Tools.leerInt("Ingrese un numero");
			leerMatriz2(a, j+1, i);
		}	
	}
	public static int multiplicacionRusaRecursiva(int a, int b) {
	    if (a == 1) {
	        return b;
	    } else if (a % 2 == 0) {
	        return multiplicacionRusaRecursiva(a / 2, b * 2);
	    } else {
	        return b + multiplicacionRusaRecursiva(a / 2, b * 2);
	    }
	}
	
	public static int ackermann(int m, int n) {
	    if (m == 0) {
	        return n + 1;
	    } else if (n == 0) {
	        return ackermann(m - 1, 1);
	    } else {
	        return ackermann(m - 1, ackermann(m, n - 1));
	    }
	}
	public static float solve_rec(float m,float n){
        if(m == 0){
            return n+1;
        }else if(m > 0 && n == 0){
            return solve_rec(m-1,1);
        }else{
            return solve_rec(m-1,solve_rec(m,n-1));
        }
    }


	

}


	
	




// disenar los siguentes metodos recursivos
	//imprimir del 1 al 15 y su correspondiente valor en octal
	//imprimir del 1 al 20 y correspondiente valor factorial
	







