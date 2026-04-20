package View;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.swing.table.*;

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
        north.add(header);
        mp.add(north, BorderLayout.NORTH);
    }

    private JPanel center;
    private void initCenter(){
        center = new JPanel(new FlowLayout());
        crearTabla();
        mp.add(center, BorderLayout.CENTER);
    }
    
    //https://hyperskill.org/learn/step/12402
    private void crearTabla(){
        try{
            Object[] columnas = crearColumnas();
            Object[][] filas = crearFilas();
            DefaultTableModel dm = new DefaultTableModel();
            //Añadir columnas
            dm.setColumnIdentifiers(columnas);
            //Añadir filas
            for (Object[] datosFilas : filas){
                dm.addRow(datosFilas);
            }
        }
        catch (IOException excep){
            excep.getMessage();
        }
        
    }
    
    private Object[] crearColumnas(){
        Object[] columnas = new Object[]{"Hola"};
        return columnas;
    }
    
    private Object[][] crearFilas() throws IOException {
        Object[][] filas;
        File fichero = new File("C:\\Users\\AluDAM\\Documents\\ProyectosProgramacion\\ej911\\Subastas");
        FileInputStream fis = new FileInputStream(fichero);
        DataInputStream dis = new DataInputStream(fis);
        //TODO return todo lo de dentro de subastas
        
        return filas;
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
