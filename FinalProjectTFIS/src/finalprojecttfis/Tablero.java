/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojecttfis;

import static finalprojecttfis.Partida.set;

/**
 *
 * @author Scm96Steven
 */
public class Tablero {
    
    int size;
    
    public Tablero(int setSize)
    {
    this.size = setSize;
    System.out.println("table size"+size);
    }
    
    void setTableText(){
         GUI.setLabel.setText(String.valueOf(set+1));
         GUI.statusLabel.setText(Partida.status);
         GUI.set1_1.setText(String.valueOf(Partida.jugadores[0].score[0]));
          GUI.set2_1.setText(String.valueOf(Partida.jugadores[0].score[1]));
             GUI.set3_1.setText(String.valueOf(Partida.jugadores[0].score[2]));
             GUI.score_1.setText(String.valueOf(Partida.playerScore[0]));
             
              GUI.set1_2.setText(String.valueOf(Partida.jugadores[1].score[0]));
             GUI.set2_2.setText(String.valueOf(Partida.jugadores[1].score[1]));
             GUI.set3_2.setText(String.valueOf(Partida.jugadores[1].score[2]));
            GUI.score_2.setText(String.valueOf(Partida.playerScore[1]));
          if(size==5)
         {
              GUI.set4_1.setText(String.valueOf(Partida.jugadores[0].score[3]));
             GUI.set5_1.setText(String.valueOf(Partida.jugadores[0].score[4]));
             
            GUI.set4_2.setText(String.valueOf(Partida.jugadores[1].score[3]));
             GUI.set5_2.setText(String.valueOf(Partida.jugadores[1].score[4]));
         }  
            
            GUI.adv_1.setText("");
            GUI.adv_2.setText("");
            if(Partida.advanceArr[0]==1)
              GUI.adv_1.setText("*");
             if(Partida.advanceArr[1]==1)
             GUI.adv_2.setText("*");      
     
     
     }
    
    public void setTableSize()
    {
        if(size==3)
        {
            GUI.set4.setVisible(false);
            GUI.set5.setVisible(false);
             GUI.set4_1.setVisible(false);
             GUI.set5_1.setVisible(false);
             
            GUI.set4_2.setVisible(false);
             GUI.set5_2.setVisible(false);
        }
            
    }
    
}
