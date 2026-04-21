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
    
    DefaultTableModel dm;
    JTable tabla;
    private void crearTabla(){
        try{
            dm = new DefaultTableModel();
            
            //Añadir columnas
            Object[] columnas = crearColumnas();
            dm.setColumnIdentifiers(columnas);
            
            //Añadir filas
            crearFilas();
            
            tabla = new JTable(dm);
            center.add(tabla);
            JScrollPane sp = new JScrollPane(tabla);
            center.add(sp);
            tabla.setVisible(true);
        }
        catch (IOException excep){
            excep.getMessage();
        }
        
    }
    
    private Object[] crearColumnas(){
        Object[] columnas = new Object[]{"Listado de Ficheros"};
        return columnas;
    }
    
    private void crearFilas() throws IOException {
        File directorio = new File("C:\\Users\\AluDAM\\Documents\\ProyectosProgramacion\\ej911\\Subastas");
        File[] listado = directorio.listFiles();
        for (int i=0;i<listado.length;i++){
            dm.addRow(new Object[] {listado[i]});
        }
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

    public JTable getTabla() {
        return tabla;
    }

    public DefaultTableModel getDm() {
        return dm;
    }
    
    
    
}
