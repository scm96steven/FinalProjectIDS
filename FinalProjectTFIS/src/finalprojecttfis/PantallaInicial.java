/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojecttfis;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Scm96Steven
 */
public class PantallaInicial extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicial
     */
     ManejoTxt mt;
    public PantallaInicial() {
        initComponents();
        this.setTitle("Tennis Scoring App 2.0 ");
          setSize(592, 400);
        set3button.setSelected(true);
        historialAnterior.setVisible(false);
    mt = new ManejoTxt();  
    }
     public static Jugador[] jugadores;
     public static int setSize = 3;
     public static String player1Name;
     public static String player2Name;

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        player2tf = new javax.swing.JTextField();
        player1tf = new javax.swing.JTextField();
        set5button = new javax.swing.JRadioButton();
        set3button = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historialAnterior = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        leerHistorialButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana1");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jLabel2.setText("Jugador 1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(176, 96, 56, 18);

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jLabel3.setText("Jugador 2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(176, 127, 56, 18);

        player2tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2tfActionPerformed(evt);
            }
        });
        jPanel1.add(player2tf);
        player2tf.setBounds(250, 127, 116, 24);

        player1tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1tfActionPerformed(evt);
            }
        });
        jPanel1.add(player1tf);
        player1tf.setBounds(250, 96, 116, 25);

        buttonGroup1.add(set5button);
        set5button.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        set5button.setText("5 Sets");
        set5button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set5buttonActionPerformed(evt);
            }
        });
        jPanel1.add(set5button);
        set5button.setBounds(244, 215, 59, 23);

        buttonGroup1.add(set3button);
        set3button.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        set3button.setText("3 Sets");
        set3button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set3buttonActionPerformed(evt);
            }
        });
        jPanel1.add(set3button);
        set3button.setBounds(244, 189, 59, 23);

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Elija la cantidad de sets:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 170, 200, 22);

        botonAceptar.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar);
        botonAceptar.setBounds(213, 256, 141, 40);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Inserte los nombres de los jugadores:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 70, 340, 22);

        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 3, 36)); // NOI18N
        jLabel5.setText("¡Bienvenido a Tennis Scoring App!");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 6, 519, 43);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/PIBackground.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 578, 330);

        jTabbedPane1.addTab("Comenzar Partida", jPanel1);

        jPanel2.setLayout(null);

        historialAnterior.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(historialAnterior);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(113, 48, 363, 188);

        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel6.setText("Historial anterior");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(227, 20, 126, 22);

        leerHistorialButton.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        leerHistorialButton.setText("Leer historial anterior");
        leerHistorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerHistorialButtonActionPerformed(evt);
            }
        });
        jPanel2.add(leerHistorialButton);
        leerHistorialButton.setBounds(220, 247, 159, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/PIBackground.jpg"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 578, 330);

        jTabbedPane1.addTab("Consultar historial anterior", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:
        
        
        
    jugadores = createPlayers();
        GUI gn = new GUI();
        gn.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void set3buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set3buttonActionPerformed

        setSize = 3;
        
    }//GEN-LAST:event_set3buttonActionPerformed

    private void set5buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set5buttonActionPerformed
        setSize = 5;
    }//GEN-LAST:event_set5buttonActionPerformed

    private void player1tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1tfActionPerformed
      

        
    }//GEN-LAST:event_player1tfActionPerformed

    private void player2tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2tfActionPerformed

             
                       
    }//GEN-LAST:event_player2tfActionPerformed

    private void leerHistorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerHistorialButtonActionPerformed
        // TODO add your handling code here:
        String[] hist ={""};
        historialAnterior.setVisible(true);
        try {
            hist = mt.textToArray();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        historialAnterior.setListData(hist);
    }//GEN-LAST:event_leerHistorialButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicial().setVisible(true);
            }
            
        });
        
    }
    
    public Jugador[] createPlayers(){
       //Se toma el nombre del jugador 1
        if(!player1tf.getText().equals(""))
         {
        player1Name = player1tf.getText();
         }
        else
         {
               player1Name = "Jugador 1";
         }
         System.out.println(player1Name);
         
         //Se toma nombre del jugador 2
             if(!player2tf.getText().equals(""))
                 {
              player2Name = player2tf.getText();
                 }
                 else
                 {
                  player2Name = "Jugador 2";
                 }
                System.out.println(player2Name);
                
            Jugador player1 = new Jugador(player1Name, setSize);    
            Jugador player2 = new Jugador(player2Name, setSize);  
            
            Jugador[] playersArr = {player1, player2};
          
            return playersArr;
    }
public  String[] players(){
String[] players = {this.player1Name, this.player2Name};    

    return players;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JList<String> historialAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton leerHistorialButton;
    public static javax.swing.JTextField player1tf;
    public static javax.swing.JTextField player2tf;
    private javax.swing.JRadioButton set3button;
    private javax.swing.JRadioButton set5button;
    // End of variables declaration//GEN-END:variables
}
