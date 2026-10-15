package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> losy = new ArrayList<>();
        int rozmiar = losy.size();

        while (rozmiar<6) {

            int los = rand.nextInt(50);
            boolean jest = losy.contains(7);
            if (jest == false) {
                losy.add(los);
                rozmiar=rozmiar+1;

            }
        }
        System.out.println(losy) ;
    }

}
