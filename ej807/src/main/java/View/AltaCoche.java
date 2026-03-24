package View;

import java.awt.*;
import javax.swing.*;
import Model.*;

public class AltaCoche {
    
    public AltaCoche(){
        
        initComponents();
        
    }
    
    private JFrame altaCocheFrame;
    private JPanel altaCochePanel;
    
    private void initComponents(){
        
        altaCocheFrame = new JFrame("Alta Coche");
        
        altaCochePanel = new JPanel(new BorderLayout());
        
        initNorth();
        
        initCenter();
        
        initSouth();
        
        
        altaCocheFrame.add(altaCochePanel);
        
        altaCocheFrame.pack();
        
        altaCocheFrame.setLocationRelativeTo(null);
        
        altaCocheFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
    private JLabel altaCocheL;
    
    private void initNorth(){
        
        altaCocheL = new JLabel("ALTA COCHE");
        
        altaCochePanel.add(altaCocheL, BorderLayout.NORTH);
        
    }
    
    private JPanel center;
    private JLabel codigoL;
    private JTextField codigo;
    private JLabel matriculaL;
    private JTextField matricula;
    private JLabel modeloL;
    private JTextField modelo;
    private JLabel precioL;
    private JTextField precio;
    private JLabel enVentaL;
    private JRadioButton enVenta;
    
    private void initCenter(){
        
        center = new JPanel(new GridLayout(5, 2));
        
        codigoL = new JLabel("CODIGO");
        
        codigo = new JTextField(Coche.getProximoCodigo()); 
        
        codigo.setEditable(false);
        
        matriculaL = new JLabel("MATRICULA");
        
        matricula = new JTextField();
        
        modeloL = new JLabel("MODELO");
        
        modelo = new JTextField();
        
        precioL = new JLabel("PRECIO");
        
        precio = new JTextField();
        
        enVentaL = new JLabel("EN VENTA");
        
        enVenta = new JRadioButton("", true);
        
        enVenta.setEnabled(false);
        
        center.add(codigoL);
        
        center.add(codigo);
        
        center.add(matriculaL);
        
        center.add(matricula);
        
        center.add(modeloL);
        
        center.add(modelo);
        
        center.add(precioL);
        
        center.add(precio);
        
        center.add(enVentaL);
        
        center.add(enVenta);
        
        altaCochePanel.add(center, BorderLayout.CENTER);
        
    }
    
    private JPanel south;
    private JButton alta;
    private JButton limpiarFormulario;
    private JButton volver;
    
    private void initSouth(){
        
        south = new JPanel(new GridLayout(1, 3));
        
        alta = new JButton("ALTA");
        
        limpiarFormulario = new JButton("LIMPIAR FORMULARIO");
        
        volver = new JButton("VOLVER");
        
        south.add(alta);
        
        south.add(limpiarFormulario);
        
        south.add(volver);

        altaCochePanel.add(south, BorderLayout.SOUTH);
    }
    
    public JButton getAltaBoton(){
        
        return alta;
        
    }
    
    public JButton getLimpiarFormularioBoton(){
        
        return limpiarFormulario;
        
    }
    
    public JButton getVolverBoton(){
        
        return volver;
        
    }

    public JTextField getMatricula() {
        return matricula;
    }

    public JTextField getModelo() {
        return modelo;
    }

    public JTextField getPrecio() {
        return precio;
    }

    public JTextField getCodigo() {
        return codigo;
    }
    
    public JFrame getAltaCocheFrame() {
        return altaCocheFrame;
    }

    public void setCodigo(String codigo) {
        this.codigo.setText(codigo);
    }
    
    
    

    JDialog mensajeAltaCorrecta;
    
    public void altaCorrecta(JFrame parent){
        
        mensajeAltaCorrecta = new JDialog(parent, "Se ha realizado el alta correctamente", true);
        
        mensajeAltaCorrecta.pack();
        
        mensajeAltaCorrecta.setLocationRelativeTo(parent);
        
        mensajeAltaCorrecta.setVisible(true);
        
    }

    
    private void cambiarCodigo(){
        
        setCodigo(Coche.getProximoCodigo());
        
    }
    
    public void limpiarFormulario(){
        
        matricula.setText("");
        modelo.setText("");
        precio.setText("");
        cambiarCodigo();
        
    }
    
    
    public void showFrame(){
        
        altaCocheFrame.setVisible(true);
        
    }
    
    public void hideFrame(){
        
        altaCocheFrame.setVisible(false);
        
    }
    
}
