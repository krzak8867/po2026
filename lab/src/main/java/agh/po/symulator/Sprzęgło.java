package agh.po.symulator;

public class Sprzęgło extends Komponent{

    boolean stanSprzęgła;

    public Sprzęgło(String producent, String model) {
        super(producent, model);
        this.stanSprzęgła=false;
    }

    public Sprzęgło(){

    }

    void wciśnij(){
        stanSprzęgła=true;
    }

    void zwolnij(){
        stanSprzęgła=false;
    }

    public boolean isStanSprzęgła() {
        return stanSprzęgła;
    }
}
