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
        IO.println("Součet je %s".formatted(soucet));
        IO.println("Rozdíl je %s".formatted(a.minus(b)));
        IO.println("Součin je %s".formatted(a.nasobeni(b)));
        IO.println("Podíl je %s".formatted(a.deleni(b)));
    }
}
