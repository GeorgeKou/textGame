/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain_model;

import parsers.Parser;
import Commands.GetCommand;

import Commands.ICommand;
import Commands.UseCommand;
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
public class ParserTest {

    public ParserTest() {
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
     * Test of parse method, of class Parser.
     */
    @Test
    public void testParserGetCommand() {
        System.out.println("GetCommand");

        String command = "GET";
        Parser instance = new Parser();
        ICommand expResult = new GetCommand("GET");

        ICommand result = instance.parse(command);
        assertEquals(expResult.execute(), result.execute());
    }

    @Test
    public void testParserUseCommand() {
        System.out.println("UseCommand");

        String command = "USE";
        Parser instance = new Parser();
        ICommand expResult = new UseCommand("Use");

        ICommand result = instance.parse(command);
        assertEquals(expResult.execute(), result.execute());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseException() {
        System.out.println("testParseException");
        String command = "SOMETHING ELSE";
        Parser instance = new Parser();

        ICommand result = instance.parse(command);
    }
}
