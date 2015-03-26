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

    void roomLocation(Location room1Location) {
        if (this.room1Location == Location.EAST) {
            room1.setExit(Location.WEST, this);
            room2.setExit(Location.EAST, this);
        } else if (this.room1Location == Location.WEST) {
            room1.setExit(Location.EAST, this);
            room2.setExit(Location.WEST, this);
        } else if (this.room1Location == Location.NORTH) {
            room1.setExit(Location.SOUTH, this);
            room2.setExit(Location.NORTH, this);
        } else if (this.room1Location == Location.SOUTH) {
            room1.setExit(Location.NORTH, this);
            room2.setExit(Location.SOUTH, this);
        }

    }

    public void setLocation(Location room1Location) {
        this.room1Location = room1Location;
        roomLocation(room1Location);
       

    }

    public Room getOtherRoom(Room room) {
        if (room == room1) {
            return room2;
        } else {
            return room1;
        }
    }

}
