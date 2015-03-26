/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsers;

import Commands.GetCommand;

import Commands.ICommand;
import Commands.UseCommand;

/**
 *
 * @author Georgios
 */
public class Parser {

    ICommand command;

    public ICommand parse(String command) {

        String parts[] = command.split(" ");
        switch (parts.length) {
            case 0:
                throw new IllegalArgumentException("No Arquements");

            case 1:
                switch (parts[0]) {
                    case "GET":
                        return new GetCommand(parts[0]);
                    case "USE":
                        return new UseCommand(parts[0]);
                    default:
                        throw new IllegalArgumentException("Uknown Command" + command);
                }

            default:
                throw new IllegalArgumentException("was expected exactly two arguemnets");
        }

    }
}
