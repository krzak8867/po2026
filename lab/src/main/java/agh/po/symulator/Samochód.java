package agh.po.symulator;

public class Samochód {
    boolean stanWłączenia;
    String nrRej;
    String model;
    int predkoscMax;
    Silnik silnik;
    SkrzyniaBiegów skrzyniaBiegów;
    Pozycja aktualnaPozycja;

    public Samochód(String nrRej, String model, int predkoscMax, Silnik silnik, SkrzyniaBiegów skrzyniaBiegów, Pozycja aktualnaPozycja ) {
        this.skrzyniaBiegów=skrzyniaBiegów;
        this.silnik=silnik;
        this.nrRej = nrRej;
        this.model = model;
        this.predkoscMax = predkoscMax;
        this.skrzyniaBiegów = skrzyniaBiegów;
        this.aktualnaPozycja = aktualnaPozycja;
        this.stanWłączenia = false;
    }

    public Samochód(){

    }

    public void włącz (){

        silnik.uruchom();
        this.stanWłączenia = true;
    }

    public void wyłącz(){
        silnik.zatrzymaj();
        skrzyniaBiegów.aktualnyBieg = 0;
        this.stanWłączenia = false;
    }

    public Pozycja getAktPozycja() {
        return aktualnaPozycja;
    }


    public static void main(String[] args) {
        Sprzęgło sprzeglo = new Sprzęgło("Mopar", "Heavy-Duty");
        SkrzyniaBiegów skrzynia = new SkrzyniaBiegów("ZF", "TorqueFlite 8HP90", 8, sprzeglo);
        Silnik silnik = new Silnik("Chrysler / Stellantis", "6.2L HEMI V8 High-Output D170", 6500);
        Pozycja pozycja = new Pozycja(0, 0);

        Samochód s = new Samochód("KR 1025HP", "Dodge Challenger SRT Demon 170", 330, silnik, skrzynia, pozycja);

        s.włącz();

        // Zmiana biegów
        s.skrzyniaBiegów.sprzęgło.wciśnij();
        s.skrzyniaBiegów.zwiększBieg();
        s.skrzyniaBiegów.zwiększBieg();
        s.skrzyniaBiegów.zmniejszBieg();
        s.skrzyniaBiegów.sprzęgło.zwolnij();

        // Wyświetlenie danych zgodnych ze schematem
        System.out.println("=== DANE SAMOCHODU ===");
        System.out.println("Model: " + s.model);
        System.out.println("Nr rejestracyjny: " + s.nrRej);
        System.out.println("Prędkość max: " + s.predkoscMax + " km/h");
        System.out.println("Silnik (producent i model): " + s.silnik.getProducent() + " - " + s.silnik.getModel());
        System.out.println("Skrzynia (producent i model): " + s.skrzyniaBiegów.getProducent() + " - " + s.skrzyniaBiegów.getModel());
        System.out.println("Sprzęgło (producent i model): " + s.skrzyniaBiegów.sprzęgło.getProducent() + " - " + s.skrzyniaBiegów.sprzęgło.getModel());

        System.out.println("\n=== AKTUALNY STAN ===");
        System.out.println("Stan włączenia: " + s.stanWłączenia);
        System.out.println("Obroty silnika: " + s.silnik.obroty + " obr./min");
        System.out.println("Aktualny bieg: " + s.skrzyniaBiegów.aktualnyBieg);
        System.out.println("Sprzęgło wciśnięte: " + s.skrzyniaBiegów.sprzęgło.isStanSprzęgła());
        System.out.println("Pozycja: " + s.getAktPozycja().getPozycja());
    }

}
