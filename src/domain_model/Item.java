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
public class Item {
    
    String itemName;
    String description;     //perigrafh atikeimenou
    String category;        //kathgoria antokeimenou opws health items,action items. status items

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Item(String itemName, String description, String category) {
        this.itemName = itemName;
        this.description = description;
        this.category = category;
    }
    
    
}
