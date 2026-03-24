package View;

import Model.Coche;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
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
    
    /**
     * Esto, simplemente, cambia el inputMap, y ActionMap de center, y cuando
     * este metodo termine, los originales, cuando se presione la tecla enter
     * el JPanel original "center", hara el setEnable.
     */
    public void añadirPulsadoTeclaEnter(){
        
        //Se crea el keystroke
        KeyStroke ks = KeyStroke.getKeyStroke("ENTER");
        
        //Se copia el inputmap de center en im 
        InputMap im = center.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        //Se crea la relacion de keystroke y teclapulsada
        im.put(ks, "teclaPulsada");
        
        //Se crea la accion
        Action miAccion = new AbstractAction() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ArrayList<Coche> lista = Coche.getListaCoches();
                
                String codigoCoche = codigo.getText();    
                
                for (Coche c : lista){
                    
                    if (c.getCodigo().equals(codigoCoche)){
                        
                        matricula.setText(c.getMatricula());
                        
                        modelo.setText(c.getModelo());
                        
                        precio.setEditable(true);
                        
                        enVenta.setEnabled(true);
                        
                        modificarBtn.setEnabled(true);
                        
                        break;
                        
                    }
                }
            }
        };
        
        //Se añade el actionmap de center a la variableam
        ActionMap am = center.getActionMap();
        
        //Se crea la relacion de actionmap
        am.put("teclaPulsada", miAccion);
        
    }
    
    public void cambiarPrecioYVenta(){
        
        ArrayList<Coche> lista = Coche.getListaCoches();
        
        String codigoEnJTextField = codigo.getText();
        
        Double precioCoche = Double.parseDouble(precio.getText());
        
        boolean estaEnVenta = enVenta.isSelected();
        
        //Selecciona el coche, mediante el codigo que haya escrito el usuario en el JTextField codigo para buscarlo, y cambia sus datos
        for (Coche c : lista){
            
            String codigoCoche = c.getCodigo();
            
            if (codigoEnJTextField.equals(codigoCoche)){
                
                c.setPrecio(precioCoche);
                
                c.setaLaVenta(estaEnVenta);
                
                limpiarFormulario();
                
                precio.setEditable(false);
                        
                enVenta.setEnabled(false);
                        
                modificarBtn.setEnabled(false);
                
            }
            
        }
        
    }
    
    public void limpiarFormulario(){
        
        codigo.setText("");
        matricula.setText("");
        modelo.setText("");
        precio.setText("");
        
         precio.setEditable(false);
                        
        enVenta.setEnabled(false);
                        
        modificarBtn.setEnabled(false);
        
    }
    
    public JFrame getModificarCocheFrame(){
        
        return mainFrame;
        
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
