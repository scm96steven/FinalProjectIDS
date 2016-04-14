/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojecttfis;

import static finalprojecttfis.PantallaInicial.player1tf;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Scm96Steven
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI1
     */
    Jugador[] jugadores;
     Partida currentGame;
    ManejoTxt mt;
    
    
    public  GUI() {
        initComponents();
         setSize(1000, 530);
         listaJugadas.setVisible(false);
        historialAnterior.setVisible(false);
         BotonJugada1.setSelected(true);
        BotonJugador1.setSelected(true);
      jugadores = PantallaInicial.jugadores;
     player1Label.setText(jugadores[0].toString());
      player2Label.setText(jugadores[1].toString());
        System.out.println(PantallaInicial.setSize);
       currentGame = new Partida(jugadores,PantallaInicial.setSize);
       mt = new ManejoTxt();  
       currentGame.tabla.setTableText();
         
    }

    String currentPlay="Saque";
    String currentPlayer; //nombre del Jugador 2 en el array
     int playerIterator;
   
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playersButtonGroup = new javax.swing.ButtonGroup();
        playsButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonJugada9 = new javax.swing.JRadioButton();
        BotonJugador1 = new javax.swing.JRadioButton();
        BotonJugada8 = new javax.swing.JRadioButton();
        BotonJugador2 = new javax.swing.JRadioButton();
        BotonJugada7 = new javax.swing.JRadioButton();
        saveHistorialButton = new javax.swing.JButton();
        BotonJugada6 = new javax.swing.JRadioButton();
        BotonJugada5 = new javax.swing.JRadioButton();
        BotonJugada4 = new javax.swing.JRadioButton();
        BotonJugada3 = new javax.swing.JRadioButton();
        BotonJugada2 = new javax.swing.JRadioButton();
        BotonJugada1 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaJugadas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        adv_2 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        set1_2 = new javax.swing.JLabel();
        set2_2 = new javax.swing.JLabel();
        set3_2 = new javax.swing.JLabel();
        set4_2 = new javax.swing.JLabel();
        set5_2 = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();
        player1Label = new javax.swing.JLabel();
        set1_1 = new javax.swing.JLabel();
        set2_1 = new javax.swing.JLabel();
        set3_1 = new javax.swing.JLabel();
        set4_1 = new javax.swing.JLabel();
        set5_1 = new javax.swing.JLabel();
        score_1 = new javax.swing.JLabel();
        adv_1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        set3 = new javax.swing.JLabel();
        set2 = new javax.swing.JLabel();
        set1 = new javax.swing.JLabel();
        set4 = new javax.swing.JLabel();
        set5 = new javax.swing.JLabel();
        score_2 = new javax.swing.JLabel();
        agregarJugada = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historialAnterior = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        leerHistorialButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel3.setText("Jugada:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(29, 198, 50, 20);

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel2.setText("Seleccione jugador:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(29, 128, 160, 20);

        playsButtonGroup.add(BotonJugada9);
        BotonJugada9.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada9.setText("Slice");
        BotonJugada9.setOpaque(false);
        BotonJugada9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada9ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugada9);
        BotonJugada9.setBounds(29, 388, 61, 23);

        playersButtonGroup.add(BotonJugador1);
        BotonJugador1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugador1.setText("Jugador 1");
        BotonJugador1.setOpaque(false);
        BotonJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugador1ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugador1);
        BotonJugador1.setBounds(29, 148, 89, 23);

        playsButtonGroup.add(BotonJugada8);
        BotonJugada8.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada8.setText("Globo");
        BotonJugada8.setOpaque(false);
        BotonJugada8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada8ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugada8);
        BotonJugada8.setBounds(29, 368, 61, 23);

        playersButtonGroup.add(BotonJugador2);
        BotonJugador2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugador2.setText("Jugador 2");
        BotonJugador2.setOpaque(false);
        BotonJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugador2ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugador2);
        BotonJugador2.setBounds(29, 168, 89, 23);

        playsButtonGroup.add(BotonJugada7);
        BotonJugada7.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada7.setText("Remate o Smash");
        BotonJugada7.setOpaque(false);
        BotonJugada7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada7ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugada7);
        BotonJugada7.setBounds(29, 347, 123, 23);

        saveHistorialButton.setBackground(new java.awt.Color(204, 204, 204));
        saveHistorialButton.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        saveHistorialButton.setText("Guardar Historial");
        saveHistorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHistorialButtonActionPerformed(evt);
            }
        });
        jPanel2.add(saveHistorialButton);
        saveHistorialButton.setBounds(710, 410, 140, 27);

        playsButtonGroup.add(BotonJugada6);
        BotonJugada6.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada6.setText("Contradejada");
        BotonJugada6.setOpaque(false);
        BotonJugada6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada6ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugada6);
        BotonJugada6.setBounds(29, 328, 109, 23);

        playsButtonGroup.add(BotonJugada5);
        BotonJugada5.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada5.setText("Dejada");
        BotonJugada5.setOpaque(false);
        BotonJugada5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada5ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugada5);
        BotonJugada5.setBounds(29, 308, 67, 24);

        playsButtonGroup.add(BotonJugada4);
        BotonJugada4.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada4.setText("Reves");
        BotonJugada4.setOpaque(false);
        BotonJugada4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada4ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugada4);
        BotonJugada4.setBounds(29, 288, 61, 23);

        playsButtonGroup.add(BotonJugada3);
        BotonJugada3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada3.setText("Volea");
        BotonJugada3.setOpaque(false);
        BotonJugada3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada3ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugada3);
        BotonJugada3.setBounds(29, 268, 61, 23);

        playsButtonGroup.add(BotonJugada2);
        BotonJugada2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada2.setText("Derecha o drive");
        BotonJugada2.setOpaque(false);
        BotonJugada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada2ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugada2);
        BotonJugada2.setBounds(29, 248, 131, 23);

        playsButtonGroup.add(BotonJugada1);
        BotonJugada1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada1.setText("Saque");
        BotonJugada1.setOpaque(false);
        BotonJugada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada1ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonJugada1);
        BotonJugada1.setBounds(29, 228, 61, 23);

        jLabel22.setFont(new java.awt.Font("Rockwell Condensed", 1, 15)); // NOI18N
        jLabel22.setText("Status:");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(286, 367, 41, 19);

        jLabel27.setFont(new java.awt.Font("Rockwell Condensed", 1, 15)); // NOI18N
        jLabel27.setText("Set:");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(286, 346, 22, 19);

        jLabel23.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel23.setText("Tabla de scores:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(470, 91, 108, 20);

        listaJugadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaJugadas);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(690, 90, 283, 310);

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jLabel1.setText("Historial de Jugadas:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(700, 70, 120, 18);

        adv_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        adv_2.setText("jLabel21");
        jPanel2.add(adv_2);
        adv_2.setBounds(284, 198, 27, 19);

        statusLabel.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        statusLabel.setText("jLabel18");
        jPanel2.add(statusLabel);
        statusLabel.setBounds(330, 370, 90, 19);

        set1_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set1_2.setText("jLabel15");
        jPanel2.add(set1_2);
        set1_2.setBounds(440, 199, 25, 19);

        set2_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set2_2.setText("jLabel16");
        jPanel2.add(set2_2);
        set2_2.setBounds(490, 199, 25, 19);

        set3_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set3_2.setText("jLabel17");
        jPanel2.add(set3_2);
        set3_2.setBounds(540, 199, 25, 19);

        set4_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set4_2.setText("jLabel17");
        jPanel2.add(set4_2);
        set4_2.setBounds(589, 199, 25, 19);

        set5_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set5_2.setText("jLabel17");
        jPanel2.add(set5_2);
        set5_2.setBounds(630, 199, 25, 19);

        player2Label.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        player2Label.setText("Jugador 2");
        jPanel2.add(player2Label);
        player2Label.setBounds(364, 199, 56, 18);

        player1Label.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        player1Label.setText("Jugador 1");
        jPanel2.add(player1Label);
        player1Label.setBounds(364, 169, 56, 18);

        set1_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set1_1.setText("jLabel11");
        jPanel2.add(set1_1);
        set1_1.setBounds(440, 169, 25, 19);

        set2_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set2_1.setText("jLabel12");
        jPanel2.add(set2_1);
        set2_1.setBounds(490, 169, 25, 19);

        set3_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set3_1.setText("jLabel13");
        jPanel2.add(set3_1);
        set3_1.setBounds(540, 169, 25, 19);

        set4_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set4_1.setText("jLabel13");
        jPanel2.add(set4_1);
        set4_1.setBounds(589, 169, 25, 19);

        set5_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set5_1.setText("jLabel13");
        jPanel2.add(set5_1);
        set5_1.setBounds(630, 169, 25, 19);

        score_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        score_1.setText("jLabel14");
        jPanel2.add(score_1);
        score_1.setBounds(335, 168, 29, 19);

        adv_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        adv_1.setText("jLabel20");
        jPanel2.add(adv_1);
        adv_1.setBounds(284, 168, 27, 19);

        jLabel19.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel19.setText("Adv.");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(282, 148, 29, 20);

        jLabel10.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel10.setText("Score");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(329, 148, 35, 20);

        set3.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set3.setText("Set 3");
        jPanel2.add(set3);
        set3.setBounds(534, 149, 31, 20);

        set2.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set2.setText("Set 2");
        jPanel2.add(set2);
        set2.setBounds(484, 149, 31, 20);

        set1.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set1.setText("Set 1");
        jPanel2.add(set1);
        set1.setBounds(434, 149, 31, 20);

        set4.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set4.setText("Set 4");
        jPanel2.add(set4);
        set4.setBounds(583, 149, 31, 20);

        set5.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set5.setText("Set 5");
        jPanel2.add(set5);
        set5.setBounds(624, 149, 31, 20);

        score_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        score_2.setText("jLabel18");
        jPanel2.add(score_2);
        score_2.setBounds(335, 198, 21, 19);

        agregarJugada.setBackground(new java.awt.Color(204, 204, 204));
        agregarJugada.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        agregarJugada.setText("Agregar jugada");
        agregarJugada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarJugadaActionPerformed(evt);
            }
        });
        jPanel2.add(agregarJugada);
        agregarJugada.setBounds(29, 418, 121, 27);

        salir.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel2.add(salir);
        salir.setBounds(890, 410, 70, 27);

        jTabbedPane1.addTab("Anotar Jugada", jPanel2);

        historialAnterior.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(historialAnterior);

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Historial anterior:");

        leerHistorialButton.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        leerHistorialButton.setText("Leer historial anterior");
        leerHistorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerHistorialButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jLabel4)))
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(leerHistorialButton)
                .addGap(460, 460, 460))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(leerHistorialButton)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar historial anterior", jPanel3);

        jPanel1.add(jTabbedPane1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1128, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonJugada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugada1ActionPerformed
        // TODO add your handling code here:
        //Cada vez que se selecciona una jugada se almacena su nombre en currentPlay para imprimirlo al historial. Igual para las demas juagdas debajo.
        currentPlay = "Saque";
        System.out.println(currentPlay);
    }//GEN-LAST:event_BotonJugada1ActionPerformed

    private void BotonJugada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugada2ActionPerformed
        // TODO add your handling code here:
        currentPlay = "Derecha";
        System.out.println(currentPlay);
    }//GEN-LAST:event_BotonJugada2ActionPerformed

    private void BotonJugada3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugada3ActionPerformed
        // TODO add your handling code here:
        currentPlay = "Volea";
        System.out.println(currentPlay);
    }//GEN-LAST:event_BotonJugada3ActionPerformed

    private void BotonJugada4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugada4ActionPerformed
        // TODO add your handling code here:
        currentPlay = "Reves";
        System.out.println(currentPlay);
    }//GEN-LAST:event_BotonJugada4ActionPerformed

    private void BotonJugada5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugada5ActionPerformed
        // TODO add your handling code here:
        currentPlay = "Dejada";
        System.out.println(currentPlay);
    }//GEN-LAST:event_BotonJugada5ActionPerformed

    private void BotonJugada6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugada6ActionPerformed
        // TODO add your handling code here:
        currentPlay = "Contra Dejada";
        System.out.println(currentPlay);
    }//GEN-LAST:event_BotonJugada6ActionPerformed

    private void saveHistorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHistorialButtonActionPerformed
        // TODO add your handling code here:

       try{
       
        mt.arrayToText(Partida.listData);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveHistorialButtonActionPerformed
<<<<<<< HEAD
=======

        currentGame.addPlay(playerIterator, currentPlay);
       currentGame.tabla.setTableText();
    }                
