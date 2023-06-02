package MemoriaDinamica;
import EntradaSalida.tools;
import javax.swing.JOptionPane;
public class testmenu {

	public static void main(String args[])
	{
		menu3("Push,Pop,Peek,Free,Imprimir,Salir,");
		}
	
	public static String boton(String menu)
	{
		String valores[] = menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","PILAS",JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE, null
				,valores,valores[0]);
		return (valores[n]);
	}
	public static void menu3(String menu)
	{
		PilaC<Integer>pila= new PilaC<Integer>();
	    String op;
		do {
			op=tools.boton(menu);
			
			switch(op) {
			case "Push":
				pila.push(tools.LeerEntero("Dame un valor"));
				tools.ImprimeMsje(""+pila.toStringP());
				
				break;
			case "Pop":
				if(pila.isEmpty()==false) {
				tools.ImprimeMsje("Dato eliminado: "+pila.pop());
				}
				else {
					tools.ImprimeErrorMsje("PILA VACIA");
				}
				break;
			case "Peek":
				if(pila.isEmpty()==false)
				tools.ImprimeMsje("Dato en el tope:"+pila.peek());
				else tools.ImprimeErrorMsje("PILA VACIA");
				break;
			case "Free":
				if(pila.isEmpty()==false) {
				while(pila.isEmpty()==false) {
					pila.pop();
				}
				tools.ImprimeMsje("PILA VACIADA");
				}
				else tools.ImprimeErrorMsje("PILA VACIA");
				break;
				
			case "Imprimir":
				if(pila.isEmpty()==false)
				tools.ImprimeMsje(pila.toStringP());
				else tools.ImprimeErrorMsje("PILA VACIA");
				break;
			case "Salir":
				break;
			}
		}
		while(!op.equalsIgnoreCase("Salir"));
	}
}