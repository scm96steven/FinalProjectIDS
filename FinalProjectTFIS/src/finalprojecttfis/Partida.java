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
public class Partida {
    int sets;
    Jugador[] jugadores;
    
    public void Partida(Jugador[] players,int set){
        sets=set;
        jugadores=players;
    }
    
}
