package agh.po.symulator;

public class SkrzyniaBiegów extends Komponent {
    Sprzęgło sprzęgło;

    int aktualnyBieg;
    int iloscBiegow;

    public SkrzyniaBiegów(String producent, String model, int iloscBiegow, Sprzęgło sprzęgło) {
        super(producent, model);
        this.aktualnyBieg=0;
        this.iloscBiegow=iloscBiegow;
        this.sprzęgło = sprzęgło;

    }

    public SkrzyniaBiegów(){

    }

    void zwiększBieg(){
        if (sprzęgło.isStanSprzęgła() && aktualnyBieg < iloscBiegow) {
            aktualnyBieg = aktualnyBieg + 1;
        }
    }

    void zmniejszBieg(){
        if (sprzęgło.isStanSprzęgła() && aktualnyBieg > 0) {
            aktualnyBieg = aktualnyBieg - 1;
        }
    }

}
