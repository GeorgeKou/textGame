/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain_model;

import java.util.HashMap;

/**
 *
 * @author Georgios
 */
public class Room {

    //
    //int roomNumber;        //deixnei arithmo dwmatiou sxetuzetai me CurrentPostion tou Player.class
    public String descpription;    //perigrafh dwmatiou
    public HashMap<Location, Exit> exits = new HashMap<>();

    public String getDescpription() {
        return descpription;
    }

    public void setDescpription(String descpription) {
        this.descpription = descpription;
    }

    void setExit(Location location, Exit exit) {
        exits.put(location, exit);

    }

    public Exit getExit(Location location) {
        return exits.get(location);
    }

    public Room() {
    }

    
    
    
}
