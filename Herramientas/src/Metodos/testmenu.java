package Metodos;
import EntradaSalida.tools;
import javax.swing.JOptionPane;
public class testmenu {
	public static void main(String args[])
	{
		menu3("Push,Pop,Peek,Free,Salir");
		}
	public static String boton(String menu)
	{
		String valores[] = menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","MENU",JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE, null
				,valores,valores[0]);
		return (valores[n]);
	}
	public static void menu3(String menu)
	{
		
		String sel="";
		do {
			sel=tools.boton(menu);
			switch(sel) {
			case "Push":
				
				break;
			case "Pop":
				
				break;
			case "Peek":
				
				break;
			case "Free":
				break;
				
			case "Salir":
				break;
			}
		}
		while(!sel.equalsIgnoreCase("Salir"));
	}
}