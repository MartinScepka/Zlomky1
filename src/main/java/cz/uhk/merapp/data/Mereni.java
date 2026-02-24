package cz.uhk.merapp.data;

import cz.uhk.zlomky.data.Zlomek;

import java.util.List;
import java.util.Vector;

public class Mereni {
    //atribut agregace s Number 1:N
    private List<Number> data = new Vector<>();

    public void pridejMereni(Number m){
        data.add(m); //delegace
    }

    public Number get(int index ){
        return data.get(index);
    }

    public int pocet() {
        return data.size();
    }

    public Number soucet(){
        Number soucet = 0; //inte nebo Integer
        for (var cislo : data){
            soucet = soucet.doubleValue() + cislo.doubleValue();
        }
        return soucet;
    }

    public Number prumer(){
        return  soucet().doubleValue() / data.size();
    }

    public Number max(){
        Number max = data.get(0);
        for (var c : data){
            if(c.doubleValue() > max.doubleValue())
                max = c;
        }
        return max;
    }
    public Number min(){
        Number min = data.get(0);
        for (var d : data){
            if(d.doubleValue() < min.doubleValue())
                min = d;
        }
        return min;
    }
}
