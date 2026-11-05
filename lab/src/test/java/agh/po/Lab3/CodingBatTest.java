package agh.po.Lab3;

import java.util.HashMap;
import java.util.Map;
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

    @org.junit.Test
    public void mapAB() {
        CodingBat test = new CodingBat();
        //Obie wartości ("a" i "b") istnieją w mapie
        Map<String, String> map1 = new HashMap<>();  //Tworzymy pustą mapę
        map1.put("a", "Hi");
        map1.put("b", "There");
        assertEquals("HiThere", test.mapAB(map1).get("ab"));
        //Jest tylko jeden klucz ("a", brak "b")
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        assertFalse(test.mapAB(map2).containsKey("ab"));
        //Pusta mapa
        Map<String, String> map3 = new HashMap<>();
        assertTrue(test.mapAB(map3).isEmpty());
    }

    @org.junit.Test
    public void wordLen() {
        CodingBat test = new CodingBat();


        Map<String, Integer> map1 = test.wordLen(new String[]{"a", "bb", "a", "bb"});
        assertEquals(Integer.valueOf(1), map1.get("a"));
        assertEquals(Integer.valueOf(2), map1.get("bb"));


        Map<String, Integer> map2 = test.wordLen(new String[]{"this", "and", "that"});
        assertEquals(Integer.valueOf(4), map2.get("this"));


        Map<String, Integer> map3 = test.wordLen(new String[]{});
        assertTrue(map3.isEmpty());
    }


}