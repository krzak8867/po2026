package agh.po.symulator;

public class Silnik extends Komponent {


    int maxObroty;
    int obroty;

    public Silnik(String producent, String model, int maxObroty) {
        super(producent, model);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public Silnik(){

    }

    public void uruchom(){
        this.obroty=1000;

    }

    public void zatrzymaj(){
        this.obroty=0;

    }

    public void zmniejszObroty(int oIle){
        if(this.obroty>500){
            this.obroty=this.obroty-oIle;
        }
    }

    public void zwiekszObroty(int oIle){
        if(this.obroty<this.maxObroty){
            this.obroty=this.obroty+oIle;
        }
    }
}
