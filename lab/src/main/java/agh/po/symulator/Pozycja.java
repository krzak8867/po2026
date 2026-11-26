package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja() {
        this.x=0.0;
        this.y=0.0;
    }

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void AktualizacjaPozycji(double deltaX, double deltaY ) {
        this.x = this.x + deltaX;
        this.y = this.y + deltaY;
    }

    public void przemiesc (double dt, double v, Pozycja cel){
        if (cel == null || dt <= 0 || v <= 0) {
            return;
        }

        double dxCalkowite = cel.x - this.x;
        double dyCalkowite = cel.y - this.y;

        double s = Math.sqrt(dxCalkowite * dxCalkowite + dyCalkowite * dyCalkowite);  //droga, odległość między celem a samochodem
        double sk = v * dt;

        // Jeśli krok jest większy lub równy pozostałej drodze, zatrzymujemy się w celu
        if (sk >= s) {
            this.x = cel.x;
            this.y = cel.y;
            return;
        }

        double deltaX = sk * (dxCalkowite / s);
        double deltaY = sk * (dyCalkowite / s);

        AktualizacjaPozycji(deltaX, deltaY);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getPozycja() {
        return "(" + x + ", " + y + ")";
    }
}
