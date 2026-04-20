package View;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainFrame {
    public MainFrame(){
        initComponents();
    }

    private JFrame mf;
    private JPanel mp;
    
    private void initComponents(){
        mf = new JFrame("Main Frame");
        mp = new JPanel(new BorderLayout());
        initNorth();
        initCenter();
        initSouth();
        mf.add(mp);
        mf.pack();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private JPanel north;
    private JLabel header;

    private void initNorth(){
        north = new JPanel(new FlowLayout());
        header = new JLabel("SUBASTAS");
        north.add(header, BorderLayout.NORTH);
        mp.add(north);
    }

    private JPanel center;
    private void initCenter(){
        center = new JPanel(new FlowLayout());
        crearTabla();
        mp.add(center, BorderLayout.CENTER);
    }
    
    private void crearTabla(){
        try {
            Object[][] datos = añadirDatos();
            String[] nombreColumnas = añadirNombresColumnas();
            //FIXME tabla no se añade a ningun panel?
            
            JTable tabla = new JTable(datos, nombreColumnas);
            
            //TODO Falta tambine un DefaultTableModel??
            JScrollPane scroll = new JScrollPane(tabla);
            mp.add(scroll);
        }
        catch (IOException exc){
            exc.getMessage();
        }
    }
    
    private Object[][] añadirDatos() throws IOException {
            File fichero = new File("C:\\Users\\AluDAM\\Documents\\ProyectosProgramacion\\ej911\\Subastas");
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);
            Object[][] vector = {
                {dis.readByte(), ""},
                {dis.readByte(), ""},
                {dis.readByte(), ""},
                {dis.readByte(), ""}
            };   
            return vector;
    }
    
    private String[] añadirNombresColumnas(){
        String[] nombresColumnas = new String[1];
        nombresColumnas[0] = "Listado de ficheros";
        return nombresColumnas;
    }

    private JPanel south;
    private JButton subasta;
    private JButton verContenido;
    private JButton salir;

    private void initSouth(){
        south = new JPanel(new FlowLayout());
        subasta = new JButton("Subasta");
        verContenido = new JButton("Ver contenido del Fichero");
        salir = new JButton("SALIR");
        south.add(subasta);
        south.add(verContenido);
        south.add(salir);
        mp.add(south, BorderLayout.SOUTH);
    }

    public void showFrame(){
        mf.setVisible(true);
    }

    public void hideFrame(){
        mf.setVisible(false);
    }

    public JButton getSubasta() {
        return subasta;
    }

    public JButton getVerContenido() {
        return verContenido;
    }

    public JButton getSalir() {
        return salir;
    }
    
}
