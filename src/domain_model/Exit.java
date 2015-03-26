/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain_model;

/**
 *
 * @author Georgios
 */
public class Exit {

    public Room room1;
    public Room room2;
    public Location room1Location;

    public Exit(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public void setLocation(Location room1Location) {
        this.room1Location = room1Location;
        switch (room1Location) {
            case EAST:
                room1.setExit(Location.WEST, this);
                room2.setExit(Location.EAST, this);
                break;
            case WEST:
                room1.setExit(Location.EAST, this);
                room2.setExit(Location.WEST, this);
                break;
            case NORTH:
                room1.setExit(Location.SOUTH, this);
                room2.setExit(Location.NORTH, this);
                break;
            case SOUTH:
                room1.setExit(Location.NORTH, this);
                room2.setExit(Location.SOUTH, this);
                break;

        }

    }

    public Room getOtherRoom(Room room) {
        if (room == room1) {
            return room2;
        } else {
            return room1;
        }
    }

}
