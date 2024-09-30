public class Main {
    public static void main(String[] args) {
        Kniha Kniha1 = new Kniha("Babička", "Božena Němcova");
        Kniha Kniha2 = new Kniha("RUR","Karel Capek", 250);

        System.out.println(Kniha1.toString());
        System.out.println(Kniha2.toString());

        System.out.println("Zmena:");

        Kniha1.setCena(210);
        Kniha2.setNazev("Krakatit");

        System.out.println(Kniha1.toString());
        System.out.println(Kniha2.toString());

        System.out.println("\n***********************************\n");

        Zvire zvire1 = new Zvire("slon");
        Zvire zvire2 = new Zvire("žirafa", 35);

        System.out.println(zvire1.toString());
        System.out.println(zvire2.toString());

        System.out.println("Zmena:");

        zvire1.setHmotnostPotravy(200);
        zvire2.setDruh("zebra");

        System.out.println(zvire1.toString());
        System.out.println(zvire2.toString());
    }
}