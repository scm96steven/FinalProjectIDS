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
    Partida currentGame = this;
    public Partida(Jugador[] players, int size){
        jugadores=players;
        setsSize=size;
    }
    
    
     public void addPlay(int playerIterator, String currentPlay){
         String currentPlayer=this.jugadores[playerIterator].name;
        int oponent = (playerIterator + 1) % 2;
        Boolean deuceWinner = false;
        
        
        if (currentGame.jugadores[playerIterator].score[currentGame.set] == 6 && currentGame.jugadores[oponent].score[currentGame.set] == 6){
            currentGame.status="Tie Break";
            System.out.println("Tie break");
            currentGame.listData[currentGame.listIterator++] = "Tie break";
            currentGame.playerScore[currentGame.scoreIterator]++;
            if (currentGame.playerScore[currentGame.scoreIterator] >= 7) {
                if (Math.abs(currentGame.playerScore[currentGame.scoreIterator] - currentGame.playerScore[oponent]) >= 2) {
                    jugadores[currentGame.scoreIterator].score[currentGame.set]++;
                    currentGame.playerScore[currentGame.scoreIterator] = 0;
                    currentGame.playerScore[oponent] = 0;
                    currentGame.listData[currentGame.listIterator++] = "Gana el tie break el" + jugadores[currentGame.scoreIterator].toString();
                    currentGame.set++;
                    currentGame.playerSets[currentGame.scoreIterator]++;
                    currentGame.status = "Partida Normal";
                }
            }
            
        }else { //Si no hay Tie break, entonces sigue la jugada normal.
            if (currentGame.set <= 3 && currentGame.game) {

                if (currentGame.playerScore[currentGame.scoreIterator] == 0) { //Actualiza el score
                    currentGame.playerScore[currentGame.scoreIterator] = 15;
                } else if (currentGame.playerScore[currentGame.scoreIterator] == 15) {//Actualiza el score
                    currentGame.playerScore[currentGame.scoreIterator] = 30;
                } else if (currentGame.playerScore[currentGame.scoreIterator] == 30) {//Actualiza el score
                    currentGame.playerScore[currentGame.scoreIterator] = 40;//Esta excepcion se utiliza para que cuando un jugador gane un Deuce, se imprima primero la jugada y luego que gano el deuce.
                    currentGame.listData[currentGame.listIterator++] = (currentPlayer + ", " + currentPlay + ", Set:" + Integer.toString(currentGame.set + 1) + ", Score:" + Integer.toString(currentGame.playerScore[currentGame.scoreIterator]));
                    if (currentGame.playerScore[currentGame.scoreIterator] == currentGame.playerScore[oponent]) { //Si ambos tienen 40 y 40 de score, entran en deuce.
                        currentGame.status = "Deuce"; 
                        currentGame.listData[currentGame.listIterator++] = "Deuce"; //Se imprime deuce en la lista
                    }
                } else if (currentGame.playerScore[currentGame.scoreIterator] == 40) {

                    if (currentGame.playerScore[currentGame.scoreIterator] != currentGame.playerScore[oponent]) //No hay deuce
                    {
                        currentGame.playerScore[currentGame.scoreIterator] = 0;
                        jugadores[currentGame.scoreIterator].score[currentGame.set]++; //Se sube el score ya que alcanzo los 40 puntos y 1 mas.
                        System.out.println("Hace un game el " + jugadores[currentGame.scoreIterator].toString());
                        currentGame.listData[currentGame.listIterator++] = "Hace un game el " + jugadores[currentGame.scoreIterator].toString();
                    } else //Si hay deuce entonces...
                    {
                        //Se imprime el score del deuce.
                        currentGame.listData[currentGame.listIterator++] = (currentPlayer + ", " + currentPlay + ", Set:" + Integer.toString(currentGame.set + 1) + ", Score:" + Integer.toString(currentGame.advanceArr[currentGame.scoreIterator] + 1));
                        currentGame.status = "Deuce";
                        currentGame.advanceArr[currentGame.scoreIterator]++; //Se suma score al jugador correspondiente
                        if (Math.abs(currentGame.advanceArr[currentGame.scoreIterator] - currentGame.advanceArr[oponent]) < 2) //Si aun nadie tiene ventaja de dos
                        {

                            if (currentGame.advanceArr[currentGame.scoreIterator] == currentGame.advanceArr[oponent]) //si se empata adv con adv, se resetea el AdvanceArr
                            {
                                currentGame.advanceArr[currentGame.scoreIterator] = 0;
                                currentGame.advanceArr[oponent] = 0;
                                System.out.println("Se empato el deuce");
                                currentGame.listData[currentGame.listIterator++] = "Se empato el deuce";
                            }
                        } else { 
                            currentGame.playerScore[currentGame.scoreIterator] = 0; 
                            currentGame.playerScore[oponent] = 0;

                            jugadores[currentGame.scoreIterator].score[currentGame.set]++;

                        }
                        if (Math.abs(currentGame.advanceArr[currentGame.scoreIterator] - currentGame.advanceArr[oponent]) == 2) { //si alguien tiene ventaja de 2. Gana el deuce
                            System.out.println("score " + jugadores[currentGame.scoreIterator].toString() + jugadores[currentGame.scoreIterator].score[currentGame.set]);
                            deuceWinner = true; 
                            setTableText();
                            currentGame.advanceArr[currentGame.scoreIterator] = 0; //Se resetea el array para un proximo deuce.
                            currentGame.advanceArr[oponent] = 0; //Se resetea el array para un proximo deuce.
                            currentGame.status = "Partida Normal";
                        }

                    }

                }

            }
            if (jugadores[currentGame.scoreIterator].score[currentGame.set] == 7) //Caso en el que esta 6 a 5. Se necesitan 7 puntos para ganar
            {
                System.out.println(" jugador tiene 7 y otro 5");
                currentGame.set++;
                currentGame.playerSets[currentGame.scoreIterator]++;
            } else if (jugadores[currentGame.scoreIterator].score[currentGame.set] == 6 && jugadores[oponent].score[currentGame.set] <= 4) { 
                //Si un player alcanza 6 y el otro tiene 4 o menos games entonces este gana el set
                //gana el set el jugador que hizo la jugada
                System.out.println(" 6 y menor que 4");
                currentGame.set++;
                currentGame.playerSets[currentGame.scoreIterator]++;
            }

            System.out.println(currentGame.playerScore[currentGame.scoreIterator]);
            listaJugadas.setVisible(true); 
            if (currentGame.playerScore[currentGame.scoreIterator] != 0 && currentGame.playerScore[currentGame.scoreIterator] != 40) {
                currentGame.listData[currentGame.listIterator++] = (currentPlayer + ", " + currentPlay + ", Set:" + Integer.toString(currentGame.set + 1) + ", Score:" + Integer.toString(currentGame.playerScore[currentGame.scoreIterator]));
            }
            if (deuceWinner == true) { //Si alguien gano el deuce(en caso de haber ocurrido). Se imprime quien lo gano.
                System.out.println("Gana el deuce el " + jugadores[currentGame.scoreIterator].toString());
                currentGame.listData[currentGame.listIterator++] = "Gana el deuce el " + jugadores[currentGame.scoreIterator].toString();
                deuceWinner = false;
            }

            listaJugadas.setListData(currentGame.listData); //Se actualiza el historial de jugadas con las nuevas jugadas.

            setTableText(); //Se actualizan los labels de la tabla de score.

        }
        if (currentGame.playerSets[currentGame.scoreIterator] >= 2 && currentGame.game) { //Si un jugador tiene mas de 2 sets de 3, este gana la partida.
            System.out.println("Gana el partido el " + jugadores[currentGame.scoreIterator].toString());
            currentGame.listData[currentGame.listIterator++] = "Gana el Partido el " + jugadores[currentGame.scoreIterator].toString();
            currentGame.game = false;
            currentGame.status = ("Ganador : " + jugadores[currentGame.scoreIterator].toString());
            JOptionPane.showMessageDialog(null, "Gana el Partido el " + jugadores[currentGame.scoreIterator].toString()); //Aviso de que un jugador gano la partida.

        }
        statusLabel.setText(currentGame.status); //Se actualiza el status al correspondiente segun lo que haya pasado en la jugada.
        String[] hola = {""};
       
    }
    
         void setTableText(){
     
     
         GUI.set1_1.setText(String.valueOf(jugadores[0].score[0]));
            GUI.set2_1.setText(String.valueOf(jugadores[0].score[1]));
             GUI.set3_1.setText(String.valueOf(jugadores[0].score[2]));
             //score_1.setText(String.valueOf(jugadores[0].playerScore[0]));
             
              GUI.set1_2.setText(String.valueOf(jugadores[1].score[0]));
             GUI.set2_2.setText(String.valueOf(jugadores[1].score[1]));
             GUI.set3_2.setText(String.valueOf(jugadores[1].score[2]));
             
             
            // jLabel18.setText(String.valueOf(playerScore[1]));
               GUI.adv_1.setText("");
            GUI.adv_2.setText("");
           /*  if(advanceArr[0]==1)
              adv_1.setText("*");
             if(advanceArr[1]==1)
             adv_2.setText("*");      
     */
     
     }
     
}
