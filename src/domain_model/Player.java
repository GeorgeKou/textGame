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
public class Player {
    
    String playerName;
    int level;       // ksekinaei apo 0 anebainei me Items kai rooms
    int health;     // ksekinaei me 100  peftei meta apo kathe xamenh maxh(quiz)
    String gender;  
    Item[] bag;         //pinakas apothikeushs accesorize tou Player
    int currentPosition; //deixnei se poio dwmatio brisketai o paixths sxetizetai me to RoomNumber tou Room.class

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
    

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Item[] getBag() {
        return bag;
    }

    public void setBag(Item[] bag) {
        this.bag = bag;
    }
    
    

    public Player(String playerName, int level, int health, String gender, Item[] bag,int currentPosition) {
        this.playerName = playerName;
        this.level = level;
        this.health = health;
        this.gender = gender;
        this.bag = bag;
        this.currentPosition = currentPosition;
        
    }
    
    
    
    
    
}
