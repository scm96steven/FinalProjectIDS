/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojecttfis;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Adalberto
 */
public class ManejoTxt {
    String documentName;
    public void leerHistorialActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        //Se lee el historial si existe con testToArray(). Si no existe lanza un mensaje de que no la encontro.
        String[] emptyArr = {"No existe un historial anterior."};
        historialAnterior.setListData(emptyArr);
        historialAnterior.setVisible(true);
        try {
            String[] str = textToArray();
            historialAnterior.setListData(str);
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }


    }                                             

    public void arrayToText(String[] arr) throws IOException {
        // Itera el arreglo para grabarlo linea por linea en el txt.
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("historial.txt"));

        FileWriter fw = new FileWriter("historial.txt");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                fw.write(arr[i] + "\n");
            }
        }
        fw.close();
    }
    public String[] textToArray() throws FileNotFoundException {
        //Esta funcion sirve para leer un txt y pasarlo a un array.
        
        String[] arr = null;
        List<String> itemsSchool = new ArrayList<String>();

        try {
            FileInputStream fstream_school = new FileInputStream("historial.txt");
            DataInputStream data_input = new DataInputStream(fstream_school);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(data_input));
            String str_line;

            while ((str_line = buffer.readLine()) != null) {
                str_line = str_line.trim();
                if ((str_line.length() != 0)) {
                    itemsSchool.add(str_line);
                }
            }

            arr = (String[]) itemsSchool.toArray(new String[itemsSchool.size()]);
        } catch (Exception e) {
            // Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println(arr[0] + arr.length);
        return arr;
    }


}
