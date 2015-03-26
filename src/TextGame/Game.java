/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextGame;

import Commands.Command;

/**
 *
 * @author Georgios
 */
public class Game {

    State currentState;                         //

    public Game(State currentState) {
        this.currentState = currentState;
    }

    public String changeState(Command command) {
        currentState = currentState.changeState(command);
        return currentState.getResult();
    }
}
