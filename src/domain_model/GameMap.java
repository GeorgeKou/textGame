package domain_model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Georgios
 */
public class GameMap extends Exit {

    Room entranceR1 = new Room();
    Room hallR2 = new Room();
    Room innerGardednR3 = new Room();
    Room livingRoomR4 = new Room();
    Room mainTableR5 = new Room();
    Room libraryR6 = new Room();
    Room officeR7 = new Room();
    Room basementR8 = new Room();
    Room dungeonR9 = new Room();
    Room hellR10 = new Room();

    Exit exitFromR1 = new Exit(entranceR1, hallR2);
    Location location;

    public GameMap(Room entranceR1, Room hallR2) {
        super(entranceR1, hallR2);
        
        entranceR1.setExit(Location.NORTH, exitFromR1);
       
    }
   
   
           

}
