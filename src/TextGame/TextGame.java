/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextGame;

import domain_model.Exit;
import domain_model.GameMap;
import domain_model.Location;
import domain_model.Room;

/**
 *
 * @author Georgios
 */
public class TextGame extends GameMap{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Exit ExitMap = ExitMap(entranceR1,hallR2,Location.NORTH);
                }

    public TextGame(Room room1, Room room2) {
        super(room1, room2);
    }

    
    
}
