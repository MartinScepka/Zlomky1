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

    //operace

    /**
     *
     * Scita zlomek s dalsim zlomkem
     * @param druhy druhy zlomek
     * @return vysledek jako zlomek
     */
    public Zlomek plus(Zlomek druhy){
        int cit = citatel * druhy.jmenovatel + druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek minus(Zlomek druhy){
        int cit = citatel * druhy.jmenovatel - druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek nasobeni(Zlomek druhy){
        int cit = citatel * druhy.citatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek deleni(Zlomek druhy){
        int cit = citatel * druhy.jmenovatel;
        int jm = jmenovatel * druhy.citatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek zkratit(){
        var  delitel = nsd(citatel, jmenovatel);
        return new Zlomek(citatel / delitel, jmenovatel / delitel);
    }

    private int nsd(int a, int b){
        if (a < b){
            var pom = a;
            a = b;
            b = pom;
        }
        //a > b ...
        int zb;
        do{
            zb = a % b;
            a = b;
            b = zb;
        } while (zb != 0);

        return a;
    }
    @Override
    public String toString() {
        return String.format("%d/%d", citatel, jmenovatel);
    }
}
