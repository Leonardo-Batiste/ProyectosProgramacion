package View;

import java.awt.*;
import javax.swing.*;

public class ModificarCoche {
    
    public ModificarCoche(){
        
        initComponents();
        
    }
    
    JFrame mainFrame;
    JPanel panelPrincipal;
    
    private void initComponents(){
        
        mainFrame = new JFrame("Los Enlaces");
        
        panelPrincipal = new JPanel(new BorderLayout());
        
        initNorth();
        
        initCenter();
        
        initSouth();
        
        mainFrame.add(panelPrincipal);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
    private JLabel concesionarioL;
    
    private void initNorth(){
        
        concesionarioL = new JLabel("CONCESIONARIO");
        
        panelPrincipal.add(concesionarioL, BorderLayout.NORTH);
        
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
        
        codigo = new JTextField();
        
        matriculaL = new JLabel("MATRICULA");
        
        matricula = new JTextField();
        matricula.setEditable(false);
        
        modeloL = new JLabel("MODELO");
        
        modelo = new JTextField();
        modelo.setEditable(false);
        
        precioL = new JLabel("PRECIO");
        
        precio = new JTextField();
        precio.setEditable(false);
        
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
        
        panelPrincipal.add(center, BorderLayout.CENTER);
        
    }
    
    private JPanel south;
    private JButton modificarBtn;
    private JButton limpiarFormularioBtn;
    private JButton volverBtn;
    
    private void initSouth(){
        
        south = new JPanel(new FlowLayout());
        
        modificarBtn = new JButton("MODIFICAR");
        modificarBtn.setEnabled(false);
        
        limpiarFormularioBtn = new JButton("LIMPIAR FORMULARIO");
        
        volverBtn = new JButton("VOLVER");
        
        
        south.add(modificarBtn);
        
        south.add(limpiarFormularioBtn);
        
        south.add(volverBtn);
        
        panelPrincipal.add(south, BorderLayout.SOUTH);
        
    }
    
    
    public void showFrame(){
        
        mainFrame.setVisible(true);
        
    }
    
    public void hideFrame(){
        
        mainFrame.setVisible(false);
        
    }
    
    public void pulsadoTeclaEnter(){
        
        
        
    }

    public JButton getModificarBtn() {
        return modificarBtn;
    }

    public void setModificarBtn(JButton modificarBtn) {
        this.modificarBtn = modificarBtn;
    }
    
    

    public JButton getLimpiarFormularioBtn() {
        return limpiarFormularioBtn;
    }

    public JButton getVolverBtn() {
        return volverBtn;
    }

    public JTextField getMatricula() {
        return matricula;
    }

    public void setMatricula(JTextField matricula) {
        this.matricula = matricula;
    }

    public JTextField getModelo() {
        return modelo;
    }

    public void setModelo(JTextField modelo) {
        this.modelo = modelo;
    }

    public JTextField getPrecio() {
        return precio;
    }

    public void setPrecio(JTextField precio) {
        this.precio = precio;
    }
    
    
    
    
}
