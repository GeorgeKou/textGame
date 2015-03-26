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
public class ExitTest {
    
    public ExitTest() {
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
     * Test of roomLocation method, of class Exit.
     */
    @Test
    public void testRoomLocation() {
        System.out.println("roomLocation");
        Location room1Location = null;
        Exit instance = null;
        instance.roomLocation(room1Location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Exit.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        Location room1Location = null;
        Exit instance = null;
        instance.setLocation(room1Location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOtherRoom method, of class Exit.
     */
    @Test
    public void testGetOtherRoom() {
        System.out.println("getOtherRoom");
        Room room = null;
        Exit instance = null;
        Room expResult = null;
        Room result = instance.getOtherRoom(room);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
