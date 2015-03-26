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

    public static Room entranceR1 = new Room();
    public static Room hallR2 = new Room();
    public static Room innerGardednR3 = new Room();
   public static Room livingRoomR4 = new Room();
    public static Room mainTableR5 = new Room();
   public static Room libraryR6 = new Room();
   public static Room officeR7 = new Room();
   public static Room basementR8 = new Room();
    public static Room dungeonR9 = new Room();
   public static Room hellR10 = new Room();

    public GameMap(Room room1, Room room2) {
        super(room1, room2);
    }

    //public GameMap(Room room1, Room room2) {
    //super(room1, room2);
    // }
    //Exit exitFromEntramceToHall = new Exit(entranceR1, hallR2);
    //Exit exitFromHallToLiivingRoom = new Exit(hallR2, livingRoomR4);
    public static Exit exitFromRoom(Room room1, Room room2) {
        Exit exitFrom = new Exit(room1, room2);

        return exitFrom;
    }

    public static Exit ExitMap(Room room1, Room room2, Location room1location) {
        //super(room1, room2);

        entranceR1.setLocation(room1location);

        entranceR1.setExit(room1location, exitFromRoom(entranceR1, hallR2));
        hallR2.setExit(room1location, exitFromRoom(hallR2, livingRoomR4));
        hallR2.setExit(room1location, exitFromRoom(hallR2, innerGardednR3));
        livingRoomR4.setExit(room1location, exitFromRoom(livingRoomR4, mainTableR5));
        mainTableR5.setExit(room1location, exitFromRoom(mainTableR5, officeR7));
        mainTableR5.setExit(room1location, exitFromRoom(mainTableR5, libraryR6));

        
        System.out.println(room1.getExit(room1location));
        return room1.getExit(room1location);
    }

}
