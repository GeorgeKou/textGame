/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain_model;

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
public class RoomTest {

    public RoomTest() {
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
     * Test of getDescpription method, of class Room.
     */
    

    @Test
    public void testRoomConnection() {
        Room room1 = new Room();
        Room room2 = new Room();

        Exit exit = new Exit(room1, room2);
        exit.setLocation(Location.EAST);

        assertEquals(exit, room1.getExit(Location.WEST));
        assertEquals(exit, room2.getExit(Location.EAST));

    }
}
