/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojecttfis;

import static finalprojecttfis.PantallaInicial.player1tf;
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
    
    
    
    public  GUI() {
        initComponents();
         setSize(1000, 530);
         listaJugadas.setVisible(false);
         BotonJugada1.setSelected(true);
        BotonJugador1.setSelected(true);
      jugadores = PantallaInicial.jugadores;
     player1Label.setText(jugadores[0].toString());
      player2Label.setText(jugadores[1].toString());
        System.out.println(PantallaInicial.setSize);
       currentGame = new Partida(jugadores,PantallaInicial.setSize);
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

        adv_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        adv_2.setText("jLabel21");

        statusLabel.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        statusLabel.setText("jLabel18");

        set1_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set1_2.setText("jLabel15");

        set2_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set2_2.setText("jLabel16");

        set3_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set3_2.setText("jLabel17");

        set4_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set4_2.setText("jLabel17");

        set5_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set5_2.setText("jLabel17");

        player2Label.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        player2Label.setText("Jugador 2");

        player1Label.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        player1Label.setText("Jugador 1");

        set1_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set1_1.setText("jLabel11");

        set2_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set2_1.setText("jLabel12");

        set3_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set3_1.setText("jLabel13");

        set4_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set4_1.setText("jLabel13");

        set5_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        set5_1.setText("jLabel13");

        score_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        score_1.setText("jLabel14");

        adv_1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        adv_1.setText("jLabel20");

        jLabel19.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel19.setText("Adv.");

        jLabel10.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        jLabel10.setText("Score");

        set3.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set3.setText("Set 3");

        set2.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set2.setText("Set 2");

        set1.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set1.setText("Set 1");

        set4.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set4.setText("Set 4");

        set5.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        set5.setText("Set 5");

        score_2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        score_2.setText("jLabel18");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(734, 734, 734)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonJugador2)
                    .addComponent(BotonJugador1)
                    .addComponent(jLabel3)
                    .addComponent(BotonJugada2)
                    .addComponent(BotonJugada6)
                    .addComponent(BotonJugada9)
                    .addComponent(BotonJugada4)
                    .addComponent(BotonJugada7)
                    .addComponent(BotonJugada5)
                    .addComponent(BotonJugada1)
                    .addComponent(BotonJugada3)
                    .addComponent(BotonJugada8)
                    .addComponent(agregarJugada))
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(adv_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(adv_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel22)))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(score_1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(player1Label)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(set1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(set1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(set2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(set2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(set3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(set3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(score_2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(player2Label)))
                        .addGap(20, 20, 20)
                        .addComponent(set1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(set2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(set3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(set4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(set4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(set4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(set5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(set5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(set5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BotonJugador2))
                            .addComponent(BotonJugador1))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BotonJugada2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(BotonJugada6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(BotonJugada9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(BotonJugada4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(BotonJugada7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(BotonJugada5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotonJugada1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(BotonJugada3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BotonJugada8)))
                        .addGap(7, 7, 7)
                        .addComponent(agregarJugada))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel19)
                        .addGap(0, 0, 0)
                        .addComponent(adv_1)
                        .addGap(11, 11, 11)
                        .addComponent(adv_2)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel27)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel23)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, 0)
                                .addComponent(score_1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(player1Label))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(set1)
                                .addGap(0, 0, 0)
                                .addComponent(set1_1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(set2)
                                .addGap(0, 0, 0)
                                .addComponent(set2_1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(set3)
                                .addGap(0, 0, 0)
                                .addComponent(set3_1)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(score_2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(player2Label)
                                    .addComponent(set1_2)
                                    .addComponent(set2_2)
                                    .addComponent(set3_2))))
                        .addGap(152, 152, 152)
                        .addComponent(statusLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(set4)
                        .addGap(0, 0, 0)
                        .addComponent(set4_1)
                        .addGap(11, 11, 11)
                        .addComponent(set4_2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(set5)
                        .addGap(0, 0, 0)
                        .addComponent(set5_1)
                        .addGap(11, 11, 11)
                        .addComponent(set5_2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Anotar Jugada", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1027, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consultar historial anterior", jPanel3);

        jPanel1.add(jTabbedPane1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1042, 706);

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
        currentGame.addPlay(playerIterator, currentPlay);
       currentGame.tabla.setTableText();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
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
    public static javax.swing.JList<String> listaJugadas;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player2Label;
    private javax.swing.ButtonGroup playersButtonGroup;
    private javax.swing.ButtonGroup playsButtonGroup;
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
