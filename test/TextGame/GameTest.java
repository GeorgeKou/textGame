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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Georgios
 */
public class GameTest {

    public GameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of changeState method, of class Game.
     */
    @Test
    public void testRoomConnection() {
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        room1.setDescpription("I am room 1");
        room2.setDescpription("I am room 2");
        room3.setDescpription("I am room3");

        Exit exit12 = new Exit(room1, room2);
        exit12.setLocation(Location.EAST);

        Exit exit23 = new Exit(room2, room3);
        exit23.setLocation(Location.SOUTH);

        assertEquals(exit12, room1.getExit(Location.WEST));
        assertEquals(exit12, room2.getExit(Location.EAST));

        State state = new State(room1);
        Game game = new Game(state);
        System.out.println(game.changeState(Command.GOEAST));
        System.out.println(game.changeState(Command.GOWEST));
        System.out.println(game.changeState(Command.GONORTH));

    }
}
