/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextGame;

import Commands.Command;
import domain_model.Exit;
import domain_model.Location;
import domain_model.Room;

/**
 *
 * @author Georgios
 */
public class State {

    String result;
    Room room1;

    public State(Room room1) {
        this.room1 = room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public String getResult() {
        return result;
    }
        //συνάρτηση αλλαγής κατάστασης- αλλαγή δωματίου
    State changeState(Command command) {                       
        switch (command) {
            case GOEAST: {
                Exit exit = room1.getExit(Location.EAST);
                if (exit == null) {
                    result = "There is no door to the east";
                    return this;
                } else {
                    State state = new State(exit.getOtherRoom(room1));
                    state.result = state.room1.getDescpription();
                    return state;
                }
            }

            case GOWEST: {
                Exit exit = room1.getExit(Location.WEST);
                if (exit == null) {
                    result = "There is no door to the west";
                    return this;
                } else {
                    State state = new State(exit.getOtherRoom(room1));
                    state.result = state.room1.getDescpription();
                    return state;
                }
            }

            case GONORTH: {
                Exit exit = room1.getExit(Location.NORTH);
                if (exit == null) {
                    result = "There is no door to the north";
                    return this;
                } else {
                    State state = new State(exit.getOtherRoom(room1));
                    state.result = state.room1.getDescpription();
                    return state;
                }
            }

            case GOSOUTH: {
                Exit exit = room1.getExit(Location.SOUTH);
                if (exit == null) {
                    result = "There is no door to the south";
                    return this;
                } else {
                    State state = new State(exit.getOtherRoom(room1));
                    state.result = state.room1.getDescpription();
                    return state;
                }

            }
        }
        return this;
    }

}
