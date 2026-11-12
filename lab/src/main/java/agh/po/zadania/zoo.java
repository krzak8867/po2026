package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class zoo {
    public static void main(String[] args) {
        zoo zoo = new zoo();
        zoo.fillAnimals();
        zoo.printDescriptions();
        System.out.println("Suma nóg: " + zoo.sumLegs());
    }

    Animal[] animals = new Animal[100];

    public void fillAnimals() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int los = random.nextInt(3);
            if (los == 0) {
                animals[i] = new Parrot("Papuga " + i);
            } else if (los == 1) {
                animals[i] = new Dog("Pies " + i);
            } else {
                animals[i] = new Snake("Wąż " + i);
            }
        }
    }
    public int sumLegs() {
        int suma = 0;
        for (Animal animal : animals) {
            int legs = animal.getLegs();
            suma += legs;
        }
        return suma;
    }


    public void printDescriptions() {
        for (Animal animal : animals) {
            System.out.println(animal.getDescription());
            animal.makeSound(); // <-- dopisz tę linijkę
        }
    }


}
