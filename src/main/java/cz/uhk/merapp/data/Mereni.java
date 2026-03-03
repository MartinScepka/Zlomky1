package cz.uhk.merapp.data;

import cz.uhk.util.Seznam;
import cz.uhk.util.impl.SpojovySeznam;
import cz.uhk.zlomky.data.Zlomek;

import java.util.List;
import java.util.Vector;

public class Mereni {
    //atribut agregace s Number 1:N
    private Seznam<Number> data = new SpojovySeznam<>();

    public void pridejMereni(Number m){
        data.pridej(m); //delegace
    }

    public Number get(int index ){
        return data.vrat(index);
    }

    public int pocet() {
        return data.pocet();
    }

    public Number soucet(){
        Number soucet = 0; //inte nebo Integer
        for (var cislo : data){
            soucet = soucet.doubleValue() + cislo.doubleValue();
        }
        return soucet;
    }

    public Number prumer(){
        return  soucet().doubleValue() / data.pocet();
    }

    public Number max(){
        Number max = data.vrat(0);
        for (var c : data){
            if(c.doubleValue() > max.doubleValue())
                max = c;
        }
        return max;
    }
    public Number min(){
        Number min = data.vrat(0);
        for (var d : data){
            if(d.doubleValue() < min.doubleValue())
                min = d;
        }
        return min;
    }
}
