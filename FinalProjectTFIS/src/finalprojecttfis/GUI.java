/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojecttfis;

/**
 *
 * @author Scm96Steven
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI1
     */
    Jugador[] jugadores;
    
    
    
    
    public GUI(Jugador[] players) {
        initComponents();
         setSize(1000, 530);
         listaJugadas.setVisible(false);
         BotonJugada1.setSelected(true);
        BotonJugador1.setSelected(true);
      jugadores = players;
      
    }

    String currentPlay;
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
        agregarJugada = new javax.swing.JButton();
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
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel3.setText("Jugada:");

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel2.setText("Seleccione jugador:");

        playsButtonGroup.add(BotonJugada9);
        BotonJugada9.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada9.setText("Slice");
        BotonJugada9.setOpaque(false);
        BotonJugada9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada9ActionPerformed(evt);
            }
        });

        playersButtonGroup.add(BotonJugador1);
        BotonJugador1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugador1.setText("Jugador 1");
        BotonJugador1.setOpaque(false);
        BotonJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugador1ActionPerformed(evt);
            }
        });

        playsButtonGroup.add(BotonJugada8);
        BotonJugada8.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada8.setText("Globo");
        BotonJugada8.setOpaque(false);
        BotonJugada8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada8ActionPerformed(evt);
            }
        });

        playersButtonGroup.add(BotonJugador2);
        BotonJugador2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugador2.setText("Jugador 2");
        BotonJugador2.setOpaque(false);
        BotonJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugador2ActionPerformed(evt);
            }
        });

        playsButtonGroup.add(BotonJugada7);
        BotonJugada7.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada7.setText("Remate o Smash");
        BotonJugada7.setOpaque(false);
        BotonJugada7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada7ActionPerformed(evt);
            }
        });

        agregarJugada.setBackground(new java.awt.Color(204, 204, 204));
        agregarJugada.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        agregarJugada.setText("Agregar jugada");
        agregarJugada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarJugadaActionPerformed(evt);
            }
        });

        playsButtonGroup.add(BotonJugada6);
        BotonJugada6.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada6.setText("Contradejada");
        BotonJugada6.setOpaque(false);
        BotonJugada6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada6ActionPerformed(evt);
            }
        });

        playsButtonGroup.add(BotonJugada5);
        BotonJugada5.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada5.setText("Dejada");
        BotonJugada5.setOpaque(false);
        BotonJugada5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada5ActionPerformed(evt);
            }
        });

        playsButtonGroup.add(BotonJugada4);
        BotonJugada4.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada4.setText("Reves");
        BotonJugada4.setOpaque(false);
        BotonJugada4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada4ActionPerformed(evt);
            }
        });

        playsButtonGroup.add(BotonJugada3);
        BotonJugada3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada3.setText("Volea");
        BotonJugada3.setOpaque(false);
        BotonJugada3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada3ActionPerformed(evt);
            }
        });

        playsButtonGroup.add(BotonJugada2);
        BotonJugada2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada2.setText("Derecha o drive");
        BotonJugada2.setOpaque(false);
        BotonJugada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada2ActionPerformed(evt);
            }
        });

        playsButtonGroup.add(BotonJugada1);
        BotonJugada1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonJugada1.setText("Saque");
        BotonJugada1.setOpaque(false);
        BotonJugada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugada1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Rockwell Condensed", 1, 15)); // NOI18N
        jLabel22.setText("Status:");

        jLabel27.setFont(new java.awt.Font("Rockwell Condensed", 1, 15)); // NOI18N
        jLabel27.setText("Set:");

        jLabel23.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel23.setText("Tabla de scores:");

        listaJugadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaJugadas);

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jLabel1.setText("Historial de Jugadas:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonJugador1)
                    .addComponent(BotonJugador2)
                    .addComponent(jLabel3)
                    .addComponent(BotonJugada2)
                    .addComponent(BotonJugada3)
                    .addComponent(BotonJugada9)
                    .addComponent(BotonJugada1)
                    .addComponent(BotonJugada4)
                    .addComponent(agregarJugada)
                    .addComponent(BotonJugada5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonJugada7)
                            .addComponent(BotonJugada6)
                            .addComponent(BotonJugada8))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel22))))
                .addGap(28, 234, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel23))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonJugador1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BotonJugador2)))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(BotonJugada5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BotonJugada2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(BotonJugada3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(BotonJugada6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(BotonJugada9))
                            .addComponent(BotonJugada1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BotonJugada7)
                                    .addComponent(jLabel27)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BotonJugada8)
                                    .addComponent(jLabel22)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(BotonJugada4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarJugada)))
                .addGap(0, 228, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anotar Jugada", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consultar historial anterior", jPanel3);

        jPanel1.add(jTabbedPane1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1001, 696);

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

    private void agregarJugadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarJugadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarJugadaActionPerformed

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
                new GUI(jugadores).setVisible(true);
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
    private javax.swing.JButton agregarJugada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listaJugadas;
    private javax.swing.ButtonGroup playersButtonGroup;
    private javax.swing.ButtonGroup playsButtonGroup;
    // End of variables declaration//GEN-END:variables
}
