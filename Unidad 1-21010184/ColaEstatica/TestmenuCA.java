package ColaEstatica;
import EntradaSalida.tools;
import javax.swing.JOptionPane;
public class TestmenuCA {

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
		ColaA<Integer>cola= new ColaA<Integer>(10);
	    String op;
		do {
			op=tools.boton(menu);
			
			switch(op) {
			case "Push":
				cola.push(tools.LeerEntero("Dame un valor"));
				tools.ImprimeMsje(""+cola.toString());
				
				break;
			case "Pop":
				if(cola.isEmpty()==false) {
				tools.ImprimeMsje("Dato eliminado: "+cola.pop());
				}
				else {
					tools.ImprimeErrorMsje("PILA VACIA");
				}
				break;
			case "Peek":
				if(cola.isEmpty()==false)
				tools.ImprimeMsje("Dato en el tope:"+cola.peek());
				else tools.ImprimeErrorMsje("COLA VACIA");
				break;
			case "Free":
				if(cola.isEmpty()==false) {
				new ColaA<Integer>(10);
				tools.ImprimeMsje("COLA VACIADA");
				}
				else {tools.ImprimeErrorMsje("COLA VACIA");
				}
				break;
				
			case "Imprimir":
				if(cola.isEmpty()==false)
				tools.ImprimeMsje(cola.toString());
				else tools.ImprimeErrorMsje("COLA VACIA");
				break;
			case "Salir":
				break;
			}
		}
		while(!op.equalsIgnoreCase("Salir"));
	}
}