public class DruckerMain {
    public static void main(String[] args) {
        Drucker drucker1 = new Drucker();
        System.out.println("Nummer int: " + drucker1.drucken(1));
        System.out.println("String: " + drucker1.drucken("Sohn"));
        System.out.println("Float: " + drucker1.drucken(12.4));
        System.out.println("Boolean: " + drucker1.drucken(true));

        printAusgabe("---------------------------------");

        //von Herrn Gerzic
        printAusgabe("Zeichenkette");
        printAusgabe(34.6);
        printAusgabe(false);
        printAusgabe(23);
        printAusgabe("---------------nicht static------------------");
        Drucker druckerNichtStatic = new Drucker();
//        druckerNichtStatic.printAusgabeNichtStatic();

    }

    public static void printAusgabe(String x) {
        System.out.println(x);
    }

    public static void printAusgabe(int x) {
        System.out.println(x);
    }

    public static void printAusgabe(double x) {
        System.out.println(x);
    }

    public static void printAusgabe(boolean x) {
        System.out.println(x);
    }

    public void printAusgabeNichtStatic(double x) {
        System.out.println(x);
    }
}
