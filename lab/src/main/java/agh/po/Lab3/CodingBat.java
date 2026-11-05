package agh.po.Lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public int sumDouble(int a, int b) {
        if (a!=b){
            return a+b;
        }
        else{
            return 2*(a+b);
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile==bSmile){
            return true;
        }
        else{
            return false;
        }
    }

    public int sum67(int[] nums) {
        int suma=0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]!=6) {
                suma = suma + nums[i];
            }
            else  {
                while (nums[i]!=7){
                    i++;
                }
            }
        }
        return suma;
        }


    public String makeAbba(String a, String b) {
        String abba = a+b+b+a;
        return abba;

    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {            //Sprawdzamy, czy w mapie są oba klucze naraz
            map.put("ab", map.get("a") + map.get("b"));                 //Tworzymy połączony napis i wrzucamy do mapy pod kluczem "ab"
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, str.length());
        }
        return map;
    }






    public static void main(String[] args) {
        CodingBat codingBat=new CodingBat();
        int suma=codingBat.sumDouble(2,2);
        System.out.println(suma);
        boolean monkey = codingBat.monkeyTrouble(true, true);
        System.out.println(monkey);
        int lista =codingBat.sum67(new int[]{1,2,3,6,5,4,7,8});
        System.out.println(lista);
        String abba = codingBat.makeAbba("a","b");
        System.out.println(abba);
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        System.out.println(codingBat.mapAB(map));
        Map<String, Integer> mapWordLen = codingBat.wordLen(new String[]{"a", "bb", "a", "bb"});
        System.out.println(mapWordLen);





    }

}
