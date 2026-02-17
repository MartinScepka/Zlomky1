import cz.uhk.zlomky.data.Zlomek;

public class Main {
    public static void main() {
        IO.println("projekt ZLOMKY!"); //Java 25 - jinak: System.out.
        IO.println("------EFN------");

        Zlomek a = new Zlomek(); //konstruktor bez parametru - defaultní -> vysledkem je instance
        a.setCitatel(1);
        a.setJmenovatel(2);

        var b = new Zlomek(3, 4); //var odvozuje typ automaticky

        IO.println(a);
        IO.println(b);

        var soucet = a.plus(b);
        IO.println("Součet je %s".formatted(soucet.zkratit()));
        IO.println("Rozdíl je %s".formatted(a.minus(b).zkratit()));
        IO.println("Součin je %s".formatted(a.nasobeni(b).zkratit()));
        IO.println("Podíl je %s".formatted(a.deleni(b).zkratit()));

        Zlomek[] pole = new Zlomek[]{
                new Zlomek(1,3),
                new Zlomek(1,2),
                new Zlomek(6,5),
                new Zlomek(4,3),
                new Zlomek(7,8),
                new Zlomek(13,10),
        };

        Zlomek vysl = parametr(pole);
        IO.println("Aritmetický průměr je %s".formatted(vysl.zkratit()));
    }

    private static Zlomek parametr(Zlomek[] pole) {
        var soucet = new Zlomek(0,1); //0

        for (var z :pole){
            soucet = soucet.plus(z);
        }
        //var pocet = new Zlomek(pole.length, 1);


        return soucet.deleni(pole.length);
    }
}
