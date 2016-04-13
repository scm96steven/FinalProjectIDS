/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojecttfis;

/**
 *
 * @author Adalberto
 */
public class Jugador {
    int score[] =new int[5];
    String name;
    public Jugador(String s,int sets) {
          name=s;
        for(int i=0;i<sets;i++)
        {
            score[i]=0;
        }
     
    }

    
}
