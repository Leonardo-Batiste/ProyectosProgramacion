package Controller;

import View.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JOptionPane;

public class MainController {
    public MainController(){
        start();
    }
    
    MainFrame mf;
    
    private void start(){
        mf = new MainFrame();
        
        crearListenersMainFrame();
        
        mf.showFrame();
    }

    private void crearListenersMainFrame(){
        mf.getConfirmar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    crearCopia();
                }
                catch (IOException except){
                    except.getMessage();
                }
            }
        });
    }
    
    private void crearCopia() throws IOException {
            File origen = new File(mf.getOrigen().getText());
            FileInputStream fis = new FileInputStream(origen);
            BufferedInputStream bis = new BufferedInputStream(fis);

            File destino = new File(mf.getDestino().getText());
            FileOutputStream fos = new FileOutputStream(destino);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] puente = new byte[1024];
            int bytesLeidos;

            while ((bytesLeidos = bis.read(puente)) != -1){
                bos.write(puente, 0, bytesLeidos);
            }
            
            JOptionPane.showMessageDialog(null, "Se ha completado la copia correctamente.");

            bis.close();
            bos.close();
        }
}
