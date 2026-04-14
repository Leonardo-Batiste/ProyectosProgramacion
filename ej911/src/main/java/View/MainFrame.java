package View;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MainFrame {
    public MainFrame(){
        initComponents();
    }

    private JFrame mainFrame;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainFrame = new JFrame("Main Frame");
        mainPanel = new JPanel(new BorderLayout());
        initNorth();
        initCenter();
        initSouth();
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private JPanel north;
    private JLabel header;

    private void initNorth(){
        north = new JPanel(new FlowLayout());
        header = new JLabel("SUBASTAS");
        header.add(north);
        mainPanel.add(north);
    }

    private JPanel center;
    //TODO Poner la tabla aqui

    private void initCenter(){
        center = new JPanel(new FlowLayout());

        mainPanel.add(center);
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
        mainPanel.add(south);
    }

    public void showFrame(){
        mainFrame.setVisible(true);
    }

    public void hideFrame(){
        mainFrame.setVisible(false);
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
