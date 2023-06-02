package EntradaSalida;

import javax.swing.JOptionPane;

public class tools {
    public static byte LeerByte(String msje){
        return(Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Lectura Byte",JOptionPane.QUESTION_MESSAGE)));
    }

    public static int LeerEntero(String msje){
        return(Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Lectura Int",JOptionPane.QUESTION_MESSAGE)));
    }

    public static String LeerString(String msje){
        return(JOptionPane.showInputDialog(null,msje,"Lectura String",JOptionPane.QUESTION_MESSAGE));
    }

    public static float LeerFloat(String msje){
        return(Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Lectura Float",JOptionPane.QUESTION_MESSAGE)));
    }

    public static char LeerChar(String msje){
        return(JOptionPane.showInputDialog(null,msje,"Lectura Char",JOptionPane.QUESTION_MESSAGE).charAt(0));
    }

    public static short LeerShort(String msje){
        return(Short.parseShort(JOptionPane.showInputDialog(null,msje,"Lectura Short",JOptionPane.QUESTION_MESSAGE)));
    }

    public static double LeerDouble(String msje){
        return(Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Lectura Double",JOptionPane.QUESTION_MESSAGE)));
    }

    public static long leerLong(String msje){
        return(Long.parseLong(JOptionPane.showInputDialog(null,msje,"Lectura Long",JOptionPane.QUESTION_MESSAGE)));
    }

    public static void ImprimeMsje(String msje){
        JOptionPane.showMessageDialog(null,msje,"Salida",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void ImprimeErrorMsje(String msje){
        JOptionPane.showMessageDialog(null,msje,"Salida",JOptionPane.INFORMATION_MESSAGE);
    }
    public static String desplegable(String menu) {
    	String valores[]=menu.split(",");
    	String res=(String)JOptionPane.showInputDialog(null,"M E N U"," Selecciona opcion:",JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
    	return(res);
    	}
    public static String boton(String menu) 
    {
    	String valores[]=menu.split(",");
    	int n;
    	n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", " M E N U",JOptionPane.NO_OPTION,JOptionPane.QUESTION_MESSAGE,null, valores,valores[0]); // botón determinado
    	return ( valores[n]);
    	}
    public class ToolsPanel{
    	public static byte leerByte(String msje) {
    		return(Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Lectura Byte",JOptionPane.QUESTION_MESSAGE)));
    	}
    }
}
