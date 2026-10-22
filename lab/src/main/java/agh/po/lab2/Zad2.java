package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Zad2 {
    public static void main(String[] args) {

        ArrayList<Integer> twojeTypy = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            int liczba = Integer.parseInt(arg);
            twojeTypy.add(liczba);
        }


        Random rand = new Random();

        ArrayList<Integer> wylosowane = new ArrayList<>();

        int rozmiar = wylosowane.size();

        while ( rozmiar< 6) {
            int los = rand.nextInt(1, 50);
            boolean jest = wylosowane.contains(los);
            if (jest == false) {
                wylosowane.add(los);
                rozmiar = rozmiar + 1;

            }
        }



        int trafienia = 0;
        for (int i = 0; i < twojeTypy.size(); i++) {
            int typ = twojeTypy.get(i);
            if (wylosowane.contains(typ)) {
                trafienia++;
            }
        }

        System.out.println("Twoje typy: " + twojeTypy);
        System.out.println("Wylosowane liczby: " + wylosowane);
        System.out.println("Liczba trafień: " + trafienia);
    }
}