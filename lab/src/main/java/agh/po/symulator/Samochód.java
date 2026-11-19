package agh.po.symulator;

public class Samochód {

    String nrRej;

    Silnik silnik;
    SkrzyniaBiegów skrzyniaBiegów;
    Pozycja aktualnaPozycja;

    public Samochód(String producent, String model, Silnik silnik, SkrzyniaBiegów skrzyniaBiegów ) {
        //super(producent, model);
        this.skrzyniaBiegów=skrzyniaBiegów;
        this.silnik=silnik;
    }

    public Samochód(){

    }

    public void Włącz (){
        silnik.uruchom();
    }

    public void Wyłącz(){
        silnik.zatrzymaj();
    }


    public static void main(String[] args) {
        Samochód s = new Samochód("dodge", "challenger");
        System.out.println(s.nrRej);
    }

}
