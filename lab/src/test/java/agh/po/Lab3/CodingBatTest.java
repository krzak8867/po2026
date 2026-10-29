package agh.po.Lab3;

import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void sumDouble() {
        CodingBat test = new CodingBat();
        assertEquals(5, test.sumDouble(2,3));
        assertEquals(12, test.sumDouble(3,3));
        assertEquals(7, test.sumDouble(4,3));


    }

    @org.junit.Test
    public void monkeyTrouble() {
        CodingBat test = new CodingBat();
        assertEquals(true, test.monkeyTrouble(true,true));
        assertEquals(true, test.monkeyTrouble(false,false));
        assertEquals(false, test.monkeyTrouble(true,false));

    }

    @org.junit.Test
    public void sum67() {
        CodingBat test = new CodingBat();
        assertEquals(5, test.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        assertEquals(5, test.sum67(new int[]{1, 2, 2}));
        assertEquals(35, test.sum67(new int[]{1, 2, 2, 6, 99, 99, 7,30}));

    }

    @org.junit.Test
    public void makeAbba() {
        CodingBat test = new CodingBat();
        assertEquals("abba", test.makeAbba("a","b"));
        assertEquals("heyhohohey", test.makeAbba("hey", "ho"));
        assertEquals("tralalatra", test.makeAbba("tra", "la"));
    }
}