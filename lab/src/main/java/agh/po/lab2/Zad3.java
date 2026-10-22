package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;


public class Zad3 {
    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<Integer> losy = new ArrayList<>();


        long czasStart = System.currentTimeMillis();

        while (losy.size()<6) {

            int los = rand.nextInt(1,50);
            boolean jest = losy.contains(los);
            if (jest == false) {
                losy.add(los);

            }

        }

        ArrayList<Integer> MojeLosy = new ArrayList<>();
        int trafienia=0;
        int LiczbaLosowań=0;

        while(trafienia<6) {
            LiczbaLosowań++;
            MojeLosy.clear();
            trafienia = 0;

            while (MojeLosy.size() < 6) {

                int MójLos = rand.nextInt(1, 50);
                boolean jest = MojeLosy.contains(MójLos);
                if (jest == false) {
                    MojeLosy.add(MójLos);


                }

            }

            for (int i = 0; i < MojeLosy.size(); i++) {
                int typ = MojeLosy.get(i);
                if (losy.contains(typ)) {
                    trafienia++;
                }
            }

        }

        long czasKoniec = System.currentTimeMillis();
        long czasCalkowity = czasKoniec - czasStart;

        System.out.println("Wygrane liczby Lotto: " + losy);
        System.out.println("Liczba losowań potrzebnych do trafienia 6/6: " + LiczbaLosowań);
        System.out.println("Łączny czas działania: " + czasCalkowity + " ms (" + (czasCalkowity / 1000.0) + " s)");



    }
}
