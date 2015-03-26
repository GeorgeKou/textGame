/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

/**
 *
 * @author Georgios
 */
public class UseCommand implements ICommand {
    String action;
    
    @Override
    public String execute()
    {return "USE";}

    public UseCommand(String action) {
        this.action = action;
    }
    
    
}