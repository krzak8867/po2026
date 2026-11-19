package agh.po.symulator;

public class SkrzyniaBiegów extends Komponent {
    Sprzęgło sprzęgło;

    int aktualnyBieg;
    int iloscBiegow;

    public SkrzyniaBiegów(String producent, String model) {
        super(producent, model);
        this.aktualnyBieg=0;
        this.iloscBiegow=iloscBiegow;

    }

    public SkrzyniaBiegów(){

    }

    void zwiększBieg(){
        aktualnyBieg=aktualnyBieg+1;
    }

    void zmniejszBieg(){
        aktualnyBieg=aktualnyBieg-1;
    }

}
