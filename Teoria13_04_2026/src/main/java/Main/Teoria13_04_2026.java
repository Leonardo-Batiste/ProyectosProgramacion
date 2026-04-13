package Main;

import java.io.*;

public class Teoria13_04_2026 {

    public static void main(String[] args) {
        try {
            /*
            File fichero = new File("prueba.txt");
            FileWriter fichEsc = new FileWriter(fichero);
            fichEsc.write('c');
            fichEsc.write('H');
            fichEsc.write('a');
            fichEsc.write("Adios");
            fichEsc.write("105");
            fichEsc.write(105); //Escribira caracter con codigo 105 = i
            fichEsc.close();
            
            System.out.println(System.getProperty("user.dir")); //Directorio actual
            
            FileReader fr = new FileReader(fichero);
            int c = fr.read();
            while (c != -1){
                System.out.println((char)c);
                c = fr.read();
            }
            
            fr.close();
            */
            
            /*
            File fichero = new File("prueba.dat");
            FileOutputStream fos = new FileOutputStream(fichero);
            fos.write('c');
            fos.write(9);
            fos.close();
            FileInputStream fis = new FileInputStream(fichero);
            System.out.println((char)fis.read() + " " + fis.read() + " " + fis.read());
            */
            
            File fichero = new File("prueba.dat");
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.write(345634324);
            dos.writeLong(23423874892374l);
            dos.writeDouble(5.5);
            dos.writeUTF("Hola");
            dos.writeBoolean(true);
            dos.close();
            fos.close();
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readInt() + " " + dis.readLong() + " " + dis.readUTF() + " " + dis.readBoolean());
            dis.close();
            fis.close();
            
        }
        catch (IOException e){
            e.getMessage();
            //System.out.println("Error");
        }
    }
}