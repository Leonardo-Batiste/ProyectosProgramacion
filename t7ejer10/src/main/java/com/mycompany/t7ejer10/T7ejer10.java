package t7ejer10;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author leona
 */
public class Main {

    public static void main(String[] args) {
        //k-->Español y V--> ingles
        HashMap<String, String> diccionario = new HashMap<>();
        
        diccionario.put("Programa", "Program");
        diccionario.put("Bienvenida", "Welcome");
        diccionario.put("Cambio", "Change");
        diccionario.put("Modificar", "Modify");
        diccionario.put("Tipo", "Type");
        
        boolean condicionWhile = true;
        while (condicionWhile){
           
            int mensaje = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer, 0-Salir, o 1-Continuar"));
            
            if (mensaje==0){
                JOptionPane.showMessageDialog(null, "Saliendo del programa");
                break;
            }
            else{
                String palabraEspañol = JOptionPane.showInputDialog("Introduce una palabra en español para saber su traduccion.");
            
                if (diccionario.containsKey(palabraEspañol)){
                    
                    String TraduccionDePalabraEspañol = diccionario.get(palabraEspañol);
                    
                    JOptionPane.showMessageDialog(null, "<"+palabraEspañol +"> se traduce a <"+ TraduccionDePalabraEspañol+">");
                    
                }
                else {
                    
                    String traduccion = JOptionPane.showInputDialog("La palabra que has introducido, no se encuentra en el diccionario, porfavor introduce la traduccion al ingles.");
                    diccionario.put(palabraEspañol, traduccion);
                    String nuevaTraduccion = diccionario.get(palabraEspañol);
                    
                    JOptionPane.showMessageDialog(null, "Muchas gracias por la traduccion. La palabra es la siguiente:");
                    JOptionPane.showMessageDialog(null, "<"+palabraEspañol+"> se traduce a <"+nuevaTraduccion+">");
                
                }
            }
        } 
    }
}