package cz.uhk.zlomky.data;

public class Zlomek {
    private int citatel;
    private int jmenovatel;


    public Zlomek(){} // defaultni konstruktor

    public Zlomek(int citatel, int jmenovatel){
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    @Override
    public String toString() {
        return String.format("%3d\n-----\n%3d", citatel, jmenovatel);
    }
}
