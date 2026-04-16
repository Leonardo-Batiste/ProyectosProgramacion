package View;

import java.awt.FlowLayout;
import javax.swing.*;

public class TablaInventario {
    public TablaInventario(){
        initComponents();
    }
    
    private JFrame mainFrame;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainFrame = new JFrame();
        
        mainPanel = new JPanel(new FlowLayout());
        
        crearTabla();
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
    }
    
    private void crearTabla(){
        Object[][] datos = añadirDatos();
        String[] nombreColumnas = añadirNombresColumnas();
        //FIXME tabla no se añade a ningun panel?
        JTable tabla = new JTable(datos, nombreColumnas);
        JScrollPane scroll = new JScrollPane(tabla);
        mainPanel.add(scroll);
    }
    
    private Object[][] añadirDatos(){
        
        Object[][] datos = new Object[][];
        return datos;
    }
    
    private String[] añadirNombresColumnas(){
        String[] nombresColumnas = new String[1];
        nombresColumnas[0] = "Listado de ficheros";
        return nombresColumnas;
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }
}
