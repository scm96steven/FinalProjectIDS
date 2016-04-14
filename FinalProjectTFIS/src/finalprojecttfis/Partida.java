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
    int set=0;
    int setsSize;
    Jugador[] jugadores;
    String status="normal";
    String[] listData = new String[1000];
    int listIterator = 0;
    int[] playerScore = {0, 0}; //Esta variable almacena el score actual del jugador sea este 0, 15, 30, 40.
    int[] advanceArr = {0, 0}; //Este array almacena los score en el Deuce.
    int[] playerSets = {0, 0}; //Almacena cuantos sets tiene ganado cada jugador.
    boolean game = true;
    int scoreIterator = 0;
    
    public Partida(Jugador[] players, int size){
        jugadores=players;
        setsSize=size;
    }
    
}