>>>>>>> origin/master

    private void BotonJugada7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugada7ActionPerformed
        // TODO add your handling code here:
        currentPlay = "Remate";
        System.out.println(currentPlay);
    }//GEN-LAST:event_BotonJugada7ActionPerformed

    private void BotonJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugador2ActionPerformed
        // TODO add your handling code here:
        currentPlayer = jugadores[1].toString(); //nombre del Jugador 2 en el array
        playerIterator = 1; //Posicion del jugador 2 en el array
        System.out.println(currentPlayer);
    }//GEN-LAST:event_BotonJugador2ActionPerformed

    private void BotonJugada8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugada8ActionPerformed
        // TODO add your handling code here:
        currentPlay = "Globo";
        System.out.println(currentPlay);
    }//GEN-LAST:event_BotonJugada8ActionPerformed

    private void BotonJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugador1ActionPerformed
        // TODO add your handling code here:
        currentPlayer = jugadores[0].toString(); //Se extrae el nombre del jugador
        playerIterator = 0; //Posicion del player 1.
        System.out.println(currentPlayer);//Se imprime a consola el player seleccionado
    }//GEN-LAST:event_BotonJugador1ActionPerformed

    private void BotonJugada9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugada9ActionPerformed
        // TODO add your handling code here:
        currentPlay = "Slice";
        System.out.println(currentPlay);
    }//GEN-LAST:event_BotonJugada9ActionPerformed

    private void agregarJugadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarJugadaActionPerformed
        // TODO add your handling code here:
         currentGame.addPlay(playerIterator, currentPlay);
       currentGame.tabla.setTableText();

       currentGame.addPlay(playerIterator, currentPlay);
    }//GEN-LAST:event_agregarJugadaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

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
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        
   
    }
   

     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonJugada1;
    private javax.swing.JRadioButton BotonJugada2;
    private javax.swing.JRadioButton BotonJugada3;
    private javax.swing.JRadioButton BotonJugada4;
    private javax.swing.JRadioButton BotonJugada5;
    private javax.swing.JRadioButton BotonJugada6;
    private javax.swing.JRadioButton BotonJugada7;
    private javax.swing.JRadioButton BotonJugada8;
    private javax.swing.JRadioButton BotonJugada9;
    private javax.swing.JRadioButton BotonJugador1;
    private javax.swing.JRadioButton BotonJugador2;
    public static javax.swing.JLabel adv_1;
    public static javax.swing.JLabel adv_2;
    private javax.swing.JButton agregarJugada;
    private javax.swing.JList<String> historialAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton leerHistorialButton;
    public static javax.swing.JList<String> listaJugadas;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player2Label;
    private javax.swing.ButtonGroup playersButtonGroup;
    private javax.swing.ButtonGroup playsButtonGroup;
    private javax.swing.JButton salir;
    private javax.swing.JButton saveHistorialButton;
    public static javax.swing.JLabel score_1;
    public static javax.swing.JLabel score_2;
    private javax.swing.JLabel set1;
    public static javax.swing.JLabel set1_1;
    public static javax.swing.JLabel set1_2;
    private javax.swing.JLabel set2;
    public static javax.swing.JLabel set2_1;
    public static javax.swing.JLabel set2_2;
    private javax.swing.JLabel set3;
    public static javax.swing.JLabel set3_1;
    public static javax.swing.JLabel set3_2;
    public static javax.swing.JLabel set4;
    public static javax.swing.JLabel set4_1;
    public static javax.swing.JLabel set4_2;
    public static javax.swing.JLabel set5;
    public static javax.swing.JLabel set5_1;
    public static javax.swing.JLabel set5_2;
    public static javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
