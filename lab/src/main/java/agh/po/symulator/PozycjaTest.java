package agh.po.symulator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PozycjaTest {

    @Test
    void powinienPrzesunacWStroneCeluPoPrzekatnej() {
        Pozycja auto = new Pozycja(0.0, 0.0);
        Pozycja cel = new Pozycja(6.0, 8.0);

        auto.przemiesc(1.0, 5.0, cel);

        assertEquals(3.0, auto.getX(), 0.0001);
        assertEquals(4.0, auto.getY(), 0.0001);
    }

    @Test
    void powinienZatrzymacSieDokladnieWCeluGdyKrokJestZaDuzy() {
        Pozycja auto = new Pozycja(1.0, 1.0);
        Pozycja cel = new Pozycja(4.0, 5.0); // odległość s = 5.0

        auto.przemiesc(2.0, 10.0, cel);

        assertEquals(4.0, auto.getX(), 0.0001);
        assertEquals(5.0, auto.getY(), 0.0001);
    }

    @Test
    void powinienPozostacWMiejscuGdyJuzJestWCelu() {
        Pozycja auto = new Pozycja(5.0, 5.0);
        Pozycja cel = new Pozycja(5.0, 5.0);

        auto.przemiesc(1.0, 10.0, cel);

        assertEquals(5.0, auto.getX(), 0.0001);
        assertEquals(5.0, auto.getY(), 0.0001);
    }

    @Test
    void powinienPrzesunacWUjemnymKierunku() {
        Pozycja auto = new Pozycja(0.0, 0.0);
        Pozycja cel = new Pozycja(-6.0, -8.0); // odległość s = 10.0

        auto.przemiesc(1.0, 5.0, cel);

        assertEquals(-3.0, auto.getX(), 0.0001);
        assertEquals(-4.0, auto.getY(), 0.0001);
    }

    @Test
    void cleToNull() {
        Pozycja auto = new Pozycja(0.0, 0.0);


        auto.przemiesc(1.0, 5.0, null);

        assertEquals(0.0, auto.getX(), 0.0001);
        assertEquals(0.0, auto.getY(), 0.0001);
    }

    @Test
    void predkoscToZero() {
        Pozycja auto = new Pozycja(0.0, 0.0);
        Pozycja cel = new Pozycja(6.0, 8.0);

        auto.przemiesc(1.0, 0.0, cel);

        assertEquals(0.0, auto.getX(), 0.0001);
        assertEquals(0.0, auto.getY(), 0.0001);
    }

}